package level1;

public class NimGame292 {

	private static boolean findWinner(int n) {
		
		 return (n%4 !=0);
	}
	public static void main(String[] args) {
		
		int n= 13;
		boolean result =findWinner(n);
		System.out.println(result);

	}



}
