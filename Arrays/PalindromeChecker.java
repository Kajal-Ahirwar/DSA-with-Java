public class PalindromeChecker {

	public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;  //this returns the last digit
            reversed = reversed * 10 + digit;
            x /= 10;     //x=x/10 which removes the last digit 
        }
        return original == reversed;
    }
    public static void main(String args[]) {
         int x = 122221;

		  PalindromeChecker checker = new PalindromeChecker();
		 boolean result = checker.isPalindrome(x);
		 
		 if (result) {
			 System.out.println(x + " is a palindrome.");
		 } else {
			 System.out.println(x + " is not a palindrome.");
		 }
    }
	
}
