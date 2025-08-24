public class substrings {

	public static String substrings(String str, int si, int ei) {
		String substr = "";
		for(int i=si; i<ei; i++) {
			substr += str.charAt(i);
		}
		return substr;
	}
	public static void main(String[] args) {
		String str = "KajalAhirwar";

		//1st approach
		System.out.println(substrings(str, 5, 12));

		//2nd inbuit & easy approach
		// System.out.println(str.substrings(0,6));
	}
}
