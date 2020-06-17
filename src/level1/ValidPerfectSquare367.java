package level1;

public class ValidPerfectSquare367 {
	
	private boolean find(long n) {
		
		 if(n ==1 || n==0) return true;
		
		long left =1;
		long right = n/2;
	
		while(left<=right) {
			
			long mid =  (left + right)/2;
			
			if(mid*mid== n) return true;
			
			else if(mid*mid>n) {  right = mid-1; }
			
			else if(mid*mid<n) {  left = mid+1;}
		
		}
	
		return false;
	}


	public static void main(String[] args) {
		
		ValidPerfectSquare367  obj = new ValidPerfectSquare367();
		
		long n =37;
		
		boolean result = obj.find(n);
		
		System.out.println(result);
				

	}


}
