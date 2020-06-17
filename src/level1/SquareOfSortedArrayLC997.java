package level1;

public class SquareOfSortedArrayLC997 {
	
	
	private int[] square(int[] nums) {
		
		int[] result = new int[nums.length];
		
		int i =0;
		int j = nums.length-1;
		int length = nums.length-1;;
		while(j>=i) {
			
			int a =nums[i]*nums[i];
			int b =nums[j]*nums[j];
			
			if(a>=b) {
				
				result[length] =a;
				i++;				
			}
			
			if(a<b) {
				
				result[length] =b;
				j--;				
			}
			
			length --;
			
		}
		
		return result;
	}


	public static void main(String[] args) {
		
		SquareOfSortedArrayLC997 obj = new SquareOfSortedArrayLC997();
		
		int[] nums = {-7,-3,2,5,6,9};
		
		int[] result =obj.square(nums);
		
		for(int k: result) {System.out.print(k+" ");}

	}



}
