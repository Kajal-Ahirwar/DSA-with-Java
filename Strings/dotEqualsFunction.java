public class dotEqualsFunction {
	public static void main(String[] args) {
		String s1 = "Kajal";
		String s2 = new String("Kajal");

		if (s1.equals(s2)) {
			System.out.println("Strings are equal.");
		} else {
			System.out.println("Strings are not equal.");
		}
	}
}

//output: Strings are equal.
