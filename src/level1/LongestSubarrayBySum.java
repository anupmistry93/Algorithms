package level1;

//given array, return start and end index in another array where sum= target with maximum length of new array 

public class LongestSubarrayBySum {
	
	public int max_index = Integer.MIN_VALUE;
	
	private int[] findSum(int[] input, int target) {
		
		int[] result = new int[2];
		
		for(int i =0; i< input.length; i++) {
			
			int sum =0;
			int j = i;
			while(j <input.length) {
				
				sum = sum + input[j];
				
				if(sum==target)
				{
					
					if(max_index<j-i)
					{						
						result[0]= i; result[1]= j;						
						max_index = j-i;
						break;
					}				
				}
				
				j++;						
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		LongestSubarrayBySum obj = new LongestSubarrayBySum();
		
		int[] input = {7,1,1,1,2,2,7,5};
		int target = 7;
		
		int[] result = obj.findSum(input, target);
		
		for(int k : result) {System.out.println(k+ " ");}
		

	}



}
