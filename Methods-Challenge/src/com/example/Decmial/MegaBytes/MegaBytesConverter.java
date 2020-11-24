package com.example.Decmial.MegaBytes;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes< 0){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = kiloBytes/1024;

            int remainingKilos = kiloBytes%1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilos + "KB");
        }
    }



    public static void main(String[] args) {
        int firstTest = 5000;
        printMegaBytesAndKiloBytes(firstTest);
    }
}
