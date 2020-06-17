package level1;

import java.util.Set;
import java.util.TreeSet;

public class LongestPlaindrome409 {
	
	private int longestPalindrome(String str) {
		
		Set<Character> set = new TreeSet<>();
		int count =0;
		for(int i=0; i<str.length();i++) {
			
			if(set.contains(str.charAt(i))) {
				
				set.remove(str.charAt(i));
				count=count+2;
			}
			
			else {
				set.add(str.charAt(i));
				}
			
			
		}
		
		if(!set.isEmpty()) count++;
		return count;
	}


	public static void main(String[] args) {
		
		LongestPlaindrome409 obj = new LongestPlaindrome409();
		
		String str= "abccccddeeds";
		
		int result = obj.longestPalindrome(str);
		System.out.println(result);
		

	}


}
