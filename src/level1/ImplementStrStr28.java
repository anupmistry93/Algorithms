package level1;

public class ImplementStrStr28 {

	private int intersection1(int[] num1, int[] num2) {
		
		int l1= num1.length;
		int l2= num2.length;
		
		for(int i =0;  i<=l1-l2; i++) {
			
			int j =0;
			for( j =0; j<l2 ;j++) {
				
				if(num1[i+j] != num2[j]) {
					
					break; 
				}
				
				
			}
			if(j==l2)return i;
	
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		
		ImplementStrStr28 obj = new ImplementStrStr28();
		
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {3,4};
		
		int result = obj.intersection1(num1,num2);
		System.out.println(result);
		

	}




}
