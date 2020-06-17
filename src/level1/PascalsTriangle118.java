package level1;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
	
	

	private List<List<Integer>> createTriangle118(int length) {
		
		
		List<List<Integer>>  triangle = new ArrayList<>();
	
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		triangle.add(row1);
		
		for(int i=1;i<length; i++) {
			
			List<Integer> previous_row = triangle.get(i-1);	
			
			List<Integer> current_row = new ArrayList<Integer>();
			
			current_row.add(1);
			
			for(int j=1;j<i; j++) {
				
				current_row.add(previous_row.get(j)+ previous_row.get(j-1));
			}
			
			
			current_row.add(1);
			triangle.add(current_row);
			
		}
		
		
		return triangle;
	}
	
	
	private List<Integer> createTriangle119(int length) {
		
		
		
	
		List<List<Integer>>  triangle = new ArrayList<>();
		
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		triangle.add(row1);
		
		for(int i=1;i<length; i++) {
			
			List<Integer> previous_row = triangle.get(i-1);	
			
			List<Integer> current_row = new ArrayList<Integer>();
			
			current_row.add(1);
			
			for(int j=1;j<i; j++) {
				
				current_row.add(previous_row.get(j)+ previous_row.get(j-1));
			}
			
			
			current_row.add(1);
			triangle.add(current_row);
			
		}
		
		
		return triangle.get(length-1);
	}
	
	private List<Integer> createTriangle120(int length) {
		
		
		List<Integer> current_row = new ArrayList<Integer>();
		current_row.add(1);
	
		int i=0;
		while(i<length) {
			
			List<Integer> previous_row = current_row;	
			List<Integer> current_row1 = new ArrayList<Integer>();
			 current_row = current_row1;
			current_row.add(1);
			
			for(int j=1;j<i; j++) {
				
				current_row.add(previous_row.get(j)+ previous_row.get(j-1));
			}
			
			
			current_row.add(1);
			previous_row= current_row;
			i++;
		}
		
		
		return current_row;
	}
	
	
	
	public static void main(String[] args) {
		
		
		PascalsTriangle118 obj = new PascalsTriangle118();
		
		int rows = 5;
		
		List<List<Integer>> result = obj.createTriangle118(rows);
		
		for(int i=0; i< rows;i++) {
			
			int t=i;
			while( t<rows-1) {
				System.out.print(" ");	
				t++;
			}
			
			for(int j =0; j<=i;j++) {
					
			int a =result.get(i).get(j);
			System.out.print(a);
			System.out.print(" ");
			
			}
					
			System.out.println(" ");
			
		}
		
		
		
		
		List<Integer> result1 = obj.createTriangle119(rows);
		
		
		
		
		
		
		//for(int i : result1) {System.out.print(i+",");}
		
		List<Integer> result2 = obj.createTriangle120(rows);
		
		//for(int i : result2) {System.out.print(i+",");}
		
		
	}






	

}
