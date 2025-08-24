public class countingSort {

	public static void countingSort(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int count[] = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			while (count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
		countingSort(arr);
	}
}
