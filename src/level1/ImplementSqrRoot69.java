package level1;

public class ImplementSqrRoot69 {

		
		private int sqrRoot(int n) {
			
	        
				 if(n ==1 || n==0) return n;
				
				int left =1;
				int right = n/2;
	        
				while(left<=right) {
					
				
	                int  mid = (right+left)/2 ;
					
					if(mid== n/mid) return mid;
					
					else if(mid>n/mid) {  right = mid-1; }
					
					else if(mid<n/mid) {  left = mid+1;}
					
					
				}
				
				
				
				return right;
		}
		
	
	
	public static void main(String[] args) {
	
		ImplementSqrRoot69 obj = new ImplementSqrRoot69();
		
		int n =36;
		int result =(int) obj.sqrRoot(n);
		System.out.println(result);
		
	}


}
