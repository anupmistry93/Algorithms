package level1;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifference389 {
	
	private char find(String s, String t) {
		
		List<Character> list = new ArrayList<>();

		for (char ch : t.toCharArray()) {
			
			list.add(ch);
		}

		
		for (char ch : s.toCharArray()) {
			
			if (list.contains(ch))
				list.remove(list.indexOf(ch));
		}
		
		
		
		return list.get(0);
	}
	

	public static void main(String[] args) {
		
		FindTheDifference389 obj = new FindTheDifference389();
		
		
		String s ="abcdeaa";
		String t = "bcdaeaaf";
		
		char result =obj.find(s, t);
		System.out.println(result);

	}



}
