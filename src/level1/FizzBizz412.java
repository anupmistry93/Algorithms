package level1;
//
public class FizzBizz412 {
	
	private String[] fizzBizz(int n) {
		
		String[] output = new String[n];
		int i =0;
		
		 while( i <n) {
			
			if((i+1)%3==0) {
				
				 output[i]= "Fizz";
			}
			
			else if((i+1)%5==0) {
				
				 output[i]= "Bizz";
			}
			
			else {
				
				output[i] = Integer.toString(i+1);
			}
			
			i++;
			
		}
		
		
		return output;
	}
	
 
	public static void main(String[] args) {

		FizzBizz412 obj = new FizzBizz412();
		
		int n = 15;
		String[] result =obj.fizzBizz(n);
		
		for(String c: result) {
			
			System.out.println(c);
		}
		
	}



}
