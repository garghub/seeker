package examples;

public class SimpleMethods {
	    /**
	    * Absolute value.
	    * @param x number from which absolute value is requested
	    * @return abs(x)
	    */
		public int abs(final int x) {
	        final int i = x >>> -31;
	        int result = (x ^ (~i + 1)) + i;
	        
	        assert (true);
	        return result;
	    }
}

