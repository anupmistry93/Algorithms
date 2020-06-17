package level1;

public class AddBinary67 {
	
private String addBinary(String b1, String b2) {
	
	
	int l1= b1.length()-1;
	int l2 = b2.length()-1;
	int carry =0;
	int sum =0;	
	StringBuilder sb = new StringBuilder();
		
	while(l1>=0 || l2>=0) {
			
		sum = carry;
		if (l1>=0) sum+= b1.charAt(l1)- '0'  ;
		if (l2>=0) sum+= b2.charAt(l2) - '0';
		
		sb.append(sum%2);
		carry =sum/2;
		l1--;l2--;
				
	}
		
		if(carry!=0) sb.append(carry);
		return  sb.reverse().toString();// type of sb != String// we can use return type as StringBuilder also
	}
	


	public static void main(String[] args) {
		
		
		AddBinary67 obj = new AddBinary67();
		String b1 ="1011";
		String b2 ="1100";
	
		String result =obj.addBinary(b1, b2);	
		System.out.println(b1+ "+"+ b2 +"=" + result);

	}

	

}
