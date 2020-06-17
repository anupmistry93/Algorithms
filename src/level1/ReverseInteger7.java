package level1;

public class ReverseInteger7 {

	private int reverseNumber(int number ) {
		int reverse;

		if (number == 0 || number>Integer.MAX_VALUE || number<Integer.MIN_VALUE) {
			return 0;
		}

		
			reverse = 0;
			int num = Math.abs(number);

			while (num > 0) {

				reverse = reverse * 10 + num % 10;
				num = num / 10;
			}

			if (number < 0) {
				reverse = 0 - reverse;
			}
		

		return reverse;
	}

	
	
	
	public static void main(String[] args) {
		int number = -21474;
		System.out.println("Original: " + number);

		ReverseInteger7 obj = new ReverseInteger7();
		int result = obj.reverseNumber(number);
		System.out.println("Reversed: " + result);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}

}
