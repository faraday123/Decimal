/**
 *  Name: Samuel Adams Adjin
 */

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        int castedNumber1 = (int) (firstNumber * 1000);
        int castedNumber2 = (int) (secondNumber * 1000);

        if (castedNumber1 == castedNumber2){
            return true;
        }else{
            return false;
        }
    }
}
