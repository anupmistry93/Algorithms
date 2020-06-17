package level1;

import java.util.LinkedList;
import java.util.Queue;

/*The remove() and poll() methods differ only in their behavior when the queue is 
empty: the remove() method throws an exception, while the poll() method returns
null.*/
public class MovingAverage346 {
	
	private Queue<Integer> queue;
	private int MaxSize;
	private double sum;
	
	
	public MovingAverage346(int size) {
		
		queue = new LinkedList<Integer>();
		MaxSize = size;
		sum=0.0;
		
	}
	
	private double next(int val) {
		
		if(queue.size()==MaxSize) {
			
			//sum -= queue.poll();
			sum -= queue.remove();
		}
		
		queue.add(val);
		sum += val;		
		return sum/queue.size() ;
	}
	
	

	public static void main(String[] args) {
		
		MovingAverage346 obj = new MovingAverage346(3);
		
		obj.next(2);
		obj.next(3);
		obj.next(4);
		
		double result =obj.next(1);
		System.out.println(result);
		
	}





}
