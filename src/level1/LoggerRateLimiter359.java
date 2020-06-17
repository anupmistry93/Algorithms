package level1;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter359 {
	
	public Map<String, Integer> map;
	
	public LoggerRateLimiter359() {
		
		map =  new HashMap<>();
		
	}
	
	
	public boolean shouldPrintMessage(int timestamp, String message) {
		
		if(map.containsKey(message)) {
			
			int diff = timestamp-map.get(message);
			
			if(diff>=10) {
				map.put(message, timestamp);
				return true;
			}
		}
		
		else {
			
			map.put(message, timestamp);
			return true;
		}
		
		return false;
	}
	
	

	public static void main(String[] args) {
	
		LoggerRateLimiter359 obj= new LoggerRateLimiter359();
		
		System.out.println(obj.shouldPrintMessage(1, "foo"));
		System.out.println(obj.shouldPrintMessage(2, "bar"));
		System.out.println(obj.shouldPrintMessage(3, "foo"));
		System.out.println(obj.shouldPrintMessage(8, "bar"));
		System.out.println(obj.shouldPrintMessage(10, "foo"));
		System.out.println(obj.shouldPrintMessage(11, "foo"));
		
	}

}
