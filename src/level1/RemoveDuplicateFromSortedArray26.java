package level1;

public class RemoveDuplicateFromSortedArray26 {

	private int removeDuplicate(int[] nums) {
		
		int j =0;
		for(int i =0; i<nums.length; i++) {
			
			if(nums[j]!= nums[i]) {
				j++;
				nums[j] = nums[i];
				
			}
			
		}
		
		
		return j+1;
	}
	
	
	public static void main(String[] args) {
		
		RemoveDuplicateFromSortedArray26  obj = new RemoveDuplicateFromSortedArray26();
		
		int[] nums = {1,1,2,3,4,5,6,6};
		
		int result = obj.removeDuplicate(nums);
		
		System.out.println("length of final array: "+ result);
		
		for(int i: nums) {
			System.out.print(i+",");
		}

	}



}
