package level1;

public class StrobogrammaticNumber246 {
	
	public static char check(char ch) {
		
		if(ch =='0') return '0'; 
		if(ch =='1') return '1'; 
		if(ch =='6') return '9'; 
		if(ch =='8') return '8'; 
		if(ch =='9') return '6';
		
		return  'x';
			
	      }
	
	
	private static boolean checkNumber(int n) {
		
		String number = Integer.toString(n);
		String newNumber = "";
		
		for(int i=number.length()-1;i>=0 ;i--) {
			
			if(check(number.charAt(i))!='x') {
				
				newNumber += check(number.charAt(i));
			}
			
		}
		return number.equals(newNumber);
	}

	public static void main(String[] args) {
	
		int n = 69;
		
		boolean result = checkNumber(n);
		System.out.println(result);

	}



}
