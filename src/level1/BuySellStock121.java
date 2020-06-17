package level1;

public class BuySellStock121 {
	
	public int maxProfit = 0;
	
	
	private int profitAmount(int[] prices) {
		
		for(int i= 0; i<prices.length; i++) {
			
			int j =i+1;
			while(j<prices.length) {
				
				if(prices[i]<prices[j]) {
							
					maxProfit = Math.max(maxProfit,prices[j]-prices[i]);  //{7,1,5,3,6,4};
				}
				
				j++;
			}
			
			
			
			
		}
		
		
		return maxProfit;
	}
	
	

	public static void main(String[] args) {
		
		BuySellStock121 obj = new BuySellStock121();
		
		int[] prices = {1,5,3,6,4};
		
		int result = obj.profitAmount(prices);
		System.out.println(result);

	}

	

}
