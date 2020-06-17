package level1;

public class FactorialTrailingZero172 {
	
	
	private int trailingZero(int n) {
		
	int x =5;
	int value =0;
	
	while(n/x!=0) {
		
		value = value+ n/x;
		x= x*5;
		
	}
	 return value;
	}


	public static void main(String[] args) {
		
		FactorialTrailingZero172 obj = new FactorialTrailingZero172();
		int n = 100;
		int result =obj.trailingZero(n);
		System.out.println(result);

	}


}
