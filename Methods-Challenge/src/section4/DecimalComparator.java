package section4;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        // casting as int is done to make sure numbers after decimal point get deleted.
        // more advanced java libraries are available to perform this function

        if ( (int) (firstNumber * 1000) == (int) (secondNumber * 1000) ){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        boolean firstTest = areEqualByThreeDecimalPlaces(3.1223D,3.544D);
        System.out.println(firstTest);
    }
}
