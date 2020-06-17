package level1;

public class ClimbingStairs70 {
	
	private long totalSteps(int n) {
		
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		//dp[2]=3;
		
		for(int i=2; i<=n; i++) {
			
			dp[i]= dp[i-1]+dp[i-2]; //dp[i]= dp[i-1]+dp[i-2] + dp[i-3];
			
		}
		
		return dp[n];
				
	}
	
	private long totalSteps1(int n) {
		
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		//dp[2]=3;
		
		for(int i=2; i<=n; i++) {
			
			dp[i]= dp[i-1]+dp[i-2]; //dp[i]= dp[i-1]+dp[i-2] + dp[i-3];
			
		}
		
		return dp[n];
				
	}


	public static void main(String[] args) {
		
		ClimbingStairs70 obj = new ClimbingStairs70();
		int n= 40;
		long result =obj.totalSteps(n);
		System.out.println(result);
		
		

	}


}
