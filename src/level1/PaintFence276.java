package level1;
//https://medium.com/@leetcodesolver/leetcode-problem-276-paint-fence-12e95234d6c
//https://www.programcreek.com/2014/05/leetcode-pain-fence-java/
public class PaintFence276 {
	
	
	private int totlWays(int n, int k) {
		
		if(n==0) return 0;
		if(n==1) return k;
		
		int same =k;
		int diff = k + k*(k-1);
		
		for(int i=3; i<=n;i++) {
			
			int same1= diff;
			int diff1 = (same+ diff)*(k-1);
			
			same=same1;
			diff =diff1;
			
			
		}
		
		return (diff);
	}
	
	

	public static void main(String[] args) {

		
		PaintFence276 obj = new PaintFence276();
		
		int n = 6;
		int k = 3;
		
		int result = obj.totlWays(n,k);
		System.out.println(result);
				
		

	}


}
