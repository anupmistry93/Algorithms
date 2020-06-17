package level1;

public class PalindromeNumber9 {
	
	private boolean checkPalindrome(int number) {
		
		if(number<0 || number%10==0) {
			
			return false;		
		}
		
			int reverse =0;
			int num =number;
			while(num>0) {
				
				reverse = reverse*10 + num%10;				
				num = num/10;								
			}
			
			if(number==reverse) {return true;}
	
				
		return false;
		
	}

	
	

	public static void main(String[] args) {
		
		PalindromeNumber9 obj = new PalindromeNumber9();
		 int number = 12321;
		 
		 boolean result = obj.checkPalindrome(number);
		 
		 System.out.println(result);

	}

	
}
