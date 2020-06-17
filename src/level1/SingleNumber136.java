package level1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SingleNumber136 {
	
	private int checkSingleNumber(int[] nums) {
		
		Set<Integer> set = new TreeSet<>();

			for(int i =0; i<nums.length; i++)
			{
				if(set.contains(nums[i])) set.remove(nums[i]);
									
				else set.add(nums[i]);
					
			}
			
		
	      for (int i: set) return i;

			return 0;
			
		
		
	}

	public static void main(String[] args) {
		 SingleNumber136 obj = new SingleNumber136();
		 
		 int[] nums = {1,1,2,2,3,4,4,3,5,5,6};
		 
		 int result= obj.checkSingleNumber(nums);
		 System.out.println(result);
	}



}
