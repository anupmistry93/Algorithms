package level1;

public class PaintHouse256 {
	
	private static int minCost(int[][] cost) {

		int pCost = 0;

		for (int i = 0; i < cost.length; i++) {

			int minAmount = Math.min(cost[i][0], cost[i][1]);
			minAmount = Math.min(minAmount, cost[i][2]);
			pCost += minAmount;
		}

		return pCost;
	}


	public static void main(String[] args) {
		
		int[][] cost =  {{17,2,17},{16,16,5},{14,3,19}};
		
		int result = minCost(cost);
		System.out.println(result);
		
		
		

	}


}
