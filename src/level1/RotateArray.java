package level1;

public class RotateArray {
	
	
	
	private void rotateArray(int[] nums, int k) {
		
		int[] ReversedArr = reverseArray(nums, 0);		
		for(int i : ReversedArr ) {System.out.print(i);}

		System.out.println("");
		
		int[] RotatedArr = reverseArray(ReversedArr, k);		
	    for(int i : RotatedArr ) {System.out.print(i);}
	
	    System.out.println("");
	
	   int[] RotatedArr1 = reverseArray(RotatedArr, k+1);	
	   for(int i : RotatedArr1 ) {System.out.print(i);}

	}
	

	private int[] reverseArray(int arr[], int p) {
		
		
		int mid = (arr.length -p)/2;
		
		for(int i= p ; i<mid ; i++) {
			
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i+p];
            arr[arr.length - 1 - i +p] = temp;
				
		}
		return arr;
		
	}

	public static void main(String[] args) {
		
		RotateArray obj = new RotateArray();
		
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		 
		obj.rotateArray(nums, k);

	}


}
