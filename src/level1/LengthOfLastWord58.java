package level1;

public class LengthOfLastWord58 {
	
	private int lengthLast(String str) {
		
		String[] s =  str.split(" ");
		
		return s[s.length-1].length();
		
		
		
		
	}

	public static void main(String[] args) {

		LengthOfLastWord58 obj = new LengthOfLastWord58();
		
		String str= "My name is AnupMistry";
		
		int result =obj.lengthLast(str);
		System.out.println(result);
		

		
	}



}
