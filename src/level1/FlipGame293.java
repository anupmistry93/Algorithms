package level1;

import java.util.ArrayList;
import java.util.List;

public class FlipGame293 {
	
	private List<String> allMoves(String s) {
		
		List<String> list = new ArrayList<>();

		for (int i = 0; i < s.length() - 1; i++) {
			String str = "";

			int t = 0;
			while (t < i) {
				str += s.charAt(t);
				t++;
			}

			if (s.charAt(i) == s.charAt(i + 1)) {

				if (s.charAt(i) == '+') {
					str += "--";
				}

				else {

					str += "++";
				}

				int k = i + 2;
				while (k < s.length()) {

					str += s.charAt(k);
					k++;
				}
				list.add(str);
			}

		}

		return list;
	}

	public static void main(String[] args) {
	
		FlipGame293 obj = new FlipGame293();
		
		String s ="++++-++---";
		
		List<String> result = obj.allMoves(s);
		
		for(String p : result) {
			
			System.out.println(p);
		}

	}


}
