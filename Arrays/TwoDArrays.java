import java.util.*;
public class TwoDArrays {

	//largest
	public static int getLargest(int marks[][]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<marks.length; i++) {
			for(int j=0; j<marks[0].length; j++) {
		        if(largest < marks[i][j]) {
			        largest = marks[i][j];
		        }
		    }
	    }
		return largest;
	}

	//smallest
	public static int getSmallest(int marks[][]) {		
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<marks.length; i++) {
			for(int j=0; j<marks[0].length; j++) {
				if(smallest > marks[i][j]) {
					smallest = marks[i][j];
				}
			}
		}
		return smallest;
	}

	public static void main(String[] args) {

		//Input a 2D array
		System.out.println("Insert 3*3 2D array element: ");
		int marks[][] = new int[3][3];
        int n = marks.length, m = marks[1].length;    //or n=3, m=3

		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				marks[i][j] = sc.nextInt();
			}
		}

		//Output
		System.out.println("Output: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("largest : " + getLargest(marks));
		System.out.println("smallest : " + getSmallest(marks));
	}
}