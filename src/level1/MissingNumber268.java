package level1;

public class MissingNumber268 {
	
private static int findMissing(int[] input) {
	
	int total=0;
	int total1=0;
	for(int i=0;i<input.length;i++) {
		
		total+= input[i];
		total1+= i+1;
		
		
	}
		
		return total1-total;
	}

	public static void main(String[] args) {
	
		int[] input = {9,6,4,2,3,5,7,0,1};
		
		int result = findMissing(input);
		System.out.println(result);
	}

	

}
