package level1;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram242 {

	private static boolean checkAnagram(String s, String t) {
		
		 if(s.length()!=t.length()) return false;
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
	
		
		for (Character c : s.toCharArray()) {

			list1.add(c.toString());
		}

		for (Character d : t.toCharArray()) {

			list2.add(d.toString());
		}

		for (String e : list1) {

			if (list2.contains(e)) {

				list2.remove(e);
			}
		}
		return list2.size() == 0;
	}
	
	private static boolean checkAnagram1(String s, String t) {
		
	    if(s.length()!=t.length()) return false;
		
		int[] count = new int[26];
		
		for(int i =0; i<s.length(); i++) {
			
			count[s.charAt(i)- 'a']++;
			count[t.charAt(i)- 'a']--;		
		}
		
		for(int c: count) {
			
			if(c!=0) return false;
		}
		
      
		return true;
	}

	public static void main(String[] args) {

		String s = "anagram";
		String t = "nagaram";

		boolean result = checkAnagram1(s, t);
		System.out.println(result);

	}

}
