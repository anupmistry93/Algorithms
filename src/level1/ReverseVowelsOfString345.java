package level1;

public class ReverseVowelsOfString345 {
	
	private boolean isVowel(char c) {
		
		
		return c=='a' || c=='e' ||c=='i'||c=='o'||c=='u' ||
				c=='A' || c=='E' ||c=='I'||c=='O'||c=='U';
	
		
	}

	
	private String reverseVowel(String str) {
		

		 char[] str1 = str.toCharArray();
			
			int i=0;
			int j= str1.length-1;
			
		while(i<=j) {

			if(!isVowel(str1[i])) {
				
				i++;
				continue;
			}
			if(!isVowel(str1[j])) {
							
				j--;
				continue;
			}
			
			char temp =str1[i];
			str1[i]=str1[j];
			str1[j]= temp;
			 i++;
			 j--;
		}
		
		  String reverse = String.copyValueOf(str1); 
		
		return reverse;
	}


	public static void main(String[] args) {
		
		ReverseVowelsOfString345 obj = new ReverseVowelsOfString345();
		
		String str = "leetcode";
		
		String reverse = obj.reverseVowel(str);
		
		System.out.println(reverse);

	}


}
