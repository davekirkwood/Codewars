package net.davekirkwood.codewars.kyu5;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

	public static boolean scramble(String str1, String str2) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char c : str1.toCharArray()) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		for(char c : str2.toCharArray()) {
			
			if(!charMap.containsKey(c)) {
				return false;
			}
			if(charMap.get(c) == 1) {
				charMap.remove(c);
			} else {
				charMap.put(c, charMap.get(c) - 1);
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Scramblies.scramble("rkqodlw", "world"));
		System.out.println(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
		System.out.println(Scramblies.scramble("katas", "steak"));
	}
	

}
