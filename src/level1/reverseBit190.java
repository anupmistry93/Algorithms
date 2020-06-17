package level1;

public class reverseBit190 {
	
	private int reverseBit(int number) {
			
		int  reversedBinary =0;
		
		while(number>0) {
			
			int digit = number%2;
			number = number/2;
			 reversedBinary  =  reversedBinary *10 + digit;			 
		}

		 
		int x=0;
		int decimal=0 ;
		while(reversedBinary>0) {
			
			int z = reversedBinary%10;
			decimal = decimal +  (int) (z*(Math.pow(2, x)));		
			reversedBinary = reversedBinary/10;
			
			x++;						
		}

		return decimal;
		
	}

	public static void main(String[] args) {
		
		reverseBit190 obj = new reverseBit190();
		
		//System.out.println(Integer.toBinaryString(234));
		int number = 234545665;
		
		int result = obj.reverseBit(number);
		System.out.println(result);
		
	}



}
