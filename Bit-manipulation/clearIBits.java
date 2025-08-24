import java.util.*;

public class clearIBits {

	public static int clearIBits(int n, int i) {
		int bitMask = -1<<i;
		return n & bitMask;
	}
	public static void main(String[] args) {
		System.out.println(clearIBits(15, 2));
	}
}
