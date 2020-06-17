package level1;

public class RangeSumQueryImmutable303 {
	
	private int sum(int[] nums, int j, int i) {
		
		int total=0;
		
		while(i<=j) {
			
			total = total+nums[i];
			i++;
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		
		RangeSumQueryImmutable303  obj = new RangeSumQueryImmutable303();
		
		int[] nums = {-2,0,3,-5,2,-1};
		int high =5;
		int low = 0;
		int result = obj.sum(nums,high, low);
		System.out.println(result);

	}
}
