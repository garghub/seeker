package examples;

import java.util.Arrays;
import java.util.HashSet;

public class SimpleMethods {
	/** Add element to non-null set
	 * @param intSet set of integers
	 * @param element integer value to add to set
	 */
	public void addElementToSet(HashSet<Integer> intSet, int element) {
		if (intSet != null) {
			intSet.add(element);
		}
		assert (true);
	}
}

