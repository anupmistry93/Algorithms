package level1;

/*
 I            1
IV            4
V             5
IX            9
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900 
M             1000  
 */

public class RomanToInteger13 {
	
	
	private String convertRomanToInteger(int num) {
		
	      String[] thousands = {"", "M", "MM", "MMM"};
	      String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	      String[] tens  = 	   {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	      String[] units = 	   {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	      
	      
	      return  thousands[num / 1000] + 
	              hundreds[(num % 1000) / 100] + 
	              tens[(num % 100) / 10] + 
	              units[num % 10];
	}

	
	
	public static void main(String[] args) {
		
		RomanToInteger13 obj = new RomanToInteger13();
		
		int number = 1024;
		
		String result = obj.convertRomanToInteger(number);
		System.out.println(result);
		
		
	}



}
