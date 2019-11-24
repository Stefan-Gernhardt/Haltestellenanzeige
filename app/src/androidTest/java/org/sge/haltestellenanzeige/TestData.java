package org.sge.haltestellenanzeige;

/**
 * Created by Admin on 28.01.2018.
 */

public class TestData {
    public final static int PERFORMANCE_GOAL_PARSER = 1200;


    public static String jsonVRNResponseDaenig = "{ \"parameters\": [ { \"name\":\"serverID\", \"value\":\"EFA10-5\" }, { \"name\":\"requestID\", \"value\":\"0\" }, { \"name\":\"sessionID\", \"value\":\"0\" }, { \"name\":\"calcTime\", \"value\":\"113.602\" } ], \"dm\": { \"input\": { \"input\":\"de:05374:49737\" }, \"points\": { \"point\": { \"usage\":\"dm\", \"type\":\"any\", \"name\":\"Marienheide, Däinghausen\", \"stateless\":\"22009113\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"100000\", \"best\":\"0\", \"object\":\"Däinghausen\", \"ref\": { \"id\":\"22009113\", \"gid\":\"de:05374:49737\", \"omc\":\"5374024\", \"placeID\":\"1\", \"place\":\"Marienheide\", \"coords\":\"7.53097,51.06741\" }, \"infos\": null } }, \"itdOdvAssignedStops\": { \"stopID\":\"22009113\", \"name\":\"Däinghausen\", \"x\":\"7.53097\", \"y\":\"51.06741\", \"mapName\":\"EPSG:4326\", \"value\":\"22009113:Däinghausen\", \"place\":\"Marienheide\", \"nameWithPlace\":\"Däinghausen,Marienheide\", \"distanceTime\":\"0\", \"isTransferStop\":\"0\", \"vm\":\"100\", \"gid\":\"de:05374:49737\" } }, \"arr\": { \"input\": { \"input\":\"\" }, \"points\": null }, \"dateTime\": { \"deparr\":\"dep\", \"ttpFrom\":\"20180801\", \"ttpTo\":\"20181208\", \"year\":\"2018\", \"month\":\"11\", \"day\":\"4\", \"hour\":\"15\", \"minute\":\"49\" }, \"dateRange\": [ { \"day\":\"04\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"1\" }, { \"day\":\"05\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"2\" }, { \"day\":\"06\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"3\" }, { \"day\":\"07\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"4\" }, { \"day\":\"08\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"5\" }, { \"day\":\"09\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"6\" }, { \"day\":\"10\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"7\" }, { \"day\":\"11\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"1\" }, { \"day\":\"12\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"2\" }, { \"day\":\"13\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"3\" }, { \"day\":\"14\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"4\" }, { \"day\":\"15\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"5\" }, { \"day\":\"16\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"6\" }, { \"day\":\"17\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"7\" }, { \"day\":\"18\", \"month\":\"11\", \"year\":\"2018\", \"weekday\":\"1\" } ], \"option\": { \"ptOption\": { \"active\":\"-1\", \"maxChanges\":\"9\", \"maxTime\":\"360\", \"maxWait\":\"120\", \"routeType\":\"LEASTTIME\", \"changeSpeed\":\"normal\", \"lineRestriction\":\"403\", \"useProxFootSearch\":\"0\", \"useProxFootSearchOrigin\":\"0\", \"useProxFootSearchDestination\":\"0\", \"bike\":\"0\", \"plane\":\"0\", \"noCrowded\":\"0\", \"noSolidStairs\":\"0\", \"noEscalators\":\"0\", \"noElevators\":\"0\", \"lowPlatformVhcl\":\"0\", \"wheelchair\":\"0\", \"needElevatedPlt\":\"0\", \"assistance\":\"0\", \"SOSAvail\":\"0\", \"noLonelyTransfer\":\"0\", \"illumTransfer\":\"0\", \"overgroundTransfer\":\"0\", \"noInsecurePlaces\":\"0\", \"privateTransport\":\"0\", \"excludedMeans\": [ { \"means\":\"Zug\", \"value\":\"0\", \"selected\":\"0\" }, { \"means\":\"S-Bahn\", \"value\":\"1\", \"selected\":\"0\" }, { \"means\":\"U-Bahn\", \"value\":\"2\", \"selected\":\"0\" }, { \"means\":\"Stadtbahn\", \"value\":\"3\", \"selected\":\"0\" }, { \"means\":\"Straßen-/Trambahn\", \"value\":\"4\", \"selected\":\"0\" }, { \"means\":\"Stadtbus\", \"value\":\"5\", \"selected\":\"0\" }, { \"means\":\"Regionalbus\", \"value\":\"6\", \"selected\":\"0\" }, { \"means\":\"Schnellbus\", \"value\":\"7\", \"selected\":\"0\" }, { \"means\":\"Seil-/Zahnradbahn\", \"value\":\"8\", \"selected\":\"0\" }, { \"means\":\"Schiff\", \"value\":\"9\", \"selected\":\"0\" }, { \"means\":\"AST/Rufbus\", \"value\":\"10\", \"selected\":\"0\" }, { \"means\":\"Sonstige\", \"value\":\"11\", \"selected\":\"0\" }, { \"means\":\"Flugzeug\", \"value\":\"12\", \"selected\":\"0\" }, { \"means\":\"Zug (Nahverkehr)\", \"value\":\"13\", \"selected\":\"0\" }, { \"means\":\"Zug (Fernverkehr)\", \"value\":\"14\", \"selected\":\"0\" }, { \"means\":\"Zug (Fernverkehr mit\", \"value\":\"15\", \"selected\":\"0\" }, { \"means\":\"Zug (Fernverkehr mit\", \"value\":\"16\", \"selected\":\"0\" }, { \"means\":\"Schienenersatzverkeh\", \"value\":\"17\", \"selected\":\"0\" }, { \"means\":\"Zug Shuttle\", \"value\":\"18\", \"selected\":\"0\" }, { \"means\":\"Bürgerbus\", \"value\":\"19\", \"selected\":\"0\" } ], \"activeImp\":\"-1\", \"activeCom\":\"-1\", \"activeSec\":\"-1\" } }, \"servingLines\": { \"lines\": { \"line\": { \"mode\": { \"name\":\"Bus 399\", \"number\":\"399\", \"product\":\"Bus\", \"productId\":\"1\", \"type\":\"5\", \"mtSubcode\":\"0\", \"code\":\"3\", \"destination\":\"Schöneborn Kindergarten,Marienheide\", \"destID\":\"22009111\", \"desc\":\"Marienheide Bf - Dannenberg\", \"timetablePeriod\":\"Jahresfahrplan 2018\", \"diva\": { \"branch\":\"11\", \"line\":\"11399\", \"supplement\":\" \", \"dir\":\"R\", \"project\":\"j18\", \"network\":\"vrs\", \"stateless\":\"vrs:11399: :R:j18\", \"operator\":\"\", \"opCode\":\"\", \"vF\":\"20171209\", \"vTo\":\"20181230\", \"attrs\": [  ] } }, \"index\":\"5:0\" } } }, \"departureList\": { \"departure\": { \"stopID\":\"22009113\", \"x\":\"7.53097\", \"y\":\"51.06741\", \"mapName\":\"EPSG:4326\", \"area\":\"1\", \"platform\":\"21\", \"platformName\":\"\", \"stopName\":\"Däinghausen,Marienheide\", \"nameWO\":\"Däinghausen\", \"countdown\":\"1226\", \"dateTime\": { \"year\":\"2018\", \"month\":\"11\", \"day\":\"5\", \"weekday\":\"2\", \"hour\":\"12\", \"minute\":\"15\" }, \"servingLine\": { \"key\":\"9\", \"code\":\"3\", \"number\":\"399\", \"symbol\":\"399\", \"motType\":\"5\", \"mtSubcode\":\"0\", \"realtime\":\"0\", \"direction\":\"Schöneborn Kindergarten,Marienheide\", \"directionFrom\":\"Marienheide Bf,Marienheide\", \"name\":\"Bus\", \"liErgRiProj\": { \"line\":\"11399\", \"project\":\"j18\", \"direction\":\"R\", \"supplement\":\" \", \"network\":\"vrs\" }, \"destID\":\"22009111\", \"stateless\":\"vrs:11399: :R:j18\" } } } }";

    public static String jsonVRNResponseViernheimRNZ = "{ \"parameters\": [ { \"name\":\"serverID\", \"value\":\"EFA10-1\" }, { \"name\":\"requestID\", \"value\":\"0\" }, { \"name\":\"sessionID\", \"value\":\"0\" }, { \"name\":\"calcTime\", \"value\":\"133.078\" } ], \"dm\": { \"input\": { \"input\":\"de:06431:3865\" }, \"points\": { \"point\": { \"usage\":\"dm\", \"type\":\"any\", \"name\":\"Viernheim, Tivoli (RNZ)\", \"stateless\":\"6003865\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"100000\", \"best\":\"0\", \"object\":\"Tivoli (RNZ)\", \"ref\": { \"id\":\"6003865\", \"gid\":\"de:06431:3865\", \"omc\":\"6431020\", \"placeID\":\"1\", \"place\":\"Viernheim\", \"niveau\":\"0\", \"coords\":\"8.56525,49.52822\" }, \"infos\": null } }, \"itdOdvAssignedStops\": { \"stopID\":\"6003865\", \"name\":\"Tivoli (RNZ)\", \"x\":\"8.56525\", \"y\":\"49.52822\", \"mapName\":\"EPSG:4326\", \"value\":\"6003865:Tivoli (RNZ)\", \"place\":\"Viernheim\", \"nameWithPlace\":\"Viernheim, Tivoli (RNZ)\", \"distanceTime\":\"0\", \"isTransferStop\":\"0\", \"vm\":\"100\", \"gid\":\"de:06431:3865\" } }, \"arr\": { \"input\": { \"input\":\"\" }, \"points\": null }, \"dateTime\": { \"deparr\":\"dep\", \"ttpFrom\":\"20180101\", \"ttpTo\":\"20180609\", \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"hour\":\"12\", \"minute\":\"25\" }, \"dateRange\": [ { \"day\":\"18\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"1\" }, { \"day\":\"19\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"2\" }, { \"day\":\"20\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"3\" }, { \"day\":\"21\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"4\" }, { \"day\":\"22\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"5\" }, { \"day\":\"23\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"6\" }, { \"day\":\"24\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"7\" }, { \"day\":\"25\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"1\" }, { \"day\":\"26\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"2\" }, { \"day\":\"27\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"3\" }, { \"day\":\"28\", \"month\":\"02\", \"year\":\"2018\", \"weekday\":\"4\" }, { \"day\":\"01\", \"month\":\"03\", \"year\":\"2018\", \"weekday\":\"5\" }, { \"day\":\"02\", \"month\":\"03\", \"year\":\"2018\", \"weekday\":\"6\" }, { \"day\":\"03\", \"month\":\"03\", \"year\":\"2018\", \"weekday\":\"7\" }, { \"day\":\"04\", \"month\":\"03\", \"year\":\"2018\", \"weekday\":\"1\" } ], \"option\": { \"ptOption\": { \"active\":\"-1\", \"maxChanges\":\"9\", \"maxTime\":\"360\", \"maxWait\":\"120\", \"routeType\":\"LEASTTIME\", \"changeSpeed\":\"normal\", \"lineRestriction\":\"403\", \"useProxFootSearch\":\"0\", \"useProxFootSearchOrigin\":\"0\", \"useProxFootSearchDestination\":\"0\", \"bike\":\"0\", \"plane\":\"0\", \"noCrowded\":\"0\", \"noSolidStairs\":\"0\", \"noEscalators\":\"0\", \"noElevators\":\"0\", \"lowPlatformVhcl\":\"0\", \"wheelchair\":\"0\", \"needElevatedPlt\":\"0\", \"assistance\":\"0\", \"SOSAvail\":\"0\", \"noLonelyTransfer\":\"0\", \"illumTransfer\":\"0\", \"overgroundTransfer\":\"0\", \"noInsecurePlaces\":\"0\", \"privateTransport\":\"0\", \"excludedMeans\": [ { \"means\":\"Zug\", \"value\":\"0\", \"selected\":\"0\" }, { \"means\":\"S-Bahn\", \"value\":\"1\", \"selected\":\"0\" }, { \"means\":\"U-Bahn\", \"value\":\"2\", \"selected\":\"0\" }, { \"means\":\"Stadtbahn\", \"value\":\"3\", \"selected\":\"0\" }, { \"means\":\"Stra�en-/Trambahn\", \"value\":\"4\", \"selected\":\"0\" }, { \"means\":\"Stadtbus\", \"value\":\"5\", \"selected\":\"0\" }, { \"means\":\"Regionalbus\", \"value\":\"6\", \"selected\":\"0\" }, { \"means\":\"Schnellbus\", \"value\":\"7\", \"selected\":\"0\" }, { \"means\":\"Seil-/Zahnradbahn\", \"value\":\"8\", \"selected\":\"0\" }, { \"means\":\"Schiff\", \"value\":\"9\", \"selected\":\"0\" }, { \"means\":\"AST/Rufbus\", \"value\":\"10\", \"selected\":\"0\" }, { \"means\":\"Sonstige\", \"value\":\"11\", \"selected\":\"0\" }, { \"means\":\"Flugzeug\", \"value\":\"12\", \"selected\":\"0\" }, { \"means\":\"Zug (Nahverkehr)\", \"value\":\"13\", \"selected\":\"0\" }, { \"means\":\"Zug (Fernverkehr)\", \"value\":\"14\", \"selected\":\"0\" }, { \"means\":\"Zug (Fernverkehr mit\", \"value\":\"15\", \"selected\":\"0\" }, { \"means\":\"Zug (Fernverkehr mit\", \"value\":\"16\", \"selected\":\"0\" }, { \"means\":\"Schienenersatzverkeh\", \"value\":\"17\", \"selected\":\"0\" }, { \"means\":\"Zug Shuttle\", \"value\":\"18\", \"selected\":\"0\" }, { \"means\":\"B�rgerbus\", \"value\":\"19\", \"selected\":\"0\" } ], \"activeImp\":\"-1\", \"activeCom\":\"-1\", \"activeSec\":\"-1\" } }, \"servingLines\": { \"lines\": [ { \"mode\": { \"name\":\"Bahn RNV 5\", \"number\":\"RNV 5\", \"product\":\"Bahn\", \"productId\":\"4\", \"type\":\"4\", \"mtSubcode\":\"0\", \"code\":\"4\", \"destination\":\"Edingen, Bahnhof\", \"destID\":\"6000619\", \"desc\":\"Weinheim - Viernheim - Mannheim - Heidelberg - Weinheim\", \"timetablePeriod\":\"Jahresfahrplan 2018 (10.12.2017 bis 08.12.2018)\", \"diva\": { \"branch\":\"13\", \"line\":\"13065\", \"supplement\":\" \", \"dir\":\"H\", \"project\":\"j18\", \"network\":\"vrn\", \"stateless\":\"vrn:13065: :H:j18\", \"operator\":\"RNV Rhein-Neckar-Verkehr GmbH\", \"opCode\":\"05\", \"vF\":\"20171210\", \"vTo\":\"20181208\", \"isTTB\":\"1\", \"isSTT\":\"1\", \"isROP\":\"1\", \"attrs\": [  ] } }, \"index\":\"4:0\" }, { \"mode\": { \"name\":\"Bahn RNV 5\", \"number\":\"RNV 5\", \"product\":\"Bahn\", \"productId\":\"4\", \"type\":\"4\", \"mtSubcode\":\"0\", \"code\":\"4\", \"destination\":\"Weinheim, Alter OEG-Bahnhof\", \"destID\":\"6004146\", \"desc\":\"Weinheim - Heidelberg - Mannheim - Viernheim - Weinheim\", \"timetablePeriod\":\"Jahresfahrplan 2018 (10.12.2017 bis 08.12.2018)\", \"diva\": { \"branch\":\"13\", \"line\":\"13065\", \"supplement\":\" \", \"dir\":\"R\", \"project\":\"j18\", \"network\":\"vrn\", \"stateless\":\"vrn:13065: :R:j18\", \"operator\":\"RNV Rhein-Neckar-Verkehr GmbH\", \"opCode\":\"05\", \"vF\":\"20171210\", \"vTo\":\"20181208\", \"isTTB\":\"1\", \"isSTT\":\"1\", \"isROP\":\"1\", \"attrs\": [  ] } }, \"index\":\"4:1\" }, { \"mode\": { \"name\":\"Bus 612\", \"number\":\"612\", \"product\":\"Bus\", \"productId\":\"1\", \"type\":\"5\", \"mtSubcode\":\"0\", \"code\":\"3\", \"destination\":\"Viernheim, Bahnhof\", \"destID\":\"6003851\", \"desc\":\"City-Linie Viernheim: Bahnhof - Tivoli/RNZ - Bürgerhaus - Nordweststadt - Friedhof - City - Bahnhof\", \"timetablePeriod\":\"Jahresfahrplan 2018 (10.12.2017 bis 08.12.2018)\", \"diva\": { \"branch\":\"29\", \"line\":\"29612\", \"supplement\":\" \", \"dir\":\"H\", \"project\":\"j18\", \"network\":\"vrn\", \"stateless\":\"vrn:29612: :H:j18\", \"operator\":\"Stadtwerke Viernheim GmbH\", \"opCode\":\"14\", \"vF\":\"20171210\", \"vTo\":\"20181208\", \"isTTB\":\"1\", \"isSTT\":\"1\", \"isROP\":\"1\", \"attrs\": [  ] } }, \"index\":\"5:0\" }, { \"mode\": { \"name\":\"Bus 612\", \"number\":\"612\", \"product\":\"Bus\", \"productId\":\"1\", \"type\":\"5\", \"mtSubcode\":\"0\", \"code\":\"3\", \"destination\":\"Viernheim, Bahnhof\", \"destID\":\"6003851\", \"desc\":\"City-Linie Viernheim: Bahnhof - Friedhof - Bürgerhaus - Tivoli/RNZ - Bahnhof\", \"timetablePeriod\":\"Jahresfahrplan 2018 (10.12.2017 bis 08.12.2018)\", \"diva\": { \"branch\":\"29\", \"line\":\"29612\", \"supplement\":\" \", \"dir\":\"R\", \"project\":\"j18\", \"network\":\"vrn\", \"stateless\":\"vrn:29612: :R:j18\", \"operator\":\"Stadtwerke Viernheim GmbH\", \"opCode\":\"14\", \"vF\":\"20171210\", \"vTo\":\"20181208\", \"isTTB\":\"1\", \"isSTT\":\"1\", \"isROP\":\"1\", \"attrs\": [  ] } }, \"index\":\"5:1\" } ] }, \"departureList\": [ { \"stopID\":\"6003865\", \"x\":\"8.56568\", \"y\":\"49.52828\", \"mapName\":\"EPSG:4326\", \"area\":\"1\", \"platform\":\"TrRiO\", \"platformName\":\"\", \"stopName\":\"Viernheim, Tivoli (RNZ)\", \"nameWO\":\"Tivoli (RNZ)\", \"countdown\":\"3\", \"dateTime\": { \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"weekday\":\"1\", \"hour\":\"12\", \"minute\":\"26\" }, \"realDateTime\": { \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"weekday\":\"1\", \"hour\":\"12\", \"minute\":\"28\" }, \"servingLine\": { \"key\":\"145\", \"code\":\"4\", \"number\":\"RNV 5\", \"symbol\":\"5\", \"motType\":\"4\", \"mtSubcode\":\"0\", \"realtime\":\"1\", \"direction\":\"Weinheim\", \"directionFrom\":\"Mannheim, Hauptbahnhof\", \"name\":\"Bahn\", \"delay\":\"2\", \"itdNoTrain\":\"Fahrzeug behindertengerecht (ohne Gewähr)\", \"liErgRiProj\": { \"line\":\"13065\", \"project\":\"j18\", \"direction\":\"R\", \"supplement\":\" \", \"network\":\"vrn\" }, \"destID\":\"-1\", \"stateless\":\"vrn:13065: :R:j18\" }, \"operator\": { \"code\":\"05\", \"name\":\"RNV Rhein-Neckar-Verkehr GmbH\", \"publicCode\":\"\" } }, { \"stopID\":\"6003865\", \"x\":\"8.56487\", \"y\":\"49.52810\", \"mapName\":\"EPSG:4326\", \"area\":\"1\", \"platform\":\"TrRiW\", \"platformName\":\"\", \"stopName\":\"Viernheim, Tivoli (RNZ)\", \"nameWO\":\"Tivoli (RNZ)\", \"countdown\":\"8\", \"dateTime\": { \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"weekday\":\"1\", \"hour\":\"12\", \"minute\":\"30\" }, \"realDateTime\": { \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"weekday\":\"1\", \"hour\":\"12\", \"minute\":\"33\" }, \"servingLine\": { \"key\":\"604\", \"code\":\"4\", \"number\":\"RNV 5\", \"symbol\":\"5\", \"motType\":\"4\", \"mtSubcode\":\"0\", \"realtime\":\"1\", \"direction\":\"Mannheim\", \"directionFrom\":\"Weinheim, Alter OEG-Bahnhof\", \"name\":\"Bahn\", \"delay\":\"3\", \"itdNoTrain\":\"Fahrzeug behindertengerecht (ohne Gewähr)\", \"liErgRiProj\": { \"line\":\"13065\", \"project\":\"j18\", \"direction\":\"H\", \"supplement\":\" \", \"network\":\"vrn\" }, \"destID\":\"-1\", \"stateless\":\"vrn:13065: :H:j18\" }, \"operator\": { \"code\":\"05\", \"name\":\"RNV Rhein-Neckar-Verkehr GmbH\", \"publicCode\":\"\" } }, { \"stopID\":\"6003865\", \"x\":\"8.56556\", \"y\":\"49.52839\", \"mapName\":\"EPSG:4326\", \"area\":\"2\", \"platform\":\"Bus\", \"platformName\":\"\", \"stopName\":\"Viernheim, Tivoli (RNZ)\", \"nameWO\":\"Tivoli (RNZ)\", \"countdown\":\"26\", \"dateTime\": { \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"weekday\":\"1\", \"hour\":\"12\", \"minute\":\"51\" }, \"servingLine\": { \"key\":\"53\", \"code\":\"3\", \"number\":\"612\", \"symbol\":\"612\", \"motType\":\"5\", \"mtSubcode\":\"0\", \"realtime\":\"0\", \"direction\":\"Viernheim, Bahnhof\", \"directionFrom\":\"Viernheim, Bahnhof\", \"name\":\"Bus\", \"itdNoTrain\":\"Fahrzeug behindertengerecht\", \"liErgRiProj\": { \"line\":\"29612\", \"project\":\"j18\", \"direction\":\"R\", \"supplement\":\" \", \"network\":\"vrn\" }, \"destID\":\"6003851\", \"stateless\":\"vrn:29612: :R:j18\" }, \"operator\": { \"code\":\"14\", \"name\":\"Stadtwerke Viernheim GmbH\", \"publicCode\":\"\" } }, { \"stopID\":\"6003865\", \"x\":\"8.56568\", \"y\":\"49.52828\", \"mapName\":\"EPSG:4326\", \"area\":\"1\", \"platform\":\"TrRiO\", \"platformName\":\"\", \"stopName\":\"Viernheim, Tivoli (RNZ)\", \"nameWO\":\"Tivoli (RNZ)\", \"countdown\":\"31\", \"dateTime\": { \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"weekday\":\"1\", \"hour\":\"12\", \"minute\":\"56\" }, \"realDateTime\": { \"year\":\"2018\", \"month\":\"2\", \"day\":\"18\", \"weekday\":\"1\", \"hour\":\"12\", \"minute\":\"56\" }, \"servingLine\": { \"key\":\"240\", \"code\":\"4\", \"number\":\"RNV 5\", \"symbol\":\"5\", \"motType\":\"4\", \"mtSubcode\":\"0\", \"realtime\":\"1\", \"direction\":\"Weinheim\", \"directionFrom\":\"Edingen, Bahnhof\", \"name\":\"Bahn\", \"delay\":\"0\", \"itdNoTrain\":\"Fahrzeug behindertengerecht (ohne Gewähr)\", \"liErgRiProj\": { \"line\":\"13065\", \"project\":\"j18\", \"direction\":\"R\", \"supplement\":\" \", \"network\":\"vrn\" }, \"destID\":\"-1\", \"stateless\":\"vrn:13065: :R:j18\" }, \"operator\": { \"code\":\"05\", \"name\":\"RNV Rhein-Neckar-Verkehr GmbH\", \"publicCode\":\"\" } } ] }";

    public final static String htmlResponseSvv = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "<title>Saarbr&#252;cken Hbf - Ankunft/Abfahrt</title>\n" +
            "<meta http-equiv=\"expires\" content=\"0\" />\n" +
            "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\n" +
            "<meta http-equiv=\"content-script-type\" content=\"text/javascript\" />\n" +
            "<link rel=\"shortcut icon\" href=\"/hafas-res/img/favicon.ico\" type=\"image/ico\" />\n" +
            "<link rel=\"apple-touch-icon-precomposed\" href=\"/hafas-res/img/apple-touch-icon-precomposed.png\" />\n" +
            "<meta name=\"viewport\" content=\"width=device-width\" />\n" +
            "<meta name=\"viewport\" content=\"minimum-scale=1.0\" />\n" +
            "<meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.5, user-scalable=yes\" />\n" +
            "<script type=\"text/javascript\" src=\"/hafas-res/js/ua_xhtml/FSuggest_mobile.js?guiV=17\"></script>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/hafas-res/css/ua_xhtml/mobile_all.css?guiV=17\" />\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/hafas-res/css/ua_xhtml/mobile_d.css\" />\n" +
            "<style type=\"text/css\">\n" +
            "/* <![CDATA[ */\n" +
            "input.button { -webkit-appearance: none; }\n" +
            "input.sqstation,input.tpLoc {width:180px;}\n" +
            "input.tpdate,input.sqdate {width:75px;}\n" +
            "input.tptime,input.sqtime {width:55px;}\n" +
            "input.hfs_checkbox,\n" +
            "input.hfs_radio {vertical-align:middle;}\n" +
            "div#suggestion div,\n" +
            "div#suggestion div.selected {\n" +
            "background-image:url(/hafas-res/img/suggest_stop.gif);\n" +
            "background-repeat:no-repeat;\n" +
            "background-position:2px 3px;\n" +
            "}\n" +
            "div#suggestion div.adr,\n" +
            "div#suggestion div.adrselected {\n" +
            "background-image:url(/hafas-res/img/suggest_adr.gif);\n" +
            "}\n" +
            "div#suggestion div.poi,\n" +
            "div#suggestion div.poiselected {\n" +
            "background-image:url(/hafas-res/img/suggest_poi.gif);\n" +
            "}\n" +
            "/* ]]> */\n" +
            "</style>\n" +
            "</head>\n" +
            "<body onload=\"window.scrollTo(0, 1)\">\n" +
            "<div class=\"HFS_mobile\">\n" +
            "<div id=\"HFS_mobile_header\">\n" +
            "<p class=\"logo\"><img class=\"logo\" src=\"/hafas-res/img/ua_xhtml/logo_vgs_s.gif\" alt=\"Saarfahrplan Mobil\" /></p>\n" +
            "</div>\n" +
            "<p class=\"querysummary\">\n" +
            "<strong>Saarbr&#252;cken Hbf</strong><br />\n" +
            "Sa, 17.02.18,\n" +
            "Abfahrt 15:39 Uhr\n" +
            "</p>\n" +
            "<table class=\"hfs_stboard\">\n" +
            "<tr>\n" +
            "<th>Uhrzeit</th>\n" +
            "<th>Progn.</th>\n" +
            "<th>Fahrt</th>\n" +
            "<th>in Richtung</th>\n" +
            "<th>Gl.</th>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:39\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+1 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/744318/261907/585268/44541/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  102</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Altenkessel Talstr.\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "C\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:40\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+1 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/sbs_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/196827/79265/137384/3091/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">S      1</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Sarreguemines\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "S\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:43\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+2 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/746514/262600/222844/137433/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  102</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Dudweiler Dudoplatz\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "D\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:45\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/sbs_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/557226/199332/735372/181950/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">S      1</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Siedlerheim\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "S\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:47\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/re_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/831570/283179/461108/46636/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=8000323&amp;sqType=dep&amp;\">RE  4114</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Mannheim Hbf\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "5\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:47\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+1 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/361389/143570/222676/9135/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  105</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Eschberg Tilsiter Str.\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "D\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:48\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/sbs_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/284298/108404/984424/397471/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">S      1</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Brebach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "S\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:48\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/378663/148204/954484/351025/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  R10</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Blieskastel &#252;. Flugh.\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "D\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:49\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/dpn_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/959409/326299/591660/23973/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=8000323&amp;sqType=dep&amp;\">RE 29525</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Mainz Hbf\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "3\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:52\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+1 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/397212/146584/439166/87185/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  122</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Schafbr&#252;cke\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "D\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:52\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+1 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/6000/16331/682036/339026/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  125</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Rodenhof K&#225;lm&#225;nstr.\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "C\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:53\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/sbs_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/446112/162283/146136/75663/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">S      1</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Siedlerheim\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "S\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:55\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+1 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/sbs_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/60753/33948/875822/417662/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">S      1</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Brebach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "S\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:57\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"delay\">+1 </span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/190935/77709/280784/76749/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  108</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Luisenthal Bf\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "C\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:57\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/654393/232387/316388/59937/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  123</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Habsterdick\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "D\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "15:58\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/798045/280322/631180/49582/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">Bus  125</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Dudweiler Dudoplatz\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "D\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "16:00\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/sbs_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/847170/295961/667268/51253/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=17.02.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=17.02.18&amp;sqTi=15:39&amp;sqEvaId=10600&amp;sqType=dep&amp;\">S      1</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lebach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "S\n" +
            "</td>\n" +
            "</tr>\n" +
            "\n" +
            "</table>\n" +
            "<p class=\"remark\">\n" +
            "<strong>weitere Haltestellen anzeigen:</strong>\n" +
            "<br />\n" +
            "- <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;input=10600&amp;boardType=dep&amp;date=17.02.18&amp;time=15:39&amp;\">Hauptbahnhof, Saarbr&#252;cken</a> ( 4 Min.)\n" +
            "<br />\n" +
            "- <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;input=10647&amp;boardType=dep&amp;date=17.02.18&amp;time=15:39&amp;\">Hauptbahnhof Nord, Saarbr&#252;cken</a> ( 4 Min.)\n" +
            "</p>\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;input=8000323&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;boardType=dep&amp;date=17.02.18&amp;time=16:34%2B1&amp;\">Mehr</a>\n" +
            "</p>\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;input=8000323&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;boardType=dep&amp;time=now&amp;selectDate=today&amp;\">Aktuell</a>\n" +
            "</p>\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;input=8000323&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;boardType=arr&amp;time=15:39&amp;date=17.02.18&amp;\">Ankunft</a>\n" +
            "</p>\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;\">Neue Anfrage</a>\n" +
            "</p>\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/detect.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;\">Startseite</a>\n" +
            "</p>\n" +
            "</div>\n" +
            "</body>\n" +
            "</html>\n";


    public final static String htmlResponseFFMHbf = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
            "<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "<title>Deutsche Bahn - Abfahrt</title>\n" +
            "<meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\" />\n" +
            "<meta http-equiv=\"expires\" content=\"-1\" />\n" +
            "<meta http-equiv=\"cache-control\" content=\"no-cache\" />\n" +
            "<meta http-equiv=\"pragma\" content=\"no-cache\" />\n" +
            "<meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0;\" />\n" +
            "<meta name=\"format-detection\" content=\"telephone=no\" />\n" +
            "<meta name=\"HandheldFriendly\" content=\"true\" />\n" +
            "<link rel=\"shortcut icon\" href=\"https://www.img-bahn.de/s3/prod/v/img_old/favicon.ico\" />\n" +
            "<link rel=\"apple-touch-icon\" type=\"image/x-icon\" href=\"https://www.img-bahn.de/s3/prod/v/img_old/apple-touch-icon.png\"/>\n" +
            "<script type=\"text/javascript\">\n" +
            "digitalData = new Object();\n" +
            "digitalData.pageInstanceID  = \"_BAHN_AnkunftAbfahrtAb_de\";\n" +
            "digitalData.version         = \"1.0\";\n" +
            "digitalData.reportSuite     = \"\";\n" +
            "digitalData.numberCarts     = 0;\n" +
            "tmpDate                     = new Date();\n" +
            "digitalData.creationDate    = tmpDate.getFullYear()+\"-\"+((tmpDate.getMonth()<9)?\"0\":\"\")+(tmpDate.getMonth()+1).toString()+\"-\"+((tmpDate.getDate()<10)?\"0\":\"\")+tmpDate.getDate()+\"T\"+((tmpDate.getHours()<10)?\"0\":\"\")+tmpDate.getHours()+\":\"+((tmpDate.getMinutes()<10)?\"0\":\"\")+tmpDate.getMinutes()+\":\"+((tmpDate.getSeconds()<10)?\"0\":\"\")+tmpDate.getSeconds()+\"+\"+(tmpDate.getTimezoneOffset()/-60)+\":00\";\n" +
            "digitalData.page            = new Object();\n" +
            "digitalData.suchparameter   = new Object();\n" +
            "digitalData.user            = new Object();\n" +
            "digitalData.page.pageInfo   = new Object();\n" +
            "digitalData.page.testing    = new Object();\n" +
            "digitalData.page.category   = new Object();\n" +
            "digitalData.page.teaser     = new Object();\n" +
            "digitalData.page.interaktion= new Object();\n" +
            "digitalData.page.isError    = false;\n" +
            "digitalData.page.environment  = \"\";\n" +
            "digitalData.page.pageInfo.pageID    = \"BAHN_AnkunftAbfahrtAb_de\";\n" +
            "digitalData.page.pageInfo.portal    = \"BAHN\";\n" +
            "digitalData.page.pageInfo.anwendung = \"ASK\";\n" +
            "digitalData.page.pageInfo.channel   = \"BAHN_ASK_DEU_de\";\n" +
            "digitalData.page.pageInfo.channelSpecific     = \"\";\n" +
            "digitalData.page.pageInfo.prozesseinstieg   = \"\";\n" +
            "digitalData.page.pageInfo.prozess           = \"\";\n" +
            "digitalData.page.pageInfo.pageName          = \"BAHN_ASK_DEU_de_AnkunftAbfahrtAb\";\n" +
            "digitalData.page.pageInfo.pageNameSpecific  = \"AnkunftAbfahrtAb\";\n" +
            "var tmp    = this.document.URL.match(/[^\\?]+/);\n" +
            "if(tmp)\n" +
            "digitalData.page.pageInfo.destinationURL    = tmp[0];\n" +
            "else\n" +
            "digitalData.page.pageInfo.destinationURL    = this.document.URL;\n" +
            "digitalData.page.pageInfo.destinationURLParameter = new Array();\n" +
            "var tmp = this.document.URL.match(/[(\\?|\\&)]([^=]+)\\=([^&#]+)/g);\n" +
            "if(tmp)\n" +
            "{\n" +
            "for(var i = 0; i < tmp.length; i++)\n" +
            "{\n" +
            "var tmpString = tmp[i].substring(1).split(\"=\");\n" +
            "digitalData.page.pageInfo.destinationURLParameter[i] = {\"name\": tmpString[0] , \"value\": tmpString[1]};\n" +
            "}\n" +
            "}\n" +
            "digitalData.page.pageInfo.referringURL      = document.referrer;\n" +
            "digitalData.page.pageInfo.onsiteSearchTerm  = \"\";\n" +
            "digitalData.page.pageInfo.onsiteSearchResults  = 0;\n" +
            "digitalData.page.pageInfo.sysEnv          = \"android\";\n" +
            "digitalData.page.pageInfo.version           = \"HAFAS 5.42.DB.R17.12.m\";\n" +
            "digitalData.page.pageInfo.issueDate         = digitalData.creationDate;\n" +
            "digitalData.page.pageInfo.effectiveDate     = digitalData.creationDate;\n" +
            "digitalData.page.pageInfo.effectiveDateUnix = tmpDate.getTime();\n" +
            "digitalData.page.pageInfo.expiryDate        = digitalData.creationDate;\n" +
            "digitalData.page.pageInfo.language          = \"de\";\n" +
            "digitalData.page.pageInfo.country           = \"DEU\";\n" +
            "digitalData.page.testing.aktiv              = false;\n" +
            "digitalData.page.testing.anzahlVariationen  = 0;\n" +
            "digitalData.page.testing.variante           = new Array();\n" +
            "digitalData.page.category.hierLevel             = new Array();\n" +
            "digitalData.page.category.hierLevel.push(\"web\");\n" +
            "digitalData.page.category.hierLevel.push(\"AnkunftAbfahrtAb\");\n" +
            "digitalData.page.category.numberHierarchyLevels = 2;\n" +
            "digitalData.page.interaktion.anzahlTypen    = 0;\n" +
            "digitalData.page.interaktion.typ            = new Array();\n" +
            "digitalData.page.teaser.anzahlTeaser        = 0;\n" +
            "digitalData.page.teaser.teaserItem          = new Array();\n" +
            "digitalData.user.profile            = new Object();\n" +
            "digitalData.user.kundentyp     = \"PK\";\n" +
            "digitalData.user.loginstatus        = \"logout\";\n" +
            "digitalData.user.kundenstatus       = \"anonym\";\n" +
            "digitalData.user.profile.address    = new Object();\n" +
            "digitalData.user.profile.address.postalCode = \"\";\n" +
            "digitalData.user.profile.address.city       = \"\";\n" +
            "digitalData.user.profile.address.country    = \"\";\n" +
            "digitalData.user.profile.anrede     = \"\";\n" +
            "digitalData.user.profile.bcStatus           = \"\";\n" +
            "digitalData.user.profile.hash               = \"\";\n" +
            "digitalData.user.profile.nlHash             = \"\";\n" +
            "digitalData.user.profile.isLSV              = 0;\n" +
            "</script>\n" +
            "<script type=\"text/javascript\" src=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/js/bahn_mobile.min.js\" ></script>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/css/bahn_mobile.css\" />\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/css_old/hafas_mobile.css\" />\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/css/touch.css\" />\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/css_old/hafas_touch.css\" />\n" +
            "</head>\n" +
            "<body onload=\"BAHN.init(); initTouchElements();\">\n" +
            "<div id=\"doc\" class=\"touch\">\n" +
            "<div id=\"header\">\n" +
            "<div class=\"logo\">\n" +
            "<img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/db_em_rgb_28px.png\" width=\"40\" height=\"28\" style=\"padding: 14px 0;\" alt=\"DB Bahn\" />\n" +
            "</div>\n" +
            "<div id=\"branding\">\n" +
            "<div class=\"bar\"> </div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"content\" class=\"\">\n" +
            "<h1>\n" +
            "Abfahrt \n" +
            "</h1>\n" +
            "<div class=\"inputtbl\">\n" +
            "<div class=\"fline stdpadding\">\n" +
            "<span class=\"bold\">\n" +
            "Frankfurt(Main)Hbf - Aktuell\n" +
            "</span>\n" +
            "<br />\n" +
            "Abfahrt 10:37\n" +
            "Uhr, 28.01.18\n" +
            "</div>\n" +
            "<div class=\"rlinebig\"></div>\n" +
            "<div class=\"haupt red\">\n" +
            "Stellwerksst&#246;rung /-ausfall: Im Bahnhof Mannheim Hbf kommt es derzeit zu Versp&#228;tungen und Zugausf&#228;llen.\n" +
            "</div>\n" +
            "<div class=\"haupt rline\">Beachten Sie bitte, dass sich die Verkehrslage durch die aktuelle St&#246;rung jederzeit &#228;ndern kann</div>\n" +
            "<div class=\"rlinebig\"></div>\n" +
            "<div class=\"fline\" style=\"height: 40px;\">\n" +
            "&nbsp; <a class=\"btnRight subbtnsmall\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&amp;protocol=https:&amp;rt=1&amp;use_realtime_filter=1&amp;webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37%2D60&amp;pt=10:37&amp;p=1111111111&amp;date=28.01.18&amp;mx=50&amp;start=yes&amp;\">Fr&#252;her</a>\n" +
            "</div>\n" +
            "<div class=\"rlinebig\"></div>\n" +
            "<div class=\"sqPlatform sqHead\">\n" +
            "Gleis\n" +
            "</div>\n" +
            "<div class=\"sqTime sqHead\">\n" +
            "Ab\n" +
            "</div>\n" +
            "<div class=\"sqProduct sqHead\">\n" +
            "&nbsp;\n" +
            "</div>\n" +
            "<div class=\"sqDirection sqHead\">\n" +
            "In Richtung\n" +
            "</div>\n" +
            "<div class=\"rlinebig\"></div>\n" +
            "<div class=\"clicktable\">\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "9\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:14</span><br/><span class=\"delay\">10:38</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/ice_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/935058/492248/348528/137422/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:14&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">ICE  692</span></a><br />nach&nbsp;Berlin Gesundbrunnen</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:36</span><br/><span class=\"delayOnTime\">10:37</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/922065/890262/956260/170777/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:36&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   21</span></a><br />nach&nbsp;Stadion Stra&#223;enbahn, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "101\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:37</span><br/><span class=\"delayOnTime\">10:38</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/558669/378665/846730/237148/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:37&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Frankfurt(Main)S&#252;d</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:37</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/74643/610167/192686/71463/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:37&amp;station_evaId=107011&amp;station_type=dep&amp;\"><span class=\"bold\">STR   21</span></a><br />nach&nbsp;Nied Kirche, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:37</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/975399/1340772/29874/310199/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:37&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   33</span></a><br />nach&nbsp;Hauptbahnhof, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "12\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:38</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/re-rb_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/174735/1100920/702096/292803/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:38&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">VIA25125</span></a><br />nach&nbsp;Erbach(Odenw)</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "102\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:39</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/590733/389270/985864/296028/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:39&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      2</span></a><br />nach&nbsp;Dietzenbach Bahnhof</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:39</span><br/><span class=\"delayOnTime\">10:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/802788/807139/405756/64730/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:39&amp;station_evaId=107011&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   37</span></a><br />nach&nbsp;Hauptbahnhof, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:39</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/381753/695236/441954/93737/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:39&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">U      4</span></a><br />nach&nbsp;Bockenheimer Warte, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:39</span><br/><span class=\"delayOnTime\">10:41</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/25743/584111/985734/484297/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:39&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   17</span></a><br />nach&nbsp;Rebstockbad, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:39</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/820770/858876/693268/73045/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:39&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   21</span></a><br />nach&nbsp;Nied Kirche, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:40</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/356805/701940/161534/38177/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:40&amp;station_evaId=107011&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   64</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:41</span><br/><span class=\"delayOnTime\">10:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/259305/625942/548010/187575/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:41&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   11</span></a><br />nach&nbsp;Fechenheim Schie&#223;h&#252;ttenstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:41</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/432636/719880/7734/140351/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:41&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">U      5</span></a><br />nach&nbsp;Preungesheim, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "6\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/ice_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/61818/197321/643840/301314/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:42&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">ICE 1654</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "13\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/re-rb_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/50190/208320/27612/2924/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:42&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">RB 15512</span></a><br />nach&nbsp;W&#228;chtersbach</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "103\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/484752/353902/985520/331180/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:42&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:42</span><br/><span class=\"delayOnTime\">10:43</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/472836/697119/365020/24903/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:42&amp;station_evaId=100008&amp;station_type=dep&amp;\"><span class=\"bold\">STR   11</span></a><br />nach&nbsp;Fechenheim Schie&#223;h&#252;ttenstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:42</span><br/><span class=\"delayOnTime\">10:46</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/782823/818376/727414/102767/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:42&amp;station_evaId=107011&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   46</span></a><br />nach&nbsp;Wasserweg, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:42</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/332349/678307/841772/310103/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:42&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">U      4</span></a><br />nach&nbsp;Bornheim Seckbacher Landstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/632856/793957/7612/207155/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:42&amp;station_evaId=102972&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   64</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:43</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/809607/825748/844380/152321/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:43&amp;station_evaId=107011&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   46</span></a><br />nach&nbsp;R&#246;merhof, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "104\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:44</span><br/><span class=\"delayOnTime\">10:45</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/22689/199951/103904/44396/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:44&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      3</span></a><br />nach&nbsp;Bad Soden(Taunus)</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "102\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:44</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/369225/315677/939424/346640/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:44&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      8</span></a><br />nach&nbsp;Offenbach(Main)Ost</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:44</span><br/><span class=\"delayOnTime\">10:45</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/314523/661363/959614/374968/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:44&amp;station_evaId=100008&amp;station_type=dep&amp;\"><span class=\"bold\">STR   12</span></a><br />nach&nbsp;Schwanheim Rheinlandstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:44</span><br/><span class=\"delayOnTime\">10:48</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/419331/697212/120018/79769/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:44&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   46</span></a><br />nach&nbsp;Wasserweg, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:44</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/14052/578319/880428/435535/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:44&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   16</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:45</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/457062/708233/211316/46696/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:45&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   46</span></a><br />nach&nbsp;R&#246;merhof, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:46</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/178539/617649/622092/251535/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:46&amp;station_evaId=100008&amp;station_type=dep&amp;\"><span class=\"bold\">STR   12</span></a><br />nach&nbsp;Fechenheim Hugo-Junkers-Stra&#223;e/Schleife, Frankfurt</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:46</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/325434/680803/162824/27070/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:46&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   16</span></a><br />nach&nbsp;Balduinstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "101\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:47</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/895254/490807/919370/161274/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:47&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      3</span></a><br />nach&nbsp;Darmstadt Hbf</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "103\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:47</span><br/><span class=\"delayOnTime\">10:48</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/779847/452553/282418/118741/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:47&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      8</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "22\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:47</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/re-rb_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/890493/502641/198424/197619/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:47&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">RB 24724</span></a><br />nach&nbsp;K&#246;nigstein(Taunus)</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:48</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/966045/872297/785374/70677/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:48&amp;station_evaId=100008&amp;station_type=dep&amp;\"><span class=\"bold\">STR   11</span></a><br />nach&nbsp;H&#246;chst Zuckschwerdtstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "102\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:49</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/885393/487447/229260/180507/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:49&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;R&#246;dermark-Ober Roden</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:49</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/974157/875001/707242/28907/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:49&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   11</span></a><br />nach&nbsp;H&#246;chst Zuckschwerdtstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:49</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/890709/864688/219252/187284/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:49&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">U      4</span></a><br />nach&nbsp;Bockenheimer Warte, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:49</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/827070/1291329/278582/136402/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:49&amp;station_evaId=107011&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   33</span></a><br />nach&nbsp;Hauptbahnhof, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "9\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:50</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/ice_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/481389/339599/801764/240419/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:50&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">ICE  277</span></a><br />nach&nbsp;Basel SBB</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "3\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:50</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/860454/479396/893130/159747/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:50&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">S      7</span></a><br />nach&nbsp;Riedstadt-Goddelau</div><div>&nbsp;<span class=\"red\">Fahrt f&#228;llt aus</span></div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:50</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/bus_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/676494/771593/215512/117755/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:50&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">Bus   37</span></a><br />nach&nbsp;Gutleut Briefzentrum, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "11\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:51</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/ic-ec_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/16437/184062/462498/225770/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:51&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">IC  2374</span></a><br />nach&nbsp;Westerland(Sylt)</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:51</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/141153/629958/318818/112361/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:51&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   21</span></a><br />nach&nbsp;Stadion Stra&#223;enbahn, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "103\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:52</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/506517/361199/548496/105415/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:52&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      2</span></a><br />nach&nbsp;Niedernhausen(Taunus)</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:52</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/905811/869211/916978/156552/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:52&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">U      4</span></a><br />nach&nbsp;Enkheim, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:52</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/102663/608320/230960/81270/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:52&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   17</span></a><br />nach&nbsp;Neu-Isenburg Stadtgrenze, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:52</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/750189/825279/925870/212873/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:52&amp;station_evaId=107011&amp;station_type=dep&amp;\"><span class=\"bold\">STR   17</span></a><br />nach&nbsp;Rebstockbad, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "23\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:53</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/re-rb_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/266304/294739/789472/305972/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:53&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">VIA25012</span></a><br />nach&nbsp;Neuwied</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "7\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:54</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/ice_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/220425/253657/184934/18992/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:54&amp;station_evaId=8000105&amp;station_type=dep&amp;\"><span class=\"bold\">ICE  621</span></a><br />nach&nbsp;N&#252;rnberg Hbf</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "104\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:54</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/856614/477979/74252/248419/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:54&amp;station_evaId=8098105&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Friedrichsdorf(Taunus)</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:54</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/615975/780541/250228/80212/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:54&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   17</span></a><br />nach&nbsp;Rebstockbad, Frankfurt a.M.</div></div>\n" +
            "<div class=\"sqdetailsDep trow\">\n" +
            "<div class=\"sqPlatform\">\n" +
            "</div>\n" +
            "<div class=\"sqTime\">\n" +
            "<span class=\"bold\">10:54</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/u-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/166686/640345/675184/282033/80?webview=&amp;si=8000105&amp;bt=dep&amp;ti=10:37&amp;pt=10:37&amp;p=1111111111&amp;date_bhftafel=28.01.18&amp;max=50&amp;rt=1&amp;&amp;date=28.01.18&amp;time=10:54&amp;station_evaId=100010&amp;station_type=dep&amp;\"><span class=\"bold\">STR   21</span></a><br />nach&nbsp;Nied Kirche, Frankfurt a.M.</div></div>\n" +
            "</div>\n" +
            "<div class=\"rlinebig\"></div>\n" +
            "<div class=\"fline\" style=\"height: 40px;\">\n" +
            "<a class=\"btnRight subbtnsmall\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?si=8000105&amp;bt=dep&amp;ti=10:54%2B1&amp;p=1111111111&amp;date=28.01.18&amp;max=50&amp;rt=1&amp;use_realtime_filter=1&amp;start=yes&amp;\">Sp&#228;ter</a>\n" +
            "</div>\n" +
            "<div class=\"rlinebottom\"></div>\n" +
            "<div class=\"bggrey\" style=\"padding-left: 16px;\">\n" +
            "<a class=\"arrowlink\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?si=8000105&amp;bt=arr&amp;ti=10:37&amp;p=1111111111&amp;max=50&amp;rt=1&amp;use_realtime_filter=1&amp;date=28.01.18&amp;start=yes&amp;\">Ankunft</a>\n" +
            "</div>\n" +
            "<div class=\"formular\">\n" +
            "<form action=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?\" method=\"post\" style=\"display:inline\">\n" +
            "<div class=\"bline bggrey\">\n" +
            "<input type=\"submit\" class=\"nebenbtnsmall\" name=\"rt\" style=\"margin-left: 6px;\" value=\"Zur&#252;ck\" />\n" +
            "</div>\n" +
            "</form>\n" +
            "</div>\n" +
            "</div>\n" +
            "<script type=\"text/javascript\">\n" +
            "digitalData.suchparameter.start = new Object();\n" +
            "digitalData.suchparameter.start.name = \"Frankfurt(Main)Hbf\";\n" +
            "digitalData.suchparameter.start.eBhf = \"008000105\";\n" +
            "digitalData.suchparameter.start.typ = \"Haltestelle\";\n" +
            "digitalData.suchparameter.start.land = \"DEU\";\n" +
            "digitalData.suchparameter.reisedatumHin = \"2018-01-28\";\n" +
            "digitalData.suchparameter.reisezeitHinVon = \"10:37\";\n" +
            "digitalData.suchparameter.hIstAnkunft = \"0\";\n" +
            "digitalData.suchparameter.reiseparameterH = new Array();\n" +
            "var reiseprodukte = new Object();\n" +
            "reiseprodukte.ICE = 1;\n" +
            "reiseprodukte.IC_EC = 1;\n" +
            "reiseprodukte.IR = 1;\n" +
            "reiseprodukte.RE_RB = 1;\n" +
            "reiseprodukte.S = 1;\n" +
            "reiseprodukte.Bus = 1;\n" +
            "reiseprodukte.Schiff = 1;\n" +
            "reiseprodukte.U = 1;\n" +
            "reiseprodukte.Tram = 1;\n" +
            "digitalData.suchparameter.reiseparameterH.push({reiseprodukte: reiseprodukte});\n" +
            "</script>\n" +
            "</div>\n" +
            "<div id=\"footer\" style=\"\">\n" +
            "<div id=\"branding_footer\">\n" +
            "<div class=\"bar\"></div>\n" +
            "</div>\n" +
            "<ul class=\"footer\">\n" +
            "<li class=\"firstitem\"><a class=\"footerlinks\" href=\"http://www.bahn.de/m/view/de/index.shtml\">Startseite</a></li>\n" +
            "<li class=\"\">\n" +
            "<a class=\"footerlinks\" href=\"http://www.bahn.de/m/view/de/home/kontakt/impressum.shtml\">Impressum</a>\n" +
            "</li>\n" +
            "</ul>\n" +
            "</div>\n" +
            "<p class=\"webtrack\">\n" +
            "<img src=\"https://st.bahn.de/b/ss//5/1485231770?AQB=1&amp;gn=MOBI_ASK_DEU_de_AnkunftAbfahrtAb&amp;ch=MOBI_ASK_DEU_de&amp;ev=event48,event17&amp;AQE=1\" width=\"5\" height=\"5\" alt=\"\" />\n" +
            "<script type=\"text/javascript\">\n" +
            "var utag_data = {\n" +
            "}\n" +
            "</script>\n" +
            "<script type=\"text/javascript\">\n" +
            "(function(a,b,c,d){\n" +
            "a='https://www.bahn.de/media/view/tms/utag.js';\n" +
            "b=document;c='script';d=b.createElement(c);d.src=a;d.type='text/java'+c;d.async=true;\n" +
            "a=b.getElementsByTagName(c)[0];a.parentNode.insertBefore(d,a);\n" +
            "})();\n" +
            "</script>\n" +
            "</p>\n" +
            "</div>\n" +
            "</body>\n" +
            "</html>\n";

    public final static String htmlResponseFFMHauptwache = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
            "    <!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd\">\n" +
            "    <html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "    <head>\n" +
            "    <title>Deutsche Bahn - Abfahrt</title>\n" +
            "    <meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\" />\n" +
            "    <meta http-equiv=\"expires\" content=\"-1\" />\n" +
            "    <meta http-equiv=\"cache-control\" content=\"no-cache\" />\n" +
            "    <meta http-equiv=\"pragma\" content=\"no-cache\" />\n" +
            "    <meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0;\" />\n" +
            "    <meta name=\"format-detection\" content=\"telephone=no\" />\n" +
            "    <meta name=\"HandheldFriendly\" content=\"true\" />\n" +
            "    <link rel=\"shortcut icon\" href=\"https://www.img-bahn.de/s3/prod/v/img_old/favicon.ico\" />\n" +
            "    <link rel=\"apple-touch-icon\" type=\"image/x-icon\" href=\"https://www.img-bahn.de/s3/prod/v/img_old/apple-touch-icon.png\"/>\n" +
            "    <script type=\"text/javascript\">\n" +
            "    digitalData = new Object();\n" +
            "    digitalData.pageInstanceID  = \"_BAHN_AnkunftAbfahrtAb_de\";\n" +
            "    digitalData.version         = \"1.0\";\n" +
            "    digitalData.reportSuite     = \"\";\n" +
            "    digitalData.numberCarts     = 0;\n" +
            "    tmpDate                     = new Date();\n" +
            "    digitalData.creationDate    = tmpDate.getFullYear()+\"-\"+((tmpDate.getMonth()<9)?\"0\":\"\")+(tmpDate.getMonth()+1).toString()+\"-\"+((tmpDate.getDate()<10)?\"0\":\"\")+tmpDate.getDate()+\"T\"+((tmpDate.getHours()<10)?\"0\":\"\")+tmpDate.getHours()+\":\"+((tmpDate.getMinutes()<10)?\"0\":\"\")+tmpDate.getMinutes()+\":\"+((tmpDate.getSeconds()<10)?\"0\":\"\")+tmpDate.getSeconds()+\"+\"+(tmpDate.getTimezoneOffset()/-60)+\":00\";\n" +
            "    digitalData.page            = new Object();\n" +
            "    digitalData.suchparameter   = new Object();\n" +
            "    digitalData.user            = new Object();\n" +
            "    digitalData.page.pageInfo   = new Object();\n" +
            "    digitalData.page.testing    = new Object();\n" +
            "    digitalData.page.category   = new Object();\n" +
            "    digitalData.page.teaser     = new Object();\n" +
            "    digitalData.page.interaktion= new Object();\n" +
            "    digitalData.page.isError    = false;\n" +
            "    digitalData.page.environment  = \"\";\n" +
            "    digitalData.page.pageInfo.pageID    = \"BAHN_AnkunftAbfahrtAb_de\";\n" +
            "    digitalData.page.pageInfo.portal    = \"BAHN\";\n" +
            "    digitalData.page.pageInfo.anwendung = \"ASK\";\n" +
            "    digitalData.page.pageInfo.channel   = \"BAHN_ASK_DEU_de\";\n" +
            "    digitalData.page.pageInfo.channelSpecific     = \"\";\n" +
            "    digitalData.page.pageInfo.prozesseinstieg   = \"\";\n" +
            "    digitalData.page.pageInfo.prozess           = \"\";\n" +
            "08-24 17:22:13.671 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: digitalData.page.pageInfo.pageName          = \"BAHN_ASK_DEU_de_AnkunftAbfahrtAb\";\n" +
            "    digitalData.page.pageInfo.pageNameSpecific  = \"AnkunftAbfahrtAb\";\n" +
            "    var tmp    = this.document.URL.match(/[^\\?]+/);\n" +
            "    if(tmp)\n" +
            "    digitalData.page.pageInfo.destinationURL    = tmp[0];\n" +
            "    else\n" +
            "    digitalData.page.pageInfo.destinationURL    = this.document.URL;\n" +
            "    digitalData.page.pageInfo.destinationURLParameter = new Array();\n" +
            "    var tmp = this.document.URL.match(/[(\\?|\\&)]([^=]+)\\=([^&#]+)/g);\n" +
            "    if(tmp)\n" +
            "    {\n" +
            "    for(var i = 0; i < tmp.length; i++)\n" +
            "    {\n" +
            "    var tmpString = tmp[i].substring(1).split(\"=\");\n" +
            "    digitalData.page.pageInfo.destinationURLParameter[i] = {\"name\": tmpString[0] , \"value\": tmpString[1]};\n" +
            "    }\n" +
            "    }\n" +
            "    digitalData.page.pageInfo.referringURL      = document.referrer;\n" +
            "    digitalData.page.pageInfo.onsiteSearchTerm  = \"\";\n" +
            "    digitalData.page.pageInfo.onsiteSearchResults  = 0;\n" +
            "    digitalData.page.pageInfo.sysEnv          = \"android\";\n" +
            "    digitalData.page.pageInfo.version           = \"HAFAS 5.43.DB.R18.08.1.a\";\n" +
            "    digitalData.page.pageInfo.issueDate         = digitalData.creationDate;\n" +
            "    digitalData.page.pageInfo.effectiveDate     = digitalData.creationDate;\n" +
            "    digitalData.page.pageInfo.effectiveDateUnix = tmpDate.getTime();\n" +
            "    digitalData.page.pageInfo.expiryDate        = digitalData.creationDate;\n" +
            "    digitalData.page.pageInfo.language          = \"de\";\n" +
            "    digitalData.page.pageInfo.country           = \"DEU\";\n" +
            "    digitalData.page.testing.aktiv              = false;\n" +
            "    digitalData.page.testing.anzahlVariationen  = 0;\n" +
            "    digitalData.page.testing.variante           = new Array();\n" +
            "    digitalData.page.category.hierLevel             = new Array();\n" +
            "    digitalData.page.category.hierLevel.push(\"web\");\n" +
            "    digitalData.page.category.hierLevel.push(\"AnkunftAbfahrtAb\");\n" +
            "    digitalData.page.category.numberHierarchyLevels = 2;\n" +
            "    digitalData.page.interaktion.anzahlTypen    = 0;\n" +
            "    digitalData.page.interaktion.typ            = new Array();\n" +
            "    digitalData.page.teaser.anzahlTeaser        = 0;\n" +
            "    digitalData.page.teaser.teaserItem          = new Array();\n" +
            "    digitalData.user.profile            = new Object();\n" +
            "    digitalData.user.kundentyp     = \"PK\";\n" +
            "    digitalData.user.loginstatus        = \"logout\";\n" +
            "    digitalData.user.kundenstatus       = \"anonym\";\n" +
            "    digitalData.user.profile.address    = new Object();\n" +
            "    digitalData.user.profile.address.postalCode = \"\";\n" +
            "    digitalData.user.profile.address.city       = \"\";\n" +
            "    digitalData.user.profile.address.country    = \"\";\n" +
            "    digitalData.user.profile.anrede     = \"\";\n" +
            "    digitalData.user.profile.bcStatus           = \"\";\n" +
            "    digitalData.user.profile.hash               = \"\";\n" +
            "    digitalData.user.profile.nlHash             = \"\";\n" +
            "    digitalData.user.profile.isLSV              = 0;\n" +
            "    </script>\n" +
            "08-24 17:22:13.672 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: <script type=\"text/javascript\" src=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/js/bahn_mobile.min.js\" ></script>\n" +
            "    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/css/bahn_mobile.css\" />\n" +
            "    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/css_old/hafas_mobile.css\" />\n" +
            "    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/css/touch.css\" />\n" +
            "    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/css_old/hafas_touch.css\" />\n" +
            "    </head>\n" +
            "    <body onload=\"BAHN.init(); initTouchElements();\">\n" +
            "    <div id=\"doc\" class=\"touch\">\n" +
            "    <div id=\"header\">\n" +
            "    <div class=\"logo\">\n" +
            "    <img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/db_em_rgb_28px.png\" width=\"40\" height=\"28\" style=\"padding: 14px 0;\" alt=\"DB Bahn\" />\n" +
            "    </div>\n" +
            "    <div id=\"branding\">\n" +
            "    <div class=\"bar\"> </div>\n" +
            "    </div>\n" +
            "    </div>\n" +
            "    <div id=\"content\" class=\"\">\n" +
            "    <h1>\n" +
            "    Abfahrt \n" +
            "    </h1>\n" +
            "    <div class=\"inputtbl\">\n" +
            "    <div class=\"fline stdpadding\">\n" +
            "    <span class=\"bold\">\n" +
            "    Frankfurt(M)Hauptwache - Aktuell\n" +
            "    </span>\n" +
            "    <br />\n" +
            "    Abfahrt 17:22\n" +
            "    Uhr, 24.08.18\n" +
            "    </div>\n" +
            "    <div class=\"rlinebig\"></div>\n" +
            "    <div class=\"fline\" style=\"height: 40px;\">\n" +
            "    &nbsp; <a class=\"btnRight subbtnsmall\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&amp;protocol=https:&amp;rt=1&amp;use_realtime_filter=1&amp;webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22%2D60&amp;pt=17:22&amp;p=1111111111111111&amp;date=24.08.18&amp;mx=50&amp;start=yes&amp;\">Fr&#252;her</a>\n" +
            "    </div>\n" +
            "    <div class=\"rlinebig\"></div>\n" +
            "    <div class=\"sqPlatform sqHead\">\n" +
            "    Gleis\n" +
            "    </div>\n" +
            "    <div class=\"sqTime sqHead\">\n" +
            "    Ab\n" +
            "    </div>\n" +
            "    <div class=\"sqProduct sqHead\">\n" +
            "    &nbsp;\n" +
            "    </div>\n" +
            "    <div class=\"sqDirection sqHead\">\n" +
            "    In Richtung\n" +
            "    </div>\n" +
            "    <div class=\"rlinebig\"></div>\n" +
            "    <div class=\"clicktable\">\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:14</span><br/><span class=\"delay\">17:23</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/737997/892757/186038/152985/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:14&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:16</span><br/><span class=\"delay\">17:25</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/884349/948161/324492/132543/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:16&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;Gonzenheim (U), Bad Homburg v.d. H&#246;he</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "08-24 17:22:13.673 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:16</span><br/><span class=\"delay\">17:26</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/803130/921110/793272/128934/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:16&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:18</span><br/><span class=\"delayOnTime\">17:18</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/210732/276701/218974/39243/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:18&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      2</span></a><br />nach&nbsp;Niedernhausen(Taunus)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:19</span><br/><span class=\"delay\">17:25</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/887526/971474/140452/225622/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:19&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:20</span><br/><span class=\"delayOnTime\">17:23</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/497445/372585/565094/116752/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:20&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Friedrichsdorf(Taunus)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:22</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/257214/738330/837350/332945/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:22&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Enkheim, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:22</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/417858/792311/67786/105400/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:22&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Hausen, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:23</span>&nbsp;<span class=\"okmsg\">+0</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/647022/421963/446028/7359/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:23&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;R&#246;dermark-Ober Roden</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:23</span><br/><span class=\"delayOnTime\">17:25</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/655176/425907/966970/265093/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:23&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;Hochheim(Main)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:24</span><br/><span class=\"delayOnTime\">17:27</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/365598/775376/354600/55442/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:24&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:24</span><br/><span class=\"delayOnTime\">17:28</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/628893/863291/738452/159598/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:24&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;Gonzenheim (U), Bad Homburg v.d. H&#246;he</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "08-24 17:22:13.674 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:25</span><br/><span class=\"delayOnTime\">17:26</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/342915/320984/304066/37746/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:25&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      4</span></a><br />nach&nbsp;Kronberg(Taunus)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:25</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/586671/845266/286542/52293/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:25&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Praunheim Heerstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:26</span><br/><span class=\"delayOnTime\">17:28</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/526092/382952/686364/167822/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:26&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Frankfurt(Main)S&#252;d</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:26</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/264030/736839/874008/349002/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:26&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Ostbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:26</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/307095/758156/102866/50940/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:26&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:26</span><br/><span class=\"delayOnTime\">17:30</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/331044/783435/742300/260809/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:26&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:28</span><br/><span class=\"delayOnTime\">17:29</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/376296/332819/391438/70290/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:28&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      9</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:28</span><br/><span class=\"delayOnTime\">17:29</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/936879/519826/180136/222227/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:28&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      2</span></a><br />nach&nbsp;Dietzenbach Bahnhof</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:29</span><br/><span class=\"delayOnTime\">17:31</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/294255/744843/318024/60933/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:29&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "08-24 17:22:13.675 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:29</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/149865/702681/64540/17693/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:29&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Hausen, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:29</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/230691/733131/742950/294585/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:29&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;Riedberg, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:30</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/695151/438599/253760/104845/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:30&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      6</span></a><br />nach&nbsp;Friedberg(Hess)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:30</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/317001/758288/569576/179129/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:30&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Enkheim, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:31</span><br/><span class=\"delayOnTime\">17:32</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/324900/315177/483872/133638/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:31&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      6</span></a><br />nach&nbsp;Frankfurt(Main)S&#252;d</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:31</span><br/><span class=\"delayOnTime\">17:34</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/880353/946829/666880/39996/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:31&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;Gonzenheim (U), Bad Homburg v.d. H&#246;he</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:31</span><br/><span class=\"delayOnTime\">17:33</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/830970/930390/511960/21019/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:31&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:33</span><br/><span class=\"delayOnTime\">17:34</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/451800/357985/947340/323073/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:33&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      9</span></a><br />nach&nbsp;Hanau Hbf</div></div>\n" +
            "08-24 17:22:13.676 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:33</span>&nbsp;<span class=\"okmsg\">+0</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/232980/285195/349732/97209/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:33&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      2</span></a><br />nach&nbsp;Niedernhausen(Taunus)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:33</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/946497/964482/333558/148728/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:33&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Ostbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:33</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/869826/939649/506110/36895/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:33&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Praunheim Heerstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:34</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/188004/718458/470472/172577/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:34&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:34</span><br/><span class=\"delayOnTime\">17:36</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/906432/977776/404908/99697/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:34&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:35</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/827874/483543/257916/147005/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:35&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Bad Homburg</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:36</span><br/><span class=\"delayOnTime\">17:37</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/913353/511132/417918/95509/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:36&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      4</span></a><br />nach&nbsp;Langen(Hess)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:36</span>&nbsp;<span class=\"okmsg\">+0</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/362865/767688/378506/68307/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:36&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "08-24 17:22:13.677 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:36</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/758832/909168/731318/112727/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:36&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;Riedberg, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:37</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/716169/891315/638898/80735/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:37&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Enkheim, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:37</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/471273/810116/358666/22250/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:37&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Hausen, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:38</span><br/><span class=\"delayOnTime\">17:40</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/346926/321936/229928/693/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:38&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:38</span>&nbsp;<span class=\"okmsg\">+0</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/258387/293643/180884/4316/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:38&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;R&#246;dermark-Ober Roden</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:39</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/377814/779196/88982/81453/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:39&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;Gonzenheim (U), Bad Homburg v.d. H&#246;he</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:39</span><br/><span class=\"delayOnTime\">17:40</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/535776/832102/915984/279409/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:39&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    3\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:40</span><br/><span class=\"delay\">17:45</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/49617/223119/515462/241212/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:40&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      3</span></a><br />nach&nbsp;Bad Soden(Taunus)</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "08-24 17:22:13.678 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: <span class=\"bold\">17:40</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/892734/947287/694146/49503/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:40&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Praunheim Heerstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    2\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:41</span>&nbsp;<span class=\"okmsg\">+0</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/808380/476235/537690/635/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:41&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Frankfurt(Main)S&#252;d</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:41</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/334938/760475/333676/55201/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:41&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Ostbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:41</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/506049/824474/496900/79776/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:41&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "    <div class=\"sqdetailsDep trow\">\n" +
            "    <div class=\"sqPlatform\">\n" +
            "    </div>\n" +
            "    <div class=\"sqTime\">\n" +
            "    <span class=\"bold\">17:41</span>&nbsp;<span class=\"okmsg\">+0</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/103305/707522/918304/424725/80?webview=&amp;si=8006692&amp;bt=dep&amp;ti=17:22&amp;pt=17:22&amp;p=1111111111111111&amp;date_bhftafel=24.08.18&amp;max=50&amp;rt=1&amp;&amp;date=24.08.18&amp;time=17:41&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "    </div>\n" +
            "    <div class=\"rlinebig\"></div>\n" +
            "    <div class=\"fline\" style=\"height: 40px;\">\n" +
            "    <a class=\"btnRight subbtnsmall\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?si=8006692&amp;bt=dep&amp;ti=17:41%2B1&amp;p=1111111111111111&amp;date=24.08.18&amp;max=50&amp;rt=1&amp;use_realtime_filter=1&amp;start=yes&amp;\">Sp&#228;ter</a>\n" +
            "    </div>\n" +
            "    <div class=\"rlinebottom\"></div>\n" +
            "    <div class=\"bggrey\" style=\"padding-left: 16px;\">\n" +
            "    <a class=\"arrowlink\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?si=8006692&amp;bt=arr&amp;ti=17:22&amp;p=1111111111111111&amp;max=50&amp;rt=1&amp;use_realtime_filter=1&amp;date=24.08.18&amp;start=yes&amp;\">Ankunft</a>\n" +
            "    </div>\n" +
            "    <div class=\"formular\">\n" +
            "    <form action=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?\" method=\"post\" style=\"display:inline\">\n" +
            "    <div class=\"bline bggrey\">\n" +
            "    <input type=\"submit\" class=\"nebenbtnsmall\" name=\"rt\" style=\"margin-left: 6px;\" value=\"Zur&#252;ck\" />\n" +
            "    </div>\n" +
            "    </form>\n" +
            "    </div>\n" +
            "    </div>\n" +
            "    <script type=\"text/javascript\">\n" +
            "    digitalData.suchparameter.start = new Object();\n" +
            "    digitalData.suchparameter.start.name = \"\";\n" +
            "    digitalData.suchparameter.start.eBhf = \"8006692\";\n" +
            "    digitalData.suchparameter.start.typ = \"Haltestelle\";\n" +
            "    digitalData.suchparameter.reisedatumHin = \"2018-08-24\";\n" +
            "    digitalData.suchparameter.reisezeitHinVon = \"17:22\";\n" +
            "    digitalData.suchparameter.hIstAnkunft = \"0\";\n" +
            "    digitalData.suchparameter.reiseparameterH = new Array();\n" +
            "    var reiseprodukte = new Object();\n" +
            "    reiseprodukte.ICE = 1;\n" +
            "08-24 17:22:13.679 26180-26180/org.sge.widgetalarmmanagerexample I/System.out: reiseprodukte.IC_EC = 1;\n" +
            "    reiseprodukte.IR = 1;\n" +
            "    reiseprodukte.RE_RB = 1;\n" +
            "    reiseprodukte.S = 1;\n" +
            "    reiseprodukte.Bus = 1;\n" +
            "    reiseprodukte.Schiff = 1;\n" +
            "    reiseprodukte.U = 1;\n" +
            "    reiseprodukte.Tram = 1;\n" +
            "    digitalData.suchparameter.reiseparameterH.push({reiseprodukte: reiseprodukte});\n" +
            "    </script>\n" +
            "    </div>\n" +
            "    <div id=\"footer\" style=\"\">\n" +
            "    <div id=\"branding_footer\">\n" +
            "    <div class=\"bar\"></div>\n" +
            "    </div>\n" +
            "    <ul class=\"footer\">\n" +
            "    <li class=\"firstitem\"><a class=\"footerlinks\" href=\"http://www.bahn.de/m/view/de/index.shtml\">Startseite</a></li>\n" +
            "    <li class=\"\">\n" +
            "    <a class=\"footerlinks\" href=\"http://www.bahn.de/m/view/de/home/kontakt/impressum.shtml\">Impressum</a>\n" +
            "    </li>\n" +
            "    </ul>\n" +
            "    </div>\n" +
            "    <p class=\"webtrack\">\n" +
            "    <img src=\"https://st.bahn.de/b/ss//5/1642874124?AQB=1&amp;gn=MOBI_ASK_DEU_de_AnkunftAbfahrtAb&amp;ch=MOBI_ASK_DEU_de&amp;ev=event48,event17&amp;AQE=1\" width=\"5\" height=\"5\" alt=\"\" />\n" +
            "    <script type=\"text/javascript\">\n" +
            "    var utag_data = {\n" +
            "    }\n" +
            "    </script>\n" +
            "    <script type=\"text/javascript\">\n" +
            "    (function(a,b,c,d){\n" +
            "    a='https://www.bahn.de/media/view/tms/utag.js';\n" +
            "    b=document;c='script';d=b.createElement(c);d.src=a;d.type='text/java'+c;d.async=true;\n" +
            "    a=b.getElementsByTagName(c)[0];a.parentNode.insertBefore(d,a);\n" +
            "    })();\n" +
            "    </script>\n" +
            "    </p>\n" +
            "    </div>\n" +
            "    </body>\n" +
            "    </html>";


    public final static String htmlResponse_RMV_SpeyererStrasse = "<table class=\"stationOverview\" summary=\"Ank&#252;nfte\">\n" +
            "<thead>\n" +
            "<tr>\n" +
            "<th id=\"hafasSQdepTime\">Zeit</th>\n" +
            "<th id=\"hafasSQdepLine\">Linie</th>\n" +
            "<th id=\"hafasSQdepDest\">von</th>\n" +
            "</tr>\n" +
            "</thead>\n" +
            "<tbody>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "21:46\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<img class=\"icon\" src=\"/auskunft/s/n/img/verspaetung_gerechnet.png\" alt=\"\" title=\"\" border=\"0\" height=\"10\" width=\"10\" />&nbsp;21:51\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_0\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "21:51\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"21:51\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_1\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "21:54\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<img class=\"icon\" src=\"/auskunft/s/n/img/verspaetung_gerechnet.png\" alt=\"\" title=\"\" border=\"0\" height=\"10\" width=\"10\" />&nbsp;21:57\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_2\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "21:59\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<img class=\"icon\" src=\"/auskunft/s/n/img/verspaetung_gerechnet.png\" alt=\"\" title=\"\" border=\"0\" height=\"10\" width=\"10\" />&nbsp;22:01\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_3\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:01\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:01\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_4\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:06\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:06\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_5\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:09\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<img class=\"icon\" src=\"/auskunft/s/n/img/verspaetung_gerechnet.png\" alt=\"\" title=\"\" border=\"0\" height=\"10\" width=\"10\" />&nbsp;22:10\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_6\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:14\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:14\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_7\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:16\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:16\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_8\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:21\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:21\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_9\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:24\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:24\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_10\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:29\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:29\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_11\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:31\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:31\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_12\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:36\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:36\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_13\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:39\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:39\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_14\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:44\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:44\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_15\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:44\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "Neue Fahrt<br />\n" +
            "<span title=\"22:44\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_16\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:46\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:46\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_17\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:51\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:51\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_18\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:54\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<img class=\"icon\" src=\"/auskunft/s/n/img/verspaetung_gerechnet.png\" alt=\"\" title=\"\" border=\"0\" height=\"10\" width=\"10\" />&nbsp;22:57\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_19\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "22:59\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"22:59\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_20\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:01\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:01\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_21\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:06\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:06\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_22\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:09\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<img src=\"/auskunft/s/n/img/verspaetung_gerechnet.png\" alt=\"\" title=\"\" border=\"0\" height=\"10\" width=\"10\" /> <span class=\"cancel\">Fahrt f&#228;llt aus</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_23\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:14\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:14\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_24\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:16\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:16\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_25\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:21\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:21\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_26\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:24\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:24\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_27\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:29\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:29\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_28\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:31\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:31\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_29\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:31\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "Neue Fahrt<br />\n" +
            "<span title=\"23:31\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_30\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:36\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:36\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_31\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:39\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:39\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_32\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:44\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:44\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_33\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:46\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:46\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_34\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:51\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:51\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_35\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:54\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:54\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_36\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "23:59\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"23:59\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_37\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:01\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"00:01\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_38\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:06\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_39\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:09\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"00:09\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_40\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:14\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_41\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:16\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_42\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:21\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_43\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:24\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "<span title=\"00:24\" class=\"green\"><img src=\"/auskunft/s/n/img/puenktlich.png\" alt=\"\" title=\"\" style=\"vertical-align:middle;\" />p&#252;nktlich</span>\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_44\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:29\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_45\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:31\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_46\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Nied Kirche&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Nied Kirche\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:36\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_47\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Zuckschwerdtstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"shaded\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:39\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 11\n" +
            "<input id=\"prod_bit_arr_48\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"\">\n" +
            "<td headers=\"hafasSQdepTime\">\n" +
            "00:44\n" +
            "<br />\n" +
            "<span class=\"prognosis\">\n" +
            "</span>\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepLine\" class=\"nowrap\">\n" +
            "Tram 21\n" +
            "<input id=\"prod_bit_arr_49\" type=\"hidden\" value=\"32\" />\n" +
            "</td>\n" +
            "<td headers=\"hafasSQdepDest\">\n" +
            "<a href=\"/auskunft/bin/jp/stboard.exe/dn?ld=14.52&amp;protocol=https:&amp;&amp;input=Frankfurt (Main) Stadion Stra&#223;enbahn&amp;maxJourneys=10&amp;view=STATIONINFO&amp;start=1\">\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "</a>\n" +
            "</td>\n" +
            "</tr>\n" +
            "</tbody>\n" +
            "</table>\n" +
            "<div>\n" +
            "<div id=\"mainHIMTickerHolder_arr\" style=\"background-color: #E2EFF9; border-bottom: 1px solid #A6C8E6;border-top: 1px solid #A6C8E6;height: 20px;overflow: hidden;padding: 3px;position: relative;\">\n" +
            "<div id=\"hfsHimTicker_arr\" style=\"color: #000000;font-size: 12px; margin-top: 5px; overflow: hidden;position: absolute; top: 0; white-space: nowrap;\"></div>\n" +
            "<div id=\"hfsHimTicker_arr2\" style=\"color: #000000;font-size: 12px; margin-top: 5px; overflow: hidden;position: absolute; top: 0; white-space: nowrap;\"></div>\n" +
            "</div>\n" +
            "</div>\n" +
            "<script type=\"text/javascript\">\n" +
            "himMessagesarr = [];\n" +
            "/* HIM Infrastrukturmeldungen */\n" +
            "himMessagesarr.push(); \n" +
            "himMessagesarr.push(); \n" +
            ";\n" +
            "/* monitorticker.js - wird mit jedem aufruf neu gemacht */\n" +
            "var tickerOffset = 1;\n" +
            "var tickerSpeed  = 25;\n" +
            "if (typeof hfsHimTickerarr == \"undefined\") {\n" +
            "hfsHimTickerarr = null;\n" +
            "}\n" +
            "tmp = [];\n" +
            "for (i = 0 ; i < himMessagesarr.length ; i++) {\n" +
            "tmp[i] = himMessagesarr[i].head;\n" +
            "}\n" +
            "tmp.unique();\n" +
            "tickerOutputTextarr = tmp.join(\"&nbsp;-&nbsp\");\n" +
            "window.startTickerarr = function() {\n" +
            "if(tickerOutputTextarr != \"\")\n" +
            "{\n" +
            "e(\"mainHIMTickerHolder_arr\").style.display='';\n" +
            "e('hfsHimTicker_arr').innerHTML = tickerOutputTextarr + \"&nbsp;-&nbsp\";\n" +
            "e('hfsHimTicker_arr2').innerHTML = tickerOutputTextarr + \"&nbsp;-&nbsp\";\n" +
            "/* Start Position */\n" +
            "if (!e('hfsHimTicker_arr').style.left) {\n" +
            "e('hfsHimTicker_arr').style.left = '250px';\n" +
            "e('hfsHimTicker_arr2').style.left = 250 + parseInt(e('hfsHimTicker_arr').offsetWidth)+'px';\n" +
            "}\n" +
            "else\n" +
            "{\n" +
            "e('hfsHimTicker_arr').style.left = '0px';\n" +
            "e('hfsHimTicker_arr2').style.left = parseInt(e('hfsHimTicker_arr').offsetWidth)+'px';\n" +
            "}\n" +
            "if (hfsHimTickerarr == null) {\n" +
            "hfsHimTickerarr = setInterval('scrollTextarr()', tickerSpeed);\n" +
            "}\n" +
            "}\n" +
            "else\n" +
            "{\n" +
            "e(\"mainHIMTickerHolder_arr\").style.display='none';\n" +
            "if(typeof hfsHimTickerarr != \"undefined\")\n" +
            "{\n" +
            "stopTickerarr();\n" +
            "}\n" +
            "}\n" +
            "};\n" +
            "window.stopTickerarr = function() {\n" +
            "if((typeof hfsHimTickerarr != \"undefined\") && (hfsHimTickerarr != null)) {\n" +
            "clearInterval(hfsHimTickerarr);\n" +
            "hfsHimTickerarr = null;\n" +
            "}\n" +
            "};\n" +
            "window.scrollTextarr = function() {\n" +
            "if(e('hfsHimTicker_arr'))\n" +
            "{\n" +
            "/* hfsHimTicker */\n" +
            "var st1 = e('hfsHimTicker_arr');\n" +
            "var st2 = e('hfsHimTicker_arr2');\n" +
            "/* Position ern */\n" +
            "st1.style.left = (parseInt(st1.style.left,10) - tickerOffset) + 'px';\n" +
            "st2.style.left = (parseInt(st2.style.left,10) - tickerOffset) + 'px';\n" +
            "/* Zurck zu Start Position */\n" +
            "if (parseInt(st1.style.left,10) + parseInt(st1.offsetWidth,10) < 0)\n" +
            "st1.style.left = parseInt(st2.offsetWidth,10) + 'px';\n" +
            "/* Zurck zu Start Position */\n" +
            "if (parseInt(st2.style.left,10) + parseInt(st2.offsetWidth,10) < 0)\n" +
            "st2.style.left = parseInt(st1.offsetWidth,10) + 'px';\n" +
            "}\n" +
            "};\n" +
            "startTickerarr();\n" +
            "</script>";


    public final static String htmlResponseKVV = "<!DOCTYPE html><html lang=\"de\" xml:lang=\"de\" xmlns=\"http://www.w3.org/1999/xhtml\">" +
            "<head>\n" +
            "<title>Abfahrtsmonitor</title>\n" +
            "<meta charset=\"utf-8\"/>\n" +
            "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n" +
            "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n" +
            "<meta name=\"author\" content=\"MENTZ GmbH\"/>\n" +
            "<meta name=\"description\" content=\"Was sind die nächsten Abfahrtsmöglichkeiten an dieser Haltestelle? Hier können Sie sich schnell und bequem informieren.\"/>\n" +
            "<link rel=\"shortcut icon\" href=\"./gfx/favicon.ico\" type=\"image/x-icon\"/>\n" +
            "<link rel=\"icon\" href=\"./gfx/favicon.ico\" type=\"image/x-icon\"/>\n" +
            "<link href=\"css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "<link href=\"css/datetimepicker.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "<link href=\"css/fonts/mdv_font-awesome.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "<link href=\"css/font/kvv.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "<link href=\"css/external.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "<link href=\"css/mdv_map.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "<link href=\"css/mdv.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "<link href=\"css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<div id=\"std3_main\" class=\"std3_noJs\" data-tunnel=\"/tunnelEfaDirect.php\">\n" +
            "<section class=\"std3_content-box\">\n" +
            "<main class=\"std3_col-xs-12 std3_col-sm-6 std3_col-md-6 std3_col-lg-4 std3_col-xl-3 std3_container std3_full-size\" id=\"std3_main-page-container\">\n" +
            "<div class=\"std3_page std3_page-active std3_full-flex\" data-i18n-group=\"std3_page\">\n" +
            "<form role=\"form\" class=\"std3_form std3_full-flex\" action=\"/fahrt-planen/abfahrtsmonitor.html\"><input type=\"hidden\" class=\"std3_basicParams_opt std3_pt-options std3_mm-options std3_it-options\" name=\"itdLPxx_formAction\" value=\"/fahrt-planen/abfahrtsmonitor.html\"/><input type=\"hidden\" class=\"std3_pt-options std3_mm-options std3_it-options\" name=\"action\" value=\"XSLT_DM_REQUEST\"/><div class=\"std3_pt-options std3_it-options\"><span class=\"std3_upate_params std3_mm-options\"><input type=\"hidden\" name=\"coordOutputFormat\" value=\"WGS84[dd.ddddd]\"/><input type=\"hidden\" name=\"command\" id=\"std3_command\" value=\"\"/><input type=\"hidden\" name=\"itdLPxx_timeFormat\" value=\"23\"/></span><input type=\"hidden\" name=\"language\" id=\"std3_language\" value=\"de\" class=\"std3_basicParams_opt\"/><input type=\"hidden\" id=\"std3_itdLPxx_useJs\" name=\"itdLPxx_useJs\" value=\"0\"/><input type=\"hidden\" name=\"std3_suggestMacro\" value=\"std3_suggest\" class=\"std3_basicParams_opt\"/><input type=\"hidden\" name=\"std3_commonMacro\" value=\"dm\" class=\"std3_basicParams_opt\"/><input type=\"hidden\" name=\"std3_contractorMacro\" value=\"\" class=\"std3_basicParams_opt\"/><input type=\"hidden\" name=\"includeCompleteStopSeq\" value=\"1\" class=\"std3_basicParams_opt\"/><input type=\"hidden\" name=\"mergeDep\" value=\"1\" class=\"std3_basicParams_opt\"/></div><div class=\"std3_col-xs-nodrag\"><div class=\"std3_col-sm-12 std3_reduced_xs_col std3_container std3_full-size\"><div class=\"std3_panel std3_panel-default std3_collapse std3_in\" role=\"tabpanel\"><div class=\"std3_panel-body\" id=\"std3_panel-body-odv-detail\" style=\"display:none;\"><div role=\"alert\" id=\"std3_odvErrorBox\" class=\"std3_alert std3_alert-danger std3_cookie_alert\" style=\"display:none;\"><div id=\"std3_odvErrorBoxContent\" style=\"display:none;\"> </div><div class=\"std3_col-xs-12\" style=\"display:none;\"><span class=\"std3_icon std3_exclamation-triangle-icon\" aria-hidden=\"true\"> </span> <span class=\"std3_sr-only\">Fehler:</span><span id=\"std3_errorMessage\"> </span></div><div style=\"clear:both\"> </div></div><h2 class=\"std3_sr-only\">Abfahrtsmonitor</h2><input type=\"hidden\" name=\"useAllStops\" value=\"1\"/><fieldset class=\"std3_pt-options std3_it-options\"><legend class=\"std3_sr-only\">Abfahrtssuche</legend><div class=\"std3_odv-container\"><div class=\"std3_single_odv_container std3_dropdown std3_odv_container\"><label for=\"std3_dm_input\" class=\"std3_sr-only\">Abfahrtspunkt</label><div class=\"std3_form-group std3_inner-addon std3_right-addon std3_dropdown-toggle\" id=\"dm_dropdownMenu\" aria-expanded=\"false\" role=\"group\"><input type=\"text\" name=\"name_dm\" class=\"std3_form-control mdv_suggest std3_identified-input\" id=\"std3_dm_input\" autocomplete=\"off\" required=\"required\" placeholder=\"Bahnhof / Haltestelle / Adresse\" value=\"Karlsruhe Volkswohnung / Staatstheater\"/><input type=\"hidden\" class=\"std3_nameCoords std3_unsaveable\" id=\"std3_nameCoords_dm\" value=\"935521,5724489\"/><div class=\"std3_input_buttons\"><button type=\"button\" class=\"std3_icon fa-2x std3_locate-me-icon std3_geo-location std3_btn std3_btn-default\" data-usage=\"dm\" aria-label=\"Aktuelle Position nutzen\"> </button></div><input type=\"hidden\" class=\"std3_dm_opt\" name=\"type_dm\" value=\"any\"/></div></div></div></fieldset><div class=\"std3_panel-group\" id=\"std3_enquiry_accordion\" role=\"tablist\" aria-multiselectable=\"true\"><div class=\"std3_panel std3_panel-default\"><div role=\"tab\" class=\"std3_panel-heading std3_toggle std3_accordion_toggle std3_collapsed\" id=\"std3_heading_ac_date\" data-toggle=\"collapse\" data-target=\"#std3_ac_date\" aria-expanded=\"false\" aria-controls=\"std3_ac_date\"><h3 class=\"std3_panel-title\"><a href=\"#std3_ac_date\">Datum / Uhrzeit + Abfahrt / Ankunft<span class=\"std3_icon std3_accrodion-toggle-icon std3_accordion_collapsed\" aria-hidden=\"true\"> </span><span class=\"std3_icon std3_accrodion-toggle-icon std3_accordion_expanded\" aria-hidden=\"true\"> </span></a></h3></div><div id=\"std3_ac_date\" role=\"tabpanel\" aria-labelledby=\"std3_heading_ac_date\" class=\"std3_panel-collapse std3_collapse\"><div class=\"std3_panel-body\"><fieldset class=\"std3_pt-options std3_it-options\"><legend \n" +
            "                Karlsruher Verkehrsverbund GmbH Tullastraße 71 76131 Karlsruhe\n" +
            "            </span><span class=\"std3_odvMinLabel\">Abfahrten von</span> Karlsruhe Volkswohnung / Staatstheater </span> <div class=\"std3_date-time-summary\"><span class=\"std3_dep-arr\">Abfahrt</span> am 04.10.2018 um 23:59 Uhr</div></div><div class=\"std3_edit\"><div class=\"std3_kvv-logo\"><svg version=\"1.1\" x=\"0px\" y=\"0px\" width=\"120px\" height=\"74px\" viewBox=\"0 0 546.16 345.313\" enable-background=\"new 0 0 546.16 345.313\" xml:space=\"preserve\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n" +
            "<g id=\"Ebene_1\">\n" +
            "\t<path d=\"M198.431,271.574h-8.943l-0.025,0.119l-10.541,49.046h12.508c11.247-0.016,19.663-6.066,19.682-15.552   c0.014-5.528-2.805-9.14-8.035-10.07c6.192-0.86,11.467-5.736,11.467-12.611C214.543,272.925,206.263,271.584,198.431,271.574z    M205.981,305.187c-0.014,7.587-6.667,11.039-15.041,11.051h-5.973l4.134-18.812h8.21   C202.239,297.443,205.971,299.813,205.981,305.187z M196.049,292.926h-6.042l3.645-16.851h4.849   c6.254,0.021,10.907,0.535,10.912,6.641C209.418,290.223,202.328,292.848,196.049,292.926z M237.702,283.895   c-11.591,0.004-18.614,10.953-18.633,22.973c0.015,9.666,6.461,14.697,14.852,14.711h0.017c5.816,0,8.581-1.131,10.677-1.899   l0.091-0.033l0.376-4.614l-0.228,0.097c-2.796,1.188-5.99,2.368-10.372,2.368c-6.238-0.01-10.691-3.843-10.701-10.631   c0-0.927,0.063-1.854,0.189-2.719h25.978l0.015-0.136c0.21-2.238,0.491-4.482,0.491-6.664c0-4.087-1.058-7.453-3.19-9.798   C245.13,285.203,241.931,283.895,237.702,283.895z M245.543,300.067h-20.753c1.24-6.388,6.206-12.096,12.911-12.091   c5.655,0.014,8.021,3.733,8.04,9.511C245.742,298.272,245.616,299.133,245.543,300.067z M305.091,284.736l-15.4,30.729   l-3.416-30.729h-5.472l-16.727,30.732l-2.65-30.732h-4.854l0.019,0.165l3.722,35.838h5.478l16.663-30.744l3.624,30.744h5.615   l18.708-36.002H305.091z M328.562,283.896c-11.592,0.004-18.613,10.951-18.632,22.971c0.014,9.666,6.461,14.698,14.851,14.713   c5.828,0,8.595-1.13,10.693-1.901l0.09-0.034l0.376-4.612l-0.228,0.098c-2.795,1.187-5.989,2.367-10.37,2.367   c-6.239-0.01-10.691-3.842-10.702-10.631c0-0.926,0.063-1.854,0.188-2.72h25.979l0.013-0.136c0.211-2.237,0.492-4.481,0.492-6.664   c0-4.086-1.057-7.452-3.189-9.797C335.991,285.203,332.791,283.894,328.562,283.896z M336.402,300.067h-20.75   c1.238-6.388,6.205-12.096,12.91-12.092c5.655,0.015,8.021,3.733,8.041,9.512C336.603,298.271,336.476,299.133,336.402,300.067z    M376.859,284.844c-0.664,2.319-1.201,4.636-1.614,6.897c-1.273-5.604-6.109-7.854-11.613-7.846   c-12.011,0.002-18.334,10.815-18.353,22.133c0.013,7.748,4.322,14.696,12.891,14.711c4.699,0.002,8.742-1.631,11.892-5.021   l-0.486,2.249c-2.123,8.882-4.749,13.793-14.904,13.814c-3.833-0.002-7.366-0.764-10.84-3.056l-0.177-0.115l-0.05,0.201   l-1.225,4.604l0.118,0.053c4.29,1.902,8.031,2.395,12.173,2.393c0.026,0,0.055,0,0.081,0c14.481,0,17.181-6.726,19.807-19.09   l5.321-24.573c0.698-3.078,1.328-5.809,1.679-7.278l0.044-0.185h-4.714L376.859,284.844z M359.78,316.659   c-6.49-0.008-9.356-4.723-9.371-10.63c0.015-7.8,4.612-18.036,13.151-18.053c6.417,0.006,9.497,4.862,9.512,11.191   C373.07,307.317,368.543,316.642,359.78,316.659z M401.844,274.924l-5.373,1.866l-0.019,0.082l-1.655,7.862h-6.994l-1.06,4.082   h7.149l-3.391,15.639c-0.35,1.544-1.613,7.209-1.613,10.324c0.009,3.932,2.895,6.794,7.921,6.8c1.839,0,3.199-0.356,4.545-0.994   l0.074-0.036l0.461-4.153l-0.253,0.141c-1.24,0.688-2.398,0.96-3.706,0.96c-2.525-0.017-3.893-1.442-3.911-4.188   c0-2.287,0.556-4.587,1.047-6.971l3.755-17.522h9.167l0.981-4.082h-9.314L401.844,274.924z M446.51,283.895   c-4.23,0.002-8.307,1.337-10.841,2.392l-0.08,0.034l-0.529,4.84l0.247-0.121c2.373-1.188,6.419-3.065,10.504-3.065   c4.838,0.017,7.463,2.712,7.479,7.552c0,1.399-0.063,2.41-0.19,3.407c-1.368-0.135-2.936-0.267-4.698-0.267   c-8.751,0.013-20.643,2.165-20.663,12.751c0.011,5.965,4.767,10.151,10.371,10.162h0.021c5.14,0,9.063-1.562,12.062-5.834   c-0.287,1.456-0.42,3.115-0.61,4.828l-0.019,0.165h4.72l0.008-0.142c0.141-2.438,0.627-5.722,1.326-8.442l-0.145-0.035v0   l0.147,0.027l1.89-9.66c0.631-2.807,0.912-5.402,0.912-6.819c0-3.737-1.022-6.688-3.037-8.7   C453.372,284.954,450.386,283.895,446.51,283.895z M439.651,317.5c-3.515-0.009-6.781-2.188-6.781-6.152   c0.004-3.849,2.349-5.972,5.478-7.175c3.127-1.197,7.017-1.426,9.984-1.426c1.402,0,2.751,0.129,4.168,0.139   C451.483,310.294,447.737,317.503,439.651,317.5z M475.552,268.051l-11.24,52.688h4.93l11.264-52.806h-4.928L475.552,268.051z    M491.791,268.052l-11.24,52.686h4.929l11.266-52.805h-4.931L491.791,268.052z M516.229,283.895   c-11.593,0.004-18.614,10.952-18.633,22.972c0.015,9.666,6.461,14.697,14.853,14.711h0.016c5.816,0,8.579-1.1\n" +
            "</g>\n" +
            "<g id=\"Ebene_2\">\n" +
            "</g>\n" +
            "<g id=\"Ebene_3\">\n" +
            "\t<path display=\"none\" fill=\"#FFFFFF\" d=\"M459.51,124.44h-2.79H31.161h-4.392l0.979-4.279l7.668-33.525l0.618-2.703l2.773-0.017   c7.192-0.042,14.291-0.299,21.095-0.762c72.72-4.952,140.346-32.848,195.562-80.668l0.985-0.854h1.306h50.664h8.142l-5.602,5.907   c-29.242,30.841-65.154,57.043-104.575,76.4h257.997h4.392l-0.979,4.279l-7.662,33.502L459.51,124.44L459.51,124.44z\"/>\n" +
            "\t<g display=\"none\" opacity=\"0.1\">\n" +
            "\t\t<path display=\"inline\" fill=\"#FFFFFF\" d=\"M25.976,114.328L5.789,202.594h23.7l9.371-41.662l21.026,41.662h27.801L61.974,157.17    l42.785-42.842H74.363L41.32,150.176l8.359-35.848H25.976z M107.25,114.328l9.763,88.266h29.095l50.461-88.266H171.23    l-35.513,66.416l-5.084-66.416H107.25z M201.06,114.328l9.63,88.266h29.553l50.25-88.266h-25.326l-35.529,66.416l-5.141-66.416    H201.06z\"/>\n" +
            "\t</g>\n" +
            "\t<path display=\"none\" opacity=\"0.1\" fill=\"#FFFFFF\" d=\"M188.576,58.607c44.077-19.366,85.062-48.014,117.579-82.307h-48.398   C204.01,22.847,135.514,52.68,60.139,57.813c-7.044,0.479-14.153,0.729-21.311,0.771L31.16,92.108h425.561l7.66-33.501H188.576z    M260.649,202.594h43.725c1.066-1.115,2.141-2.221,3.23-3.311c35.775-35.752,84.398-58.445,138.445-60.516l7.699-33.667   C374.606,105.225,304.432,143.535,260.649,202.594z\"/>\n" +
            "\t<g display=\"none\">\n" +
            "\t\t<path display=\"inline\" fill=\"#CD1719\" d=\"M25.49,143.16L5.304,231.425h23.7l9.371-41.662l21.026,41.662h27.801l-25.714-45.424    l42.785-42.841H73.878l-33.043,35.847l8.359-35.847H25.49z M106.765,143.16l9.763,88.265h29.095l50.461-88.265h-25.338    l-35.513,66.416l-5.084-66.416H106.765z M200.574,143.16l9.631,88.265h29.551l50.252-88.265h-25.326l-35.531,66.416l-5.139-66.416    H200.574z\"/>\n" +
            "\t</g>\n" +
            "\t<path fill=\"#D0043C\" d=\"M190.562,87.438c44.074-19.366,85.341-48.014,117.859-82.307h-50.664   C204.01,51.678,135.514,81.511,60.139,86.644c-7.044,0.479-14.153,0.729-21.311,0.771l-7.667,33.524h425.561l7.66-33.501H190.562z    M260.649,231.425h46.273c38.302-39.693,85.08-61.756,139.127-63.826l7.699-33.667   C374.606,134.056,304.432,172.366,260.649,231.425z\"/>\n" +
            "\t<g>\n" +
            "\t\t<path d=\"M25.976,143.159L5.789,231.425h23.7l9.371-41.662l21.026,41.662h27.801l-25.714-45.424l42.785-42.842H74.363    L41.32,179.007l8.359-35.848H25.976z M107.25,143.159l9.763,88.266h29.095l50.461-88.266H171.23l-35.513,66.416l-5.084-66.416    H107.25z M201.06,143.159l9.63,88.266h29.553l50.25-88.266h-25.326l-35.529,66.416l-5.141-66.416H201.06z\"/>\n" +
            "\t</g>\n" +
            "</g>\n" +
            "<g id=\"Ebene_4\">\n" +
            "</g>\n" +
            "</svg></div><button type=\"button\" class=\"std3_btn std3_btn-primary std3_btn-lg std3_toggle-odv\"><span class=\"std3_edit-text std3_hidden-xs\">Ändern</span><i class=\"std3_icon std3_edit-icon std3_hidden-sm std3_hidden-md\"> </i></button></div></div></div></div></div></div></div><div id=\"std3_ajax-result-container\"><div class=\"std3_panel std3_panel-default std3_page-result  std3_col-xs-nodrag\"><div id=\"std3_dm_panel\" class=\"std3_panel-heading\" role=\"tabpanel\" tabindex=\"0\"><div class=\"std3_panel-title std3_container-fluid std3_full-size\"><span class=\"std3_col-xs-5 std3_full-size\"><input type=\"checkbox\" class=\"std3_fancy-check std3_sr-only std3_update-dm\" id=\"std3_updateDm\"/><label for=\"std3_updateDm\" class=\"std3_updateDmLabel\"><span class=\"std3_checkbox-label\">Minütlich aktualisieren</span></label></span><div class=\"std3_col-xs-7 std3_addional-result-icons\"><div class=\"std3_pull-right\"><a href=\"#\" class=\"std3_icon std3_share-icon std3_sharing-link\" data-toggle=\"modal\" data-target=\"#std3_shareDm\"><span class=\"std3_sr-only\">Versenden/Teilen des DMs</span></a><span class=\"std3_seperator\">|</span><a href=\"#\" class=\"std3_icon std3_print-icon std3_print-window\"><span class=\"std3_sr-only\">Drucken</span></a><span class=\"std3_seperator\">|</span><a href=\"#\" class=\"std3_icon std3_close-icon std3_closeDm\" data-toggle=\"std3_close\"><span class=\"std3_sr-only\">Abfahrtsergebnis schließen</span></a></div></div> </div></div><div id=\"std3_dm_box\" aria-labelledby=\"std3_dm_panel\" role=\"tabpanel\" class=\"std3_panel-body std3_limited-sm std3_loading-message-container\"><div class=\"std3_row\"><div class=\"std3_panel-group\" id=\"std3_stop_accordion\" role=\"tablist\" aria-multiselectable=\"true\"><div class=\"std3_container-fluid\"><div class=\"std3_dmStopOuterBox\"><div class=\"std3_filtered-stop-box-item\"><a class=\"std3_result-row std3_in\" id=\"std3_stop_head7000072\" data-toggle=\"collapse\" data-parent=\"#std3_stop_accordion\" href=\"#std3_stop7000072\" aria-expanded=\"true\" aria-controls=\"std3_stop7000072\"><div class=\"std3_stop-row-outer\"><div class=\"std3_row std3_stop-row\"><div class=\"std3_col-xs-8 std3_condensed std3_full-size\">KA Volkswohnung/Staatstheater</div><div class=\"std3_col-xs-4 std3_condensed\"><div class=\"std3_switch-util\"><span class=\"std3_sr-only\"></span><span class=\"std3_switch-label\"> </span><span class=\"std3_switch-handle\"> </span></div></div></div></div></a><div id=\"std3_stop7000072\" class=\"std3_panel-collapse std3_collapse std3_in std3_container-fluid std3_full-size\" role=\"tabpanel\" aria-labelledby=\"std3_stop_head7000072\" aria-expanded=\"true\"><div class=\"std3_dmHeaderRow std3_dm-header_container\"><div class=\"std3_dm-time\">Geplant</div><div class=\"std3_dm-time\">Heute</div><div class=\"std3_line-direction\">Linie / Richtung</div></div><div class=\"std3_col-xs-12 std3_full-size std3_departure-line std3_result-row std3_assigned-StopID-7000072 7000072\" data-draw-line=\"kvv:24010:E:R:s18\" data-key=\"141\" data-stop=\"7000072\" data-date=\"20181004\" data-time=\"2359\"><div class=\"std3_dm-result_container\"><div class=\"std3_dm-time std3_dm-result-row\">23:59</div><div class=\"std3_dm-time std3_dm-result-row std3_realtime-column\" data-delay=\"0\">23:59</div><div class=\"std3_dm-mot-info\"><a href=\"#\" type=\"button\" class=\"std3_line_link std3_min_button std3_button-link\" title=\"Zeige diese Linie auf der Karte\"><span class=\"std3_mot-icon-container\" data-motType=\"5\" title=\"Bus\" data-shortname=\"\" data-line=\"24010\" data-network=\"\"><span class=\"std3_mot-icon-element\"><span class=\"std3_icon fa-fw std3_mot-icon-background\"> </span><span class=\"std3_mot-icon std3_icon fa-fw std3_mot5-icon\"> </span></span> <span class=\"std3_mot-label\"><span class=\"std3_sr-only\">Bus </span>10</span></span></a>10 Hauptbahnhof<span class=\"std3_secFont\"> ab KA Volkswohnung/Staatstheater</span><div class=\"std3_additional-information-box\">  </div></div></div><div class=\"std3_clearfix std3_spare-prev-line\"> </div></div><div class=\"std3_col-xs-12 std3_full-size std3_departure-line std3_result-row std3_assigned-StopID-7000072 7000072\" data-draw-line=\"kvv:21006:E:R:s18\" \n" +
            "</div>\n" +
            "</main>\n" +
            "<aside class=\"std3_col-xs-hide std3_col-sm-6 std3_col-md-6 std3_col-lg-8 std3_col-xl-9\">\n" +
            "<div id=\"std3_map\" class=\"std3_stop-translation\">\n" +
            "             \n" +
            "        </div>\n" +
            "<div class=\"std3_map_addbox std3_hidden-xs\"> </div>\n" +
            "</aside>\n" +
            "</section>\n" +
            "<div id=\"std3_fullscreen-modals\" data-i18n-group=\"std3_fullscreen-modals\">\n" +
            "<div class=\"std3_modal std3_fade std3_overlay \" id=\"std3_language-control\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"std3_language-control-label\" aria-hidden=\"true\">\n" +
            "<div class=\"std3_modal-dialog\">\n" +
            "<div class=\"std3_modal-content\">\n" +
            "<div class=\"std3_modal-header\">\n" +
            "<button type=\"button\" class=\"std3_close\" data-dismiss=\"modal\" aria-label=\"\">\n" +
            "<span aria-hidden=\"true\">×</span>\n" +
            "</button>\n" +
            "<h4 class=\"std3_modal-title\" id=\"std3_language-control-label\">Sprachauswahl</h4>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-body\">\n" +
            "<div><input type=\"radio\" name=\"itdLPxx_language\" class=\"std3_language-control\" id=\"std3_language-control-de\" value=\"de\" checked=\"checked\"/> <label for=\"std3_language-control-de\">Deutsch</label></div><div><input type=\"radio\" name=\"itdLPxx_language\" class=\"std3_language-control\" id=\"std3_language-control-en\" value=\"en\"/> <label for=\"std3_language-control-en\">Englisch</label></div><div><input type=\"radio\" name=\"itdLPxx_language\" class=\"std3_language-control\" id=\"std3_language-control-fr\" value=\"fr\"/> <label for=\"std3_language-control-fr\">Französisch</label></div>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-footer\">\n" +
            "<button type=\"button\" class=\"std3_btn std3_btn-default\" data-dismiss=\"modal\">Schließen</button>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"std3_toggle-pdf-modal\" style=\"display: none\" data-toggle=\"modal\" data-target=\"#std3_pdf-modal\"></div>\n" +
            "<div class=\"std3_modal std3_fade std3_overlay \" id=\"std3_pdf-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"std3_pdf-modal-label\" aria-hidden=\"true\">\n" +
            "<div class=\"std3_modal-dialog\">\n" +
            "<div class=\"std3_modal-content\">\n" +
            "<div class=\"std3_modal-header\">\n" +
            "<button type=\"button\" class=\"std3_close\" data-dismiss=\"modal\" aria-label=\"\">\n" +
            "<span aria-hidden=\"true\">×</span>\n" +
            "</button>\n" +
            "<h4 class=\"std3_modal-title\" id=\"std3_pdf-modal-label\">\n" +
            "<span class=\"std3_pdf-title\">PDF</span>\n" +
            "</h4>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-body\">\n" +
            "<div class=\"std3_pdf-body\"><div class=\"std3_pdf-loader\">Erzeuge PDF<span class=\"std3_icon std3_spinner-icon fa-2x std3_spin\"> </span></div></div>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-footer\">\n" +
            "<a class=\"std3_btn std3_btn-primary std3_pdf-download\" target=\"_blank\" download=\"Result.pdf\" href=\"#\">Download</a>\n" +
            "<button type=\"button\" class=\"std3_btn std3_btn-default\" data-dismiss=\"modal\">Schließen</button>\n" +
            "</div>\n" +
            "</div>\n" +
            "<a href=\"#\" data-toggle=\"modal\" data-target=\"#std3_elevation-modal\" style=\"display:none;\"> </a>\n" +
            "<div class=\"std3_modal std3_fade std3_overlay \" id=\"std3_elevation-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"std3_elevation-modal-label\" aria-hidden=\"true\">\n" +
            "<div class=\"std3_modal-dialog\">\n" +
            "<div class=\"std3_modal-content\">\n" +
            "<div class=\"std3_modal-header\">\n" +
            "<button type=\"button\" class=\"std3_close\" data-dismiss=\"modal\" aria-label=\"\">\n" +
            "<span aria-hidden=\"true\">×</span>\n" +
            "</button>\n" +
            "<h4 class=\"std3_modal-title\" id=\"std3_elevation-modal-label\">Höhenprofil</h4>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-body\">\n" +
            "<div id=\"nop\"> </div>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-footer\">\n" +
            "<button type=\"button\" class=\"std3_btn std3_btn-default\" data-dismiss=\"modal\">Schließen</button>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"std3_modal std3_fade std3_overlay \" id=\"std3_share-page\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"std3_share-page-label\" aria-hidden=\"true\">\n" +
            "<div class=\"std3_modal-dialog\">\n" +
            "<div class=\"std3_modal-content\">\n" +
            "<div class=\"std3_modal-header\">\n" +
            "<button type=\"button\" class=\"std3_close\" data-dismiss=\"modal\" aria-label=\"\">\n" +
            "<span aria-hidden=\"true\">×</span>\n" +
            "</button>\n" +
            "<h4 class=\"std3_modal-title\" id=\"std3_share-page-label\">Teilen</h4>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-body\">\n" +
            "<div><input type=\"text\" class=\"std3_sharing-link\" value=\"0\"/></div>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-footer\">\n" +
            "<button type=\"button\" class=\"std3_btn std3_btn-default\" data-dismiss=\"modal\">Schließen</button>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"std3_modal std3_fade std3_overlay \" id=\"std3_ics_modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"std3_ics_modal-label\" aria-hidden=\"true\">\n" +
            "<div class=\"std3_modal-dialog\">\n" +
            "<div class=\"std3_modal-content\">\n" +
            "<div class=\"std3_modal-header\">\n" +
            "<button type=\"button\" class=\"std3_close\" data-dismiss=\"modal\" aria-label=\"\">\n" +
            "<span aria-hidden=\"true\">×</span>\n" +
            "</button>\n" +
            "<h4 class=\"std3_modal-title\" id=\"std3_ics_modal-label\">Aktuelle Meldungen</h4>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-body\">Aktuelle Meldungen</div>\n" +
            "<div class=\"std3_modal-footer\">\n" +
            "<button type=\"button\" class=\"std3_btn std3_btn-default\" data-dismiss=\"modal\">Schließen</button>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div class=\"std3_modal std3_fade std3_overlay \" id=\"std3_page-overlay\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"std3_page-overlay-label\" aria-hidden=\"true\">\n" +
            "<div class=\"std3_modal-dialog\">\n" +
            "<div class=\"std3_modal-content\">\n" +
            "<div class=\"std3_modal-header\">\n" +
            "<button type=\"button\" class=\"std3_close\" data-dismiss=\"modal\" aria-label=\"\">\n" +
            "<span aria-hidden=\"true\">×</span>\n" +
            "</button>\n" +
            "<h4 class=\"std3_modal-title\" id=\"std3_page-overlay-label\">Trigger Title</h4>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-body\">pauls_modal</div>\n" +
            "<div class=\"std3_modal-footer\">\n" +
            "<button type=\"button\" class=\"std3_btn std3_btn-default\" data-dismiss=\"modal\">Schließen</button>\n" +
            "</div>\n" +
            "</div>\n" +
            "<a style=\"display: none\" data-target=\"#std3_page-print\" data-toggle=\"modal\" href=\"#\">HiddenTrigger</a>\n" +
            "<div class=\"std3_modal std3_fade std3_overlay \" id=\"std3_page-print\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"std3_page-print-label\" aria-hidden=\"true\">\n" +
            "<div class=\"std3_modal-dialog\">\n" +
            "<div class=\"std3_modal-content\">\n" +
            "<div class=\"std3_modal-header\">\n" +
            "<button type=\"button\" class=\"std3_close\" data-dismiss=\"modal\" aria-label=\"\">\n" +
            "<span aria-hidden=\"true\">×</span>\n" +
            "</button>\n" +
            "<h4 class=\"std3_modal-title\" id=\"std3_page-print-label\"></h4>\n" +
            "</div>\n" +
            "<div class=\"std3_modal-body\">NOPE</div>\n" +
            "<div class=\"std3_modal-footer\">\n" +
            "<button type=\"button\" class=\"std3_btn std3_btn-default\" data-dismiss=\"modal\">Schließen</button>\n" +
            "</div>\n" +
            "</div>\n" +
            "<div id=\"std3_js-templates\"> </div>\n" +
            "<script src=\"js/ext/jquery-2.1.3.min.js\"> </script>\n" +
            "<script src=\"js/ext/bootstrap.min.js\"> </script>\n" +
            "<script src=\"js/ext/jquery.custom.concat.min.js\"> </script>\n" +
            "<script src=\"js/i18n.min.js\"> </script>\n" +
            "<script src=\"js/mdv.min.js\"> </script>\n" +
            "<script src=\"js/ext/mdvLeaflet.std3.min.js\"> </script>\n" +
            "<script src=\"js/mdv_map.min.js\"> </script>\n" +
            "<script src=\"js/ext/locales/bootstrap-datetimepicker.fr.js\"> </script>\n" +
            "<script src=\"js/ext/locales/bootstrap-datetimepicker.de.js\"> </script>\n" +
            "</div>\n" +
            "</body>\n" +
            "</html>";


    public final static String htmlResponseKvvLine1 = "<!DOCTYPE html><html lang=\"de\" xml:lang=\"de\" xmlns=\"http://www.w3.org/1999/xhtml\"><head></head><body>" +
            "<div class=\"std3_col-xs-12 std3_full-size std3_departure-line std3_result-row std3_assigned-StopID-7000072 7000072\" data-draw-line=\"kvv:22011:E:H:s18\" data-key=\"56001\" data-stop=\"7000072\" data-date=\"20181006\" data-time=\"0124\"><div class=\"std3_dm-result_container\"><div class=\"std3_dm-time std3_dm-result-row\">01:24</div><div class=\"std3_dm-time std3_dm-result-row std3_realtime-column\" data-delay=\"1\">01:25</div><div class=\"std3_dm-mot-info\"><a href=\"#\" type=\"button\" class=\"std3_line_link std3_min_button std3_button-link\" title=\"Zeige diese Linie auf der Karte\"><span class=\"std3_mot-icon-container\" data-motType=\"1\" title=\"S-Bahn\" data-shortname=\"\" data-line=\"22011\" data-network=\"\"><span class=\"std3_mot-icon-element\"><span class=\"std3_icon fa-fw std3_mot-icon-background\"> </span><span class=\"std3_mot-icon std3_icon fa-fw std3_mot1-icon\"> </span></span> <span class=\"std3_mot-label\"><span class=\"std3_sr-only\">S-Bahn </span>S11</span> <span class=\"std3_mot-label\"><span class=\"std3_sr-only\">S-Bahn </span>56001</span></span></a>S11 Hochstetten<span class=\"std3_secFont\"> ab KA Volkswohnung/Staatstheater</span><div class=\"std3_additional-information-box\">  </div></div></div><div class=\"std3_clearfix std3_spare-prev-line\"> </div></div>" + "</body>";



    public final static String htmlResponseKvvLine2 = "<!DOCTYPE html><html lang=\"de\" xml:lang=\"de\" xmlns=\"http://www.w3.org/1999/xhtml\"><head></head><body>" +
            "\n" +
            "<div class=\"std3_col-xs-12 std3_full-size std3_departure-line std3_result-row std3_assigned-StopID-7032586 7032586\" data-draw-line=\"ddb:90S51: :R:j18\" data-key=\"12410\" data-stop=\"7032586\" data-date=\"20181006\" data-time=\"1245\"><div class=\"std3_dm-result_container\"><div class=\"std3_dm-time std3_dm-result-row\">12:45</div><div class=\"std3_dm-time std3_dm-result-row std3_realtime-column\" data-delay=\"0\">12:45</div><div class=\"std3_dm-mot-info\"><a href=\"#\" type=\"button\" class=\"std3_line_link std3_min_button std3_button-link\" title=\"Zeige diese Linie auf der Karte\"><span class=\"std3_mot-icon-container\" data-mottype=\"0\" title=\"Zug\" data-shortname=\"\" data-line=\"90S51\" data-network=\"\"><span class=\"std3_mot-icon-element\"><span class=\"std3_icon fa-fw std3_mot-icon-background\"> </span><span class=\"std3_mot-icon std3_icon fa-fw std3_mot0-icon\"> </span></span> <span class=\"std3_mot-label\"><span class=\"std3_sr-only\">Zug </span> 12410</span></span></a>Neustadt, Hauptbahnhof<span class=\"std3_secFont\"> ab Gleis 1</span><div class=\"std3_additional-information-box\">  </div></div></div><div class=\"std3_clearfix std3_spare-prev-line\"> </div></div>" + "</body>";


    public final static String htmlResponseSvv2 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "<title>Kirchstr., Heusweiler - Ankunft/Abfahrt</title>\n" +
            "<meta http-equiv=\"expires\" content=\"0\" />\n" +
            "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\n" +
            "<meta http-equiv=\"content-script-type\" content=\"text/javascript\" />\n" +
            "<link rel=\"shortcut icon\" href=\"/hafas-res/img/favicon.ico\" type=\"image/ico\" />\n" +
            "<link rel=\"apple-touch-icon-precomposed\" href=\"/hafas-res/img/apple-touch-icon-precomposed.png\" />\n" +
            "<meta name=\"viewport\" content=\"width=device-width\" />\n" +
            "<meta name=\"viewport\" content=\"minimum-scale=1.0\" />\n" +
            "<meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.5, user-scalable=yes\" />\n" +
            "<script type=\"text/javascript\" src=\"/hafas-res/js/ua_xhtml/FSuggest_mobile.js?guiV=17\"></script>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/hafas-res/css/ua_xhtml/mobile_all.css?guiV=17\" />\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/hafas-res/css/ua_xhtml/mobile_d.css\" />\n" +
            "<style type=\"text/css\">\n" +
            "/* <![CDATA[ */\n" +
            "input.button { -webkit-appearance: none; }\n" +
            "input.sqstation,input.tpLoc {width:180px;}\n" +
            "input.tpdate,input.sqdate {width:75px;}\n" +
            "input.tptime,input.sqtime {width:55px;}\n" +
            "input.hfs_checkbox,\n" +
            "input.hfs_radio {vertical-align:middle;}\n" +
            "div#suggestion div,\n" +
            "div#suggestion div.selected {\n" +
            "background-image:url(/hafas-res/img/suggest_stop.gif);\n" +
            "background-repeat:no-repeat;\n" +
            "background-position:2px 3px;\n" +
            "}\n" +
            "div#suggestion div.adr,\n" +
            "div#suggestion div.adrselected {\n" +
            "background-image:url(/hafas-res/img/suggest_adr.gif);\n" +
            "}\n" +
            "div#suggestion div.poi,\n" +
            "div#suggestion div.poiselected {\n" +
            "background-image:url(/hafas-res/img/suggest_poi.gif);\n" +
            "}\n" +
            "/* ]]> */\n" +
            "</style>\n" +
            "</head>\n" +
            "<body onload=\"window.scrollTo(0, 1)\">\n" +
            "<div class=\"HFS_mobile\">\n" +
            "<div id=\"HFS_mobile_header\">\n" +
            "<p class=\"logo\"><img class=\"logo\" src=\"/hafas-res/img/ua_xhtml/logo_vgs_s.gif\" alt=\"Saarfahrplan Mobil\" /></p>\n" +
            "</div>\n" +
            "<p class=\"querysummary\">\n" +
            "<strong>Kirchstr., Heusweiler</strong><br />\n" +
            "Fr, 19.10.18,\n" +
            "Abfahrt 15:39 Uhr\n" +
            "</p>\n" +
            "<table class=\"hfs_stboard\">\n" +
            "<tr>\n" +
            "<th>Uhrzeit</th>\n" +
            "<th>Progn.</th>\n" +
            "<th>Fahrt</th>\n" +
            "<th>in Richtung</th>\n" +
            "<th>Gl.</th>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "15:54\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/486096/188184/578388/127163/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Obersalbach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "16:07\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/723540/267332/191518/145422/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "16:08\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/574569/217675/760992/188974/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "16:54\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/672447/250301/724036/137871/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Obersalbach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "17:07\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/581745/220067/940112/276143/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "17:08\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/201843/93433/337114/101278/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "17:54\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/824403/300953/890094/170249/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Obersalbach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "18:07\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/312921/130459/999752/395572/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "18:08\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "<span class=\"onTime\">pktl.</span>\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/295908/124788/592814/197774/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "18:54\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/638778/239078/875508/224832/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Obersalbach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "19:07\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/696501/258319/596994/66334/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "19:08\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/752493/276983/371248/65211/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "19:54\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/360864/146440/432730/96082/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Obersalbach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "20:07\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/796995/291817/565670/17175/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "20:08\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/144222/74226/232098/67980/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=19.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr><td colspan=\"5\" style=\"color:#fff; background-color:#c00; font-weight:bold\">20.10.18</td></tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "04:28\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/366471/148212/116926/63694/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15502&amp;sqType=dep&amp;\">Bus   N4</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Dillingen &#252;. Lebach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "06:39\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/211287/92996/90608/25125/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15502&amp;sqType=dep&amp;\">Bus  190</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lebach Bf\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "A\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "08:39\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/958662/345678/552930/43089/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Obersalbach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "08:59\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/311868/130080/116156/45878/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "09:00\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/451614/176662/597256/148090/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "09:39\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/620442/232938/436522/11448/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Obersalbach\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color1\">\n" +
            "<td class=\"time\">\n" +
            "09:59\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/399213/159195/298868/16364/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15507&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "</td>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "<tr class=\"color0\">\n" +
            "<td class=\"time\">\n" +
            "10:00\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/984435/354269/836742/90227/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "14:08\n" +
            "</td>\n" +
            "<td class=\"prognosis\">\n" +
            "</td>\n" +
            "<td class=\"journey\">\n" +
            "<img class=\"secProd\" src=\"/hafas-res/img/bus_pic.gif\" alt=\"\" />\n" +
            "<a href=\"http://www.saarfahrplan.de/cgi-bin/traininfo.exe/dox/474339/184208/247664/34281/80?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;backLink=sq&amp;date=20.10.18&amp;sqPf=1111111111111111&amp;sqMj=50&amp;sqDa=19.10.18&amp;sqTi=15:39&amp;sqEvaId=15516&amp;sqType=dep&amp;\">Bus  149</a>\n" +
            "<td class=\"direction\">\n" +
            "Lummerschied\n" +
            "</td>\n" +
            "<td class=\"track\">\n" +
            "</td>\n" +
            "</tr>\n" +
            "</table>\n" +
            "<p class=\"remark\">\n" +
            "<strong>weitere Haltestellen anzeigen:</strong>\n" +
            "<br />\n" +
            "- <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;input=15537&amp;boardType=dep&amp;date=19.10.18&amp;time=15:39&amp;\">Markt, Heusweiler</a> ( 8 Min.)\n" +
            "- <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;input=15500&amp;boardType=dep&amp;date=19.10.18&amp;time=15:39&amp;\">Rathaus, Heusweiler</a> ( 8 Min.)\n" +
            "<br />\n" +
            "<br />\n" +
            "- <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;input=15510&amp;boardType=dep&amp;date=19.10.18&amp;time=15:39&amp;\">Dilsburg Br&#252;cke, Heusweiler</a> ( 16 Min.)\n" +
            "<br />\n" +
            "- <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;input=15538&amp;boardType=dep&amp;date=19.10.18&amp;time=15:39&amp;\">Dilsburg Ludwigstr., Heusweiler</a> ( 19 Min.)\n" +
            "- <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;input=15501&amp;boardType=dep&amp;date=19.10.18&amp;time=15:39&amp;\">Illinger Str., Heusweiler</a> ( 13 Min.)\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;input=15507&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;boardType=dep&amp;time=now&amp;selectDate=today&amp;\">Aktuell</a>\n" +
            "</p>\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;input=15507&amp;productsFilter=1111111111111111&amp;maxJourneys=50&amp;start=yes&amp;boardType=arr&amp;time=15:39&amp;date=19.10.18&amp;\">Ankunft</a>\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/stboard.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;\">Neue Anfrage</a>\n" +
            "</p>\n" +
            "<p class=\"link1\">\n" +
            "<img class=\"smIcon\" src=\"/hafas-res/img/ua_xhtml/icons/ico.gif\" alt=\"\" /> <a href=\"http://www.saarfahrplan.de/cgi-bin/detect.exe/dox?L=public&amp;M=d&amp;dpm=0&amp;dw=128&amp;dh=128&amp;\">Startseite</a>\n" +
            "</html>";


public final static String htmlResponseVBN = "{\n" +
        "\"headTexts\":[\"Zeit/Prognose\",\"Linie\",\"Ziel\",\"Gl.\",\"Abfahrten\",\"* Anrufpflichtiger Verkehr, Fahrtinformationen beachten!\"],\n" +
        "\"stationName\":\"Bremen Am Brill\",\n" +
        "\"stationEvaId\":\"8096108\",\n" +
        "\"boardType\":\"dep\",\n" +
        "\"imgPath\":\"/hafas-res/img/\",\n" +
        "\"iconProductsSubPath\":\"\",\n" +
        "\"rtInfo\":true,\n" +
        "\"journey\":[\n" +
        "{\"tip\":\"918891/332190/673530/30481/80?date=20.10.18&amp;station_evaId=670014\",\"id\":\"258938013\",\"ti\":\"09:10\",\"da\":\"20.10.18\",\"st\":\"Gröpelingen\",\"pr\":\"Tram 3\",\"tr\":\"F\",\"ntr\":false,\"cat\":\"Tram\",\"catMarker\":false,\"rt\":{\"status\":null,\"dlm\":\"1\",\"dlt\":\"09:11\",\"progText\":\"\"}}   \n" +
        ",{\"tip\":\"141348/263738/621358/263563/80?date=20.10.18&amp;station_evaId=107711\",\"id\":\"216622800\",\"ti\":\"09:11\",\"da\":\"20.10.18\",\"st\":\"Bremen Hbf\",\"pr\":\"Bus 101\",\"tr\":\"A\",\"ntr\":false,\"cat\":\"Bus\",\"catMarker\":false,\"rt\":{\"status\":null,\"dlm\":\"2\",\"dlt\":\"09:13\",\"progText\":\"\"}}   \n" +
        ",{\"tip\":\"344211/141072/276770/23661/80?date=20.10.18&amp;station_evaId=107711\",\"id\":\"263358013\",\"ti\":\"09:13\",\"da\":\"20.10.18\",\"st\":\"Bf Mahndorf\",\"pr\":\"Tram 1\",\"tr\":\"A\",\"ntr\":false,\"cat\":\"Tram\",\"catMarker\":false,\"rt\":{\"status\":null,\"dlm\":\"0\",\"dlt\":\"09:13\",\"progText\":\"\"}}   \n" +
        "],\n" +
        "\"maxJ\":2,\n" +
        "\"rufverkehr\":false\n" +
        "}";

    public final static String htmlResponseVBN_Adelebsen = "{\n" +
            "\"headTexts\":[\"Zeit/Prognose\",\"Linie\",\"Ziel\",\"Gl.\",\"Abfahrten\",\"* Anrufpflichtiger Verkehr, Fahrtinformationen beachten!\"],\n" +
            "\"stationName\":\"Adelebsen\",\n" +
            "\"stationEvaId\":\"9000761\",\n" +
            "\"boardType\":\"dep\",\n" +
            "\"imgPath\":\"/hafas-res/img/\",\n" +
            "\"iconProductsSubPath\":\"\",\n" +
            "\"rtInfo\":true,\n" +
            "\"journey\":[\n" +
            "{\"tip\":\"845139/389614/518208/22611/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"107901802\",\"ti\":\"11:33\",\"da\":\"04.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":{\"status\":null,\"dlm\":\"0\",\"dlt\":\"11:33\",\"progText\":\"\"}}   \n" +
            ",{\"tip\":\"69006/146979/58494/6246/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"123977801\",\"ti\":\"12:31\",\"da\":\"04.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"480690/268129/661996/170768/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"107899800\",\"ti\":\"13:33\",\"da\":\"04.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"203703/191874/64598/35602/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"123973800\",\"ti\":\"14:31\",\"da\":\"04.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"645540/323080/878242/223941/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"107900800\",\"ti\":\"15:33\",\"da\":\"04.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"994359/455430/965304/151201/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"123977802\",\"ti\":\"16:31\",\"da\":\"04.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"299292/207664/977560/389017/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"107900801\",\"ti\":\"17:33\",\"da\":\"04.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"666675/346203/40214/202119/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"123978801\",\"ti\":\"18:31\",\"da\":\"04.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"128562/150754/344090/129193/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"107900802\",\"ti\":\"19:33\",\"da\":\"04.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"83592/151841/562246/253262/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"123977803\",\"ti\":\"20:31\",\"da\":\"04.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"39690/121130/371328/172437/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"107900803\",\"ti\":\"21:33\",\"da\":\"04.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"884955/418960/566374/11798/80?date=04.11.18&amp;station_evaId=8000418\",\"id\":\"123975800\",\"ti\":\"21:40\",\"da\":\"04.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"845340/389700/681400/58920/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"107920800\",\"ti\":\"06:25\",\"da\":\"05.11.18\",\"st\":\"Ottbergen\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"105/124011/942686/471308/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"123976800\",\"ti\":\"06:31\",\"da\":\"05.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"815283/281252/151134/196194/80?date=05.11.18&amp;station_evaId=851904\",\"id\":\"9491800\",\"ti\":\"06:59\",\"da\":\"05.11.18\",\"st\":\"Göttingen Bahnhof/ZOB\",\"pr\":\"Bus 210\",\"tr\":\"\",\"ntr\":false,\"cat\":\"Bus\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"7584/110429/442360/218652/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"107901800\",\"ti\":\"07:33\",\"da\":\"05.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"40059/137332/413380/193337/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"123979800\",\"ti\":\"07:40\",\"da\":\"05.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"285813/103596/682338/245898/80?date=05.11.18&amp;station_evaId=851904\",\"id\":\"8325800\",\"ti\":\"07:59\",\"da\":\"05.11.18\",\"st\":\"Göttingen Bahnhof/ZOB\",\"pr\":\"Bus 110\",\"tr\":\"\",\"ntr\":false,\"cat\":\"Bus\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"608979/212468/661076/127545/80?date=05.11.18&amp;station_evaId=851904\",\"id\":\"9475800\",\"ti\":\"07:59\",\"da\":\"05.11.18\",\"st\":\"Uslar\",\"pr\":\"Bus 210\",\"tr\":\"\",\"ntr\":false,\"cat\":\"Bus\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"655644/228052/840074/201489/80?date=05.11.18&amp;station_evaId=851904\",\"id\":\"9504800\",\"ti\":\"08:19\",\"da\":\"05.11.18\",\"st\":\"Göttingen Bahnhof/ZOB\",\"pr\":\"Bus 210\",\"tr\":\"\",\"ntr\":false,\"cat\":\"Bus\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"343296/122799/434364/102750/80?date=05.11.18&amp;station_evaId=851904\",\"id\":\"8367800\",\"ti\":\"08:25\",\"da\":\"05.11.18\",\"st\":\"Dransfeld\",\"pr\":\"Bus 115\",\"tr\":\"\",\"ntr\":false,\"cat\":\"Bus\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"242529/188750/457432/147873/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"107907800\",\"ti\":\"08:25\",\"da\":\"05.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"114387/162106/968908/446325/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"123977800\",\"ti\":\"08:31\",\"da\":\"05.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"240279/88417/525726/182770/80?date=05.11.18&amp;station_evaId=851904\",\"id\":\"8324800\",\"ti\":\"09:09\",\"da\":\"05.11.18\",\"st\":\"Göttingen Bahnhof/ZOB\",\"pr\":\"Bus 110\",\"tr\":\"\",\"ntr\":false,\"cat\":\"Bus\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"463509/262404/248294/30357/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"107901801\",\"ti\":\"09:33\",\"da\":\"05.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"628728/333555/366390/26382/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"123979801\",\"ti\":\"09:40\",\"da\":\"05.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"964755/429492/12532/315320/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"107907801\",\"ti\":\"10:25\",\"da\":\"05.11.18\",\"st\":\"Paderborn Hbf\",\"pr\":\"RB85\",\"tr\":\"1\",\"ntr\":false,\"cat\":\"Zug\",\"catMarker\":false,\"rt\":false}   \n" +
            ",{\"tip\":\"435147/269027/210914/39592/80?date=05.11.18&amp;station_evaId=8000418\",\"id\":\"123978800\",\"ti\":\"10:31\",\"da\":\"05.11.18\",\"st\":\"Göttingen\",\"pr\":\"SEV\",\"tr\":\"\",\"ntr\":false,\"cat\":\"SEV\",\"catMarker\":false,\"rt\":false}   \n" +
            "],\n" +
            "\"maxJ\":27,\n" +
            "\"rufverkehr\":false\n" +
            "}";

    public final static String JSON_DB_SUGGESTION_RESPONSE_b = "SLs.sls={\"suggestions\":[{\"value\":\"Jößnitz\",\"id\":\"A=1@O=Jößnitz@X=12139824@Y=50537616@U=80@L=008011966@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008011966\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"12139824\",\"ycoord\":\"50537616\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"5622\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Gößnitz\",\"id\":\"A=1@O=Gößnitz@X=12429304@Y=50893202@U=80@L=008010134@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008010134\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"12429304\",\"ycoord\":\"50893202\",\"state\":\"id\",\"prodClass\":\"24\",\"weight\":\"3965\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Lößnitzgrund\",\"id\":\"A=1@O=Lößnitzgrund@X=13653769@Y=51121861@U=80@L=008012247@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008012247\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"13653769\",\"ycoord\":\"51121861\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"140\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Lößnitz ob Bf\",\"id\":\"A=1@O=Lößnitz ob Bf@X=12748771@Y=50624874@U=80@L=008012245@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008012245\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"12748771\",\"ycoord\":\"50624874\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"140\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Lößnitz unt Bf\",\"id\":\"A=1@O=Lößnitz unt Bf@X=12724456@Y=50611112@U=80@L=008012246@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008012246\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"12724456\",\"ycoord\":\"50611112\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"140\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Jeßnitz(Anhalt)\",\"id\":\"A=1@O=Jeßnitz(Anhalt)@X=12277350@Y=51682554@U=80@L=008011961@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008011961\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"12277350\",\"ycoord\":\"51682554\",\"state\":\"id\",\"prodClass\":\"24\",\"weight\":\"1006\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Laußnitz\",\"id\":\"A=1@O=Laußnitz@X=13879650@Y=51248249@U=80@L=008012174@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008012174\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"13879650\",\"ycoord\":\"51248249\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"3099\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Schieren Bißnitz\",\"id\":\"A=1@O=Schieren Bißnitz@X=10425473@Y=53941894@U=80@L=003475029@B=1@V=4.9,@p=1541275578@\",\"extId\":\"003475029\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"10425473\",\"ycoord\":\"53941894\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"38\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Rostock Saßnitzer Straße\",\"id\":\"A=1@O=Rostock Saßnitzer Straße@X=12043631@Y=54145823@U=80@L=000708500@B=1@V=4.9,@p=1541275578@\",\"extId\":\"000708500\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"12043631\",\"ycoord\":\"54145823\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"647\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"PÖßNECK\",\"id\":\"A=1@O=PÖßNECK@X=11588444@Y=50690441@U=80@L=008096007@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008096007\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"11588444\",\"ycoord\":\"50690441\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"5622\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Sassnitz\",\"id\":\"A=1@O=Sassnitz@X=13637913@Y=54516286@U=80@L=008012843@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008012843\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"13637913\",\"ycoord\":\"54516286\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"3099\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"},{\"value\":\"Pößneck ob Bf\",\"id\":\"A=1@O=Pößneck ob Bf@X=11588336@Y=50690289@U=80@L=008012657@B=1@V=4.9,@p=1541275578@\",\"extId\":\"008012657\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"11588336\",\"ycoord\":\"50690289\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"3099\",\"ringMethod\":\"1\",\"ringProvider\":\"4.9,\",\"ringRegion\":\"no\"}]};SLs.showSuggestion();";

    public final static String JSON_DB_SUGGESTION_RESPONSE = "{\"suggestions\":[{\"value\":\"Reggio d'Emilia AV\",\"id\":\"A=1@O=Reggio d'Emilia AV@X=10656568@Y=44723905@U=80@L=008305254@B=1@p=1540333724@\",\"extId\":\"008305254\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"10656568\",\"ycoord\":\"44723905\",\"state\":\"id\",\"prodClass\":\"1\",\"weight\":\"16875\"},{\"value\":\"Villena AV\",\"id\":\"A=1@O=Villena AV@X=-867701@Y=38631763@U=80@L=007103309@B=1@p=1540333724@\",\"extId\":\"007103309\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"-867701\",\"ycoord\":\"38631763\",\"state\":\"id\",\"prodClass\":\"3\",\"weight\":\"3816\"},{\"value\":\"Medina AV\",\"id\":\"A=1@O=Medina AV@X=-4923175@Y=41290628@U=81@L=007108240@B=1@p=1540342287@\",\"extId\":\"007108240\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"-4923175\",\"ycoord\":\"41290628\",\"state\":\"id\",\"prodClass\":\"3\",\"weight\":\"3501\"},{\"value\":\"Delémont, Av. de la gare\",\"id\":\"A=1@O=Delémont, Av. de la gare@X=7349347@Y=47364073@U=81@L=008571982@B=1@p=1540342287@\",\"extId\":\"008571982\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"7349347\",\"ycoord\":\"47364073\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"1339\"},{\"value\":\"Montreux, av. Nestlé\",\"id\":\"A=1@O=Montreux, av. Nestlé@X=6912777@Y=46431352@U=81@L=008593920@B=1@p=1540342287@\",\"extId\":\"008593920\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6912777\",\"ycoord\":\"46431352\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"1339\"},{\"value\":\"Territet, av. Riviera\",\"id\":\"A=1@O=Territet, av. Riviera@X=6922027@Y=46427847@U=81@L=008593946@B=1@p=1540342287@\",\"extId\":\"008593946\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6922027\",\"ycoord\":\"46427847\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"1339\"},{\"value\":\"Vevey, av. de Corsier\",\"id\":\"A=1@O=Vevey, av. de Corsier@X=6842688@Y=46468631@U=81@L=008593979@B=1@p=1540342287@\",\"extId\":\"008593979\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6842688\",\"ycoord\":\"46468631\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"1339\"},{\"value\":\"Redondela AV\",\"id\":\"A=1@O=Redondela AV@X=-8608977@Y=42282013@U=80@L=007108224@B=1@p=1540333724@\",\"extId\":\"007108224\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"-8608977\",\"ycoord\":\"42282013\",\"state\":\"id\",\"prodClass\":\"12\",\"weight\":\"1428\"},{\"value\":\"Aigle, av. Margencel\",\"id\":\"A=1@O=Aigle, av. Margencel@X=6964950@Y=46318160@U=80@L=008593763@B=1@p=1540333724@\",\"extId\":\"008593763\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6964950\",\"ycoord\":\"46318160\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"La Tour-de-Peilz, av. Muller\",\"id\":\"A=1@O=La Tour-de-Peilz, av. Muller@X=6856756@Y=46455542@U=80@L=008593950@B=1@p=1540333724@\",\"extId\":\"008593950\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6856756\",\"ycoord\":\"46455542\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Moudon, av. de Bussy\",\"id\":\"A=1@O=Moudon, av. de Bussy@X=6799522@Y=46671958@U=80@L=008570340@B=1@p=1540333724@\",\"extId\":\"008570340\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6799522\",\"ycoord\":\"46671958\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Neuchâtel, Av. des Alpes\",\"id\":\"A=1@O=Neuchâtel, Av. des Alpes@X=6917235@Y=46993700@U=80@L=008593573@B=1@p=1540333724@\",\"extId\":\"008593573\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6917235\",\"ycoord\":\"46993700\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Neuchâtel, Av. des Cadolles\",\"id\":\"A=1@O=Neuchâtel, Av. des Cadolles@X=6924427@Y=47000747@U=80@L=008579630@B=1@p=1540333724@\",\"extId\":\"008579630\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6924427\",\"ycoord\":\"47000747\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Pully, av. de Rochettaz\",\"id\":\"A=1@O=Pully, av. de Rochettaz@X=6663443@Y=46514305@U=80@L=008588447@B=1@p=1540333724@\",\"extId\":\"008588447\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6663443\",\"ycoord\":\"46514305\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Renens VD, av. du 14 Avril\",\"id\":\"A=1@O=Renens VD, av. du 14 Avril@X=6579708@Y=46539322@U=80@L=008588839@B=1@p=1540333724@\",\"extId\":\"008588839\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6579708\",\"ycoord\":\"46539322\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Ste-Croix, av. de Neuchâtel\",\"id\":\"A=1@O=Ste-Croix, av. de Neuchâtel@X=6496756@Y=46825664@U=80@L=008579719@B=1@p=1540333724@\",\"extId\":\"008579719\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6496756\",\"ycoord\":\"46825664\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Ste-Croix, av. des Gittaz\",\"id\":\"A=1@O=Ste-Croix, av. des Gittaz@X=6497331@Y=46823129@U=80@L=008593786@B=1@p=1540333724@\",\"extId\":\"008593786\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6497331\",\"ycoord\":\"46823129\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"673\"},{\"value\":\"Aire-Adour Av des Pyrénées\",\"id\":\"A=1@O=Aire-Adour Av des Pyrénées@X=-273118@Y=43691225@U=80@L=008706827@B=1@p=1540333724@\",\"extId\":\"008706827\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"-273118\",\"ycoord\":\"43691225\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"136\"},{\"value\":\"St Jean de Monts Av Forêt\",\"id\":\"A=1@O=St Jean de Monts Av Forêt@X=-2067707@Y=46781797@U=81@L=008706328@B=1@p=1540342287@\",\"extId\":\"008706328\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"-2067707\",\"ycoord\":\"46781797\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"118\"},{\"value\":\"Villars-le-Terroir, av. d'Orbe\",\"id\":\"A=1@O=Villars-le-Terroir, av. d'Orbe@X=6638570@Y=46657647@U=81@L=008583301@B=1@p=1540342287@\",\"extId\":\"008583301\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6638570\",\"ycoord\":\"46657647\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"118\"},{\"value\":\"Fratton Goldsmith Av\",\"id\":\"A=1@O=Fratton Goldsmith Av@X=-1059315@Y=50810052@U=80@L=007002587@B=1@p=1540333724@\",\"extId\":\"007002587\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"-1059315\",\"ycoord\":\"50810052\",\"state\":\"id\",\"prodClass\":\"8\",\"weight\":\"261\"},{\"value\":\"Maurepas Av. Franche Comté Noctilien\",\"id\":\"A=1@O=Maurepas Av. Franche Comté Noctilien@X=1950506@Y=48766363@U=80@L=008706442@B=1@p=1540333724@\",\"extId\":\"008706442\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"1950506\",\"ycoord\":\"48766363\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"136\"},{\"value\":\"Rambervillers (Av 11 Novembre)\",\"id\":\"A=1@O=Rambervillers (Av 11 Novembre)@X=6638300@Y=48342738@U=80@L=008705378@B=1@p=1540333724@\",\"extId\":\"008705378\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6638300\",\"ycoord\":\"48342738\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"136\"},{\"value\":\"Yverdon-les-Bains, av. de Gare\",\"id\":\"A=1@O=Yverdon-les-Bains, av. de Gare@X=6641806@Y=46780377@U=80@L=008502072@B=1@p=1540333724@\",\"extId\":\"008502072\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"6641806\",\"ycoord\":\"46780377\",\"state\":\"id\",\"prodClass\":\"32\",\"weight\":\"23\"}]}";

    public final static String htmlResponseRVV_DOX = "\n" +
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "<title>Frankfurt &#x0028;Main&#x0029; Speyerer Stra&#223;e - Abfahrten/Ank&#252;nfte</title>\n" +
            "<meta http-equiv=\"expires\" content=\"0\" />\n" +
            "<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\n" +
            "<script type=\"text/javascript\" src=\"/auskunft/s/n/js/ua_xhtml/FSuggest_mobile.js\"></script>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/auskunft/s/n/css/ua_xhtml/hafas_xhtml.css\" />\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/auskunft/s/n/css/ua_xhtml/common_D.css\" />\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/auskunft/s/n/css/ua_xhtml/dynCSS_S.css\" />\n" +
            "<style type=\"text/css\">\n" +
            "/* <![CDATA[ */\n" +
            ".headerDiv {\n" +
            "background:#0f4b8c;\n" +
            "height:30px;\n" +
            "border:0px;\n" +
            "font-size:0px;\n" +
            "}\n" +
            "/* ]]> */\n" +
            "</style>\n" +
            "</head>\n" +
            "<body data-mobil-type=\"simple\">\n" +
            "<div class=\"headerDiv\">\n" +
            "<img height=\"30\" width=\"107\" src=\"/auskunft/s/n/img/ua_xhtml/simple//header_logo.png\" alt=\"\" />\n" +
            "</div>\n" +
            "<div>\n" +
            "<div class=\"langBox\">&#160;<a href=\"https://www.rmv.de/auskunft/bin/jp/help.exe/dox?M=s&amp;tpl=lang\"><img align=\"right\" src=\"/auskunft/s/n/img/ua_xhtml/simple/language_d.gif\" alt=\"\" border=\"0\"/></a></div>\n" +
            "</div>\n" +
            "<div class=\"whiteIndend\">\n" +
            "<a class=\"flagInactive\" href=\"http://mobil.rmv.de/mobile/portal?locale=d\">Home</a>\n" +
            "<a class=\"flagActive\" href=\"http://mobil.rmv.de/mobile/portal/information?locale=d\">Information</a>\n" +
            "<a class=\"flagInactive\" href=\"http://mobil.rmv.de/mobile/portal/entertainment?locale=d\">Entertainment</a>\n" +
            "</div>\n" +
            "<div class=\"main\" style=\"margin-left:5px;\">\n" +
            "<div class=\"commonSpacer\"></div>\n" +
            "<div class=\"commonSpacer\"></div>\n" +
            "<div class=\"greenContainerHead\">\n" +
            "<div class=\"darkGreenIndend\">Ank&#252;nfte</div>\n" +
            "</div>\n" +
            "<br />\n" +
            "<p class=\"qs\">\n" +
            "<b>Frankfurt (Main) Speyerer Stra&#223;e</b><br />\n" +
            "Ankunft 16:02\n" +
            "Uhr, 28.10.18\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>16:05</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>16:05</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>16:09</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>16:10</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>16:15</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>16:15</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>16:19</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>16:20</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>16:25</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>16:25</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>16:29</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>16:30</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>16:35</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>16:35</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>16:39</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>16:40</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>16:45</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>16:45</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>16:49</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>16:50</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>16:55</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>16:55</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>16:59</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>17:00</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>17:05</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>17:05</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>17:09</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>17:10</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>17:15</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>17:15</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>17:19</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>17:20</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>17:25</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>17:25</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>17:29</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>17:30</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>17:35</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>17:35</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>17:39</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>17:40</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>17:45</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>17:45</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>17:49</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>17:50</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>17:55</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>17:55</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Schie&#223;h&#252;ttenstra&#223;e\n" +
            "<br />\n" +
            "<b>17:59</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 11</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Zuckschwerdtstra&#223;e\n" +
            "<br />\n" +
            "<b>18:00</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) M&#246;nchhofstra&#223;e\n" +
            "<br />\n" +
            "<b>18:05</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"sq\">\n" +
            "<b>Tram 21</b>\n" +
            "&lt;&lt;\n" +
            "Frankfurt (Main) Stadion Stra&#223;enbahn\n" +
            "<br />\n" +
            "<b>18:05</b>\n" +
            "keine Prognose verf&#252;gbar\n" +
            "<img src=\"/auskunft/s/n/img/ua_xhtml/him.gif\" alt=\"\" />\n" +
            "<b>Frankfurt: Trams / U-Bahnen - &#196;nderungen anl&#228;sslich des Frankfurt Marathons am 28.10.</b>\n" +
            "<br />\n" +
            "</p>\n" +
            "<div class=\"line\"></div>\n" +
            "<p class=\"links\">\n" +
            "<img class=\"smIcon\" src=\"/auskunft/s/n/img/ua_xhtml/ico.gif\" alt=\"\" /> <a href=\"http://www.rmv.de/auskunft/bin/jp/stboard.exe/dox?M=s&amp;input=3000019&amp;boardType=arr&amp;time=18:05%2B1&amp;productsFilter=0&amp;date=28.10.18&amp;maxJourneys=50&amp;start=yes\">Mehr</a>\n" +
            "<br />\n" +
            "<img class=\"smIcon\" src=\"/auskunft/s/n/img/ua_xhtml/ico.gif\" alt=\"\" /> <a href=\"http://www.rmv.de/auskunft/bin/jp/stboard.exe/dox?M=s&amp;input=3000019&amp;boardType=dep&amp;time=16:02&amp;productsFilter=0&amp;maxJourneys=50&amp;date=28.10.18&amp;start=yes\">Abfahrt</a>\n" +
            "<br />\n" +
            "<img class=\"smIcon\" src=\"/auskunft/s/n/img/ua_xhtml/ico.gif\" alt=\"\" /> <a href=\"/auskunft/bin/jp/stboard.exe/dox?M=s&amp;protocol=https:&amp;REQstationreq=Frankfurt &#x0028;Main&#x0029; Speyerer Stra&#223;e&amp;editStation=yes&amp;\">Anfrage &#228;ndern</a>\n" +
            "<br />\n" +
            "<img class=\"smIcon\" src=\"/auskunft/s/n/img/ua_xhtml/ico.gif\" alt=\"\" /> <a href=\"/auskunft/bin/jp/stboard.exe/dox?M=s&amp;protocol=https:&amp;\">Neue Anfrage</a>\n" +
            "<br />\n" +
            "</p>\n" +
            "</div>\n" +
            "<div class=\"commonSpacer\"></div>\n" +
            "<div class=\"commonSpacer\"></div>\n" +
            "<div class=\"whiteIndend\">\n" +
            "<a class=\"flagInactive\" href=\"http://mobil.rmv.de/mobile/portal?locale=d\">Home</a>\n" +
            "<a class=\"flagActive\" href=\"http://mobil.rmv.de/mobile/portal/information?locale=d\">Information</a>\n" +
            "<a class=\"flagInactive\" href=\"http://mobil.rmv.de/mobile/portal/entertainment?locale=d\">Entertainment</a>\n" +
            "</div>\n" +
            "<div class=\"commonSpacer\"></div>\n" +
            "<div class=\"footerSpace\"></div>\n" +
            "<div class=\"footerDiv\">\n" +
            "<a class=\"footer\" href=\"http://mobil.rmv.de/mobile/portal/imprint?locale=d\">Impressum</a> | <a class=\"footer\" href=\"http://mobil.rmv.de/mobile/portal/imprint?locale=d\">Datenschutzerkl&#228;rung</a>\n" +
            "</div>\n" +
            "</body>\n" +
            "</html>\n";

    public final static String htmlResponseFFMHauptwacheB = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
            "        <!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.0//EN\" \"http://www.wapforum.org/DTD/xhtml-mobile10.dtd\">\n" +
            "        <html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "        <head>\n" +
            "<title>Deutsche Bahn - Abfahrt</title>\n" +
            "        <meta http-equiv=\"content-type\" content=\"text/html; charset=ISO-8859-1\" />\n" +
            "        <meta http-equiv=\"expires\" content=\"-1\" />\n" +
            "        <meta http-equiv=\"cache-control\" content=\"no-cache\" />\n" +
            "        <meta http-equiv=\"pragma\" content=\"no-cache\" />\n" +
            "        <meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0;\" />\n" +
            "        <meta name=\"format-detection\" content=\"telephone=no\" />\n" +
            "        <meta name=\"HandheldFriendly\" content=\"true\" />\n" +
            "        <link rel=\"shortcut icon\" href=\"https://www.img-bahn.de/s3/prod/v/img_old/favicon.ico\" />\n" +
            "        <link rel=\"apple-touch-icon\" type=\"image/x-icon\" href=\"https://www.img-bahn.de/s3/prod/v/img_old/apple-touch-icon.png\"/>\n" +
            "        <script type=\"text/javascript\">\n" +
            "        digitalData = new Object();\n" +
            "        digitalData.pageInstanceID  = \"dbbahnprod_BAHN_AnkunftAbfahrtAb_de\";\n" +
            "        digitalData.version         = \"1.0\";\n" +
            "        digitalData.reportSuite     = \"dbbahnprod\";\n" +
            "        digitalData.numberCarts     = 0;\n" +
            "        tmpDate                     = new Date();\n" +
            "        digitalData.creationDate    = tmpDate.getFullYear()+\"-\"+((tmpDate.getMonth()<9)?\"0\":\"\")+(tmpDate.getMonth()+1).toString()+\"-\"+((tmpDate.getDate()<10)?\"0\":\"\")+tmpDate.getDate()+\"T\"+((tmpDate.getHours()<10)?\"0\":\"\")+tmpDate.getHours()+\":\"+((tmpDate.getMinutes()<10)?\"0\":\"\")+tmpDate.getMinutes()+\":\"+((tmpDate.getSeconds()<10)?\"0\":\"\")+tmpDate.getSeconds()+\"+\"+(tmpDate.getTimezoneOffset()/-60)+\":00\";\n" +
            "        digitalData.page            = new Object();\n" +
            "        digitalData.suchparameter   = new Object();\n" +
            "        digitalData.user            = new Object();\n" +
            "        digitalData.page.pageInfo   = new Object();\n" +
            "        digitalData.page.testing    = new Object();\n" +
            "        digitalData.page.category   = new Object();\n" +
            "        digitalData.page.teaser     = new Object();\n" +
            "        digitalData.page.interaktion= new Object();\n" +
            "        digitalData.page.isError    = false;\n" +
            "        digitalData.page.environment  = \"dbbahnprod\";\n" +
            "        digitalData.page.pageInfo.pageID    = \"BAHN_AnkunftAbfahrtAb_de\";\n" +
            "        digitalData.page.pageInfo.portal    = \"BAHN\";\n" +
            "        digitalData.page.pageInfo.anwendung = \"ASK\";\n" +
            "        digitalData.page.pageInfo.channel   = \"BAHN_ASK_DEU_de\";\n" +
            "        digitalData.page.pageInfo.channelSpecific     = \"\";\n" +
            "        digitalData.page.pageInfo.prozesseinstieg   = \"\";\n" +
            "        digitalData.page.pageInfo.prozess           = \"\";\n" +
            "        digitalData.page.pageInfo.pageName          = \"BAHN_ASK_DEU_de_AnkunftAbfahrtAb\";\n" +
            "        digitalData.page.pageInfo.pageNameSpecific  = \"AnkunftAbfahrtAb\";\n" +
            "        var tmp    = this.document.URL.match(/[^\\?]+/);\n" +
            "        if(tmp)\n" +
            "        digitalData.page.pageInfo.destinationURL    = tmp[0];\n" +
            "        else\n" +
            "        digitalData.page.pageInfo.destinationURL    = this.document.URL;\n" +
            "        digitalData.page.pageInfo.destinationURLParameter = new Array();\n" +
            "        var tmp = this.document.URL.match(/[(\\?|\\&)]([^=]+)\\=([^&#]+)/g);\n" +
            "        if(tmp)\n" +
            "        {\n" +
            "        for(var i = 0; i < tmp.length; i++)\n" +
            "        {\n" +
            "        var tmpString = tmp[i].substring(1).split(\"=\");\n" +
            "        digitalData.page.pageInfo.destinationURLParameter[i] = {\"name\": tmpString[0] , \"value\": tmpString[1]};\n" +
            "        }\n" +
            "        }\n" +
            "        digitalData.page.pageInfo.referringURL      = document.referrer;\n" +
            "        digitalData.page.pageInfo.onsiteSearchTerm  = \"\";\n" +
            "        digitalData.page.pageInfo.onsiteSearchResults  = 0;\n" +
            "        digitalData.page.pageInfo.sysEnv          = \"android\";\n" +
            "        digitalData.page.pageInfo.version           = \"HAFAS 5.43.DB.R18.12.2.a\";\n" +
            "        digitalData.page.pageInfo.issueDate         = digitalData.creationDate;\n" +
            "        digitalData.page.pageInfo.effectiveDate     = digitalData.creationDate;\n" +
            "        digitalData.page.pageInfo.effectiveDateUnix = tmpDate.getTime();\n" +
            "        digitalData.page.pageInfo.expiryDate        = digitalData.creationDate;\n" +
            "        digitalData.page.pageInfo.language          = \"de\";\n" +
            "        digitalData.page.pageInfo.country           = \"DEU\";\n" +
            "        digitalData.page.testing.aktiv              = false;\n" +
            "        digitalData.page.testing.anzahlVariationen  = 0;\n" +
            "        digitalData.page.testing.variante           = new Array();\n" +
            "        digitalData.page.category.hierLevel             = new Array();\n" +
            "        digitalData.page.category.hierLevel.push(\"web\");\n" +
            "        digitalData.page.category.hierLevel.push(\"AnkunftAbfahrtAb\");\n" +
            "        digitalData.page.category.numberHierarchyLevels = 2;\n" +
            "        digitalData.page.interaktion.anzahlTypen    = 0;\n" +
            "        digitalData.page.interaktion.typ            = new Array();\n" +
            "        digitalData.page.teaser.anzahlTeaser        = 0;\n" +
            "        digitalData.page.teaser.teaserItem          = new Array();\n" +
            "        digitalData.user.profile            = new Object();\n" +
            "        digitalData.user.kundentyp     = \"PK\";\n" +
            "        digitalData.user.loginstatus        = \"logout\";\n" +
            "        digitalData.user.kundenstatus       = \"anonym\";\n" +
            "        digitalData.user.profile.address    = new Object();\n" +
            "        digitalData.user.profile.address.postalCode = \"\";\n" +
            "        digitalData.user.profile.address.city       = \"\";\n" +
            "        digitalData.user.profile.address.country    = \"\";\n" +
            "        digitalData.user.profile.anrede     = \"\";\n" +
            "        digitalData.user.profile.bcStatus           = \"\";\n" +
            "        digitalData.user.profile.hash               = \"\";\n" +
            "        digitalData.user.profile.nlHash             = \"\";\n" +
            "        digitalData.user.profile.isLSV              = 0;\n" +
            "        </script>\n" +
            "        <script type=\"text/javascript\" src=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/js/bahn_mobile.min.js\" ></script>\n" +
            "        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/css/bahn_mobile.css\" />\n" +
            "        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/css_old/hafas_mobile.css\" />\n" +
            "        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/cms/mobile/css/touch.css\" />\n" +
            "        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.img-bahn.de/s3/prod/v/css_old/hafas_touch.css\" />\n" +
            "        </head>\n" +
            "        <body onload=\"BAHN.init(); initTouchElements();\">\n" +
            "        <div id=\"doc\" class=\"touch\">\n" +
            "        <div id=\"header\">\n" +
            "        <div class=\"logo\">\n" +
            "        <img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/db_em_rgb_28px.png\" width=\"40\" height=\"28\" style=\"padding: 14px 0;\" alt=\"DB Bahn\" />\n" +
            "        </div>\n" +
            "        <div id=\"branding\">\n" +
            "        <div class=\"bar\"> </div>\n" +
            "        </div>\n" +
            "        </div>\n" +
            "        <div id=\"content\" class=\"\">\n" +
            "        <h1>\n" +
            "Abfahrt\n" +
            "        </h1>\n" +
            "        <div class=\"inputtbl\">\n" +
            "        <div class=\"fline stdpadding\">\n" +
            "        <span class=\"bold\">\n" +
            "        Frankfurt(M)Hauptwache - Aktuell\n" +
            "        </span>\n" +
            "        <br />\n" +
            "        Abfahrt 19:24\n" +
            "        Uhr, 26.01.19\n" +
            "        </div>\n" +
            "        <div class=\"rlinebig\"></div>\n" +
            "        <div class=\"fline\" style=\"height: 40px;\">\n" +
            "        &nbsp; <a class=\"btnRight subbtnsmall\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?ld=15046&amp;protocol=https:&amp;rt=1&amp;use_realtime_filter=1&amp;webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24%2D60&amp;pt=19:24&amp;p=1111111111111111&amp;date=26.01.19&amp;mx=50&amp;start=yes&amp;\">Fr&#252;her</a>\n" +
            "        </div>\n" +
            "        <div class=\"rlinebig\"></div>\n" +
            "        <div class=\"sqPlatform sqHead\">\n" +
            "        Gleis\n" +
            "        </div>\n" +
            "        <div class=\"sqTime sqHead\">\n" +
            "        Ab\n" +
            "        </div>\n" +
            "        <div class=\"sqProduct sqHead\">\n" +
            "        &nbsp;\n" +
            "        </div>\n" +
            "        <div class=\"sqDirection sqHead\">\n" +
            "        In Richtung\n" +
            "        </div>\n" +
            "        <div class=\"rlinebig\"></div>\n" +
            "        <div class=\"clicktable\">\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:23</span><br/><span class=\"delayOnTime\">19:24</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/882588/490045/937518/174586/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:23&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;R&#246;dermark-Ober Roden</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:23</span><br/><span class=\"delayOnTime\">19:27</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/220194/575911/426046/139686/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:23&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Ostbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:24</span><br/><span class=\"delayOnTime\">19:24</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/471942/630537/533910/109669/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:24&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;Nieder-Eschbach, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:24</span><br/><span class=\"delayOnTime\">19:24</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/191724/556922/755474/313886/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:24&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:25</span><br/><span class=\"delayOnTime\">19:28</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/641163/409690/29574/198956/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:25&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      4</span></a><br />nach&nbsp;Kronberg(Taunus)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:26</span><br/><span class=\"delay\">19:31</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/920751/783567/689130/37651/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:26&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      3</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:28</span><br/><span class=\"delayOnTime\">19:29</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/9816/199722/51978/22735/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:28&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      9</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:28</span><br/><span class=\"delayOnTime\">19:28</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/543186/686751/455408/46704/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:28&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Enkheim, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:28</span><br/><span class=\"delayOnTime\">19:29</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/548838/690125/582652/108441/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:28&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Praunheim Heerstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:29</span><br/><span class=\"delayOnTime\">19:31</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/241803/550630/820860/329854/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:29&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:29</span><br/><span class=\"delayOnTime\">19:29</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/891690/798863/637874/21764/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:29&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:30</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/172902/253717/650828/267792/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:30&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      6</span></a><br />nach&nbsp;Friedberg(Hess)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:31</span><br/><span class=\"delayOnTime\">19:33</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/595851/706981/662636/132740/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:31&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:31</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/462123/662892/554284/123139/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:31&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;Riedberg, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:33</span><br/><span class=\"delayOnTime\">19:33</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/385587/324980/101820/77636/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:33&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      9</span></a><br />nach&nbsp;Hanau Hbf</div><br /><span class=\"red\">Signalst&#246;rung: Auf der Strecke Mainz-Bischofsheim - Frankfurt(Main)Hbf zwischen R&#252;sselsheim und Raunheim.</span><br /><span class=\"red\">Es kommt zu Versp&#228;tungen im S-Bahnverkehr der Deutschen Bahn.</span></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:33</span><br/><span class=\"delayOnTime\">19:33</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/163056/556865/541986/216703/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:33&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Ostbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:33</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/94278/535358/592600/264936/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:33&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Hausen, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:34</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/447285/619976/714174/208021/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:34&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;Gonzenheim (U), Bad Homburg v.d. H&#246;he</div><div>&nbsp;<span class=\"red\">Fahrt f&#228;llt aus</span></div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:34</span><br/><span class=\"delayOnTime\">19:34</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/220947/566663/789890/321354/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:34&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:36</span><br/><span class=\"delayOnTime\">19:37</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/738852/442252/603820/55650/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:36&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      4</span></a><br />nach&nbsp;Langen(Hess)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:36</span><br/><span class=\"delayOnTime\">19:36</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/223911/551834/443666/147197/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:36&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      3</span></a><br />nach&nbsp;Bahnhof, Oberursel (Taunus)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:38</span><br/><span class=\"delayOnTime\">19:39</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/934203/507249/851370/114309/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:38&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:38</span><br/><span class=\"delayOnTime\">19:38</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/275910/597659/683222/249704/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:38&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Enkheim, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:38</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/495999/672512/246482/42154/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:38&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Praunheim Heerstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:39</span><br/><span class=\"delayOnTime\">19:39</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/934704/778522/494218/64488/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:39&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:39</span><br/><span class=\"delayOnTime\">19:39</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/96624/533841/885036/410368/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:39&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:40</span><br/><span class=\"delayOnTime\">19:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/191784/259877/849874/361034/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:40&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      3</span></a><br />nach&nbsp;Bad Soden(Taunus)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:41</span><br/><span class=\"delayOnTime\">19:42</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/798984/462320/889236/178314/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:41&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Frankfurt(Main)S&#252;d</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:41</span><br/><span class=\"delayOnTime\">19:41</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/762870/730138/535930/13678/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:41&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      3</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:43</span><br/><span class=\"delayOnTime\">19:43</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/661056/416262/795822/177561/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:43&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      2</span></a><br />nach&nbsp;Dietzenbach Bahnhof</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:43</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/450948/346588/553300/126337/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:43&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      8</span></a><br />nach&nbsp;Wiesbaden Hbf</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:43</span><br/><span class=\"delayOnTime\">19:43</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/501864/669801/725320/195435/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:43&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Ostbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:43</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/749976/753924/329962/85074/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:43&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Hausen, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:44</span><br/><span class=\"delayOnTime\">19:44</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/654063/689232/344758/45642/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:44&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;Gonzenheim (U), Bad Homburg v.d. H&#246;he</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:44</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/673386/717476/957376/254285/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:44&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:45</span><br/><span class=\"delayOnTime\">19:45</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/918264/502184/963434/175629/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:45&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      6</span></a><br />nach&nbsp;Frankfurt(Main)S&#252;d</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:46</span><br/><span class=\"delayOnTime\">19:46</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/595137/706743/265648/65595/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:46&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:46</span><br/><span class=\"delayOnTime\">19:46</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/216252/580935/944918/400414/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:46&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      8</span></a><br />nach&nbsp;Riedberg, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:48</span><br/><span class=\"delayOnTime\">19:48</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/957705/515132/145702/246396/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:48&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      2</span></a><br />nach&nbsp;Niedernhausen(Taunus)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:48</span><br/><span class=\"delayOnTime\">19:50</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/781026/456627/262976/128854/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:48&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      8</span></a><br />nach&nbsp;Offenbach(Main)Ost</div><br /><span class=\"red\">Signalst&#246;rung: Auf der Strecke Mainz-Bischofsheim - Frankfurt(Main)Hbf zwischen R&#252;sselsheim und Raunheim.</span><br /><span class=\"red\">Es kommt zu Versp&#228;tungen im S-Bahnverkehr der Deutschen Bahn.</span></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:48</span><br/><span class=\"delayOnTime\">19:48</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/992667/836555/282862/189458/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:48&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Enkheim, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:48</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/718809/746782/820244/170582/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:48&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      7</span></a><br />nach&nbsp;Praunheim Heerstra&#223;e, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:49</span><br/><span class=\"delayOnTime\">19:49</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/232404/547497/707994/276555/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:49&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      2</span></a><br />nach&nbsp;S&#252;dbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:49</span><br/><span class=\"delayOnTime\">19:49</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/599931/701610/693480/146822/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:49&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      1</span></a><br />nach&nbsp;Ginnheim, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        3\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:50</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/864129/484034/177122/199507/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:50&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      5</span></a><br />nach&nbsp;Friedrichsdorf(Taunus)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:51</span><br/><span class=\"delayOnTime\">19:51</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/228963/272271/905792/376600/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:51&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      3</span></a><br />nach&nbsp;Darmstadt Hbf</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:51</span><br/><span class=\"delayOnTime\">19:51</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/627714/687087/851230/216378/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:51&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      3</span></a><br />nach&nbsp;Hohemark, Oberursel (Taunus)</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        2\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:53</span><br/><span class=\"delayOnTime\">19:54</span></div><div class=\"sqProduct\"><img src=\"https://www.img-bahn.de/s3/prod/v/img_old/ua_xhtml/s-bahn_16x16.png\" width=\"16\" height=\"16\" alt=\"\" /></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/945534/511027/948668/159180/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:53&amp;station_evaId=8006692&amp;station_type=dep&amp;\"><span class=\"bold\">S      1</span></a><br />nach&nbsp;R&#246;dermark-Ober Roden</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:53</span><br/><span class=\"delayOnTime\">19:53</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/307818/605046/70614/67299/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:53&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Ostbahnhof, Frankfurt a.M.</div></div>\n" +
            "        <div class=\"sqdetailsDep trow\">\n" +
            "        <div class=\"sqPlatform\">\n" +
            "        </div>\n" +
            "        <div class=\"sqTime\">\n" +
            "        <span class=\"bold\">19:53</span><br/><span class=\"delayOnTime\">19:53</span></div><div class=\"sqProduct\"></div><div class=\"sqDirection\"><a href=\"https://reiseauskunft.bahn.de/bin/traininfo.exe/dox/433848/648494/349278/30023/81?webview=&amp;si=8006692&amp;bt=dep&amp;ti=19:24&amp;pt=19:24&amp;p=1111111111111111&amp;date_bhftafel=26.01.19&amp;max=50&amp;rt=1&amp;&amp;date=26.01.19&amp;time=19:53&amp;station_evaId=100001&amp;station_type=dep&amp;\"><span class=\"bold\">U      6</span></a><br />nach&nbsp;Hausen, Frankfurt a.M.</div></div>\n" +
            "        </div>\n" +
            "        <div class=\"rlinebig\"></div>\n" +
            "        <div class=\"fline\" style=\"height: 40px;\">\n" +
            "        <a class=\"btnRight subbtnsmall\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?si=8006692&amp;bt=dep&amp;ti=19:53%2B1&amp;p=1111111111111111&amp;date=26.01.19&amp;max=50&amp;rt=1&amp;use_realtime_filter=1&amp;start=yes&amp;\">Sp&#228;ter</a>\n" +
            "        </div>\n" +
            "        <div class=\"rlinebottom\"></div>\n" +
            "        <div class=\"bggrey\" style=\"padding-left: 16px;\">\n" +
            "        <a class=\"arrowlink\" href=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?si=8006692&amp;bt=arr&amp;ti=19:24&amp;p=1111111111111111&amp;max=50&amp;rt=1&amp;use_realtime_filter=1&amp;date=26.01.19&amp;start=yes&amp;\">Ankunft</a>\n" +
            "        </div>\n" +
            "        <div class=\"formular\">\n" +
            "        <form action=\"https://reiseauskunft.bahn.de/bin/bhftafel.exe/dox?\" method=\"post\" style=\"display:inline\">\n" +
            "        <div class=\"bline bggrey\">\n" +
            "        <input type=\"submit\" class=\"nebenbtnsmall\" name=\"rt\" style=\"margin-left: 6px;\" value=\"Zur&#252;ck\" />\n" +
            "        </div>\n" +
            "        </form>\n" +
            "        </div>\n" +
            "        </div>\n" +
            "        <script type=\"text/javascript\">\n" +
            "        digitalData.suchparameter.start = new Object();\n" +
            "        if(typeof(tmpDiv) == \"undefined\")\n" +
            "        tmpDiv = document.createElement(\"div\");\n" +
            "        tmpDiv.innerHTML = \"Frankfurt&#x0028;M&#x0029;Hauptwache\";\n" +
            "        digitalData.suchparameter.start.name = tmpDiv.innerHTML;\n" +
            "        digitalData.suchparameter.start.eBhf = \"008006692\";\n" +
            "        digitalData.suchparameter.start.typ = \"Haltestelle\";\n" +
            "        digitalData.suchparameter.start.land = \"DEU\";\n" +
            "        digitalData.suchparameter.reisedatumHin = \"2019-01-26\";\n" +
            "        digitalData.suchparameter.reisezeitHinVon = \"19:24\";\n" +
            "        digitalData.suchparameter.hIstAnkunft = \"0\";\n" +
            "        digitalData.suchparameter.reiseparameterH = new Array();\n" +
            "        var reiseprodukte = new Object();\n" +
            "        reiseprodukte.ICE = 1;\n" +
            "        reiseprodukte.IC_EC = 1;\n" +
            "        reiseprodukte.IR = 1;\n" +
            "        reiseprodukte.RE_RB = 1;\n" +
            "        reiseprodukte.S = 1;\n" +
            "        reiseprodukte.Bus = 1;\n" +
            "        reiseprodukte.Schiff = 1;\n" +
            "        reiseprodukte.U = 1;\n" +
            "        reiseprodukte.Tram = 1;\n" +
            "        reiseprodukte.AST = 1;\n" +
            "        digitalData.suchparameter.reiseparameterH.push({reiseprodukte: reiseprodukte});\n" +
            "        </script>\n" +
            "        </div>\n" +
            "        <div id=\"footer\" style=\"\">\n" +
            "        <div id=\"branding_footer\">\n" +
            "        <div class=\"bar\"></div>\n" +
            "        </div>\n" +
            "        <div class=\"footer-list-container\">\n" +
            "        <div class=\"footer-left\">\n" +
            "        <ul class=\"footer\">\n" +
            "        <li class=\"firstitem\"><a class=\"footerlinks\" href=\"\">Startseite</a></li>\n" +
            "        <li class=\"\">\n" +
            "        <a class=\"footerlinks\" href=\"https://fahrkarten.bahn.de/mobile/st/st.post?\">Mobiles Reiseportal</a>\n" +
            "        </li>\n" +
            "        </ul>\n" +
            "        </div>\n" +
            "        <div class=\"footer-right\">\n" +
            "        <ul class=\"footer\">\n" +
            "        <li class=\"firstitem\">\n" +
            "        <a class=\"footerlinks\" href=\"http://www.bahn.de/m/view/de/home/kontakt/impressum.shtml\">Impressum</a>\n" +
            "        </li>\n" +
            "        <li>\n" +
            "<a class=\"footerlinks\" href=\"\" target=\"_blank\">Datenschutz</a>\n" +
            "        </li>\n" +
            "        </ul>\n" +
            "        </div>\n" +
            "        2019-01-26 19:24:30.097 3583-3614/org.sge.widgetalarmmanagerexample I/chatty: uid=10471(u0_a471) roidJUnitRunner identical 1 line\n" +
            "        </div>\n" +
            "        <p class=\"webtrack\">\n" +
            "        <img src=\"https://st.bahn.de/b/ss/dbbahnprod/5/139025776?AQB=1&amp;gn=MOBI_ASK_DEU_de_AnkunftAbfahrtAb&amp;ch=MOBI_ASK_DEU_de&amp;ev=event48,event17&amp;AQE=1\" width=\"5\" height=\"5\" alt=\"\" />\n" +
            "        <script type=\"text/javascript\">\n" +
            "        var utag_data = {\n" +
            "        }\n" +
            "        </script>\n" +
            "        <script type=\"text/javascript\">\n" +
            "        (function(a,b,c,d){\n" +
            "        a='https://www.bahn.de/media/view/tms/utag.js';\n" +
            "        b=document;c='script';d=b.createElement(c);d.src=a;d.type='text/java'+c;d.async=true;\n" +
            "        a=b.getElementsByTagName(c)[0];a.parentNode.insertBefore(d,a);\n" +
            "        })();\n" +
            "        </script>\n" +
            "        </p>\n" +
            "        </div>\n" +
            "        </body>\n" +
            "        </html>";


    public final static String jsonResponseHVVStPauli  = "{\"returnCode\":\"OK\",\"results\":[{\"name\":\"St.Pauli\",\"city\":\"Hamburg\",\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\",\"type\":\"STATION\",\"coordinate\":{\"x\":9.970189,\"y\":53.550799},\"serviceTypes\":[\"bus\",\"u\"],\"hasStationInformation\":true}]}";
    public final static String jsonDepartureResponseHVVStPauli = "{\"returnCode\":\"OK\",\"time\":{\"date\":\"20.11.2018\",\"time\":\"15:05\"},\"departures\":[{\"line\":{\"name\":\"37\",\"direction\":\"Bramfelder Dorfplatz (Heukoppel)\",\"origin\":\"Schenefeld, Schenefelder Platz\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:37_HHA-B\"},\"timeOffset\":-2,\"serviceId\":85785,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"112\",\"direction\":\"Neumühlen/Övelgönne (Fähre)\",\"origin\":\"Osterbrookplatz\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Stadtbus\",\"model\":\"Solobus\"},\"id\":\"HHA-B:112_HHA-B\"},\"timeOffset\":0,\"serviceId\":68206,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"U3\",\"direction\":\"Hauptbahnhof Süd - Wandsbek-Gartenstadt\",\"origin\":\"Barmbek - Sierichstraße\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":0,\"serviceId\":39963,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 1\"},{\"line\":{\"name\":\"U3\",\"direction\":\"Schlump - Barmbek\",\"origin\":\"Barmbek - Mundsburg\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":2,\"serviceId\":40150,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 2\"},{\"line\":{\"name\":\"37\",\"direction\":\"Schenefeld, Schenefelder Platz\",\"origin\":\"Bramfelder Dorfplatz (Heukoppel)\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:37_HHA-B\"},\"timeOffset\":5,\"serviceId\":85560,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"U3\",\"direction\":\"Hauptbahnhof Süd - Wandsbek-Gartenstadt\",\"origin\":\"Barmbek - Sierichstraße\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":5,\"serviceId\":39964,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 1\"},{\"line\":{\"name\":\"6\",\"direction\":\"U Borgweg\",\"origin\":\"U Feldstraße\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Metrobus\",\"model\":\"Gelenkbus\"},\"id\":\"HHA-B:6_HHA-B\"},\"timeOffset\":6,\"serviceId\":16060,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"U3\",\"direction\":\"Schlump - Barmbek\",\"origin\":\"Barmbek - Mundsburg\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":7,\"serviceId\":40151,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 2\"},{\"line\":{\"name\":\"37\",\"direction\":\"Hauptbahnhof/ZOB\",\"origin\":\"Schenefeld, Schenefelder Platz\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:37_HHA-B\"},\"timeOffset\":8,\"serviceId\":85717,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"U3\",\"direction\":\"Hauptbahnhof Süd - Wandsbek-Gartenstadt\",\"origin\":\"Barmbek - Sierichstraße\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":10,\"serviceId\":39965,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 1\"},{\"line\":{\"name\":\"112\",\"direction\":\"Osterbrookplatz\",\"origin\":\"Neumühlen/Övelgönne (Fähre)\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Stadtbus\",\"model\":\"Solobus\"},\"id\":\"HHA-B:112_HHA-B\"},\"timeOffset\":11,\"serviceId\":68383,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"36\",\"direction\":\"S Blankenese\",\"origin\":\"Berner Heerweg\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:36_HHA-B\"},\"timeOffset\":12,\"serviceId\":90024,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"6\",\"direction\":\"U Feldstraße\",\"origin\":\"U Borgweg\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Metrobus\",\"model\":\"Gelenkbus\"},\"id\":\"HHA-B:6_HHA-B\"},\"timeOffset\":12,\"serviceId\":15859,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"}},{\"line\":{\"name\":\"U3\",\"direction\":\"Schlump - Barmbek\",\"origin\":\"Barmbek - Mundsburg\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":12,\"delay\":240,\"serviceId\":40152,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 2\",\"realtimePlatform\":\"Gleis 2\",\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"36\",\"direction\":\"Berner Heerweg\",\"origin\":\"S Blankenese\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:36_HHA-B\"},\"timeOffset\":13,\"delay\":240,\"serviceId\":89886,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"112\",\"direction\":\"Neumühlen/Övelgönne (Fähre)\",\"origin\":\"Osterbrookplatz\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Stadtbus\",\"model\":\"Solobus\"},\"id\":\"HHA-B:112_HHA-B\"},\"timeOffset\":15,\"delay\":0,\"serviceId\":68209,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"U3\",\"direction\":\"Hauptbahnhof Süd - Wandsbek-Gartenstadt\",\"origin\":\"Barmbek - Sierichstraße\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":15,\"delay\":0,\"serviceId\":39966,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 1\",\"realtimePlatform\":\"Gleis 1\",\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"6\",\"direction\":\"U Borgweg\",\"origin\":\"U Feldstraße\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Metrobus\",\"model\":\"Gelenkbus\"},\"id\":\"HHA-B:6_HHA-B\"},\"timeOffset\":16,\"delay\":0,\"serviceId\":16062,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"37\",\"direction\":\"Bramfelder Dorfplatz (Heukoppel)\",\"origin\":\"Schenefeld, Schenefelder Platz\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:37_HHA-B\"},\"timeOffset\":17,\"delay\":0,\"serviceId\":85787,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"37\",\"direction\":\"Schenefeld, Schenefelder Platz\",\"origin\":\"Hauptbahnhof/ZOB\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:37_HHA-B\"},\"timeOffset\":17,\"delay\":0,\"serviceId\":85652,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"U3\",\"direction\":\"Schlump - Barmbek\",\"origin\":\"Barmbek - Mundsburg\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":17,\"delay\":60,\"serviceId\":40153,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 2\",\"realtimePlatform\":\"Gleis 2\",\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"U3\",\"direction\":\"Hauptbahnhof Süd - Wandsbek-Gartenstadt\",\"origin\":\"Barmbek - Sierichstraße\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":20,\"delay\":0,\"serviceId\":39967,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 1\",\"realtimePlatform\":\"Gleis 1\",\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"U3\",\"direction\":\"Schlump - Barmbek\",\"origin\":\"Barmbek - Mundsburg\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":22,\"delay\":60,\"serviceId\":40154,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 2\",\"realtimePlatform\":\"Gleis 2\",\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"U3\",\"direction\":\"Hauptbahnhof Süd - Wandsbek-Gartenstadt\",\"origin\":\"Barmbek - Sierichstraße\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":25,\"delay\":0,\"serviceId\":39968,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 1\",\"realtimePlatform\":\"Gleis 1\",\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"112\",\"direction\":\"Osterbrookplatz\",\"origin\":\"Neumühlen/Övelgönne (Fähre)\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Stadtbus\",\"model\":\"Solobus\"},\"id\":\"HHA-B:112_HHA-B\"},\"timeOffset\":26,\"delay\":0,\"serviceId\":68386,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"6\",\"direction\":\"U Borgweg\",\"origin\":\"U Feldstraße\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Metrobus\",\"model\":\"Gelenkbus\"},\"id\":\"HHA-B:6_HHA-B\"},\"timeOffset\":26,\"delay\":0,\"serviceId\":16064,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"37\",\"direction\":\"Bramfelder Dorfplatz (Heukoppel)\",\"origin\":\"Schenefeld, Schenefelder Platz\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:37_HHA-B\"},\"timeOffset\":27,\"delay\":0,\"serviceId\":85789,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"37\",\"direction\":\"Schenefeld, Schenefelder Platz\",\"origin\":\"Bramfelder Dorfplatz (Heukoppel)\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Schnellbus\",\"longInfo\":\"Niederflur-Schnellbus\",\"model\":\"Schnellbus\"},\"id\":\"HHA-B:37_HHA-B\"},\"timeOffset\":27,\"delay\":0,\"serviceId\":85561,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"6\",\"direction\":\"U Feldstraße\",\"origin\":\"U Borgweg\",\"type\":{\"simpleType\":\"BUS\",\"shortInfo\":\"Bus\",\"longInfo\":\"Niederflur Metrobus\",\"model\":\"Gelenkbus\"},\"id\":\"HHA-B:6_HHA-B\"},\"timeOffset\":27,\"delay\":0,\"serviceId\":15862,\"station\":{\"combinedName\":\"U St.Pauli\",\"id\":\"Master:80017\"},\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]},{\"line\":{\"name\":\"U3\",\"direction\":\"Schlump - Barmbek\",\"origin\":\"Barmbek - Mundsburg\",\"type\":{\"simpleType\":\"TRAIN\",\"shortInfo\":\"U\",\"longInfo\":\"U-Bahn\",\"model\":\"DT5\"},\"id\":\"HHA-U:U3_HHA-U\"},\"timeOffset\":27,\"delay\":60,\"serviceId\":40155,\"station\":{\"combinedName\":\"St.Pauli\",\"id\":\"Master:80900\"},\"platform\":\"Gleis 2\",\"realtimePlatform\":\"Gleis 2\",\"attributes\":[{\"isPlanned\":true,\"types\":[\"REALTIME\",\"ACCURATE\"]}]}]}";

    public final static String jsonResponseMVVMarienplatz  = "{ \"parameters\": [ { \"name\":\"serverID\", \"value\":\"vm-mvv03.defas-fgi.de\" }, { \"name\":\"requestID\", \"value\":\"0\" }, { \"name\":\"sessionID\", \"value\":\"0\" }, { \"name\":\"calcTime\", \"value\":\"48.853\" } ], \"stopFinder\": { \"message\": [ { \"name\":\"code\", \"value\":\"-8011\" }, { \"name\":\"error\", \"value\":\"\" }, { \"name\":\"type\", \"value\":\"\" }, { \"name\":\"module\", \"value\":\"BROKER\" } ], \"input\": { \"input\":\"marienplat\" }, \"points\": [ { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Aiglsbach, Aiglsbach, Marienplatz\", \"stateless\":\"4100770\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"0\", \"best\":\"0\", \"object\":\"Aiglsbach, Marienplatz\", \"mainLoc\":\"Aiglsbach\", \"modes\":\"6\", \"ref\": { \"id\":\"4100770\", \"gid\":\"de:09273:770\", \"omc\":\"9273113\", \"placeID\":\"1\", \"place\":\"Aiglsbach\", \"coords\":\"1303902.00000,5777257.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Bad Aibling, Bad Aibling / Marienplatz\", \"stateless\":\"1190362\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"0\", \"best\":\"0\", \"object\":\"Bad Aibling / Marienplatz\", \"mainLoc\":\"Bad Aibling\", \"modes\":\"6\", \"ref\": { \"id\":\"1190362\", \"gid\":\"de:09187:90362\", \"omc\":\"9187117\", \"placeID\":\"1\", \"place\":\"Bad Aibling\", \"coords\":\"1337034.00000,5915715.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"München, Pasinger Marienplatz\", \"stateless\":\"91001622\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"55\", \"best\":\"0\", \"object\":\"Pasinger Marienplatz\", \"mainLoc\":\"München\", \"modes\":\"5,6\", \"ref\": { \"id\":\"91001622\", \"gid\":\"de:09162:1622\", \"omc\":\"9162000\", \"placeID\":\"1\", \"place\":\"München\", \"coords\":\"1275650.00000,5868716.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Wolfratshausen, Marienplatz\", \"stateless\":\"1004806\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"256\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Wolfratshausen\", \"modes\":\"6\", \"ref\": { \"id\":\"1004806\", \"gid\":\"de:09173:4806\", \"omc\":\"9173147\", \"placeID\":\"1\", \"place\":\"Wolfratshausen\", \"coords\":\"1271097.00000,5907325.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Dorfen (Kr Erding), Marienplatz\", \"stateless\":\"1003652\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"232\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Dorfen (Kr Erding)\", \"modes\":\"6,10\", \"ref\": { \"id\":\"1003652\", \"gid\":\"de:09177:3652\", \"omc\":\"9177115\", \"placeID\":\"1\", \"place\":\"Dorfen (Kr Erding)\", \"coords\":\"1352447.00000,5847577.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Ebersberg (Oberbay), Marienplatz\", \"stateless\":\"1004090\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"222\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Ebersberg (Oberbay)\", \"modes\":\"6\", \"ref\": { \"id\":\"1004090\", \"gid\":\"de:09175:4090\", \"omc\":\"9175115\", \"placeID\":\"1\", \"place\":\"Ebersberg (Oberbay)\", \"coords\":\"1332434.00000,5880120.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"München, Marienplatz (Rindermarkt)\", \"stateless\":\"91000166\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"307\", \"best\":\"0\", \"object\":\"Marienplatz (Rindermarkt)\", \"mainLoc\":\"München\", \"modes\":\"5\", \"ref\": { \"id\":\"91000166\", \"gid\":\"de:09162:166\", \"omc\":\"9162000\", \"placeID\":\"1\", \"place\":\"München\", \"coords\":\"1288380.00000,5870561.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Mering, St.Afra Marienplatz\", \"stateless\":\"2001103\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"64\", \"best\":\"0\", \"object\":\"St.Afra Marienplatz\", \"mainLoc\":\"Mering\", \"modes\":\"6\", \"ref\": { \"id\":\"2001103\", \"gid\":\"de:09771:1103\", \"omc\":\"9771146\", \"placeID\":\"1\", \"place\":\"Mering\", \"coords\":\"1221252.00000,5846406.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Freising, Marienplatz\", \"stateless\":\"1002851\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"370\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Freising\", \"modes\":\"6,10\", \"ref\": { \"id\":\"1002851\", \"gid\":\"de:09178:2851\", \"omc\":\"9178124\", \"placeID\":\"1\", \"place\":\"Freising\", \"coords\":\"1307321.00000,5826249.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Friedberg (Bay), Marienplatz\", \"stateless\":\"2002002\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"270\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Friedberg (Bay)\", \"modes\":\"5,6,10\", \"ref\": { \"id\":\"2002002\", \"gid\":\"de:09771:2002\", \"omc\":\"9771130\", \"placeID\":\"1\", \"place\":\"Friedberg (Bay)\", \"coords\":\"1222162.00000,5833885.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Garmisch-Partenkirchen, Marienplatz\", \"stateless\":\"1130005\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"181\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Garmisch-Partenkirchen\", \"modes\":\"6\", \"ref\": { \"id\":\"1130005\", \"gid\":\"de:09180:30005\", \"omc\":\"9180117\", \"placeID\":\"1\", \"place\":\"Garmisch-Partenkirchen\", \"coords\":\"1234088.00000,5977198.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"München, Marienplatz (St. Peter)\", \"stateless\":\"91000148\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"333\", \"best\":\"0\", \"object\":\"Marienplatz (St. Peter)\", \"mainLoc\":\"München\", \"ref\": { \"id\":\"91000148\", \"gid\":\"de:09162:148\", \"omc\":\"9162000\", \"placeID\":\"1\", \"place\":\"München\", \"coords\":\"1288610.00000,5870339.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"München, Marienplatz\", \"stateless\":\"91000002\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"444\", \"best\":\"1\", \"object\":\"Marienplatz\", \"mainLoc\":\"München\", \"modes\":\"1,2,5\", \"ref\": { \"id\":\"91000002\", \"gid\":\"de:09162:2\", \"omc\":\"9162000\", \"placeID\":\"1\", \"place\":\"München\", \"coords\":\"1288570.00000,5870282.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Hundham/Kr Miesbach, Hundham Marienplatz\", \"stateless\":\"1143182\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"0\", \"best\":\"0\", \"object\":\"Hundham Marienplatz\", \"mainLoc\":\"Fischbachau\", \"modes\":\"6\", \"ref\": { \"id\":\"1143182\", \"gid\":\"de:09182:43182\", \"omc\":\"9182114\", \"placeID\":\"57\", \"place\":\"Hundham/Kr Miesbach\", \"coords\":\"1329157.00000,5933284.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Ingolstadt, Marienplatz\", \"stateless\":\"1500505\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"322\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Ingolstadt\", \"modes\":\"5\", \"ref\": { \"id\":\"1500505\", \"gid\":\"\", \"omc\":\"9161000\", \"placeID\":\"1\", \"place\":\"Ingolstadt\", \"coords\":\"1276995.00000,5764129.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Kapfelberg (Kr KEH), Kapfelberg, Marienplatz\", \"stateless\":\"4110153\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"0\", \"best\":\"0\", \"object\":\"Kapfelberg, Marienplatz\", \"mainLoc\":\"Kelheim\", \"modes\":\"6\", \"ref\": { \"id\":\"4110153\", \"gid\":\"de:09273:10153\", \"omc\":\"9273137\", \"placeID\":\"12\", \"place\":\"Kapfelberg (Kr KEH)\", \"coords\":\"1333989.00000,5736735.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Oberalting, Marienplatz\", \"stateless\":\"1005516\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"277\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Seefeld (Oberbay)\", \"modes\":\"6\", \"ref\": { \"id\":\"1005516\", \"gid\":\"de:09188:5516\", \"omc\":\"9188132\", \"placeID\":\"1\", \"place\":\"Oberalting\", \"coords\":\"1248867.00000,5887118.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"München, Marienplatz (Hl.-Geist-Kirche)\", \"stateless\":\"91000147\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"279\", \"best\":\"0\", \"object\":\"Marienplatz (Hl.-Geist-Kirche)\", \"mainLoc\":\"München\", \"ref\": { \"id\":\"91000147\", \"gid\":\"de:09162:147\", \"omc\":\"9162000\", \"placeID\":\"1\", \"place\":\"München\", \"coords\":\"1288728.00000,5870445.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"München, Marienplatz (Theatinerstraße)\", \"stateless\":\"91000020\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"272\", \"best\":\"0\", \"object\":\"Marienplatz (Theatinerstraße)\", \"mainLoc\":\"München\", \"modes\":\"4\", \"ref\": { \"id\":\"91000020\", \"gid\":\"de:09162:20\", \"omc\":\"9162000\", \"placeID\":\"1\", \"place\":\"München\", \"coords\":\"1288559.00000,5869911.00000\" } }, { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Landshut, Marienplatz\", \"stateless\":\"4600255\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"370\", \"best\":\"0\", \"object\":\"Marienplatz\", \"mainLoc\":\"Landshut\", \"modes\":\"5\", \"ref\": { \"id\":\"4600255\", \"gid\":\"de:09261:255\", \"omc\":\"9261000\", \"placeID\":\"1\", \"place\":\"Landshut\", \"coords\":\"1353544.00000,5803121.00000\" } } ] } }";
    public final static String departureResponseMVVMarienplatz  = "<div>\n" +
            "        \n" +
            "\n" +
            "        <div class=\"scroll_header\">\n" +
            "            <div class=\"dm_top_links\">\n" +
            "                <div class=\"dm_later\">\n" +
            "                    <a class=\"txtlink\">Next departures</a>\n" +
            "                    <p />\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"grp_header dm_stop_header\">\n" +
            "                <div class=\"grp_name\">München, Marienplatz</div>\n" +
            "            </div>\n" +
            "            <div class=\"dm_sum trp_info_date\">\n" +
            "                Departures on 28. 01. 2019, at 12:47 \n" +
            "                 \n" +
            "            </div>\n" +
            "            <div class=\"dm_table_header\">\n" +
            "                <div class=\"dm_symbol\">Line</div>\n" +
            "                <div class=\"dm_descr\">Towards</div>\n" +
            "                <div class=\"dm_time nowr\">Departures</div>\n" +
            "                <div class=\"dm_live nowr\">Live</div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        \n" +
            "        \n" +
            "        <div class=\"scroll_container\">\n" +
            "            <table style=\"clear:both;\">\n" +
            "                <thead class=\"visuallyhidden\">\n" +
            "                    <tr>\n" +
            "                        <th>Line</th>\n" +
            "                        <th>Towards</th>\n" +
            "                        <th class=\"nowr\">Departure</th>\n" +
            "                        <th class=\"nowr\">Live</th>\n" +
            "                    </tr>\n" +
            "                </thead>\n" +
            "            <!-- Datum Header -->\n" +
            "                <tbody>\n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"U6\" class=\"mot_general u6\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">U6</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Münchner Freiheit\n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:48</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S6\" class=\"mot_general s6\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S6</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Tutzing\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:48</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S7\" class=\"mot_general s7\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S7</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Wolfratshausen\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:50</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S7\" class=\"mot_general s7\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S7</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Kreuzstraße\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:51</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S6\" class=\"mot_general s6\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S6</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                München Ost\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:52</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"U6\" class=\"mot_general u6\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">U6</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Klinikum Großhadern\n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:52</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"U6\" class=\"mot_general u6\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">U6</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Garching, Forschungszentrum\n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:54</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"U3\" class=\"mot_general u3\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">U3</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Fürstenried West\n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:54</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S2\" class=\"mot_general s2\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S2</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Erding\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:55</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S3\" class=\"mot_general s3\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S3</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Mammendorf\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:55</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"U6\" class=\"mot_general u6\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">U6</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Harras\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:56</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"132\" class=\"mot_bus b132\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">132</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Implerstraße\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:56</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"U3\" class=\"mot_general u3\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">U3</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Moosach\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:56</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S4\" class=\"mot_general s4\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S4</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Geltendorf\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">12:58</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"U6\" class=\"mot_general u6\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">U6</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Münchner Freiheit\n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span class=\"rt_late\">13:03</span></td>\n" +
            "                            <td class=\"dm_time padded\">12:58</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S8\" class=\"mot_general s8\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S8</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                München Flughafen Terminal\n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span class=\"rt_late\">13:02</span></td>\n" +
            "                            <td class=\"dm_time padded\">12:59</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S1\" class=\"mot_general s1\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S1</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                München Flughafen Terminal\n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">13:00</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S1\" class=\"mot_general s1\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S1</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                Freising\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">13:00</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"even\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S1\" class=\"mot_general s1\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S1</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                München Ost\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">13:01</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                    \n" +
            "                        \n" +
            "                        <tr class=\"odd\">\n" +
            "                            <td>\n" +
            "                                <img width=\"34\" height=\"17\"\n" +
            "    title=\"S1\" class=\"mot_general s1\"\n" +
            "    src=\"/img/201811230833/1x1.png\" />\n" +
            "                                <span class=\"printable\">S1</span>                     \n" +
            "                            </td>\n" +
            "                            <td>\n" +
            "                                München Ost\n" +
            "                                \n" +
            "                                <span\n" +
            "    style=\"padding-right:2em;\">&nbsp;</span>\n" +
            "                                \n" +
            "                                \n" +
            "                            </td>\n" +
            "                            <td class=\"dm_live\"><span>&nbsp;</span></td>\n" +
            "                            <td class=\"dm_time\">13:01</td>\n" +
            "                        </tr>\n" +
            "                    \n" +
            "                </tbody>\n" +
            "            </table>\n" +
            "        </div>\n" +
            "        \n" +
            "        \n" +
            "                \n" +
            "        \n" +
            "        <div class=\"scroll_footer dm_footer\">\n" +
            "            <div class=\"ctr_submit_btn\">\n" +
            "                <div class=\"btn\"\n" +
            "                     onclick=\"mvv.setInitialOdv('91000002', true,'destination')\">Travel to here</div>\n" +
            "                <div class=\"btn\"\n" +
            "                     onclick=\"mvv.setInitialOdv('91000002', true, 'origin')\">Travel from here</div>\n" +
            "                \n" +
            "                <a href=\"javascript:void(0)\"\n" +
            "                   onclick=\"R.pdf.get_city_map('91000002')\">City map</a>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    \n" +
            "    </div>";

    static final String FILE_CONTENT = "SLs.sls={\"suggestions\":[{\"value\":\"Tivoli (RNZ), Viernheim\",\"id\":\"A=1@O=Tivoli (RNZ), Viernheim@X=8565902@Y=49528460@U=80@L=000518554@B=1@p=1517269699@\",\"extId\":\"000518554\",\"type\":\"1\",\"typeStr\":\"[Bhf/Hst]\",\"xcoord\":\"8565902\",\"ycoord\":\"49528460\",\"state\":\"id\",\"prodClass\":\"800\",\"weight\":\"2277\"}]};SLs.showSuggestion();";
    static final String FILE_CONTENT_VRN_TIVOLI = "{ \"parameters\": [ { \"name\":\"serverID\", \"value\":\"EFA10-1\" }, { \"name\":\"requestID\", \"value\":\"0\" }, { \"name\":\"sessionID\", \"value\":\"0\" }, { \"name\":\"calcTime\", \"value\":\"156.592\" } ], \"stopFinder\": { \"message\": [ { \"name\":\"code\", \"value\":\"-8010\" }, { \"name\":\"error\", \"value\":\"\" }, { \"name\":\"type\", \"value\":\"\" }, { \"name\":\"module\", \"value\":\"BROKER\" } ], \"input\": { \"input\":\"Tivoli (RNZ), Viernheim\" }, \"points\": { \"point\": { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Viernheim, Tivoli (RNZ)\", \"stateless\":\"6003865\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"250\", \"best\":\"1\", \"object\":\"Tivoli (RNZ)\", \"mainLoc\":\"Viernheim\", \"modes\":\"4,5\", \"ref\": { \"id\":\"6003865\", \"gid\":\"de:06431:3865\", \"omc\":\"6431020\", \"placeID\":\"1\", \"place\":\"Viernheim\", \"coords\":\"8.56525,49.52822\" }, \"infos\": null } }, \"itdOdvAssignedStops\": { \"stopID\":\"6003865\", \"name\":\"Tivoli (RNZ)\", \"x\":\"8.56525\", \"y\":\"49.52822\", \"mapName\":\"EPSG:4326\", \"value\":\"6003865:Tivoli (RNZ)\", \"place\":\"Viernheim\", \"nameWithPlace\":\"Viernheim, Tivoli (RNZ)\", \"distanceTime\":\"0\", \"isTransferStop\":\"0\", \"vm\":\"100\", \"gid\":\"de:06431:3865\" } } }";
    static final String FILE_CONTENT_VRN_H = "{ \"parameters\": [ { \"name\":\"serverID\", \"value\":\"EFA10-3\" }, { \"name\":\"requestID\", \"value\":\"0\" }, { \"name\":\"sessionID\", \"value\":\"0\" }, { \"name\":\"calcTime\", \"value\":\"63.912\" } ], \"stopFinder\": { \"message\": [ { \"name\":\"code\", \"value\":\"-8010\" }, { \"name\":\"error\", \"value\":\"\" }, { \"name\":\"type\", \"value\":\"\" }, { \"name\":\"module\", \"value\":\"BROKER\" } ], \"input\": { \"input\":\"Hannover\" }, \"points\": { \"point\": { \"usage\":\"sf\", \"type\":\"any\", \"name\":\"Hannover\", \"stateless\":\"suburbID:3241001:18:Hannover:::\", \"anyType\":\"loc\", \"sort\":\"1\", \"quality\":\"0\", \"best\":\"1\", \"ref\": { \"id\":\"25000031\", \"gid\":\"25000031\", \"omc\":\"3241001\", \"placeID\":\"18\", \"place\":\"Hannover\", \"coords\":\"9.74107,52.37649\" }, \"infos\": null } }, \"itdOdvAssignedStops\": { \"stopID\":\"25000031\", \"name\":\"Hauptbahnhof\", \"x\":\"9.74107\", \"y\":\"52.37649\", \"mapName\":\"EPSG:4326\", \"value\":\"25000031:Hauptbahnhof\", \"place\":\"Hannover\", \"nameWithPlace\":\"Hannover Hauptbahnhof\", \"distanceTime\":\"0\", \"isTransferStop\":\"0\", \"vm\":\"100\", \"gid\":\"de:03241:31\" } } }";
    static final String FILE_CONTENT_RVV_CHLODWIG = "{\"suggestions\":[{\"data\":\"22001182\",\"value\":\"Bonn Chlodwigplatz\"},{\"data\":\"22000018\",\"value\":\"K\\u00f6ln Chlodwigplatz\"},{\"data\":\"15013515\",\"value\":\"Koblenz Chlodwigstr.\"},{\"data\":\"20018654\",\"value\":\"D\\u00fcsseldorf Chlodwigstra\\u00dfe\"},{\"data\":\"21002275\",\"value\":\"D\\u00fcren (Rheinl) D\\u00fcren, Chlodwigplatz\"}]}";
    static final String FILE_CONTENT_RVV_CHLODWIG_ABFARTEN = "{\"departureData\":[{\"name\":\"16\",\"lineNumber\":\"16\",\"lineCode\":\"01016\",\"subname\":\"Stadtbahn\",\"direction\":\"Niehl Sebastianstr.,K\\u00f6ln\",\"directionCode\":\"H\",\"route\":\"Bad Godesberg Stadthalle - Severinstr.\",\"type\":4,\"day\":\"16\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"16\",\"minute\":\"43\",\"orgDay\":\"16\",\"orgHour\":\"16\",\"orgMinute\":\"43\",\"countdown\":0,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550331780\",\"orgFullTime\":\"1550331780\",\"supplement\":\"\",\"key\":\"923\"},{\"name\":\"133\",\"lineNumber\":\"133\",\"lineCode\":\"01133\",\"subname\":\"Bus\",\"direction\":\"Breslauer Platz\\/Hbf,K\\u00f6ln\",\"directionCode\":\"H\",\"route\":\"Zollstock S\\u00fcdfriedhof - Ulrepforte\",\"type\":5,\"day\":\"16\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"16\",\"minute\":\"45\",\"orgDay\":\"16\",\"orgHour\":\"16\",\"orgMinute\":\"45\",\"countdown\":1,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550331900\",\"orgFullTime\":\"1550331900\",\"supplement\":\"\",\"key\":\"272\"},{\"name\":\"142\",\"lineNumber\":\"142\",\"lineCode\":\"01142\",\"subname\":\"Bus\",\"direction\":\"Ubierring,K\\u00f6ln\",\"directionCode\":\"R\",\"route\":\"Merheimer Platz - Ubierring\",\"type\":5,\"day\":\"16\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"16\",\"minute\":\"45\",\"orgDay\":\"16\",\"orgHour\":\"16\",\"orgMinute\":\"45\",\"countdown\":1,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550331900\",\"orgFullTime\":\"1550331900\",\"supplement\":\"\",\"key\":\"307\"},{\"name\":\"106\",\"lineNumber\":\"106\",\"lineCode\":\"01106\",\"subname\":\"Bus\",\"direction\":\"Marienburg S\\u00fcdpark,K\\u00f6ln\",\"directionCode\":\"R\",\"route\":\"Heumarkt - Marienburg S\\u00fcdpark\",\"type\":5,\"day\":\"16\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"16\",\"minute\":\"46\",\"orgDay\":\"16\",\"orgHour\":\"16\",\"orgMinute\":\"46\",\"countdown\":2,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550331960\",\"orgFullTime\":\"1550331960\",\"supplement\":\"\",\"key\":\"581\"},{\"name\":\"106\",\"lineNumber\":\"106\",\"lineCode\":\"01106\",\"subname\":\"Bus\",\"direction\":\"Heumarkt,K\\u00f6ln\",\"directionCode\":\"H\",\"route\":\"Marienburg S\\u00fcdpark - Ulrepforte\",\"type\":5,\"day\":\"16\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"16\",\"minute\":\"47\",\"orgDay\":\"16\",\"orgHour\":\"16\",\"orgMinute\":\"47\",\"countdown\":3,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550332020\",\"orgFullTime\":\"1550332020\",\"supplement\":\"\",\"key\":\"242\"},{\"name\":\"16\",\"lineNumber\":\"16\",\"lineCode\":\"01016\",\"subname\":\"Stadtbahn\",\"direction\":\"Wesseling,Wesseling\",\"directionCode\":\"R\",\"route\":\"Niehl Sebastianstr. - Bad Godesberg Stadthalle\",\"type\":4,\"day\":\"16\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"16\",\"minute\":\"48\",\"orgDay\":\"16\",\"orgHour\":\"16\",\"orgMinute\":\"48\",\"countdown\":4,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550332080\",\"orgFullTime\":\"1550332080\",\"supplement\":\"\",\"key\":\"1831\"}],\"departureInfo\":{\"stopInfo\":{\"text\":\"\"},\"stopBlocking\":{\"text\":\"\"},\"areaInfo\":{\"text\":\"\"},\"areaBlocking\":{\"text\":\"\"}},\"globalInfo\":\"\",\"stationName\":\"K\\u00f6ln, Chlodwigplatz\",\"marquee\":0,\"stationInfo\":[],\"currentTime\":1550331835,\"currentTimeReal\":1550331835}";
    static final String FILE_CONTENT_RVV_DORTMUND_ABFARTEN = "{\"departureData\":[{\"name\":\"U49\",\"lineNumber\":\"U49\",\"lineCode\":\"36009\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Hacheney\",\"directionCode\":\"H\",\"route\":\"Fredenbaum - Clarenberg\",\"type\":3,\"day\":\"11\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"15\",\"minute\":\"21\",\"orgDay\":\"11\",\"orgHour\":\"15\",\"orgMinute\":\"21\",\"countdown\":0,\"platform\":\"\",\"delay\":\"-9999\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"text\":\"\",\"priority\":0}},\"fullTime\":1549894860,\"orgFullTime\":1549894860,\"supplement\":\"\",\"key\":\"214\"},{\"name\":\"475\",\"lineNumber\":\"475\",\"lineCode\":\"38075\",\"subname\":\"Bus\",\"direction\":\"Dortmund Hbf\",\"directionCode\":\"R\",\"route\":\"DO-Mengede Bf - Dortmund Hbf\",\"type\":5,\"day\":\"11\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"15\",\"minute\":\"24\",\"orgDay\":\"11\",\"orgHour\":\"15\",\"orgMinute\":\"24\",\"countdown\":3,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"text\":\"\",\"priority\":0}},\"fullTime\":1549895040,\"orgFullTime\":1549895040,\"supplement\":\"\",\"key\":\"37\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund, Aplerbeck\",\"directionCode\":\"H\",\"route\":\"DO-Westerfilde - Clarenberg\",\"type\":3,\"day\":\"11\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"15\",\"minute\":\"25\",\"orgDay\":\"11\",\"orgHour\":\"15\",\"orgMinute\":\"25\",\"countdown\":4,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"text\":\"\",\"priority\":0}},\"fullTime\":1549895100,\"orgFullTime\":1549895100,\"supplement\":\"\",\"key\":\"117\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Westerfilde S\",\"directionCode\":\"R\",\"route\":\"Aplerbeck - DO-Westerfilde\",\"type\":3,\"day\":\"11\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"15\",\"minute\":\"28\",\"orgDay\":\"11\",\"orgHour\":\"15\",\"orgMinute\":\"26\",\"countdown\":7,\"platform\":\"\",\"delay\":\"2\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"text\":\"\",\"priority\":0}},\"fullTime\":1549895280,\"orgFullTime\":1549895160,\"supplement\":\"\",\"key\":\"481\"},{\"name\":\"460\",\"lineNumber\":\"460\",\"lineCode\":\"38060\",\"subname\":\"Bus\",\"direction\":\"Dortmund Kirchlinde Zentrum\",\"directionCode\":\"R\",\"route\":\"Reinoldikirche - Kirchlinde Zentrum\",\"type\":5,\"day\":\"11\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"15\",\"minute\":\"31\",\"orgDay\":\"11\",\"orgHour\":\"15\",\"orgMinute\":\"31\",\"countdown\":10,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"text\":\"\",\"priority\":0}},\"fullTime\":1549895460,\"orgFullTime\":1549895460,\"supplement\":\"\",\"key\":\"122\"},{\"name\":\"U49\",\"lineNumber\":\"U49\",\"lineCode\":\"36009\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Hacheney\",\"directionCode\":\"H\",\"route\":\"Fredenbaum - Clarenberg\",\"type\":3,\"day\":\"11\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"15\",\"minute\":\"31\",\"orgDay\":\"11\",\"orgHour\":\"15\",\"orgMinute\":\"31\",\"countdown\":10,\"platform\":\"\",\"delay\":\"-9999\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"text\":\"\",\"priority\":0}},\"fullTime\":1549895460,\"orgFullTime\":1549895460,\"supplement\":\"\",\"key\":\"215\"}],\"departureInfo\":{\"stopInfo\":{\"text\":\"\"},\"stopBlocking\":{\"text\":\"\"},\"areaInfo\":{\"text\":\"\"},\"areaBlocking\":{\"text\":\"\"}},\"globalInfo\":\"\",\"stationName\":\"Dortmund, Hafen\",\"marquee\":0,\"stationInfo\":{\"aufzug\":\"Aufzug\",\"info\":\"dyn. Fahrgastinformation\",\"automat\":\"Fahrscheinautomat\",\"sitzen\":\"Sitzgelegenheiten\"},\"currentTime\":1549894883,\"currentTimeReal\":1549894883}";
    static final String FILE_CONTENT_RVV_DORTMUNDHAFEN_ABFARTEN = "{\"departureData\":[{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Hbf\",\"directionCode\":\"H\",\"route\":\"DO-Westerfilde - Clarenberg\",\"type\":3,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"21\",\"orgDay\":\"17\",\"orgHour\":\"10\",\"orgMinute\":\"46\",\"countdown\":14,\"platform\":\"\",\"delay\":\"35\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTim" +
            "e\":\"1550398860\",\"orgFullTime\":\"1550396760\",\"supplement\":\"\",\"key\":\"312\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Westerfilde S\",\"directionCode\":\"R\",\"route\":\"Aplerbeck - DO-Westerfilde\",\"type\":3,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"13\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"13\",\"countdown\":6,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"l" +
            "ineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550398380\",\"orgFullTime\":\"1550398380\",\"supplement\":\"\",\"key\":\"607\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Hbf\",\"directionCode\":\"H\",\"route\":\"DO-Westerfilde - Clarenberg\",\"type\":3,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"16\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"16\",\"countdown\":9,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{" +
            "\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550398560\",\"orgFullTime\":\"1550398560\",\"supplement\":\"\",\"key\":\"314\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Westerfilde S\",\"directionCode\":\"R\",\"route\":\"Aplerbeck - DO-Westerfilde\",\"type\":3,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"28\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"28\",\"countdown\":21,\"platform\":\"\",\"de" +
            "lay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550399280\",\"orgFullTime\":\"1550399280\",\"supplement\":\"\",\"key\":\"608\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Hbf\",\"directionCode\":\"H\",\"route\":\"DO-Westerfilde - Clarenberg\",\"type\":3,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"31\",\"orgDay\":\"17\",\"orgHour\":\"" +
            "11\",\"orgMinute\":\"31\",\"countdown\":24,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550399460\",\"orgFullTime\":\"1550399460\",\"supplement\":\"\",\"key\":\"315\"},{\"name\":\"475\",\"lineNumber\":\"475\",\"lineCode\":\"38075\",\"subname\":\"Bus\",\"direction\":\"Dortmund Deusen\",\"directionCode\":\"H\",\"route\":\"Dortmund Hbf - DO-Mengede Bf\",\"type\":5,\"day\":\"17\",\"month\":\"2\",\"year\":\"201" +
            "9\",\"hour\":\"11\",\"minute\":\"34\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"34\",\"countdown\":27,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550399640\",\"orgFullTime\":\"1550399640\",\"supplement\":\"\",\"key\":\"64\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Westerfilde S\",\"directionCode\":\"R\",\"route\":\"Aplerbeck " +
            "- DO-Westerfilde\",\"type\":3,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"43\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"43\",\"countdown\":36,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550400180\",\"orgFullTime\":\"1550400180\",\"supplement\":\"\",\"key\":\"609\"},{\"name\":\"460\",\"lineNumber\":\"460\",\"lineCode\":\"38060\",\"subname\":\"Bus\",\"direction\":\"Dort" +
            "mund Kirchlinde Zentrum\",\"directionCode\":\"R\",\"route\":\"Reinoldikirche - Kirchlinde Zentrum\",\"type\":5,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"43\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"43\",\"countdown\":36,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550400180\",\"orgFullTime\":\"1550400180\",\"supplement\":\"\",\"key\":\"148\"},{\"name\":\"460" +
            "\",\"lineNumber\":\"460\",\"lineCode\":\"38060\",\"subname\":\"Bus\",\"direction\":\"Dortmund Reinoldikirche\",\"directionCode\":\"H\",\"route\":\"Kirchlinde Zentrum - Reinoldikirche\",\"type\":5,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"45\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"45\",\"countdown\":38,\"platform\":\"\",\"delay\":\"0\",\"isRealTime\":true,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550400300\"" +
            ",\"orgFullTime\":\"1550400300\",\"supplement\":\"\",\"key\":\"25\"},{\"name\":\"U47\",\"lineNumber\":\"U47\",\"lineCode\":\"36007\",\"subname\":\"U-Bahn\",\"direction\":\"Dortmund Hbf\",\"directionCode\":\"H\",\"route\":\"DO-Westerfilde - Clarenberg\",\"type\":3,\"day\":\"17\",\"month\":\"2\",\"year\":\"2019\",\"hour\":\"11\",\"minute\":\"46\",\"orgDay\":\"17\",\"orgHour\":\"11\",\"orgMinute\":\"46\",\"countdown\":39,\"platform\":\"\",\"delay\":\"\",\"isRealTime\":false,\"isDateOverflow\":false,\"lineInfo\":{\"lineInfo\":{\"messages\":[],\"text\":\"\",\"priority\":0},\"lineBlocking\":{\"messages\"" +
            ":[],\"text\":\"\",\"priority\":0}},\"fullTime\":\"1550400360\",\"orgFullTime\":\"1550400360\",\"supplement\":\"\",\"key\":\"316\"}],\"departureInfo\":{\"stopInfo\":{\"text\":\"\"},\"stopBlocking\":{\"text\":\"\"},\"areaInfo\":{\"text\":\"\"},\"areaBlocking\":{\"text\":\"\"}},\"globalInfo\":\"\",\"stationName\":\"Dortmund, Hafen\",\"marquee\":0,\"stationInfo\":{\"aufzug\":\"Aufzug\",\"info\":\"dyn. Fahrgastinformation\",\"automat\":\"Fahrscheinautomat\",\"sitzen\":\"Sitzgelegenheiten\"},\"currentTime\":1550397996,\"currentTimeReal\":1550397996}";

    static final String FILE_CONTENT_VGN_SUGGESTIONS = "{\"query\":\"platz\",\"suggestions\":[\"N\\u00fcrnberg, N\\u00fcrnberg Hbf (Nelson-Mandela-Platz)\",\"N\\u00fcrnberg, Friedrich-Ebert-Platz\",\"Aurach (Kr Ansbach), Blumenauer Platz\",\"Bayreuth, Berliner Platz\",\"Bayreuth, Geschw.-Scholl-Platz\",\"Bayreuth, Siebener Platz\",\"Erlangen, Berliner Platz\",\"Erlangen, Martin-Luther-Platz\",\"Erlangen, Martin-Luther-Platz \\/ Ost\",\"Feucht, Bahnhof Park&Ride-Platz\",\"Forchheim (Ofr), Am Strecker Platz\",\"Forchheim (Ofr), Ernst-Reuter-Platz\",\"Gr\\u00e4fenberg, Pringy-Platz\",\"Gunzenhausen, Dr.-Eidam-Platz\",\"Herzogenaurach, Carl-Platz-Schule\",\"Herzogenaurach, Martin-Luther-Platz\",\"Hirschaid, Erlach Pr\\u00e4lat-Werthmann-Platz\",\"Neumarkt (Oberpf), Theo-Betz-Platz\",\"N\\u00fcrnberg, Dr.-Luppe-Platz\",\"N\\u00fcrnberg, Friedrich-Ebert-Platz West\",\"N\\u00fcrnberg, Innerer Laufer Platz\",\"N\\u00fcrnberg, Leipziger Platz\",\"N\\u00fcrnberg, Max-Grundig-Platz\",\"N\\u00fcrnberg, N\\u00fcrnberg, Eichst\\u00e4tter Platz\",\"N\\u00fcrnberg, Platz der Opfer d. Faschism.\",\"Oberasbach(Kr F\\u00fcrth), Albrecht-D\\u00fcrer-Platz\",\"Oberasbach(Kr F\\u00fcrth), Willy-Brandt-Platz\",\"Oberhaid (Oberfr), Dr.-Hau-Platz\",\"Pleinfeld, Waldcampingplatz\\/Freibad\",\"Pyrbaum, Wolfsteiner Platz\",\"Regelsbach, H.-Reck-Platz\",\"Roth (Mittelfr), Willy-Supf-Platz\",\"N\\u00fcrnberg, Lorenzer Platz 1\",\"N\\u00fcrnberg, Richard-Wagner-Platz\",\"N\\u00fcrnberg, Hans-Sachs-Platz 2\",\"N\\u00fcrnberg, Jean-Paul-Platz 10\",\"Schwabach, Martin-Luther-Platz\",\"Erlangen, Martin-Luther-Platz 9\",\"N\\u00fcrnberg, Albrecht-D\\u00fcrer-Platz 1\",\"N\\u00fcrnberg, Andreij-Sacharow-Platz 1\",\"N\\u00fcrnberg, Innerer Laufer Platz 11\",\"N\\u00fcrnberg, Innerer Laufer Platz 3\",\"N\\u00fcrnberg, Leonhard-\\u00dcbler-Platz 1\",\"N\\u00fcrnberg, Nelson-Mandela-Platz 18\",\"N\\u00fcrnberg, Richard-Wagner-Platz 5\",\"Herzogenaurach, C.-Platz-Schule Herzogenaurach\",\"N\\u00fcrnberg, Sporthalle BBZ Berliner Platz\",\"N\\u00fcrnberg, Altenheim N\\u00fcrnberg\\/Julius-Schieder-Platz\",\"Herzogenaurach, Friedhof Herzogenaurach\\/Martin-Luther-Platz\",\"N\\u00fcrnberg, Sonderp\\u00e4dagogisches F\\u00f6rderzentrum Jean-Paul-Platz\",\"Burgthann, Platzl\",\"Seubersdorf (i d Opf), Am Platz\",\"Mistelbach (Kr BT), Am Platz\",\"Gunzenhausen, Isle-Platz\",\"Postbauer-Heng, Kago-Platz\",\"Herzogenaurach, Langer Platz\",\"N\\u00fcrnberg, Lorenzer Platz\",\"N\\u00fcrnberg, Aussiger Platz\",\"N\\u00fcrnberg, Berliner Platz\",\"N\\u00fcrnberg, Danziger Platz\",\"N\\u00fcrnberg, Leipziger Platz\",\"Oberasbach(Kr F\\u00fcrth), Leipziger Platz\",\"Erlangen, Berliner Platz\",\"Lauf a.d.Pegnitz, Bullacher Platz\",\"Lauf a.d.Pegnitz, CeramTec-Platz\",\"Pappenheim, Buchauer Platz\",\"Heinersreuth (Kr BT), Fehringer Platz\",\"Oberhaid (Oberfr), Dr.-Hau-Platz\",\"Burgkunstadt, Widencer Platz\",\"N\\u00fcrnberg, Dr.-Luppe-Platz\",\"N\\u00fcrnberg, Heilbronner Platz\",\"N\\u00fcrnberg, Budapester Platz\",\"N\\u00fcrnberg, Jean-Paul-Platz\",\"N\\u00fcrnberg, S\\u00fcdtiroler Platz\",\"Feucht, Raiffeisen-Platz\",\"Pyrbaum, Wolfsteiner Platz\",\"Ammerndorf, Dullikener Platz\",\"Herzogenaurach, St.-Josefs-Platz\",\"Neunkirchen am Brand, Deerlijker Platz\",\"Velden (b Hersbruck), Toni-Wolf-Platz\",\"Waischenfeld, Fraunhofer-Platz\",\"Neustadt (Aisch), Graslitzer Platz\",\"Scheinfeld, Rot-Kreuz-Platz\",\"Amberg (Oberpf), Lothringer Platz\",\"Sulzbach-Rosenberg, Sparkassen-Platz\",\"Rieden (Oberpf), St.-Georgs-Platz\",\"Neumarkt (Oberpf), Theo-Betz-Platz\",\"Fichtelberg, Max-Reger-Platz\",\"Ha\\u00dffurt, Tricastiner Platz\",\"N\\u00fcrnberg, Willy-Brandt-Platz\",\"N\\u00fcrnberg, Hans-Sachs-Platz\",\"N\\u00fcrnberg, Heroldsberger Platz\",\"N\\u00fcrnberg, Veit-Sto\\u00df-Platz\",\"N\\u00fcrnberg, Eichst\\u00e4tter Platz\",\"N\\u00fcrnberg, Max-Grundig-Platz\",\"N\\u00fcrnberg, Max-Morlock-Platz\",\"Zirndorf (Kr F\\u00fcrth), Wilhelm-Tell-Platz\",\"Oberasbach(Kr F\\u00fcrth), Willy-Brandt-Platz\",\"Eckental, Von-Muffel-Platz\",\"Stein (b N\\u00fcrnberg), Mecklenburger Platz\",\"Heroldsberg (Kr ERH), Hans-Sachs-Platz\",\"Allersberg, Saint-Cere-Platz\",\"Erlangen, Dechsendorfer Platz\",\"Herzogenaurach, Adi-Dassler-Platz\",\"Schwabach, Rosa-Mihalka-Platz\",\"Roth (Mittelfr), Willy-Supf-Platz\",\"Forchheim (Ofr), Ernst-Reuter-Platz\",\"Forchheim (Ofr), Joseph-Otto-Platz\",\"Forchheim (Ofr), St.-Ottilien-Platz\",\"Neustadt (Aisch), Max-D\\u00f6llner-Platz\",\"Neustadt (Aisch), Peter-Kolb-Platz\",\"Ansbach, Josef-Fruth-Platz\",\"W\\u00f6rnitz, Georg-Ehnes-Platz\",\"Amberg (Oberpf), Carl-Schulz-Platz\",\"Vilseck (Opf), Hans-Ohorn-Platz\",\"Berching, Dr.-Grabmann-Platz\",\"Beilngries, Platz der Heimat\",\"Hohenfels (Kr NM), Pfarrer-Ertl-Platz\",\"Beratzhausen, Johann-Ehrl-Platz\",\"Bayreuth, August-Bebel-Platz\",\"Bayreuth, Lise-Meitner-Platz\",\"Bayreuth, St.-Nepomuk-Platz\",\"Creu\\u00dfen (Oberfr), Pfarrer-Will-Platz\",\"Bamberg, Anna-Linder-Platz\",\"Bamberg, St.-Wolfgang-Platz\",\"Hallstadt (b Bamberg), St.-Kilians-Platz\",\"Strullendorf, St.-\\u00c4gidius-Platz\",\"Lisberg, Von-M\\u00fcnster-Platz\",\"Burgkunstadt, Kathi-Baur-Platz\",\"Kitzingen, Gustav-Adolf-Platz\",\"Kitzingen, St.-Vinzenz-Platz\",\"Eltmann, Johannes-Nas-Platz\",\"N\\u00fcrnberg, Rosa-Luxemburg-Platz\",\"N\\u00fcrnberg, \\u00c4u\\u00dferer Laufer Platz\",\"N\\u00fcrnberg, Albrecht-D\\u00fcrer-Platz\",\"N\\u00fcrnberg, Andreij-Sacharow-Platz\",\"N\\u00fcrnberg, Innerer Laufer Platz\",\"N\\u00fcrnberg, Kaspar-Hauser-Platz\",\"N\\u00fcrnberg, Friedrich-Ebert-Platz\",\"N\\u00fcrnberg, Fritz-Munkert-Platz\",\"N\\u00fcrnberg, Georg-Wieszner-Platz\",\"N\\u00fcrnberg, Helmut-Herold-Platz\",\"N\\u00fcrnberg, Karl-Pschigode-Platz\",\"N\\u00fcrnberg, Richard-Wagner-Platz\",\"N\\u00fcrnberg, Nelson-Mandela-Platz\",\"N\\u00fcrnberg, Leonhard-\\u00dcbler-Platz\",\"N\\u00fcrnberg, Julius-Schieder-Platz\",\"N\\u00fcrnberg, Christoph-Carl-Platz\",\"Oberasbach(Kr F\\u00fcrth), Albrecht-D\\u00fcrer-Platz\",\"Stein (b N\\u00fcrnberg), Martin-Luther-Platz\",\"Burgthann, Martin-Luther-Platz\",\"Langenzenn, Martin-Luther-Platz\",\"Erlangen, Martin-Luther-Platz\",\"Herzogenaurach, Friedrich-Weiler-Platz\",\"Herzogenaurach, Martin-Luther-Platz\",\"Schwabach, Martin-Luther-Platz\",\"Heideck (Mfr), Dr.-Max-Ring-Platz\",\"Abenberg (Mfr), Pr\\u00e4lat-Sperber-Platz\",\"H\\u00f6chstadt a.d. Aisch, Pfarrer-Reichelt-Platz\",\"Adelsdorf (Lkr. ERH), Dr.-Carl-Soldan-Platz\",\"Waischenfeld, Bischof-Nausea-Platz\",\"Neustadt (Aisch), Leonhard-Bankel-Platz\",\"Bad Windsheim, Albrecht-D\\u00fcrer-Platz\",\"Markt Bibart, Julius-Echter-Platz\",\"Ansbach, Kaspar-Hauser-Platz\",\"Ansbach, Martin-Luther-Platz\",\"Bechhofen a d Heide, Martin-Luther-Platz\",\"Schillingsf\\u00fcrst (Mfr), Karl-Albrecht-Platz\",\"Wilburgstetten, Bischof-Rabeno-Platz\",\"Wei\\u00dfenburg (Bayern), Martin-Luther-Platz\",\"Hirschau (Oberpfalz), Bischof-B\\u00f6sl-Platz\",\"Schnaittenbach, Bischof-Rosner-Platz\",\"Schnaittenbach, Georg-Landgraf-Platz\",\"Hahnbach (Kr Amberg), Pfarrer-Lindl-Platz\",\"Hirschbach (Oberpf), Heinrich-Hertz-Platz\",\"Neumarkt (Oberpf), Pfarrer-A.-Lang-Platz\",\"Parsberg (Opf), Rudolf-Eisenmann-Platz\",\"Warmensteinach, Gustav-Leutelt-Platz\",\"Fichtelberg, Wolfgang-Graf-Platz\",\"Bamberg, Eugen-Pacelli-Platz\",\"Bamberg, Heinrich-Weber-Platz\",\"Bischberg (Kr Bamberg), Pfarrer-Deinhart-Platz\",\"Bischberg (Kr Bamberg), Platz von Montauban\",\"Stegaurach, Dr.-Peter-Lex-Platz\",\"Viereth-Trunstadt, Pfarrer-Marquard-Platz\",\"Lichtenfels, Christ-K\\u00f6nig-Platz\",\"Burgkunstadt, Regens-Wagner-Platz\",\"Bad Staffelstein, Georg-Herpich-Platz\",\"Bad Staffelstein, Pfarrer-Birger-Platz\",\"Ebensfeld, Pater-Lunkenbein-Platz\",\"Uffenheim, Wilhelm-Hoegner-Platz\",\"Volkach, Julius-Echter-Platz\",\"Iphofen, Julius-Echter-Platz\",\"Kleinlangheim, Christian-Beyer-Platz\",\"R\\u00fcdenhausen, Paul-Gerhardt-Platz\",\"Wonfurt, Von-Seckendorff-Platz\",\"N\\u00fcrnberg, Ritter-von-Schuh-Platz\",\"N\\u00fcrnberg, Matth\\u00e4us-Herrmann-Platz\",\"N\\u00fcrnberg, Elisabeth-Selbert-Platz\",\"N\\u00fcrnberg, Gabriel-von-Seidl-Platz\",\"Altdorf (b N\\u00fcrnberg), Emil-von-Stromer-Platz\",\"R\\u00f6thenbach a.d.Pegn., Geschwister-Scholl-Platz\",\"F\\u00fcrth (Bayern), Dr.-Martin-Luther-Platz\",\"Erlangen, Gro\\u00df-von-Trockau-Platz\",\"Hersbruck, Nikolaus-Selnecker-Platz\",\"Auerbach i.d.Opf., Franz-Josef-Strau\\u00df-Platz\",\"Neuhaus a.d. Pegnitz, Salvatore-d'Amato-Platz\",\"Forchheim (Ofr), Viktor-von-Scheffel-Platz\",\"Heroldsbach, Pfr.-Dr.-Marquardt-Platz\",\"Igensdorf, B\\u00fcrgermeister-Zei\\u00df-Platz\",\"Bad Windsheim, Dr.-Martin-Luther-Platz\",\"Gunzenhausen, Dr.-Heinrich-Eidam-Platz\",\"Gunzenhausen, Dr.-Martin-Luther-Platz\",\"Parsberg (Opf), Heinz-Schauwecker-Platz\",\"Beratzhausen, Gottfried-K\\u00f6lwel-Platz\",\"Bayreuth, Geschwister-Scholl-Platz\",\"Speichersdorf, Abt-Veit-H\\u00f6ser-Platz\",\"Warmensteinach, Matth\\u00e4us-Herrmann-Platz\",\"Bamberg, E.T.A.-Hoffmann-Platz\",\"Bamberg, Graf-Stauffenberg-Platz\",\"Bamberg, Jacobus-von-Hauck-Platz\",\"Rattelsdorf (Ofr), Kaspar-R\\u00f6ckelein-Platz\",\"Uffenheim, Franz-Josef-Strau\\u00df-Platz\",\"Ippesheim (Mfr), Am Ferdinand-Schlez-Platz\",\"Zeil (Main), Elisabetha-Hofmann-Platz\",\"Zeil (Main), Pfarrer-Anton-Kehl-Platz\",\"Aidhausen, Pater-Clemens-Fuhl-Platz\",\"N\\u00fcrnberg, Platz der Opfer des Faschismus\",\"Baiersdorf (Mfr), Johann-Jakob-Schamel-Platz\",\"Ansbach, Johann-Sebastian-Bach-Platz\",\"Wolframs-Eschenbach, Dr.-Johann-Baptist-Kurz-Platz\",\"Wolframs-Eschenbach, Wolfram-von-Eschenbach-Platz\",\"Amberg (Oberpf), B\\u00fcrgermeister-Bartelt-Platz\",\"Neumarkt (Oberpf), Freiherr-von-Gemmingen-Platz\",\"Feucht, Kurt-Nagel-Platz (Gewerbepark N\\u00fcrnberg-Feucht)\",\"Rentweinsdorf, Planplatz\",\"Pleinfeld, Marktplatz\",\"Pleinfeld, Kirchenplatz\"],\"icons\":[\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"Haltestelle\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"POI\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\",\"Adresse\"],\"data\":[{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:509\",\"db\":1,\"x\":\"4433548.32565\",\"y\":\"681026.78559\",\"city\":\"N\\u00fcrnberg\",\"object\":\"N\\u00fcrnberg Hbf (Nelson-Mandela-Platz)\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:232\",\"x\":\"4432802.78837\",\"y\":\"678976.73614\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Friedrich-Ebert-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09571:12071\",\"x\":\"4384241.17732\",\"y\":\"702606.90306\",\"city\":\"Aurach (Kr Ansbach)\",\"object\":\"Blumenauer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09462:22044\",\"x\":\"4469379.75362\",\"y\":\"625114.14133\",\"city\":\"Bayreuth\",\"object\":\"Berliner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09462:22096\",\"x\":\"4468031.29192\",\"y\":\"625164.13599\",\"city\":\"Bayreuth\",\"object\":\"Geschw.-Scholl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09462:22235\",\"x\":\"4468770.29359\",\"y\":\"626140.73170\",\"city\":\"Bayreuth\",\"object\":\"Siebener Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09562:3358\",\"x\":\"4429067.30915\",\"y\":\"665158.87298\",\"city\":\"Erlangen\",\"object\":\"Berliner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09562:3167\",\"x\":\"4428059.75314\",\"y\":\"663387.06184\",\"city\":\"Erlangen\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09562:3166\",\"x\":\"4428156.88004\",\"y\":\"663409.07093\",\"city\":\"Erlangen\",\"object\":\"Martin-Luther-Platz \\/ Ost\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09574:7201\",\"x\":\"4442271.30670\",\"y\":\"687898.27587\",\"city\":\"Feucht\",\"object\":\"Bahnhof Park&Ride-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09474:9023\",\"x\":\"4432542.78503\",\"y\":\"650724.18019\",\"city\":\"Forchheim (Ofr)\",\"object\":\"Am Strecker Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09474:9046\",\"x\":\"4433981.79011\",\"y\":\"650035.79019\",\"city\":\"Forchheim (Ofr)\",\"object\":\"Ernst-Reuter-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09474:9401\",\"x\":\"4446316.28517\",\"y\":\"658847.00359\",\"city\":\"Gr\\u00e4fenberg\",\"object\":\"Pringy-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09577:16112\",\"x\":\"4409379.78181\",\"y\":\"716940.68649\",\"city\":\"Gunzenhausen\",\"object\":\"Dr.-Eidam-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09572:6008\",\"x\":\"4419426.99766\",\"y\":\"666584.78860\",\"city\":\"Herzogenaurach\",\"object\":\"Carl-Platz-Schule\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09572:6037\",\"x\":\"4420832.21979\",\"y\":\"666928.15376\",\"city\":\"Herzogenaurach\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09471:20725\",\"x\":\"4424895.13994\",\"y\":\"640528.74825\",\"city\":\"Hirschaid\",\"object\":\"Erlach Pr\\u00e4lat-Werthmann-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09373:17030\",\"x\":\"4460925.22416\",\"y\":\"699847.90192\",\"city\":\"Neumarkt (Oberpf)\",\"object\":\"Theo-Betz-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:648\",\"x\":\"4432222.31713\",\"y\":\"681877.89462\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Dr.-Luppe-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:241\",\"x\":\"4432763.15352\",\"y\":\"678969.10429\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Friedrich-Ebert-Platz West\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:155\",\"x\":\"4433720.94031\",\"y\":\"679688.10187\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Innerer Laufer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:1326\",\"x\":\"4435149.00419\",\"y\":\"677966.75718\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Leipziger Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:1574\",\"x\":\"4437221.95754\",\"y\":\"683210.67797\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Max-Grundig-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:1918\",\"x\":\"4430214.30658\",\"y\":\"687778.02603\",\"city\":\"N\\u00fcrnberg\",\"object\":\"N\\u00fcrnberg, Eichst\\u00e4tter Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09564:445\",\"x\":\"4434992.05890\",\"y\":\"681634.09644\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Platz der Opfer d. Faschism.\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09573:5661\",\"x\":\"4424730.20995\",\"y\":\"682399.79061\",\"city\":\"Oberasbach(Kr F\\u00fcrth)\",\"object\":\"Albrecht-D\\u00fcrer-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09573:5669\",\"x\":\"4424453.30736\",\"y\":\"682440.81266\",\"city\":\"Oberasbach(Kr F\\u00fcrth)\",\"object\":\"Willy-Brandt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09471:21505\",\"x\":\"4414954.69741\",\"y\":\"626451.29823\",\"city\":\"Oberhaid (Oberfr)\",\"object\":\"Dr.-Hau-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09577:16802\",\"x\":\"4425107.18628\",\"y\":\"717843.27301\",\"city\":\"Pleinfeld\",\"object\":\"Waldcampingplatz\\/Freibad\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09373:17855\",\"x\":\"4448173.30219\",\"y\":\"697507.68861\",\"city\":\"Pyrbaum\",\"object\":\"Wolfsteiner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09576:8731\",\"x\":\"4423784.77150\",\"y\":\"689219.26112\",\"city\":\"Regelsbach\",\"object\":\"H.-Reck-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"de:09576:8061\",\"x\":\"4433866.85810\",\"y\":\"702731.73505\",\"city\":\"Roth (Mittelfr)\",\"object\":\"Willy-Supf-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:175:9564000:-1\",\"x\":\"4433306.92861\",\"y\":\"680253.37360\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Lorenzer Platz 1\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:751:9564000:-1\",\"x\":\"4433063.05767\",\"y\":\"680803.87122\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Richard-Wagner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:4:9564000:-1\",\"x\":\"4433429.97449\",\"y\":\"679992.44583\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Hans-Sachs-Platz 2\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:325:9564000:-1\",\"x\":\"4434384.21569\",\"y\":\"682331.20513\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Jean-Paul-Platz 10\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:121:9565000:-1\",\"x\":\"4429092.21861\",\"y\":\"693733.83581\",\"city\":\"Schwabach\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:167:9562000:-1\",\"x\":\"4428070.02255\",\"y\":\"663396.26450\",\"city\":\"Erlangen\",\"object\":\"Martin-Luther-Platz 9\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:501:9564000:-1\",\"x\":\"4433145.33691\",\"y\":\"679777.21582\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Albrecht-D\\u00fcrer-Platz 1\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:1061:9564000:-1\",\"x\":\"4433754.14503\",\"y\":\"679904.15091\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Andreij-Sacharow-Platz 1\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:311:9564000:-1\",\"x\":\"4433618.61477\",\"y\":\"679639.44389\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Innerer Laufer Platz 11\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:15:9564000:-1\",\"x\":\"4433684.69417\",\"y\":\"679722.73622\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Innerer Laufer Platz 3\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:1154:9564000:-1\",\"x\":\"4439484.59562\",\"y\":\"685242.86647\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Leonhard-\\u00dcbler-Platz 1\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:617:9564000:-1\",\"x\":\"4433619.31285\",\"y\":\"681082.87189\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Nelson-Mandela-Platz 18\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:17:9564000:-1\",\"x\":\"4433164.01024\",\"y\":\"680859.67884\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Richard-Wagner-Platz 5\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:1575:9572132:-1\",\"x\":\"4419631.12452\",\"y\":\"666712.23313\",\"city\":\"Herzogenaurach\",\"object\":\"C.-Platz-Schule Herzogenaurach\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:556:9564000:-1\",\"x\":\"4434642.26721\",\"y\":\"678684.74759\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Sporthalle BBZ Berliner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:1144:9564000:-1\",\"x\":\"4436981.73157\",\"y\":\"681208.45189\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Altenheim N\\u00fcrnberg\\/Julius-Schieder-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:2110:9572132:-1\",\"x\":\"4420922.37814\",\"y\":\"666851.04913\",\"city\":\"Herzogenaurach\",\"object\":\"Friedhof Herzogenaurach\\/Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"poiID:325:9564000:-1\",\"x\":\"4434384.21569\",\"y\":\"682331.20513\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Sonderp\\u00e4dagogisches F\\u00f6rderzentrum Jean-Paul-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4449867.11221:694494.43672:NAV4:Burgthann, Platzl\",\"x\":\"4449867.11221\",\"y\":\"694494.43672\",\"city\":\"Burgthann\",\"object\":\"Platzl\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4470421.46363:716361.05263:NAV4:Seubersdorf (i d Opf), Am Platz\",\"x\":\"4470421.46363\",\"y\":\"716361.05263\",\"city\":\"Seubersdorf (i d Opf)\",\"object\":\"Am Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4465118.42278:629310.12184:NAV4:Mistelbach (Kr BT), Am Platz\",\"x\":\"4465118.42278\",\"y\":\"629310.12184\",\"city\":\"Mistelbach (Kr BT)\",\"object\":\"Am Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4409201.95127:717824.04217:NAV4:Gunzenhausen, Isle-Platz\",\"x\":\"4409201.95127\",\"y\":\"717824.04217\",\"city\":\"Gunzenhausen\",\"object\":\"Isle-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4453782.73732:696845.01273:NAV4:Postbauer-Heng, Kago-Platz\",\"x\":\"4453782.73732\",\"y\":\"696845.01273\",\"city\":\"Postbauer-Heng\",\"object\":\"Kago-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4420643.27801:667093.90193:NAV4:Herzogenaurach, Langer Platz\",\"x\":\"4420643.27801\",\"y\":\"667093.90193\",\"city\":\"Herzogenaurach\",\"object\":\"Langer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433344.47816:680325.93718:NAV4:N\\u00fcrnberg, Lorenzer Platz\",\"x\":\"4433344.47816\",\"y\":\"680325.93718\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Lorenzer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4436535.87979:681057.11193:NAV4:N\\u00fcrnberg, Aussiger Platz\",\"x\":\"4436535.87979\",\"y\":\"681057.11193\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Aussiger Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4434535.46097:678847.76896:NAV4:N\\u00fcrnberg, Berliner Platz\",\"x\":\"4434535.46097\",\"y\":\"678847.76896\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Berliner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4435332.79142:678557.89780:NAV4:N\\u00fcrnberg, Danziger Platz\",\"x\":\"4435332.79142\",\"y\":\"678557.89780\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Danziger Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4435300.77612:677907.52329:NAV4:N\\u00fcrnberg, Leipziger Platz\",\"x\":\"4435300.77612\",\"y\":\"677907.52329\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Leipziger Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4423992.22531:682415.57399:NAV4:Oberasbach(Kr F\\u00fcrth), Leipziger Platz\",\"x\":\"4423992.22531\",\"y\":\"682415.57399\",\"city\":\"Oberasbach(Kr F\\u00fcrth)\",\"object\":\"Leipziger Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4429135.03120:665146.79976:NAV4:Erlangen, Berliner Platz\",\"x\":\"4429135.03120\",\"y\":\"665146.79976\",\"city\":\"Erlangen\",\"object\":\"Berliner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4446160.08725:667213.22054:NAV4:Lauf a.d.Pegnitz, Bullacher Platz\",\"x\":\"4446160.08725\",\"y\":\"667213.22054\",\"city\":\"Lauf a.d.Pegnitz\",\"object\":\"Bullacher Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4447924.85262:674303.36690:NAV4:Lauf a.d.Pegnitz, CeramTec-Platz\",\"x\":\"4447924.85262\",\"y\":\"674303.36690\",\"city\":\"Lauf a.d.Pegnitz\",\"object\":\"CeramTec-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4425486.13009:737023.46980:NAV4:Pappenheim, Buchauer Platz\",\"x\":\"4425486.13009\",\"y\":\"737023.46980\",\"city\":\"Pappenheim\",\"object\":\"Buchauer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4466368.48648:622695.84014:NAV4:Heinersreuth (Kr BT), Fehringer Platz\",\"x\":\"4466368.48648\",\"y\":\"622695.84014\",\"city\":\"Heinersreuth (Kr BT)\",\"object\":\"Fehringer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4415018.17194:626394.40642:NAV4:Oberhaid (Oberfr), Dr.-Hau-Platz\",\"x\":\"4415018.17194\",\"y\":\"626394.40642\",\"city\":\"Oberhaid (Oberfr)\",\"object\":\"Dr.-Hau-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4445126.09466:603155.91336:NAV4:Burgkunstadt, Widencer Platz\",\"x\":\"4445126.09466\",\"y\":\"603155.91336\",\"city\":\"Burgkunstadt\",\"object\":\"Widencer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432254.68558:681842.55775:NAV4:N\\u00fcrnberg, Dr.-Luppe-Platz\",\"x\":\"4432254.68558\",\"y\":\"681842.55775\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Dr.-Luppe-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4429922.14446:687363.19764:NAV4:N\\u00fcrnberg, Heilbronner Platz\",\"x\":\"4429922.14446\",\"y\":\"687363.19764\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Heilbronner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433613.67393:682190.63458:NAV4:N\\u00fcrnberg, Budapester Platz\",\"x\":\"4433613.67393\",\"y\":\"682190.63458\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Budapester Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4434388.12524:682331.25206:NAV4:N\\u00fcrnberg, Jean-Paul-Platz\",\"x\":\"4434388.12524\",\"y\":\"682331.25206\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Jean-Paul-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4434020.57281:683033.24231:NAV4:N\\u00fcrnberg, S\\u00fcdtiroler Platz\",\"x\":\"4434020.57281\",\"y\":\"683033.24231\",\"city\":\"N\\u00fcrnberg\",\"object\":\"S\\u00fcdtiroler Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4442766.83358:688419.96893:NAV4:Feucht, Raiffeisen-Platz\",\"x\":\"4442766.83358\",\"y\":\"688419.96893\",\"city\":\"Feucht\",\"object\":\"Raiffeisen-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4448176.26628:697470.57692:NAV4:Pyrbaum, Wolfsteiner Platz\",\"x\":\"4448176.26628\",\"y\":\"697470.57692\",\"city\":\"Pyrbaum\",\"object\":\"Wolfsteiner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4417122.37434:683298.48136:NAV4:Ammerndorf, Dullikener Platz\",\"x\":\"4417122.37434\",\"y\":\"683298.48136\",\"city\":\"Ammerndorf\",\"object\":\"Dullikener Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4421473.12841:667686.66337:NAV4:Herzogenaurach, St.-Josefs-Platz\",\"x\":\"4421473.12841\",\"y\":\"667686.66337\",\"city\":\"Herzogenaurach\",\"object\":\"St.-Josefs-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4436982.65568:662408.09323:NAV4:Neunkirchen am Brand, Deerlijker Platz\",\"x\":\"4436982.65568\",\"y\":\"662408.09323\",\"city\":\"Neunkirchen am Brand\",\"object\":\"Deerlijker Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4464899.22915:661922.34552:NAV4:Velden (b Hersbruck), Toni-Wolf-Platz\",\"x\":\"4464899.22915\",\"y\":\"661922.34552\",\"city\":\"Velden (b Hersbruck)\",\"object\":\"Toni-Wolf-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4453305.22694:636774.29544:NAV4:Waischenfeld, Fraunhofer-Platz\",\"x\":\"4453305.22694\",\"y\":\"636774.29544\",\"city\":\"Waischenfeld\",\"object\":\"Fraunhofer-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4400005.35826:665273.50521:NAV4:Neustadt (Aisch), Graslitzer Platz\",\"x\":\"4400005.35826\",\"y\":\"665273.50521\",\"city\":\"Neustadt (Aisch)\",\"object\":\"Graslitzer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4389396.01575:655668.70089:NAV4:Scheinfeld, Rot-Kreuz-Platz\",\"x\":\"4389396.01575\",\"y\":\"655668.70089\",\"city\":\"Scheinfeld\",\"object\":\"Rot-Kreuz-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4489094.87945:681847.10663:NAV4:Amberg (Oberpf), Lothringer Platz\",\"x\":\"4489094.87945\",\"y\":\"681847.10663\",\"city\":\"Amberg (Oberpf)\",\"object\":\"Lothringer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4481478.07512:674778.38187:NAV4:Sulzbach-Rosenberg, Sparkassen-Platz\",\"x\":\"4481478.07512\",\"y\":\"674778.38187\",\"city\":\"Sulzbach-Rosenberg\",\"object\":\"Sparkassen-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4496208.06504:694697.74085:NAV4:Rieden (Oberpf), St.-Georgs-Platz\",\"x\":\"4496208.06504\",\"y\":\"694697.74085\",\"city\":\"Rieden (Oberpf)\",\"object\":\"St.-Georgs-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4460884.43768:699884.11345:NAV4:Neumarkt (Oberpf), Theo-Betz-Platz\",\"x\":\"4460884.43768\",\"y\":\"699884.11345\",\"city\":\"Neumarkt (Oberpf)\",\"object\":\"Theo-Betz-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4489456.49933:619644.97665:NAV4:Fichtelberg, Max-Reger-Platz\",\"x\":\"4489456.49933\",\"y\":\"619644.97665\",\"city\":\"Fichtelberg\",\"object\":\"Max-Reger-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4394443.09584:614255.77457:NAV4:Ha\\u00dffurt, Tricastiner Platz\",\"x\":\"4394443.09584\",\"y\":\"614255.77457\",\"city\":\"Ha\\u00dffurt\",\"object\":\"Tricastiner Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433847.73265:680567.21564:NAV4:N\\u00fcrnberg, Willy-Brandt-Platz\",\"x\":\"4433847.73265\",\"y\":\"680567.21564\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Willy-Brandt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433446.66099:679959.52170:NAV4:N\\u00fcrnberg, Hans-Sachs-Platz\",\"x\":\"4433446.66099\",\"y\":\"679959.52170\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Hans-Sachs-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4435512.09352:676556.38623:NAV4:N\\u00fcrnberg, Heroldsberger Platz\",\"x\":\"4435512.09352\",\"y\":\"676556.38623\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Heroldsberger Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4431470.69804:680185.82106:NAV4:N\\u00fcrnberg, Veit-Sto\\u00df-Platz\",\"x\":\"4431470.69804\",\"y\":\"680185.82106\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Veit-Sto\\u00df-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4430011.69045:687859.35399:NAV4:N\\u00fcrnberg, Eichst\\u00e4tter Platz\",\"x\":\"4430011.69045\",\"y\":\"687859.35399\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Eichst\\u00e4tter Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4437631.96703:683378.50488:NAV4:N\\u00fcrnberg, Max-Grundig-Platz\",\"x\":\"4437631.96703\",\"y\":\"683378.50488\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Max-Grundig-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4436729.19088:682818.30350:NAV4:N\\u00fcrnberg, Max-Morlock-Platz\",\"x\":\"4436729.19088\",\"y\":\"682818.30350\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Max-Morlock-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4422260.06303:679472.67302:NAV4:Zirndorf (Kr F\\u00fcrth), Wilhelm-Tell-Platz\",\"x\":\"4422260.06303\",\"y\":\"679472.67302\",\"city\":\"Zirndorf (Kr F\\u00fcrth)\",\"object\":\"Wilhelm-Tell-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4424421.38295:682487.16348:NAV4:Oberasbach(Kr F\\u00fcrth), Willy-Brandt-Platz\",\"x\":\"4424421.38295\",\"y\":\"682487.16348\",\"city\":\"Oberasbach(Kr F\\u00fcrth)\",\"object\":\"Willy-Brandt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4442206.31848:667038.50201:NAV4:Eckental, Von-Muffel-Platz\",\"x\":\"4442206.31848\",\"y\":\"667038.50201\",\"city\":\"Eckental\",\"object\":\"Von-Muffel-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4428590.93766:684153.86684:NAV4:Stein (b N\\u00fcrnberg), Mecklenburger Platz\",\"x\":\"4428590.93766\",\"y\":\"684153.86684\",\"city\":\"Stein (b N\\u00fcrnberg)\",\"object\":\"Mecklenburger Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4439367.61047:670674.57659:NAV4:Heroldsberg (Kr ERH), Hans-Sachs-Platz\",\"x\":\"4439367.61047\",\"y\":\"670674.57659\",\"city\":\"Heroldsberg (Kr ERH)\",\"object\":\"Hans-Sachs-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4444621.51223:702662.04144:NAV4:Allersberg, Saint-Cere-Platz\",\"x\":\"4444621.51223\",\"y\":\"702662.04144\",\"city\":\"Allersberg\",\"object\":\"Saint-Cere-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4423679.21847:660238.95936:NAV4:Erlangen, Dechsendorfer Platz\",\"x\":\"4423679.21847\",\"y\":\"660238.95936\",\"city\":\"Erlangen\",\"object\":\"Dechsendorfer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4419369.57635:667302.01046:NAV4:Herzogenaurach, Adi-Dassler-Platz\",\"x\":\"4419369.57635\",\"y\":\"667302.01046\",\"city\":\"Herzogenaurach\",\"object\":\"Adi-Dassler-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4427508.50462:689440.93598:NAV4:Schwabach, Rosa-Mihalka-Platz\",\"x\":\"4427508.50462\",\"y\":\"689440.93598\",\"city\":\"Schwabach\",\"object\":\"Rosa-Mihalka-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433881.25436:702731.25587:NAV4:Roth (Mittelfr), Willy-Supf-Platz\",\"x\":\"4433881.25436\",\"y\":\"702731.25587\",\"city\":\"Roth (Mittelfr)\",\"object\":\"Willy-Supf-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433978.51334:650091.95369:NAV4:Forchheim (Ofr), Ernst-Reuter-Platz\",\"x\":\"4433978.51334\",\"y\":\"650091.95369\",\"city\":\"Forchheim (Ofr)\",\"object\":\"Ernst-Reuter-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432475.43993:649267.86829:NAV4:Forchheim (Ofr), Joseph-Otto-Platz\",\"x\":\"4432475.43993\",\"y\":\"649267.86829\",\"city\":\"Forchheim (Ofr)\",\"object\":\"Joseph-Otto-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432859.36374:654507.82262:NAV4:Forchheim (Ofr), St.-Ottilien-Platz\",\"x\":\"4432859.36374\",\"y\":\"654507.82262\",\"city\":\"Forchheim (Ofr)\",\"object\":\"St.-Ottilien-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4399640.09052:665488.39255:NAV4:Neustadt (Aisch), Max-D\\u00f6llner-Platz\",\"x\":\"4399640.09052\",\"y\":\"665488.39255\",\"city\":\"Neustadt (Aisch)\",\"object\":\"Max-D\\u00f6llner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4399307.40710:665240.53830:NAV4:Neustadt (Aisch), Peter-Kolb-Platz\",\"x\":\"4399307.40710\",\"y\":\"665240.53830\",\"city\":\"Neustadt (Aisch)\",\"object\":\"Peter-Kolb-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4396117.66204:695214.27975:NAV4:Ansbach, Josef-Fruth-Platz\",\"x\":\"4396117.66204\",\"y\":\"695214.27975\",\"city\":\"Ansbach\",\"object\":\"Josef-Fruth-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4372226.56730:701014.59153:NAV4:W\\u00f6rnitz, Georg-Ehnes-Platz\",\"x\":\"4372226.56730\",\"y\":\"701014.59153\",\"city\":\"W\\u00f6rnitz\",\"object\":\"Georg-Ehnes-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4489995.18534:681531.81703:NAV4:Amberg (Oberpf), Carl-Schulz-Platz\",\"x\":\"4489995.18534\",\"y\":\"681531.81703\",\"city\":\"Amberg (Oberpf)\",\"object\":\"Carl-Schulz-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4484506.61784:661236.46744:NAV4:Vilseck (Opf), Hans-Ohorn-Platz\",\"x\":\"4484506.61784\",\"y\":\"661236.46744\",\"city\":\"Vilseck (Opf)\",\"object\":\"Hans-Ohorn-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4459354.71867:718976.92976:NAV4:Berching, Dr.-Grabmann-Platz\",\"x\":\"4459354.71867\",\"y\":\"718976.92976\",\"city\":\"Berching\",\"object\":\"Dr.-Grabmann-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4461557.77931:727428.70176:NAV4:Beilngries, Platz der Heimat\",\"x\":\"4461557.77931\",\"y\":\"727428.70176\",\"city\":\"Beilngries\",\"object\":\"Platz der Heimat\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4489043.55099:708143.17905:NAV4:Hohenfels (Kr NM), Pfarrer-Ertl-Platz\",\"x\":\"4489043.55099\",\"y\":\"708143.17905\",\"city\":\"Hohenfels (Kr NM)\",\"object\":\"Pfarrer-Ertl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4486161.77183:720163.60483:NAV4:Beratzhausen, Johann-Ehrl-Platz\",\"x\":\"4486161.77183\",\"y\":\"720163.60483\",\"city\":\"Beratzhausen\",\"object\":\"Johann-Ehrl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4468236.10250:626290.00518:NAV4:Bayreuth, August-Bebel-Platz\",\"x\":\"4468236.10250\",\"y\":\"626290.00518\",\"city\":\"Bayreuth\",\"object\":\"August-Bebel-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4471170.87517:627988.52465:NAV4:Bayreuth, Lise-Meitner-Platz\",\"x\":\"4471170.87517\",\"y\":\"627988.52465\",\"city\":\"Bayreuth\",\"object\":\"Lise-Meitner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4472643.24919:624140.45713:NAV4:Bayreuth, St.-Nepomuk-Platz\",\"x\":\"4472643.24919\",\"y\":\"624140.45713\",\"city\":\"Bayreuth\",\"object\":\"St.-Nepomuk-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4473045.40940:636882.92347:NAV4:Creu\\u00dfen (Oberfr), Pfarrer-Will-Platz\",\"x\":\"4473045.40940\",\"y\":\"636882.92347\",\"city\":\"Creu\\u00dfen (Oberfr)\",\"object\":\"Pfarrer-Will-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4418063.73329:629643.65802:NAV4:Bamberg, Anna-Linder-Platz\",\"x\":\"4418063.73329\",\"y\":\"629643.65802\",\"city\":\"Bamberg\",\"object\":\"Anna-Linder-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4421903.97841:631702.30218:NAV4:Bamberg, St.-Wolfgang-Platz\",\"x\":\"4421903.97841\",\"y\":\"631702.30218\",\"city\":\"Bamberg\",\"object\":\"St.-Wolfgang-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4419108.04624:626860.27692:NAV4:Hallstadt (b Bamberg), St.-Kilians-Platz\",\"x\":\"4419108.04624\",\"y\":\"626860.27692\",\"city\":\"Hallstadt (b Bamberg)\",\"object\":\"St.-Kilians-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4428228.58214:635319.33117:NAV4:Strullendorf, St.-\\u00c4gidius-Platz\",\"x\":\"4428228.58214\",\"y\":\"635319.33117\",\"city\":\"Strullendorf\",\"object\":\"St.-\\u00c4gidius-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4408473.30158:630616.80140:NAV4:Lisberg, Von-M\\u00fcnster-Platz\",\"x\":\"4408473.30158\",\"y\":\"630616.80140\",\"city\":\"Lisberg\",\"object\":\"Von-M\\u00fcnster-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4450437.99613:602125.82906:NAV4:Burgkunstadt, Kathi-Baur-Platz\",\"x\":\"4450437.99613\",\"y\":\"602125.82906\",\"city\":\"Burgkunstadt\",\"object\":\"Kathi-Baur-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4367673.90730:646844.48579:NAV4:Kitzingen, Gustav-Adolf-Platz\",\"x\":\"4367673.90730\",\"y\":\"646844.48579\",\"city\":\"Kitzingen\",\"object\":\"Gustav-Adolf-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4369085.93242:647979.78923:NAV4:Kitzingen, St.-Vinzenz-Platz\",\"x\":\"4369085.93242\",\"y\":\"647979.78923\",\"city\":\"Kitzingen\",\"object\":\"St.-Vinzenz-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4404365.07240:621958.74880:NAV4:Eltmann, Johannes-Nas-Platz\",\"x\":\"4404365.07240\",\"y\":\"621958.74880\",\"city\":\"Eltmann\",\"object\":\"Johannes-Nas-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433675.23849:680233.17418:NAV4:N\\u00fcrnberg, Rosa-Luxemburg-Platz\",\"x\":\"4433675.23849\",\"y\":\"680233.17418\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Rosa-Luxemburg-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433899.18299:679492.16129:NAV4:N\\u00fcrnberg, \\u00c4u\\u00dferer Laufer Platz\",\"x\":\"4433899.18299\",\"y\":\"679492.16129\",\"city\":\"N\\u00fcrnberg\",\"object\":\"\\u00c4u\\u00dferer Laufer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433127.72995:679672.42583:NAV4:N\\u00fcrnberg, Albrecht-D\\u00fcrer-Platz\",\"x\":\"4433127.72995\",\"y\":\"679672.42583\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Albrecht-D\\u00fcrer-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433746.90979:679909.90909:NAV4:N\\u00fcrnberg, Andreij-Sacharow-Platz\",\"x\":\"4433746.90979\",\"y\":\"679909.90909\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Andreij-Sacharow-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433730.70159:679688.86986:NAV4:N\\u00fcrnberg, Innerer Laufer Platz\",\"x\":\"4433730.70159\",\"y\":\"679688.86986\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Innerer Laufer Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432773.36204:679991.54785:NAV4:N\\u00fcrnberg, Kaspar-Hauser-Platz\",\"x\":\"4432773.36204\",\"y\":\"679991.54785\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Kaspar-Hauser-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432767.91977:678952.27750:NAV4:N\\u00fcrnberg, Friedrich-Ebert-Platz\",\"x\":\"4432767.91977\",\"y\":\"678952.27750\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Friedrich-Ebert-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4435280.03708:676527.02308:NAV4:N\\u00fcrnberg, Fritz-Munkert-Platz\",\"x\":\"4435280.03708\",\"y\":\"676527.02308\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Fritz-Munkert-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432491.51280:682347.14431:NAV4:N\\u00fcrnberg, Georg-Wieszner-Platz\",\"x\":\"4432491.51280\",\"y\":\"682347.14431\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Georg-Wieszner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432561.24819:682505.26937:NAV4:N\\u00fcrnberg, Helmut-Herold-Platz\",\"x\":\"4432561.24819\",\"y\":\"682505.26937\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Helmut-Herold-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433099.95653:680876.43576:NAV4:N\\u00fcrnberg, Karl-Pschigode-Platz\",\"x\":\"4433099.95653\",\"y\":\"680876.43576\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Karl-Pschigode-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433058.39431:680812.25964:NAV4:N\\u00fcrnberg, Richard-Wagner-Platz\",\"x\":\"4433058.39431\",\"y\":\"680812.25964\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Richard-Wagner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433653.80327:681032.61536:NAV4:N\\u00fcrnberg, Nelson-Mandela-Platz\",\"x\":\"4433653.80327\",\"y\":\"681032.61536\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Nelson-Mandela-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4439447.47140:685239.20483:NAV4:N\\u00fcrnberg, Leonhard-\\u00dcbler-Platz\",\"x\":\"4439447.47140\",\"y\":\"685239.20483\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Leonhard-\\u00dcbler-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4437022.52614:681230.36215:NAV4:N\\u00fcrnberg, Julius-Schieder-Platz\",\"x\":\"4437022.52614\",\"y\":\"681230.36215\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Julius-Schieder-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4439853.48425:678212.83004:NAV4:N\\u00fcrnberg, Christoph-Carl-Platz\",\"x\":\"4439853.48425\",\"y\":\"678212.83004\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Christoph-Carl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4424716.68554:682435.34798:NAV4:Oberasbach(Kr F\\u00fcrth), Albrecht-D\\u00fcrer-Platz\",\"x\":\"4424716.68554\",\"y\":\"682435.34798\",\"city\":\"Oberasbach(Kr F\\u00fcrth)\",\"object\":\"Albrecht-D\\u00fcrer-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4428637.06989:684265.63243:NAV4:Stein (b N\\u00fcrnberg), Martin-Luther-Platz\",\"x\":\"4428637.06989\",\"y\":\"684265.63243\",\"city\":\"Stein (b N\\u00fcrnberg)\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4452629.46359:694210.32632:NAV4:Burgthann, Martin-Luther-Platz\",\"x\":\"4452629.46359\",\"y\":\"694210.32632\",\"city\":\"Burgthann\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4412700.14746:675136.80224:NAV4:Langenzenn, Martin-Luther-Platz\",\"x\":\"4412700.14746\",\"y\":\"675136.80224\",\"city\":\"Langenzenn\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4428024.02232:663387.88384:NAV4:Erlangen, Martin-Luther-Platz\",\"x\":\"4428024.02232\",\"y\":\"663387.88384\",\"city\":\"Erlangen\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4420630.89813:667363.33421:NAV4:Herzogenaurach, Friedrich-Weiler-Platz\",\"x\":\"4420630.89813\",\"y\":\"667363.33421\",\"city\":\"Herzogenaurach\",\"object\":\"Friedrich-Weiler-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4420811.74676:666950.53831:NAV4:Herzogenaurach, Martin-Luther-Platz\",\"x\":\"4420811.74676\",\"y\":\"666950.53831\",\"city\":\"Herzogenaurach\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4429038.34383:693809.33005:NAV4:Schwabach, Martin-Luther-Platz\",\"x\":\"4429038.34383\",\"y\":\"693809.33005\",\"city\":\"Schwabach\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4436377.59542:715586.69526:NAV4:Heideck (Mfr), Dr.-Max-Ring-Platz\",\"x\":\"4436377.59542\",\"y\":\"715586.69526\",\"city\":\"Heideck (Mfr)\",\"object\":\"Dr.-Max-Ring-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4424723.17295:704087.21993:NAV4:Abenberg (Mfr), Pr\\u00e4lat-Sperber-Platz\",\"x\":\"4424723.17295\",\"y\":\"704087.21993\",\"city\":\"Abenberg (Mfr)\",\"object\":\"Pr\\u00e4lat-Sperber-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4420503.91744:645614.20918:NAV4:H\\u00f6chstadt a.d. Aisch, Pfarrer-Reichelt-Platz\",\"x\":\"4420503.91744\",\"y\":\"645614.20918\",\"city\":\"H\\u00f6chstadt a.d. Aisch\",\"object\":\"Pfarrer-Reichelt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4419640.74172:651165.70141:NAV4:Adelsdorf (Lkr. ERH), Dr.-Carl-Soldan-Platz\",\"x\":\"4419640.74172\",\"y\":\"651165.70141\",\"city\":\"Adelsdorf (Lkr. ERH)\",\"object\":\"Dr.-Carl-Soldan-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4452976.34520:636401.57476:NAV4:Waischenfeld, Bischof-Nausea-Platz\",\"x\":\"4452976.34520\",\"y\":\"636401.57476\",\"city\":\"Waischenfeld\",\"object\":\"Bischof-Nausea-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4399161.80040:665663.58454:NAV4:Neustadt (Aisch), Leonhard-Bankel-Platz\",\"x\":\"4399161.80040\",\"y\":\"665663.58454\",\"city\":\"Neustadt (Aisch)\",\"object\":\"Leonhard-Bankel-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4386141.40517:673191.13876:NAV4:Bad Windsheim, Albrecht-D\\u00fcrer-Platz\",\"x\":\"4386141.40517\",\"y\":\"673191.13876\",\"city\":\"Bad Windsheim\",\"object\":\"Albrecht-D\\u00fcrer-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4386463.68978:657557.63266:NAV4:Markt Bibart, Julius-Echter-Platz\",\"x\":\"4386463.68978\",\"y\":\"657557.63266\",\"city\":\"Markt Bibart\",\"object\":\"Julius-Echter-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4396185.92497:696061.99179:NAV4:Ansbach, Kaspar-Hauser-Platz\",\"x\":\"4396185.92497\",\"y\":\"696061.99179\",\"city\":\"Ansbach\",\"object\":\"Kaspar-Hauser-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4396117.95960:696096.54702:NAV4:Ansbach, Martin-Luther-Platz\",\"x\":\"4396117.95960\",\"y\":\"696096.54702\",\"city\":\"Ansbach\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4394329.67759:712272.57913:NAV4:Bechhofen a d Heide, Martin-Luther-Platz\",\"x\":\"4394329.67759\",\"y\":\"712272.57913\",\"city\":\"Bechhofen a d Heide\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4373959.51427:697342.45429:NAV4:Schillingsf\\u00fcrst (Mfr), Karl-Albrecht-Platz\",\"x\":\"4373959.51427\",\"y\":\"697342.45429\",\"city\":\"Schillingsf\\u00fcrst (Mfr)\",\"object\":\"Karl-Albrecht-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4382473.84935:726272.35014:NAV4:Wilburgstetten, Bischof-Rabeno-Platz\",\"x\":\"4382473.84935\",\"y\":\"726272.35014\",\"city\":\"Wilburgstetten\",\"object\":\"Bischof-Rabeno-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4424803.31227:726796.42608:NAV4:Wei\\u00dfenburg (Bayern), Martin-Luther-Platz\",\"x\":\"4424803.31227\",\"y\":\"726796.42608\",\"city\":\"Wei\\u00dfenburg (Bayern)\",\"object\":\"Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4496093.28236:670244.75491:NAV4:Hirschau (Oberpfalz), Bischof-B\\u00f6sl-Platz\",\"x\":\"4496093.28236\",\"y\":\"670244.75491\",\"city\":\"Hirschau (Oberpfalz)\",\"object\":\"Bischof-B\\u00f6sl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4500162.35965:670087.37392:NAV4:Schnaittenbach, Bischof-Rosner-Platz\",\"x\":\"4500162.35965\",\"y\":\"670087.37392\",\"city\":\"Schnaittenbach\",\"object\":\"Bischof-Rosner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4500367.78138:669924.00758:NAV4:Schnaittenbach, Georg-Landgraf-Platz\",\"x\":\"4500367.78138\",\"y\":\"669924.00758\",\"city\":\"Schnaittenbach\",\"object\":\"Georg-Landgraf-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4489388.52247:675608.72454:NAV4:Hahnbach (Kr Amberg), Pfarrer-Lindl-Platz\",\"x\":\"4489388.52247\",\"y\":\"675608.72454\",\"city\":\"Hahnbach (Kr Amberg)\",\"object\":\"Pfarrer-Lindl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4472306.01633:665875.78228:NAV4:Hirschbach (Oberpf), Heinrich-Hertz-Platz\",\"x\":\"4472306.01633\",\"y\":\"665875.78228\",\"city\":\"Hirschbach (Oberpf)\",\"object\":\"Heinrich-Hertz-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4458927.27964:699884.16616:NAV4:Neumarkt (Oberpf), Pfarrer-A.-Lang-Platz\",\"x\":\"4458927.27964\",\"y\":\"699884.16616\",\"city\":\"Neumarkt (Oberpf)\",\"object\":\"Pfarrer-A.-Lang-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4479084.48063:712654.77206:NAV4:Parsberg (Opf), Rudolf-Eisenmann-Platz\",\"x\":\"4479084.48063\",\"y\":\"712654.77206\",\"city\":\"Parsberg (Opf)\",\"object\":\"Rudolf-Eisenmann-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4484571.47389:619796.87316:NAV4:Warmensteinach, Gustav-Leutelt-Platz\",\"x\":\"4484571.47389\",\"y\":\"619796.87316\",\"city\":\"Warmensteinach\",\"object\":\"Gustav-Leutelt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4489617.84093:619477.66233:NAV4:Fichtelberg, Wolfgang-Graf-Platz\",\"x\":\"4489617.84093\",\"y\":\"619477.66233\",\"city\":\"Fichtelberg\",\"object\":\"Wolfgang-Graf-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4421722.67045:629741.95112:NAV4:Bamberg, Eugen-Pacelli-Platz\",\"x\":\"4421722.67045\",\"y\":\"629741.95112\",\"city\":\"Bamberg\",\"object\":\"Eugen-Pacelli-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4421601.97462:629785.89215:NAV4:Bamberg, Heinrich-Weber-Platz\",\"x\":\"4421601.97462\",\"y\":\"629785.89215\",\"city\":\"Bamberg\",\"object\":\"Heinrich-Weber-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4415931.60842:629157.61304:NAV4:Bischberg (Kr Bamberg), Pfarrer-Deinhart-Platz\",\"x\":\"4415931.60842\",\"y\":\"629157.61304\",\"city\":\"Bischberg (Kr Bamberg)\",\"object\":\"Pfarrer-Deinhart-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4414238.05428:628630.14372:NAV4:Bischberg (Kr Bamberg), Platz von Montauban\",\"x\":\"4414238.05428\",\"y\":\"628630.14372\",\"city\":\"Bischberg (Kr Bamberg)\",\"object\":\"Platz von Montauban\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4414720.18454:633554.27481:NAV4:Stegaurach, Dr.-Peter-Lex-Platz\",\"x\":\"4414720.18454\",\"y\":\"633554.27481\",\"city\":\"Stegaurach\",\"object\":\"Dr.-Peter-Lex-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4410395.63772:627113.81263:NAV4:Viereth-Trunstadt, Pfarrer-Marquard-Platz\",\"x\":\"4410395.63772\",\"y\":\"627113.81263\",\"city\":\"Viereth-Trunstadt\",\"object\":\"Pfarrer-Marquard-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4430438.61387:604471.72223:NAV4:Lichtenfels, Christ-K\\u00f6nig-Platz\",\"x\":\"4430438.61387\",\"y\":\"604471.72223\",\"city\":\"Lichtenfels\",\"object\":\"Christ-K\\u00f6nig-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4446506.26599:603652.18609:NAV4:Burgkunstadt, Regens-Wagner-Platz\",\"x\":\"4446506.26599\",\"y\":\"603652.18609\",\"city\":\"Burgkunstadt\",\"object\":\"Regens-Wagner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4428185.60632:607538.19705:NAV4:Bad Staffelstein, Georg-Herpich-Platz\",\"x\":\"4428185.60632\",\"y\":\"607538.19705\",\"city\":\"Bad Staffelstein\",\"object\":\"Georg-Herpich-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4430891.00436:607932.23071:NAV4:Bad Staffelstein, Pfarrer-Birger-Platz\",\"x\":\"4430891.00436\",\"y\":\"607932.23071\",\"city\":\"Bad Staffelstein\",\"object\":\"Pfarrer-Birger-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4423586.69808:609820.90078:NAV4:Ebensfeld, Pater-Lunkenbein-Platz\",\"x\":\"4423586.69808\",\"y\":\"609820.90078\",\"city\":\"Ebensfeld\",\"object\":\"Pater-Lunkenbein-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4370850.78469:668583.67013:NAV4:Uffenheim, Wilhelm-Hoegner-Platz\",\"x\":\"4370850.78469\",\"y\":\"668583.67013\",\"city\":\"Uffenheim\",\"object\":\"Wilhelm-Hoegner-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4373321.17538:633306.86683:NAV4:Volkach, Julius-Echter-Platz\",\"x\":\"4373321.17538\",\"y\":\"633306.86683\",\"city\":\"Volkach\",\"object\":\"Julius-Echter-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4374375.45727:651177.77348:NAV4:Iphofen, Julius-Echter-Platz\",\"x\":\"4374375.45727\",\"y\":\"651177.77348\",\"city\":\"Iphofen\",\"object\":\"Julius-Echter-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4376600.96256:643687.80421:NAV4:Kleinlangheim, Christian-Beyer-Platz\",\"x\":\"4376600.96256\",\"y\":\"643687.80421\",\"city\":\"Kleinlangheim\",\"object\":\"Christian-Beyer-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4380732.63212:644477.22459:NAV4:R\\u00fcdenhausen, Paul-Gerhardt-Platz\",\"x\":\"4380732.63212\",\"y\":\"644477.22459\",\"city\":\"R\\u00fcdenhausen\",\"object\":\"Paul-Gerhardt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4390111.04360:617212.41876:NAV4:Wonfurt, Von-Seckendorff-Platz\",\"x\":\"4390111.04360\",\"y\":\"617212.41876\",\"city\":\"Wonfurt\",\"object\":\"Von-Seckendorff-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4433747.05436:681724.40306:NAV4:N\\u00fcrnberg, Ritter-von-Schuh-Platz\",\"x\":\"4433747.05436\",\"y\":\"681724.40306\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Ritter-von-Schuh-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4435171.80022:684225.43787:NAV4:N\\u00fcrnberg, Matth\\u00e4us-Herrmann-Platz\",\"x\":\"4435171.80022\",\"y\":\"684225.43787\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Matth\\u00e4us-Herrmann-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4437384.84162:685892.19286:NAV4:N\\u00fcrnberg, Elisabeth-Selbert-Platz\",\"x\":\"4437384.84162\",\"y\":\"685892.19286\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Elisabeth-Selbert-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4435229.20147:682902.11770:NAV4:N\\u00fcrnberg, Gabriel-von-Seidl-Platz\",\"x\":\"4435229.20147\",\"y\":\"682902.11770\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Gabriel-von-Seidl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4451152.18835:689242.18497:NAV4:Altdorf (b N\\u00fcrnberg), Emil-von-Stromer-Platz\",\"x\":\"4451152.18835\",\"y\":\"689242.18497\",\"city\":\"Altdorf (b N\\u00fcrnberg)\",\"object\":\"Emil-von-Stromer-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4445867.88650:677137.67269:NAV4:R\\u00f6thenbach a.d.Pegn., Geschwister-Scholl-Platz\",\"x\":\"4445867.88650\",\"y\":\"677137.67269\",\"city\":\"R\\u00f6thenbach a.d.Pegn.\",\"object\":\"Geschwister-Scholl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4427013.96281:678443.27160:NAV4:F\\u00fcrth (Bayern), Dr.-Martin-Luther-Platz\",\"x\":\"4427013.96281\",\"y\":\"678443.27160\",\"city\":\"F\\u00fcrth (Bayern)\",\"object\":\"Dr.-Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4430735.57893:664449.04504:NAV4:Erlangen, Gro\\u00df-von-Trockau-Platz\",\"x\":\"4430735.57893\",\"y\":\"664449.04504\",\"city\":\"Erlangen\",\"object\":\"Gro\\u00df-von-Trockau-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4458764.76568:674327.40148:NAV4:Hersbruck, Nikolaus-Selnecker-Platz\",\"x\":\"4458764.76568\",\"y\":\"674327.40148\",\"city\":\"Hersbruck\",\"object\":\"Nikolaus-Selnecker-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4474088.45226:653687.52381:NAV4:Auerbach i.d.Opf., Franz-Josef-Strau\\u00df-Platz\",\"x\":\"4474088.45226\",\"y\":\"653687.52381\",\"city\":\"Auerbach i.d.Opf.\",\"object\":\"Franz-Josef-Strau\\u00df-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4468288.31887:660062.41370:NAV4:Neuhaus a.d. Pegnitz, Salvatore-d'Amato-Platz\",\"x\":\"4468288.31887\",\"y\":\"660062.41370\",\"city\":\"Neuhaus a.d. Pegnitz\",\"object\":\"Salvatore-d'Amato-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4432954.65853:649277.05985:NAV4:Forchheim (Ofr), Viktor-von-Scheffel-Platz\",\"x\":\"4432954.65853\",\"y\":\"649277.05985\",\"city\":\"Forchheim (Ofr)\",\"object\":\"Viktor-von-Scheffel-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4427842.20291:653337.81183:NAV4:Heroldsbach, Pfr.-Dr.-Marquardt-Platz\",\"x\":\"4427842.20291\",\"y\":\"653337.81183\",\"city\":\"Heroldsbach\",\"object\":\"Pfr.-Dr.-Marquardt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4444632.24709:661546.28019:NAV4:Igensdorf, B\\u00fcrgermeister-Zei\\u00df-Platz\",\"x\":\"4444632.24709\",\"y\":\"661546.28019\",\"city\":\"Igensdorf\",\"object\":\"B\\u00fcrgermeister-Zei\\u00df-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4385423.28012:673759.58895:NAV4:Bad Windsheim, Dr.-Martin-Luther-Platz\",\"x\":\"4385423.28012\",\"y\":\"673759.58895\",\"city\":\"Bad Windsheim\",\"object\":\"Dr.-Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4409399.02323:716927.26744:NAV4:Gunzenhausen, Dr.-Heinrich-Eidam-Platz\",\"x\":\"4409399.02323\",\"y\":\"716927.26744\",\"city\":\"Gunzenhausen\",\"object\":\"Dr.-Heinrich-Eidam-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4409229.07512:717210.94852:NAV4:Gunzenhausen, Dr.-Martin-Luther-Platz\",\"x\":\"4409229.07512\",\"y\":\"717210.94852\",\"city\":\"Gunzenhausen\",\"object\":\"Dr.-Martin-Luther-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4479176.74727:712511.39937:NAV4:Parsberg (Opf), Heinz-Schauwecker-Platz\",\"x\":\"4479176.74727\",\"y\":\"712511.39937\",\"city\":\"Parsberg (Opf)\",\"object\":\"Heinz-Schauwecker-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4485964.02684:720012.64830:NAV4:Beratzhausen, Gottfried-K\\u00f6lwel-Platz\",\"x\":\"4485964.02684\",\"y\":\"720012.64830\",\"city\":\"Beratzhausen\",\"object\":\"Gottfried-K\\u00f6lwel-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4467935.04131:625302.44216:NAV4:Bayreuth, Geschwister-Scholl-Platz\",\"x\":\"4467935.04131\",\"y\":\"625302.44216\",\"city\":\"Bayreuth\",\"object\":\"Geschwister-Scholl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4482997.76992:633876.75611:NAV4:Speichersdorf, Abt-Veit-H\\u00f6ser-Platz\",\"x\":\"4482997.76992\",\"y\":\"633876.75611\",\"city\":\"Speichersdorf\",\"object\":\"Abt-Veit-H\\u00f6ser-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4484190.23326:620212.62493:NAV4:Warmensteinach, Matth\\u00e4us-Herrmann-Platz\",\"x\":\"4484190.23326\",\"y\":\"620212.62493\",\"city\":\"Warmensteinach\",\"object\":\"Matth\\u00e4us-Herrmann-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4420431.75970:631137.30700:NAV4:Bamberg, E.T.A.-Hoffmann-Platz\",\"x\":\"4420431.75970\",\"y\":\"631137.30700\",\"city\":\"Bamberg\",\"object\":\"E.T.A.-Hoffmann-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4419738.39556:630355.74907:NAV4:Bamberg, Graf-Stauffenberg-Platz\",\"x\":\"4419738.39556\",\"y\":\"630355.74907\",\"city\":\"Bamberg\",\"object\":\"Graf-Stauffenberg-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4421103.06987:631411.17261:NAV4:Bamberg, Jacobus-von-Hauck-Platz\",\"x\":\"4421103.06987\",\"y\":\"631411.17261\",\"city\":\"Bamberg\",\"object\":\"Jacobus-von-Hauck-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4421748.64566:618147.69895:NAV4:Rattelsdorf (Ofr), Kaspar-R\\u00f6ckelein-Platz\",\"x\":\"4421748.64566\",\"y\":\"618147.69895\",\"city\":\"Rattelsdorf (Ofr)\",\"object\":\"Kaspar-R\\u00f6ckelein-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4371045.75971:668699.84780:NAV4:Uffenheim, Franz-Josef-Strau\\u00df-Platz\",\"x\":\"4371045.75971\",\"y\":\"668699.84780\",\"city\":\"Uffenheim\",\"object\":\"Franz-Josef-Strau\\u00df-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4371694.61859:662152.81839:NAV4:Ippesheim (Mfr), Am Ferdinand-Schlez-Platz\",\"x\":\"4371694.61859\",\"y\":\"662152.81839\",\"city\":\"Ippesheim (Mfr)\",\"object\":\"Am Ferdinand-Schlez-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4398579.86932:616220.23726:NAV4:Zeil (Main), Elisabetha-Hofmann-Platz\",\"x\":\"4398579.86932\",\"y\":\"616220.23726\",\"city\":\"Zeil (Main)\",\"object\":\"Elisabetha-Hofmann-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4398949.20426:615485.56299:NAV4:Zeil (Main), Pfarrer-Anton-Kehl-Platz\",\"x\":\"4398949.20426\",\"y\":\"615485.56299\",\"city\":\"Zeil (Main)\",\"object\":\"Pfarrer-Anton-Kehl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4388204.89223:601267.37781:NAV4:Aidhausen, Pater-Clemens-Fuhl-Platz\",\"x\":\"4388204.89223\",\"y\":\"601267.37781\",\"city\":\"Aidhausen\",\"object\":\"Pater-Clemens-Fuhl-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4434938.51749:681588.62668:NAV4:N\\u00fcrnberg, Platz der Opfer des Faschismus\",\"x\":\"4434938.51749\",\"y\":\"681588.62668\",\"city\":\"N\\u00fcrnberg\",\"object\":\"Platz der Opfer des Faschismus\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4431040.96024:656574.39398:NAV4:Baiersdorf (Mfr), Johann-Jakob-Schamel-Platz\",\"x\":\"4431040.96024\",\"y\":\"656574.39398\",\"city\":\"Baiersdorf (Mfr)\",\"object\":\"Johann-Jakob-Schamel-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4396461.76489:696197.52977:NAV4:Ansbach, Johann-Sebastian-Bach-Platz\",\"x\":\"4396461.76489\",\"y\":\"696197.52977\",\"city\":\"Ansbach\",\"object\":\"Johann-Sebastian-Bach-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4407480.24447:704907.63182:NAV4:Wolframs-Eschenbach, Dr.-Johann-Baptist-Kurz-Platz\",\"x\":\"4407480.24447\",\"y\":\"704907.63182\",\"city\":\"Wolframs-Eschenbach\",\"object\":\"Dr.-Johann-Baptist-Kurz-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4407285.11083:704874.32911:NAV4:Wolframs-Eschenbach, Wolfram-von-Eschenbach-Platz\",\"x\":\"4407285.11083\",\"y\":\"704874.32911\",\"city\":\"Wolframs-Eschenbach\",\"object\":\"Wolfram-von-Eschenbach-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4489047.21656:682545.43109:NAV4:Amberg (Oberpf), B\\u00fcrgermeister-Bartelt-Platz\",\"x\":\"4489047.21656\",\"y\":\"682545.43109\",\"city\":\"Amberg (Oberpf)\",\"object\":\"B\\u00fcrgermeister-Bartelt-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4458709.78855:699685.03566:NAV4:Neumarkt (Oberpf), Freiherr-von-Gemmingen-Platz\",\"x\":\"4458709.78855\",\"y\":\"699685.03566\",\"city\":\"Neumarkt (Oberpf)\",\"object\":\"Freiherr-von-Gemmingen-Platz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4440769.71252:687592.13510:NAV4:Feucht, Kurt-Nagel-Platz (Gewerbepark N\\u00fcrnberg-Feucht)\",\"x\":\"4440769.71252\",\"y\":\"687592.13510\",\"city\":\"Feucht\",\"object\":\"Kurt-Nagel-Platz (Gewerbepark N\\u00fcrnberg-Feucht)\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4414148.85455:611863.57171:NAV4:Rentweinsdorf, Planplatz\",\"x\":\"4414148.85455\",\"y\":\"611863.57171\",\"city\":\"Rentweinsdorf\",\"object\":\"Planplatz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4426012.48404:718571.04235:NAV4:Pleinfeld, Marktplatz\",\"x\":\"4426012.48404\",\"y\":\"718571.04235\",\"city\":\"Pleinfeld\",\"object\":\"Marktplatz\",\"my\":\"\"},{\"type\":\"stateless\",\"place\":\"\",\"name\":\"coord:4426080.85568:718511.12262:NAV4:Pleinfeld, Kirchenplatz\",\"x\":\"4426080.85568\",\"y\":\"718511.12262\",\"city\":\"Pleinfeld\",\"object\":\"Kirchenplatz\",\"my\":\"\"}]}";
    static final String FILE_CONTENT__REPRODUCE_EXCEPTION_VRN = "{ \"parameters\": [ { \"name\":\"serverID\", \"value\":\"EFA10-5\" }, { \"name\":\"requestID\", \"value\":\"0\" }, { \"name\":\"sessionID\", \"value\":\"0\" }, { \"name\":\"calcTime\", \"value\":\"117.364\" } ], \"dm\": { \"input\": { \"input\":\"de:05762:7629\" }, \"points\": {\"point\": { \"usage\":\"dm\", \"type\":\"any\", \"name\":\"Istrup (Brakel/Hx), Wendeplatz\", \"stateless\":\"23207629\", \"anyType\":\"stop\", \"sort\":\"2\", \"quality\":\"100000\", \"best\":\"0\", \"object\":\"Wendeplatz\", \"ref\": { \"id\":\"23207629\",\"gid\":\"de:05762:7629\",\"omc\":\"5762016\", \"placeID\":\"13\", \"place\":\"Istrup (Brakel/Hx)\", \"coords\":\"9.12013,51.70564\" }, \"infos\": null } }, \"itdOdvAssignedStops\": { \"stopID\":\"23207629\", \"name\":\"Wendeplatz\", \"x\":\"9.12013\", \"y\":\"51.70564\", \"mapName\":\"EPSG:4326\", \"value\":\"23207629:Wendeplatz\", \"place\":\"Istrup (Brakel/Hx)\", \"nameWithPlace\":\"Bk-Istrup, Wendeplatz\", \"distanceTime\":\"0\", \"isTransferStop\":\"0\", \"vm\":\"100\", \"gid\":\"de:05762:7629\" } }, \"arr\": { \"input\": { \"input\":\"\" }, \"points\": null }, \"dateTime\": { \"deparr\":\"dep\", \"ttpFrom\":\"20190101\", \"ttpTo\":\"20191214\", \"year\":\"2019\", \"month\":\"5\", \"day\":\"5\", \"hour\":\"21\", \"minute\":\"25\" }, \"dateRange\": [ { \"day\":\"05\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"1\" }, { \"day\":\"06\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"2\" }, { \"day\":\"07\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"3\" }, { \"day\":\"08\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"4\" }, { \"day\":\"09\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"5\" }, {\"day\":\"10\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"6\" }, { \"day\":\"11\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"7\" }, { \"day\":\"12\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"1\" }, { \"day\":\"13\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"2\" }, { \"day\":\"14\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"3\" }, { \"day\":\"15\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"4\" }, { \"day\":\"16\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"5\" }, { \"day\":\"17\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"6\" }, { \"day\":\"18\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"7\" }, { \"day\":\"19\", \"month\":\"05\", \"year\":\"2019\", \"weekday\":\"1\" } ], \"option\": { \"ptOption\": { \"active\":\"-1\", \"maxChanges\":\"9\", \"maxTime\":\"360\", \"maxWait\":\"120\", \"routeType\":\"LEASTTIME\", \"changeSpeed\":\"normal\", \"lineRestriction\":\"403\", \"useProxFootSearch\":\"0\", \"useProxFootSearchOrigin\":\"0\", \"useProxFootSearchDestination\":\"0\", \"bike\":\"0\",\"plane\":\"0\", \"noCrowded\":\"0\", \"noSolidStairs\":\"0\", \"noEscalators\":\"0\", \"noElevators\":\"0\", \"lowPlatformVhcl\":\"0\", \"wheelchair\":\"0\", \"needElevatedPlt\":\"0\", \"assistance\":\"0\", \"SOSAvail\":\"0\", \"noLonelyTransfer\":\"0\", \"illumTransfer\":\"0\", \"overgroundTransfer\":\"0\", \"noInsecurePlaces\":\"0\", \"privateTransport\":\"0\", \"excludedMeans\": [ { \"means\":\"Zug\", \"value\":\"0\", \"selected\":\"0\" }, { \"means\":\"S-Bahn\", \"value\":\"1\", \"selected\":\"0\" }, { \"means\":\"U-Bahn\", \"value\":\"2\", \"selected\":\"0\" }, { \"means\":\"Stadtbahn\", \"value\":\"3\", \"selected\":\"0\" }, { \"means\":\"Straßen-/Trambahn\", \"value\":\"4\", \"selected\":\"0\" }, { \"means\":\"Stadtbus\", \"value\":\"5\", \"selected\":\"0\" }, { \"means\":\"Regionalbus\", \"value\":\"6\", \"selected\":\"0\" }, { \"means\":\"Schnellbus\", \"value\":\"7\", \"selected\":\"0\" }, { \"means\":\"Seil-/Zahnradbahn\", \"value\":\"8\", \"selected\":\"0\" }, { \"means\":\"Schiff\", \"value\":\"9\", \"selected\":\"0\" }, { \"means\":\"AST/Rufbus\", \"value\":\"10\", \"selected\":\"0\" }, { \"means\":\"Sonstige\", \"value\":\"11\", \"selected\":\"0\" }, { \"means\":\"Flugzeug\", \"value\":\"12\", \"selected\":\"0\" }, { \"means\":\"Zug (Nahverkehr)\", \"value\":\"13\", \"selected\":\"0\" }, { \"means\":\"Zug (Fernverkehr)\", \"value\":\"14\", \"selected\":\"0\" }, { \"means\":\"Zug Fernv m Zuschlag\", \"value\":\"15\", \"selected\":\"0\" }, { \"means\":\"Zug Fernv m spez Fpr\", \"value\":\"16\", \"selected\":\"0\" }, { \"means\":\"SEV Schienenersatzv\", \"value\":\"17\", \"selected\":\"0\" }, { \"means\":\"Zug Shuttle\", \"value\":\"18\", \"selected\":\"0\" }, { \"means\":\"Bürgerbus\", \"value\":\"19\", \"selected\":\"0\" } ], \"activeImp\":\"-1\", \"activeCom\":\"-1\", \"activeSec\":\"-1\" } }, \"servingLines\": { \"lines\": { \"line\": { \"mode\": { \"name\":\"Bus 570\", \"number\":\"570\", \"product\":\"Bus\", \"productId\":\"2\", \"type\":\"5\", \"mtSubcode\":\"0\", \"code\":\"3\", \"destination\":\"Brakel, Grundschule\", \"destID\":\"23207420\", \"desc\":\"Bad Driburg - Brakel Bad Driburg - Herste - Istrup - Riesel - Brakel\", \"timetablePeriod\":\"Jahresfahrplan ab 05.08.18\", \"diva\": { \"branch\":\"73\", \"line\":\"73570\", \"supplement\":\" \", \"dir\":\"R\", \"project\":\"8_1\", \"network\":\"vph\", \"stateless\":\"vph:73570: :R:8_1\", \"operator\":\"Weser-Egge-Bus\", \"opCode\":\"62\", \"vF\":\"20180805\", \"vTo\":\"20190803\", \"attrs\": [  ] } }, \"index\":\"5:0\" } } }, \"departureList\": { \"departure\": { \"stopID\":\"23207629\", \"x\":\"9.12025\", \"y\":\"51.70569\", \"mapName\":\"EPSG:4326\", \"area\":\"0\", \"platform\":\"1\", \"platformName\":\"\", \"stopName\":\"Bk-Istrup, Wendeplatz\", \"nameWO\":\"Wendeplatz\", \"countdown\":\"624\", \"dateTime\": { \"year\":\"2019\", \"month\":\"5\", \"day\":\"6\", \"weekday\":\"2\", \"hour\":\"7\", \"minute\":\"49\" }, \"servingLine\": { \"key\":\"53\", \"code\":\"3\", \"number\":\"570\", \"symbol\":\"570\", \"motType\":\"5\", \"mtSubcode\":\"0\", \"realtime\":\"0\", \"direction\":\"Brakel, Grundschule\", \"directionFrom\":\"Bk-Istrup, Wendeplatz\", \"name\":\"Bus\", \"liErgRiProj\": { \"line\":\"73570\", \"project\":\"8_1\", \"direction\":\"R\", \"supplement\":\" \", \"network\":\"vph\" }, \"destID\":\"23207420\", \"stateless\":\"vph:73570: :R:8_1\" }, \"operator\": { \"code\":\"62\", \"name\":\"Weser-Egge-Bus\", \"publicCode\":\"\" } } } }";
}