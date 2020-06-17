package level1;

public class UglyNumber263 {
	
	private static boolean verifyUglyNumber(int num) {
		
 		if(num<=0) return false;
		
		
		while(num%2==0) {num=num/2;}  //    n/=2 --> n=n/2
		while(num%3==0) {num=num/2;}
		while(num%5==0) {num=num/2;}
		
		return num==1 ;
	}
	

	public static void main(String[] args) {
		
		int num = 360;
		
		boolean result = UglyNumber263.verifyUglyNumber(num);
		System.out.println(result);
	}



}
