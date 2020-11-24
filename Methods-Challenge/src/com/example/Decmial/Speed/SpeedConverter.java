package com.example.Decmial.Speed;


public class SpeedConverter {
    static long toMilesPerHour(double kilometersPerHour){
        long boii = 0;
        double converter = 0.621D;

        if(kilometersPerHour < 0){
            boii = -1;
        }else {
            boii = (long)Math.round(converter * kilometersPerHour);
        }
        return boii;
    }
    static void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long milesPerHours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHours +" mi/h");
        }
    }

    public static void main(String[] args) {
        double kilometersPerHour = 95.75D;
        long firstTest = toMilesPerHour(kilometersPerHour);

        System.out.println(firstTest);

        printConversion(kilometersPerHour);

    }
}
