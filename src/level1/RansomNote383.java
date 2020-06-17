package level1;

public class RansomNote383 {
	
	private static boolean checkRansomeNote(String str1, String str2) {
		
		int[] count =  new int[26];
		
		for(int i =0; i<str2.length();i++) {
			
			count[str2.charAt(i)-'a']++;
		}
		
		for(int j=0; j<str1.length();j++) {
			
			//int c = --count[str1.charAt(j)-'a'];
			if(--count[str1.charAt(j)-'a']<0) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String str1="abcd";
		String str2="abcdef";
		
		boolean result = checkRansomeNote(str1, str2);
		
		System.out.println(result);
		
		

	}



}
