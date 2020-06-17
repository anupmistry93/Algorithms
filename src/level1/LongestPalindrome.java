package level1;

public class LongestPalindrome {
	
	public int max_length = Integer.MIN_VALUE;
	
	
	public int longest(char[] a) {
		
		
		for(int i =1; i<a.length; i++)
		{
			
			int p =i-1; int q= i+1;
			
			while(p>=0 && q < a.length)
			{
				
				
				if(a[p]==a[q] && p>=0)
					{
					
						p--; q++;
						
						max_length= Math.max(max_length, q);
						continue;									
					}
				
				
				else break;
				
			}
			
		}
		return max_length;
		
		
	}
	
	
	

	public static void main(String[] args) {
		//char[] a= {'a','b','c','d','c','b','a'};
		
		char[] a= {'a','b','e','b','c','b','a'};
		 
		LongestPalindrome obj = new LongestPalindrome();
		int length = obj.longest(a);
		System.out.println(length);
		
		
	

}

	

}
