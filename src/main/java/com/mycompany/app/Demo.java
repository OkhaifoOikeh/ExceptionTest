package com.mycompany.app;

public class Demo {

    public static int getBigger(int x, int y) {
        int big;
        if (x > y) 
            big = y; // bug!
        else
            big = y;
        return big;
    }

    public static double getRandom() { // flaky test
        return Math.random();
    }
}