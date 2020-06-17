package level1;

public class CountAndSay38 {
	
	private static String countAndSay(int n) {
		
		
		
		//StringBuilder str = new StringBuilder("1");
		String str = "1";
		
		while(n>1)
		{	
			
			StringBuilder strb = new StringBuilder();
			for(int i=0; i<str.length();i++) {//11
				
				//int j = i;
				int count = 1;
				while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
					
					 count++;
					 i++;			 
				}
				
				strb.append(count).append(str.charAt(i));
				
			}	
			
			 str= strb.toString();
			 n--;
		}
		
	    return str;
	}
	

	public static void main(String[] args) {
		
		
		CountAndSay38 obj = new CountAndSay38();
		
		int n = 3;
		
		String result = countAndSay(n);
		System.out.println(result);

	}



}
