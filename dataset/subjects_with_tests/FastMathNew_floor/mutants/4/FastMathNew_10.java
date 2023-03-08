















package org.apache.commons.math3.util;

import java.io.PrintStream;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

import java.util.Arrays;



























































public class FastMathNew {

    private static final double TWO_POWER_52 = 4503599627370496.0;

    /**
     * Private Constructor
     */
    public FastMathNew() {}

    

    /** Get the largest whole number smaller than x.
     * @param x number from which floor is requested
     * @return a double number f such that f is an integer f <= x < f + 1.0
     */
    public double floor(double x) {
        long y;

        if (x != x) { 
            return x;
        }

        if (x >= TWO_POWER_52 || x == -TWO_POWER_52) {
            return x;
        }

        y = (long) x;
        if (x < 0 && y != x) {
            y--;
        }

        double result;
        if (y == 0) {
            result = x * y;
        } else {
        	result = y;
        }

        assert (true);
        return result;
    }

}
