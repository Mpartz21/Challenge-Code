package com.example.Decmial.TeenNum;

public class TeenNumberChecker {
    public static boolean hasTeen(int type1, int type2, int type3) {

        if(type1 < 20 && type1 > 12){
            if(type2 < 20 && type2 > 12){
                if(type3 < 20 && type3 > 12){
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }
    public static boolean isTeen(int lol1){
        if(lol1 < 20 && lol1 > 12){
            return true;
        }
        return false;
    }
}
