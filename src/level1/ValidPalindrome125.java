package level1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidPalindrome125 {
	
	
	private Boolean checkPalindrome1(String str) {
		
		int i,j;
		String newStr1 ="";
		String newStr2 ="";
		for(i =(str.length()-1) ,j=0; i>=0 && j<str.length(); i--, j++) {
			
			String ch =Character.toString(str.charAt(i));	
			Boolean b = Pattern.matches("[a-zA-Z]", ch);
			
			String ch1 =Character.toString(str.charAt(j));	
			Boolean b1 = Pattern.matches("[a-zA-Z]", ch1);
			
			if(b) {newStr1= newStr1+ch;}
			if(b1) {newStr2= newStr2+ch1;}
			
			
		}
		System.out.println(newStr2);
		System.out.println(newStr1);
		
		
		
		return newStr1.equals(newStr2);
	}
	
	
	private Boolean checkPalindrome2(String str) {
		
		int i,j;
		String newStr1 ="";
		String newStr2 ="";
		for(i =(str.length()-1) ,j=0; i>=0 && j<str.length(); i--, j++) {
			
			int ch =str.charAt(i);	
			if( (95<ch && 123>ch) || (64<ch && 91>ch) ){newStr1= newStr1+ch;}
			
			int ch1 =str.charAt(j);	
			if( (95<ch1 && 123>ch1) || (64<ch1 && 91>ch1) ){newStr2= newStr2+ch1;}			
			
		}
		
		System.out.println(newStr2);
		System.out.println(newStr1);
		
		return newStr1.equals(newStr2);
	}
	
	

	public static void main(String[] args) {
		
		ValidPalindrome125 obj = new ValidPalindrome125();
		String str = "abfgwg fba ";
		
//		Boolean bol= obj.checkPalindrome1(str);		
//		System.out.println(bol);
		
		Boolean bol1= obj.checkPalindrome2(str);		
		System.out.println(bol1);

	}



}
