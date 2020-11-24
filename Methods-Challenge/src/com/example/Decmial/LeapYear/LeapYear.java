package com.example.Decmial.LeapYear;

public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean leap;

        if(year >= 1 && year <= 9999){
            leap = false;
        }else {
            leap = false;
            return leap;
        }

        if(year % 4 == 0){
            if (year % 100 == 0) {
                if(year % 400 == 0){
                    leap = true;
                    return leap;
                } else{
                    leap = false;
                    return leap;
                }
            }
            leap =true;
            return leap;
        }
return leap;
    }



    public static void main(String[] args) {
      boolean leap=  isLeapYear(1924);
        System.out.println(leap);
//      if(leap=true){
//          System.out.println(leap);
//      }

    }
}
