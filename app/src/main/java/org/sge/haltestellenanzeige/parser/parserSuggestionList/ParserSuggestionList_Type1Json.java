package org.sge.haltestellenanzeige.parser.parserSuggestionList;

import android.text.Html;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.sge.haltestellenanzeige.opnv.OPNV;
import org.sge.haltestellenanzeige.stop.Stop;
import org.sge.haltestellenanzeige.util.Util;

import java.util.ArrayList;

public abstract class ParserSuggestionList_Type1Json extends ParserSuggestionList {
    @Override
    public ArrayList<Stop> parseSuggestionListResponse(OPNV opnv, String jsonStringPara) {
        System.out.println("ParserSuggestionList_Type1Json::read json suggestion ParserSuggestionList_Type1Json list"); //NON-NLS

        getList().clear();

        String jsonStringExtract = ParserSuggestionList.extractJsonString(jsonStringPara);
        System.out.println("ParserSuggestionList_Type1Json::jasonStringExtract"); //NON-NLS

        String jsonString = Util.convertStringFromISO8859ToUTF8(jsonStringExtract);
        System.out.println("ParserSuggestionList_Type1Json::start parsing"); //NON-NLS

        try {
            JSONObject reader = null;
            try {
                reader = new JSONObject(jsonString);
            } catch (JSONException e) {
                e.printStackTrace();
                return getList();
            }

            JSONObject stopFinderJasonObject = null;
            try {
                stopFinderJasonObject = reader.getJSONObject("stopFinder"); //NON-NLS
                System.out.println("ParserSuggestionList_Type1Json::stop finder found"); //NON-NLS
            } catch (JSONException e) {
                e.printStackTrace();
                return getList();
            }

            JSONArray stationArray = null;
            try {
                stationArray = stopFinderJasonObject.optJSONArray("points"); //NON-NLS
            } catch (Exception e) {
                e.printStackTrace();
                return getList();
            }

            if (stationArray == null) {
                System.out.println("ParserSuggestionList_Type1Json::stationArray null"); //NON-NLS
                try {
                    if (stopFinderJasonObject.isNull("points")) {//NON-NLS
                        // suggestion list is empty
                        System.out.println("ParserSuggestionList_Type1Json::suggestion list is empty"); //NON-NLS
                        return getList();
                    }

                    System.out.println("ParserSuggestionList_Type1Json::stopFinderJasonObject.getJSONObject(\"points\")"); //NON-NLS
                    JSONObject pointsJasonObject = stopFinderJasonObject.getJSONObject("points"); //NON-NLS

                    System.out.println("ParserSuggestionList_Type1Json::pointsJasonObject.getJSONObject(\"point\")"); //NON-NLS
                    JSONObject pointJasonObject = pointsJasonObject.getJSONObject("point"); //NON-NLS

                    String name = Html.fromHtml(pointJasonObject.getString("name")).toString(); //NON-NLS
                    System.out.println("ParserSuggestionList_Type1Json::pointJasonObject.getString(\"name\"): " + name); //NON-NLS

                    String anyType = pointJasonObject.getString("anyType"); //NON-NLS
                    System.out.println("ParserSuggestionList_Type1Json::pointJasonObject.getString(\"anyType\"): " + anyType); //NON-NLS

                    System.out.println("ParserSuggestionList_Type1Json::pointJasonObject.getJSONObject(\"ref\")"); //NON-NLS
                    JSONObject refJasonObject = pointJasonObject.getJSONObject("ref"); //NON-NLS

                    String gid = refJasonObject.getString("gid"); //NON-NLS
                    System.out.println("ParserSuggestionList_Type1Json::refJasonObject.getString(\"gid\"): " + gid); //NON-NLS

                    String coords = ""; //NON-NLS
                    boolean coordsExist = false;
                    try {
                        coords = refJasonObject.getString("coords"); //NON-NLS
                        coordsExist = true;
                    }
                    catch(org.json.JSONException e) {
                        // no coords found, so dont add this stop
                    }
                    System.out.println("ParserSuggestionList_Type1Json::refJasonObject.getString(\"coords\"): " + coords); //NON-NLS

                    if(coordsExist) {
                        if(anyType != null) {
                            if ("stop".contentEquals(anyType)) {//NON-NLS
                                getList().add(new Stop(opnv, name, gid, parseXCoord(coords), parseYCoord(coords), opnv.getUrl(gid)));
                            }
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("ParserSuggestionList_Type1Json::stationArray found and not null"); //NON-NLS
                for (int s = 0; s < stationArray.length(); s++) {
                    // System.out.println("ParserSuggestionList_Type1Json parseSuggestionListResponse s: " + s);
                    JSONObject station = null;
                    JSONObject ref = null;
                    try {
                        station = stationArray.getJSONObject(s);

                        String anyType = station.getString("anyType"); //NON-NLS
                        if (anyType != null) {
                            if ("stop".contentEquals(anyType)) {//NON-NLS
                                ref = station.getJSONObject("ref"); //NON-NLS

                                String gid = ref.getString("gid"); //NON-NLS
                                String coords = null;
                                try {
                                    coords = ref.getString("coords"); //NON-NLS
                                }
                                catch(org.json.JSONException e) {
                                    // stop has no coordinates
                                }

                                String name = Html.fromHtml(station.getString("name")).toString(); //NON-NLS

                                // System.out.println("ParserSuggestionList_Type1Json parseSuggestionListResponse add stop: " + name);
                                if((coords != null) && (name != null)  && (gid != null)) {
                                    getList().add(new Stop(opnv, name, gid, parseXCoord(coords), parseYCoord(coords), opnv.getUrl(gid)));
                                }
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("parseSuggestionListResponse exception ParserSuggestionList_Type1Json suggestion list: " + jsonString); //NON-NLS
            return getList();
        }

        return getList();
    }


    public double parseXCoord(String coords) {
        // "8.57242,49.54917"
        String x = coords.substring(0, coords.indexOf(','));
        return Double.parseDouble(x);
    }


    public double parseYCoord(String coords) {
        // "8.57242,49.54917"
        String y = coords.substring(coords.indexOf(',')+1);
        return Double.parseDouble(y);
    }


}
