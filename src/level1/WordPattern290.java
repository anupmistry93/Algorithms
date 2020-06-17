package level1;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {

	private boolean checkPattern(String pattern, String str) {

		Map<Character, String> map = new HashMap<>();

		String[] str1 = str.split(" ");
		
		if(str1.length!=pattern.length()) return false;
		
		for (int i = 0; i < pattern.length(); i++) {

			if (!map.containsKey(pattern.charAt(i))) {
				
				if(map.containsValue(str1[i])) return false;
				
				map.put(pattern.charAt(i), str1[i]);
				
			} else {
				
				String a = map.get(pattern.charAt(i));
				String b = str1[i];
				if (a.equals(b)) {
					continue;
				}

				else
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		WordPattern290 obj = new WordPattern290();

		String pattern = "abba";
		String str = "dog cat dog dog";

		boolean result = obj.checkPattern(pattern, str);

		System.out.println(result);
	}

}
