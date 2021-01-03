package com.section5.MinMaxChallenge;
/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0,max = 0;
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter number: ");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int nextInt = scanner.nextInt();


                if(first){
                   first = false;
                    min = nextInt;
                    max = nextInt;
                }

                if(nextInt > max){
                    max = nextInt;
                }

                if(nextInt < min){
                    min = nextInt;
                }
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min= " + min + " max= " + max );
        scanner.close();
    }
}
