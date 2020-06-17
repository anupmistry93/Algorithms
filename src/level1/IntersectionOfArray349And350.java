package level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfArray349And350 {

	private int[] intersection1(int[] num1, int[] num2) {
		
		
		Set<Integer> set = new TreeSet<>();
		Set<Integer> set1 = new TreeSet<>();
		
		
		for(int c: num1) {
			set.add(c);
		}
				
		for(int c:num2) {			
			if(set.contains(c)) {				
				set1.add(c);			
			}
		}
		
		
		int[] result= new int[set1.size()] ;	
		int i =0;
		for(int c: set1) { result[i]=c; i++;}
	
		return result;
		
}
	
	private int[] intersection2(int[] num1, int[] num2) {
		
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		
		
		for(int c: num1) {
			list.add(c);
		}
				
		for(int c:num2) {			
			if(list.contains(c)) {				
				list1.add(c);			
			}
		}
		
		
		int[] result= new int[list1.size()] ;	
		int i =0;
		for(int c: list1) { result[i]=c; i++;}
	
		return result;
		
}
	
	
	private int[] union(int[] num1, int[] num2) {
		
		
		List<Integer> list = new ArrayList<>();
		
		
		
		for(int c: num1) {
			list.add(c);
		}
				
		for(int c:num2) {			
			if(!list.contains(c)) {				
				list.add(c);			
			}
		}
		
		
		int[] result= new int[list.size()] ;	
		int i =0;
		for(int c: list) { result[i]=c; i++;}
	
		return result;
		
}
	
	
	
	public static void main(String[] args) {
	
		IntersectionOfArray349And350  obj = new IntersectionOfArray349And350 ();
		
		int[] num1 = {1,2,3,4,5,3};
		int[] num2 = {3,4};
		
//		int[] result = obj.intersection1(num1,num2);	
//		for(int c: result)
//		System.out.println(c);
//		
//		
//		int[] result1 = obj.intersection2(num1,num2);		
//		for(int c: result1)
//		System.out.println(c);
		
		int[] result2 = obj.union(num1,num2);
		for(int c: result2)
		System.out.println(c);
		
	}

}
