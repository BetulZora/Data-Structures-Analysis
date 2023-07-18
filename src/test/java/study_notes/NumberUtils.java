package study_notes;

import java.util.Arrays;

public class NumberUtils {

    public static void main(String[] args) {

        int number = 153;

        System.out.println("isNarcissistic(number) = " + isNarcissistic(number));


    }



    public static boolean isNarcissistic(int number) {
        // TODO replace with your code
        // function must break number into digits
        // must raise each digit to the power of total number of digits
        // must all values in the array
        // return false if the sum is the original number

        String numberAsString = ""+number;
        int power = numberAsString.length();
        String[] numberInDigits = numberAsString.split("");
        int[] digitsModified = new int[power];

        for(int k=0; k<power; k++){ // index of String and int array
            int newValue = 1;
            for(int i=1; i <= power; i++){ // raises it to the power
                newValue = newValue * Integer.parseInt(numberInDigits[k]);
            }

            digitsModified[k] = newValue;

        }

        // we have to add them together
        int sum =0;
        for( int p = 0; p < power; p++){

            sum = sum + digitsModified[p];

        }


        if (sum == number) {return true;}


        return false;
    }


}
