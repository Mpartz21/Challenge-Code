package com.section5.CodeEx18;
/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to the solution code.
 */

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        boolean multipleSameDigits = true;
        int firstDigitFirstNum = 0;
        int lastDigitFirstNum = 0;
        int firstDigitSecondNum = 0;
        int lastDigitSecondNum = 0;

        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            multipleSameDigits = false;
            return multipleSameDigits;
        }
        lastDigitFirstNum = firstNumber % 10;
        lastDigitSecondNum = secondNumber % 10;

        while (firstNumber >= 10) {
            firstNumber /= 10;
        }
        firstDigitFirstNum = firstNumber;

        while (secondNumber >= 10) {
            secondNumber /= 10;
        }
        firstDigitSecondNum = secondNumber;

        if(firstDigitFirstNum==firstDigitSecondNum
        ||firstDigitFirstNum==lastDigitSecondNum
        ||lastDigitFirstNum==firstDigitSecondNum
        ||lastDigitFirstNum==lastDigitSecondNum){
            return multipleSameDigits;
        }else{
            multipleSameDigits = false;
        }

        return multipleSameDigits;
    }

    public static void main(String[] args) {
        boolean test = hasSharedDigit(12,23);
        System.out.println(test);
    }
}
