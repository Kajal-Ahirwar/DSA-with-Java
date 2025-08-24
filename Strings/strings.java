import java.util.*;

public class strings {

	public static void printLetters(String name) {
        for(int i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}
	public static boolean isPalindrome(String str) {
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                //not a palindrome
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		////creating a string
		// String str = "abcd";
		// String str1 = new String("efg");
		// System.out.println(str + " " + str1);

        ////take string as a input
		// Scanner sc = new Scanner(System.in);
		// String name;
		// name = sc.nextLine();
		// System.out.println(name);

		////finding the length of the string
		// String name = "Kajal Ahirwar";
		// System.out.println(name.length());

        ////string concatenate
		// String firstString = "Kajal";
		// String lastString = "Ahirwar";
		// System.out.println(firstString + " " + lastString);

		////string charAt method
        // String name = "Kajal";
		// System.out.println(name.charAt(0));
		// System.out.println(name.charAt(1));
		// System.out.println(name.charAt(2));
		// System.out.println(name.charAt(3));
		// System.out.println(name.charAt(4));
                       //or
		// printLetters(name);

		////check if a string is a palindrome or not
       
		// String str = "nitin";
		// System.out.println(isPalindrome(str));
	}
}
