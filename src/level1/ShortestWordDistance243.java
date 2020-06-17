package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ShortestWordDistance243 {

	private static int ShortestDistance(String[] words, String word1, String word2) {

		int l1 = -1;
		int l2 = -1;
		int minDist = Integer.MAX_VALUE;
		for (int i=0; i<words.length;i++) {

			if (words[i] == word1) {

				l1 = i;
			}

			if (words[i] == word2) {

				l2 = i;
			}

			if (l1 != -1 && l2 != -2) {

				int min = Math.abs(l1 - l2);
				minDist = Math.min(min, minDist);
			}
		}
		return minDist;
	}
	
	public static void main(String[] args) {

		String[] words = { "practice", "makes", "perfect", "coding", "makes" };
		String word1 = "makes";
		String word2 = "coding";

		int result = ShortestDistance(words, word1, word2);
		System.out.println(result);

	}

}
