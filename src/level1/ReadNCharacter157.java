package level1;

public class ReadNCharacter157 {
	
	
	private String read4(String str, int n) {
		
		int i=0;
		String newString = "";
		
		while(i<n){
			
			newString += str.charAt(i);
			i++;
		}
		
		return newString;
	}

	public static void main(String[] args) {
		
		ReadNCharacter157 obj = new ReadNCharacter157();
		
		String str = "acvdres";
		int n = 3;
		String result = obj.read4(str,n);
		System.out.println(result);
		

	}



}
