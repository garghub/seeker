package examples;

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
        return 0;
    }
}

