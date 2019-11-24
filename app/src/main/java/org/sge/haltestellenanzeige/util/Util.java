package org.sge.haltestellenanzeige.util;

import java.io.InputStream;
import java.io.StringWriter;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import android.content.Context;
import android.util.Xml;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Util {
    public final static int MESSAGE_LENGTH = 200;

    static public String getTimeStamp() {
        return new SimpleDateFormat("HH:mm:ss").format(new Timestamp(System.currentTimeMillis())); //NON-NLS
    }


    public final static int getResourceID(final String resName, final String resType, final Context ctx)
    {
        //System.out.println("getResourceIDName: " + resName);
        final int ResourceID = ctx.getResources().getIdentifier(resName, resType, ctx.getApplicationInfo().packageName);
        if (ResourceID == 0)
        {
            System.out.println("no id found for " + resName); //NON-NLS
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        }
        else
        {
            //System.out.println("getResourceID: " + ResourceID);
            return ResourceID;
        }
    }


    public static String getCurrentTime(String timeformat){
        return new SimpleDateFormat(timeformat).format(new Date());
    }


    public static String getCurrentTimeDe(){
        return getCurrentTime("HH:mm");
    }


    public static String getCurrentDateDe(){
        return getCurrentTime("dd.MM.yyyy");
    }


    public static String computeDepartureTime(String baseTime, long timeOffsetInMinutes) {
        // baseTime = "15:05 20.11.2018";
        try {
            Date dateBase = new SimpleDateFormat("HH:mm").parse(baseTime);
            long departureTimeInMillis = dateBase.getTime() + timeOffsetInMinutes * 60 * 1000;
            Date dateDeparture = new Date(departureTimeInMillis);

            Format formatter = new SimpleDateFormat("HH:mm");
            return formatter.format(dateDeparture);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "";
    }


    public static Date convertStringTimeToDate(String time) {
        // baseTime = "15:05";
        try {
            return new SimpleDateFormat("HH:mm").parse(time);
        } catch (ParseException e) {
            // System.out.println("Unparseable date: " + time);
        }

        return null;
    }


    private static File getFileFromPath(String fileName) {
        URL resource = ClassLoader.getSystemClassLoader().getResource(fileName);
        return new File(resource.getPath());
    }


    public static String readFile(String path, Charset encoding) {
        File file = getFileFromPath(path);

        //Read text from file
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return text.toString();
    }

    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    private static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }


    public static String exchangeUmlaute(String input) {
        return input
                //.replaceAll("&#252;", "ü") // repaced by Html.fromHtml(returnString).toString() in the get-methods
                //.replaceAll("&#220;", "Ü")
                //.replaceAll("&#246;", "ö")
                //.replaceAll("&#214;", "Ö")
                //.replaceAll("&#228;", "ä")
                //.replaceAll("&#196;", "Ä")
                //.replaceAll("&#223;", "ß")
                //.replaceAll("&#225;", "á")
                .replaceAll("&nbsp;", " ")//NON-NLS
                .replaceAll("&quot;", " ")//NON-NLS
                .replaceAll("&gt;", " ")//NON-NLS
                .replaceAll("&lt;", " ")//NON-NLS
                .replaceAll("&amp;", " ")//NON-NLS
                .replaceAll("&apos;", " "); //NON-NLS
    }


    static public void waitMillis(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static public String printPart(String s, int l) {
        if(s == null) return "";
        if(s.isEmpty()) return "";

        return ">>>" + s.substring(0, Math.min(s.length() - 1, l)) + "<<<";
    }


    static public void warningMessage(String messageText) {
        System.out.println("Haltestellenanzeige Warning: " + messageText); //NON-NLS
    }


    static public boolean startsWithANumber(String s) {
        if(s == null) return false;
        if(s.isEmpty()) return false;
        return Character.isDigit(s.charAt(0));
    }


    static public String convertStringFromISO8859ToUTF8(String input) {
        byte[] ptext = input.getBytes(ISO_8859_1);
        return new String(ptext, UTF_8);
    }


    static public String stringParameter2UrlParameter(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8"); //NON-NLS
        } catch (UnsupportedEncodingException e) {
            return s;
        }
    }


    static public String removeLineBreaks(String text) {
        return text.replace("\n", "").replace("\r", "").replace("- ", "" + '\u2011' + '\u00A0');
    }


    static public void printHtmlForNode(HtmlCleaner htmlCleaner, TagNode node) {
        String content = "<" + node.getName() + ">" + htmlCleaner.getInnerHtml(node) + "</" + node.getName() + ">";
        System.out.println(content);
    }


    static public String getStringHtmlForNode(HtmlCleaner htmlCleaner, TagNode node) {
        return "<" + node.getName() + ">" + htmlCleaner.getInnerHtml(node) + "</" + node.getName() + ">";
    }


    static public String cutString(String stringToCut, int maxLength) {
        return stringToCut.substring(0, Math.min(maxLength, stringToCut.length()));
    }


    public static String readTestDataFile(InputStream inputStream) {
        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        return  result;
    }


    public static List<String> split(String s, int maxLength) {
        List<String> returnList = new ArrayList<String>();

        String workString = s;
        while(workString.length() > 0) {
            String substring = workString.substring(0, Math.min(workString.length(), maxLength));
            returnList.add(substring);
            workString = workString.substring(Math.min(workString.length(), maxLength));
        }

        return returnList;
    }


    public static void printStringInMultipleLines(String s, int maxLength) {
        String workString = s;
        while(workString.length() > 0) {
            String substring = workString.substring(0, Math.min(workString.length(), maxLength));
            System.out.println(substring);
            workString = workString.substring(Math.min(workString.length(), maxLength));
        }
    }


    public static void printStringInMultipleLines(String s) {
        printStringInMultipleLines(s, 200);
    }

    public static boolean isValidTimeFormat(String delayString) {
        // hh:mm or h:mm
        if(delayString == null) return false;
        if(delayString.isEmpty()) return false;
        if(delayString.length()<4) return false;
        if(delayString.length()>5) return false;

        int indexDoublePoint = delayString.indexOf(':');
        if(indexDoublePoint<1) return false;
        if(indexDoublePoint>2) return false;

        if(indexDoublePoint==1) {
            if(!isInteger("" + delayString.charAt(0))) return false;
            if(!isInteger("" + delayString.charAt(2))) return false;
            if(!isInteger("" + delayString.charAt(3))) return false;
        }

        if(indexDoublePoint==2) {
            if(!isInteger("" + delayString.charAt(0))) return false;
            if(!isInteger("" + delayString.charAt(1))) return false;
            if(!isInteger("" + delayString.charAt(3))) return false;
            if(!isInteger("" + delayString.charAt(4))) return false;
        }

        return true;
    }


    public static int getTimeDifferenceInMinutes(String time1, String time2) {
        Date date1 = Util.convertStringTimeToDate(time1);
        Date date2 = Util.convertStringTimeToDate(time2);

        if((date1 == null) || (date2 == null)) return Integer.MIN_VALUE;

        long delayInMilliSeconds = date2.getTime() - date1.getTime();
        long delayInMinutes = delayInMilliSeconds / (1000*60);

        return (int)delayInMinutes;
    }
}
