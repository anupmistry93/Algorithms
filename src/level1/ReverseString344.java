package level1;

public class ReverseString344 {
	
	private String reverse(String str) {
		
		String reverse = "";
		
		for(int i =str.length()-1; i>=0;i--) {
			
			reverse+= str.charAt(i);
			
		}
		
		return reverse;
	}

	public static void main(String[] args) {
		
		ReverseString344 obj = new ReverseString344();
		
		String str ="Anup is a good boy";
		
		String result = obj.reverse(str);
		
		System.out.println(result);

	}



}
