package com.mycompany.app;


public class Primitives 
{
   public static int number = 1;
    public static int addInt (int x, int y){
        int res;
        res = 
        Math.addExact(x, x);
        ++res;
        return res;
    }
    public static double addDouble (double x, double y){
        double res;
        res = x+y;
        return res;
    }
    public static float addFloat (float x, float y){
		float res;
		res = x+y;
		res = Math.abs(res);
        return res;
    }
    public static long addlong (long x, long y){
		long res;
		res = x+y;
		res = Math.abs(res);
        return res;
    }
    public static int addshort (short x, short y){
		int res;
		res = Math.addExact(x,y);
		x++;
        return res;
    }
    public static char addchar (char x, char y){
		char res;
		res = x;
        return res;
    }
    public static byte addByte (byte x, byte y){
		byte res;
		byte [] i =  new byte[10];
		res = i[0];
        return res;
    }
    public static boolean addboolean (boolean x, boolean y){
		boolean res;
		res = Boolean.logicalOr(x, y);
        return res;
	}
}