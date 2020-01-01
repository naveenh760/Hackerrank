package ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class Medium {

	static int[] matchingStrings(String[] strings, String[] queries) {
		int[] results = new int[queries.length];
		Map<String, Integer> stringFreq = new HashMap<String, Integer>();
		for (String string : strings) {
			if (stringFreq.containsKey(string)) {
				stringFreq.put(string, stringFreq.get(string) + 1);
			} else {
				stringFreq.put(string, 1);
				;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			if (stringFreq.containsKey(queries[i])) {
				results[i] = stringFreq.get(queries[i]);
			} else {
				results[i] = 0;
			}
		}

		return results;
	}

}
