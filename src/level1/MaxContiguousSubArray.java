package level1;

public class MaxContiguousSubArray {

	public static int max_value = Integer.MIN_VALUE;

	public static int findMax(int[] arr) {

		int current_max = 0;
		for (int i = 0; i < arr.length; i++) {

			current_max = Math.max(current_max + arr[i], arr[i]);
			max_value = Math.max(current_max, max_value);
		}
		return max_value;
	}

	public static void main(String[] args) {
		int[] arr = { 2, -2, 3, 1, -3, 5 };

		int maxValue = MaxContiguousSubArray.findMax(arr);
		System.out.println("Maximum contiguous subarray sum is: " + maxValue);
	}
}
