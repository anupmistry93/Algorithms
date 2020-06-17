package level1;

public class RemoveDuplicateFromSortedArray26_alternate {

private int removeDuplicate(int[] nums) {
		
		int j =1;
		for(int i =1; i<nums.length; i++) {
			
			if(nums[j-1]!= nums[i]) {
				
				nums[j] = nums[i];
				j++;
				
			}
			
		}
		
		
		return j;
	}
	
	
	public static void main(String[] args) {
		
		RemoveDuplicateFromSortedArray26_alternate  obj = new RemoveDuplicateFromSortedArray26_alternate();
		
		int[] nums = {1,1,1,1,2,3,3,3,3,4,5,6,6,6};
		
		int result = obj.removeDuplicate(nums);
		
		System.out.println("length of final array: "+ result);
		
		for(int i: nums) {
			System.out.print(i+",");
		}

	}



}
