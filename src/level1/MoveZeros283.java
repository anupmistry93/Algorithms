package level1;

public class MoveZeros283 {

	private void moveBit(int[] nums) {

		if (nums == null || nums.length == 0)
			return;

		int j = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {

				//swap
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j++] = temp;
				// j++

			}

		}
	}

	public static void main(String[] args) {

		MoveZeros283 obj = new MoveZeros283();

		int[] nums = { 0, 1, 0, 3, 12 };

		obj.moveBit(nums);

		for (int c : nums) {
			System.out.print(" " + c);
		}

	}

}
