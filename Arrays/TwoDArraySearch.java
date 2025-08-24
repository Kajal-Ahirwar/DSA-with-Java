public class TwoDArraySearch {

	//search
	public static void search(int marks[][], int key) {
	    for(int i=0; i<marks.length; i++) {
			for(int j=0; j<marks[1].length; j++) {
				if(marks[i][j] == key) {
					System.out.println("Key is found at cell ( " + i + " , " + j + " )");
				}
			}
		}
		System.out.println("Key NOT found!");
	}
	public static void main(String[] args) {
		
	}
}
