package level1;

public class RemoveElement27 {
	
	private int remove(int[] nums, int target) {
		
		int n = nums.length;
		int i =0;
		while(i <n)
		{
			
			if(nums[i]==target)
			{
				nums[i]=nums[n-1];						
				n--;
			}
			
			else
			{
				i++;
			}
			
			
		}
		
		
		
		
		return n;
	}

	public static void main(String[] args) {
		
		RemoveElement27 obj = new RemoveElement27();
		
		int[] nums = {3,2,1,2,1,1,1,1};
		int target = 1;
		
		
		int result = obj.remove(nums, target);
		System.out.println("length of final array is: " + result);
		


		
		

	}

	

}
