
public class JadenCasingStrings {

	public String toJadenCase(String phrase) {
		
		if(phrase == null) {
			return null;
		}
		
		if(phrase.isEmpty()) {
			return null;
		}
		
		for(int i=0; i<phrase.length(); i++) {
			if(i==0 || phrase.substring(i-1, i).equals(" ")) {
				
				String before = phrase.substring(0, i);
				String here = phrase.substring(i, i+1).toUpperCase();
				String after = phrase.substring(i+1);
				phrase = before + here + after;
			}
		}
		return phrase;
	}

	public static void main(String[] args) {
		System.out.println(new JadenCasingStrings().toJadenCase("here is my phrase."));
		System.out.println(new JadenCasingStrings().toJadenCase("a"));
		System.out.println(new JadenCasingStrings().toJadenCase("an a"));
		System.out.println(new JadenCasingStrings().toJadenCase(""));
		System.out.println(new JadenCasingStrings().toJadenCase(" "));
		System.out.println(new JadenCasingStrings().toJadenCase(null));
	}
	
	
}
