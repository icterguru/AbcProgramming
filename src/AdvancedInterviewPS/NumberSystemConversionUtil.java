package AdvancedInterviewPS;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumberSystemConversionUtil {

    /**
     * This example is convoluted as in reality it just uses 'toString' to convert the number...
     * However, it displays the logic needed to make the conversion...
     *
     * To convert a number to a new base, recursively return the remainder of the number
     * divided by the base for each operation until zero. Then return the concatenated value in reverse.
     *
     * Example convert 9 to base 2
     * 9    / 2 =    4 R 1
     * 4    / 2 =    2 R 0
     * 2    / 2 =    1 R 0
     * 1    / 2 =    0 R 1
     *
     * Answer :: 1001
     *
     * @param number :: Integer number to convert.
     * @param base  :: Base to convert to.
     * @return :: BigInteger of the number converted to the desired base.
     */
    static BigInteger convertBase( int number, int base ) {

        List<Integer> remainder = new ArrayList<>();

        int count = 0;
        String result = "";
        while( number != 0 ) {
            remainder.add( count, number % base != 0 ? number % base : 0 );
            number = number/ base;
            try {
                result += remainder.get( count );
            } catch( NumberFormatException e ) {
                e.getMessage();
            }
        }
        return new BigInteger( new StringBuffer( result ).reverse().toString() );
    }

    public static void main( String[] args ) {

        System.out.println( convertBase( 10, 8 ) );

    }
}