

	// Q.no. = 1
	// For a given convert each of the first letter of each word to uppercase.
	// T.E. = O(n)
	// public static String toUppeCase(String str) {
	// StringBuilder sb = new StringBuilder("");

	// // first convert the first letter to uper case
	// char ch = Character.toUpperCase(str.charAt(0));
	// sb.append(ch);

	// for(int i=1; i<str.length(); i++) {
	// if(str.charAt(i) == ' ' && i<str.length()-1) {
	// sb.append(str.charAt(i));
	// i++;
	// sb.append(Character.toUpperCase(str.charAt(i)));
	// } else {
	// sb.append(str.charAt(i));
	// }
	// }
	// return sb.toString();
	// }
	// public static void main(String[] args) {
	// String str = "hi i am kajal";
	// System.out.println(toUppeCase(str));
	// }

	// Q.no. = 2
	// String Compression
	// T.C. = O(n)

	// public static String stringCompression(String str) {
	// StringBuilder sb = new StringBuilder("");

	// for (int i = 0; i < str.length(); i++) {
	// Integer count = 1;
	// while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
	// count++;
	// i++;
	// }
	// sb.append(str.charAt(i));
	// if (count > 1) {
	// sb.append(count.toString());
	// }
	// }
	// return sb.toString();
	// }

	// public static void main(String[] args) {
	// String str = "aabbcc";
	// System.out.print(stringCompression(str));
	// }

	// Q.no. = 3
	// count lowercase vowels occured in String entered by the user
	// T.C. =

	// public static int comparision(String str) {
	// StringBuilder sb = new StringBuilder("");

	// Integer count = 0;
	// for(int i=0; i<str.length(); i++) {
	// if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
	// str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	// count++;
	// } else {
	// return -1;
	// }
	// }
	// return count;
	// }
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// String str = sc.nextLine();

	// System.out.println(comparision(str));
	// }
	// you need treat n as an unsigned value

import java.util.Scanner;

public class Solution {
	public int reverseBits(int n) {
		return Integer.reverse(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
            int n = sc.nextInt();
            Solution example = new Solution();
            int result = example.reverseBits(n);
            System.out.println(result);
        }
        sc.close();
	}

	public String isSubsequence(String s4, String t4) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isSubsequence'");
	}
}