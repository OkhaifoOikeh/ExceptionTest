package com.mycompany.app;

public class Objects {

    public static String createStringFrom(String x) {
		String str = x;
        return str;
    }
    public static String equalsStrings(String x, String y) {
        String str =  x.concat(y) + "!";
        return str;
    }
    public static String Factory(){
         return new String();
            
    }
} 