package level1;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Matcher;

public class Test {

	public static void main(String[] args) {
//		char a= '0'; // asci value
//		int b=   123;
//		String c = "1";
//		
//		String e = c+b;//(int + string = string)
//		String f = a + c;
//		System.out.println(e);
//		System.out.println(f);
//		
//		 int d = b-a; // int + char(ascii) = int. 	 
//		 System.out.println(d);
		
		
//	StringBuilder sb = new StringBuilder();// it takes only string, initially empty string  
//	   sb.append('a'); // we can appent int , string or char
//	   sb.append("b");
//	   System.out.println(sb);
//	   
//	   int[] h = new int[] {1,2,3,4};
//	   int[] i = new int[10] ;	   
//	   int[][] k = new int[][] {{1,2,4},{3,2,6},{5,2,8}};	   
//	   System.out.println(k[2][2]);
	
//		char ch1 = "a1cd".charAt(1);
//		int ch =1;
//		int ascii = (int)ch;
//		System.out.println(ascii);
		
		
//		Boolean b = Pattern.matches("\\d", "1");
//		Boolean b1 = Pattern.matches("\\D", "A");
//		Boolean b2 = Pattern.matches("..CD", "ASCD");
//		Boolean b3 = Pattern.matches("[A-Z][JK]", "IK");
//		Boolean b4 = Pattern.matches("^I$", "IK");
//		Boolean b5 = Pattern.matches("[MS][a-z]{5}", "Monica");
//		Boolean b6 = Pattern.matches("[a-z]+", "xxxyyyzz");
//		Boolean b7 = Pattern.matches("^[A-Z].", "AV");
//		Boolean b8 = Pattern.matches("^[A-Z].[a-z]$", "AVa");
//		Boolean b9 = Pattern.matches("[^A-Z].", "1V");
//		System.out.println(b);
//		System.out.println(b1);
//		System.out.println(b3);
//		System.out.println(b8);
		
//		String str = "Samsunga";
//		System.out.println(str.indexOf(""));
//		System.out.println(str.substring(1,str.length()));

//**********************QUEUE***********************************
//	   Queue<Integer> queue = new LinkedList<>();
//	   
//	   System.out.println(queue.offer(10)); //offer() will return false if it fails to insert the element on a size restricted Queue, whereas add() will throw an IllegalStateException.
//	   System.out.println(queue.isEmpty());
//	   System.out.println(queue.add(2));
//	   System.out.println("-"+ queue.peek()); // returns head of the queue
//	   System.out.println(queue.poll());  //returns and removes the element at the front the container..when the Queue is empty, it returns null 
//	  
//	   for(int q: queue) {System.out.println(q);}
	   
//**********************Stack(it extends vector class)*********************************************** 
	   
//	   Vector<Integer> stack = new Stack<>();
//	   Stack<Integer> stack1 = new Stack<>();
//	   
//	   stack1.push(1); stack1.push(2); stack1.push(3); 
//	   System.out.println(stack1.push(4));
//	   System.out.println(stack1.pop()); //pop head of the stack and return the same
//	   System.out.println(stack1.peek()); // return head of the queue withoud popping
//	   stack1.isEmpty();
	   

		
		
//		StringBuilder str = new StringBuilder("abfhdaha");
//
//		for(int i=0 ; i<str.length(); i++) {
//			
//			System.out.println(str.charAt(i));
			//str.append("a");
//	}
			
//		
//*********************************************************************
		
//		char[] count = new char[5];
//		
//		for(char c: count)System.out.println(c);
		
//***************************************************************
		
		int i=0;
		int j=0;
		if(--i<0) {System.out.println(2);}
		if(j--<0) {System.out.println(2);}
		
	}

}
