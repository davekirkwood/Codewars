import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
	static String encode(String word) {
		
		Map<Character, Integer> charCounts = new HashMap<>();
		for(int i=0; i<word.length(); i++) {
			Character c = word.toUpperCase().charAt(i);
			if(!charCounts.containsKey(c)) {
				charCounts.put(c, 1);
			} else {
				charCounts.put(c, charCounts.get(c) + 1);
			}
		}
		
		String result = "";
		for(int i=0; i<word.length(); i++) {
			Character c = word.toUpperCase().charAt(i);
			if(charCounts.get(c) > 1) {
				result += ")";
			} else {
				result += "(";
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(DuplicateEncoder.encode("Prespecialized")); // )()())()(()()
		System.out.println(DuplicateEncoder.encode("   ()(   ")); 		// ))))())))
	}

}
