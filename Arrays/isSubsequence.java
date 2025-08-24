public class isSubsequence {

	public static void main(String[] args) {
		Solution solution = new Solution();

		// Example 1
		String s1 = "abc";
		String t1 = "ahbgdc";
		System.out.println("Is \"" + s1 + "\" a subsequence of \"" + t1 + "\"? " + solution.isSubsequence(s1, t1)); // true

		// Example 2
		String s2 = "axc";
		String t2 = "ahbgdc";
		System.out.println("Is \"" + s2 + "\" a subsequence of \"" + t2 + "\"? " + solution.isSubsequence(s2, t2)); // false

		// Example 3 (empty string)
		String s3 = "";
		String t3 = "ahbgdc";
		System.out.println("Is \"" + s3 + "\" a subsequence of \"" + t3 + "\"? " + solution.isSubsequence(s3, t3)); // true

		// Example 4 (both empty)
		String s4 = "";
		String t4 = "";
		System.out.println("Is \"" + s4 + "\" a subsequence of \"" + t4 + "\"? " + solution.isSubsequence(s4, t4)); // true
	}

	public static boolean isSubsequence(String s, String t) {
		// if (s.length() == 0)
		// return true;
		int i = 0, j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == s.length();
	}
}