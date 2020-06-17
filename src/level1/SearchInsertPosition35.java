package level1;

public class SearchInsertPosition35 {
	
	
private static int returnIndex(int[] arr, int n) {
	
	int left =0;
	int right = arr.length-1;

	
	while(left<=right) {
		
		int mid = (left +right)/2;
		
		if(arr[mid]==n) {
			
			return mid;
		}	
		
		else if(arr[mid]>n) {
			
			right = mid-1;
			
			if(mid==0 && arr[mid]>n) return 0;
			
			if(arr[mid]>n && arr[mid-1]<n) return mid;
		}
		
		else if (arr[mid]<n ) {
			
			 left= mid+1;
			 
			 if(mid==arr.length-1 && arr[mid]<n) return arr.length;
			 
			 if(arr[mid]<n && arr[mid+1]>n ) return mid+1;
		}
		
		
	}
		
		return 0;
	}
	

	public static void main(String[] args) {
		
		SearchInsertPosition35 obj = new SearchInsertPosition35();
		
		int[] arr = {3,4,5,6,8,9};
		int n = 10;
		
		int result = returnIndex(arr,n);
		
		System.out.println(result);
		 

	}

	

}
