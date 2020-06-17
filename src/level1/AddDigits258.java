package level1;
//
public class AddDigits258 {
	
	private int addDigits(int num) {
		
		if(num<10)return num;
		
		int sum=0;
		while(num>0) {
			
			sum =sum +num%10;
			num=num/10;
			
		} 
		num=sum;
		
		return addDigits(num);
		
		
	}

	public static void main(String[] args) {
		
		AddDigits258 obj = new AddDigits258();
		int num =38;
		int result = obj.addDigits(num);
		System.out.println(result);
		
	}



}
