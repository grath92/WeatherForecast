package com.gopalkrath.weatherforecast;


public class Utility {

    public static String convertTempFtoC (String tempValueInF) {

        int valueInInt = Integer.parseInt(tempValueInF);
        int finalAns = (valueInInt - 32) * 5/9;

        return Integer.toString(finalAns);
    }
}
