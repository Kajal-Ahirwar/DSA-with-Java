import java.util.*;

public class oddOrEven {
	
	public static void checkEvenOrAOdd(int n) {
		int bitMask = 1;
		if((n & bitMask) == 0) {
            System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		
		checkEvenOrAOdd(11);
		checkEvenOrAOdd(12);
	}
	
}
