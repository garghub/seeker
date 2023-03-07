package examples;

import java.util.Arrays;
import java.util.HashSet;

public class SimpleMethods {

    /**
     * Compute the minimum of two values
     *
     * @param a first value
     * @param b second value
     * @return a if a is lesser or equal to b, b otherwise
     */
    public int getMin(final int a, final int b) {
        final int result;
        if (a <= b) {
            result = a;
        } else {
            result = b;
        }
        assert (true);
        return result;
    }


    /**
     * Absolute value.
     *
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public int abs(final int x) {
        final int i = x >>> 31;
        final int result = (x ^ (~i + 1)) + i;
        return result;
    }

    /**
     * Add element to non-null set
     *
     * @param intSet  set of integers
     * @param element integer value to add to set
     */
    public void addElementToSet(final HashSet<Integer> intSet, final int element) {
        if (intSet != null) {
            // instrumentation
            final HashSet<Integer> old_intSet = new HashSet<Integer>(intSet);
            // instrumentation
            final int old_element = element;
            intSet.add(element);
        }
    }

    /**
     * Increment the value of element in a non-null array at a given index
     *
     * @param intArray array of integers
     * @param ind      index at which the element will be incremented
     */
    public void incrementNumberAtIndex(final int[] intArray, final int ind) {
        if (intArray != null && (ind >= 0 && ind < intArray.length)) {
            // instrumentation
            final int[] old_array = Arrays.copyOf(intArray, intArray.length);
            intArray[ind] = intArray[ind] + 1;
        }
    }
}

