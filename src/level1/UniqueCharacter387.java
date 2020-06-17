package level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UniqueCharacter387 {
	
	private int find(String str) {
		
		Map<Character, Integer> map = new TreeMap<>();
		Set<Character> set = new TreeSet<>();
		char ch;
		int output = Integer.MAX_VALUE;
		
		for(int i =0; i<str.length(); i++) {
			
			ch =str.charAt(i);			
			if(map.containsKey(ch) || set.contains(ch)) {
				 
				set.add(ch);
				map.remove(ch);			
			}
			
			else {
				map.put(ch,i);
			}
		}
		
		if(map.isEmpty()) return -1;
		
		Set<Map.Entry<Character,Integer>> se = map.entrySet();
		for(Map.Entry<Character,Integer> e: se) {
			
			output = Math.min(output, e.getValue());
			
			System.out.println(e.getKey()+"-"+ e.getValue());
		}
		
		return output;
	}

	public static void main(String[] args) {
		
		UniqueCharacter387  obj = new UniqueCharacter387();
		
		String str ="leetcoded";
		
		int result = obj.find(str);
		
		System.out.println("result:"+result);

	}



}
