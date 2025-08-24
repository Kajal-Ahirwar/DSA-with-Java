public class largestInStrings {
	public static void main(String[] args) {
		String fruits[] = {"melon", "kiwi", "apple"};

		String largest = fruits[0];
		for(int i=1; i<fruits.length; i++) {
			if(largest.compareTo(fruits[i]) < 0) {
				largest = fruits[i];
			}
		}
		System.out.println(largest);   //find in lexicographic order
	}
}
