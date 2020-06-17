package level1;

public class PowerOfFour342 {
	
	private boolean powerOf(int n) {
		int r;
		while(n>1) {
			
			r= n% 4;
			n=n/4;
			
			
			if(r != 0) {return false;}
			
			
			
			
		}
		
		
		return true;
	}

	

	public static void main(String[] args) {

		PowerOfFour342 obj = new PowerOfFour342();
		
		int n =256;
		
		boolean result=obj.powerOf(n);
		System.out.println(result);
	}


}
