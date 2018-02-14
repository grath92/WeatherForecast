package com.gopalkrath.weatherforecast;



public class Utility {

    private static final char DEGREE_SYMBOL = 0x00B0;

    public static final String STR_CLOUDY = "Cloudy";
    public static final String STR_PARTLY_CLOUDY = "Partly Cloudy";
    public static final String STR_MOSTLY_CLOUDY = "Mostly Cloudy";
    public static final String STR_SUNNY = "Sunny";

    public static String convertTempFtoC (String tempValueInF) {

        int valueInInt = Integer.parseInt(tempValueInF);
        int finalAns = (valueInInt - 32) * 5/9;

        return Integer.toString(finalAns) + DEGREE_SYMBOL + "C";
    }
}
