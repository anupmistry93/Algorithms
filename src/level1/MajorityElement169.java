package level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement169 {
	
	private int findElement(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int output =0;
		
		for(int i =0 ; i< nums.length ; i++) {
			
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			
			else {
				map.put(nums[i], map.get(nums[i])+1);
				
				if(map.get(nums[i])> nums.length/2) {
					   output = nums[i] ;
					   break;
				}
				
				}
			
		
		}

		return output;
		
	}
	
	

	public static void main(String[] args) {
		
		MajorityElement169 obj = new MajorityElement169();
		
		int[] nums = {2,1,1,3,3,4,4,4,4,4,4,};
		
		int result = obj.findElement(nums);
		
		System.out.println(result);

	}



}
