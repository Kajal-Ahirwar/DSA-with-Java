import java.util.*;

//Linear Search
public class linearSearch {

	public static int linearSearch(int numbers[], int key) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int numbers[] = { 1, 4, 7, 9, 12, 15, 20 };
		int key = 9;

		int index = linearSearch(numbers, key);
		if (index == -1) {
			System.out.println("NOT FOUND!");
		} else {
			System.out.println("Key is at index " + index);
		}
	}
}
