import java.util.*;

public class binarySearch {

	public static int binarySearch(int numbers[], int key) {
		int start = 0, end = numbers.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			// comparisons
			if (numbers[mid] == key) {
				return mid;
			}
			if (numbers[mid] > key) { // left
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
        int numbers[] = {1, 3, 6, 8, 10, 15, 20};
		binarySearch(numbers, 10);
	}
}
