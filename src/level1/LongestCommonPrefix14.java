package level1;

public class LongestCommonPrefix14 {
	
	private String findPrefix(String[] input) {
				
		String prefix = input[0];
		
		for(int i =1; i<input.length; i++) {
			
			while(input[i].indexOf(prefix)!=0) {
				
				prefix = prefix.substring(0, prefix.length()-1);
				
			}
			
		}
		
		return prefix;
	}
	

	public static void main(String[] args) {
		
		LongestCommonPrefix14 obj = new LongestCommonPrefix14();
		
		String[] input = {"flower","flow", "flight"};
		
		String result = obj.findPrefix(input);
		System.out.println(result);
		

	}



}
