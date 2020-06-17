package level1;

import java.util.Map;
import java.util.TreeMap;

public class TwoSum1 {

	private int[] desiredSum(int[] nums, int sum) {
		
		Map<Integer, Integer> map= new TreeMap<>();
		
		for(int i=0; i<nums.length ; i++) {
			
			int complement = sum - nums[i];
			
			if(map.containsKey(complement)) {
				
			   return new int[] {map.get(complement), i};
			}
			
			else {
				
				map.put(nums[i], i);
			}
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		TwoSum1  obj = new TwoSum1();
		
		int[] nums = {2,7,11,15,3};
		int sum =5;
		
		int[] result = obj.desiredSum(nums, sum);
		
		for(int i: result) {
			System.out.println(i);
		}
		

	}

	

	

}
