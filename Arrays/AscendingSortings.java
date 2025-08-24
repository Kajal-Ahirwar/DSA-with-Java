import java.util.Arrays;

public class AscendingSortings {

	//Bubble Sort

	public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	//Selection Sort

	public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
			int minPosition = i;
			for(int j=i+1; j<arr.length; j++) {
                if(arr[minPosition] > arr[j]) {
					minPosition = j;
				}
			}
			//swapping
			int temp = arr[minPosition];
			arr[minPosition] = arr[i];
			arr[i] = temp;
		}
	}

	//Insertion sort 

	public static void insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int curr = arr[i];
			int prev = i-1;
			while(prev >= 0 && arr[prev] > curr) {             //finding the correct position to insert 
				arr[prev+1] = arr[prev];
				prev--;
			}

			arr[prev+1] = curr;            //Insertion 
		}
	}

	//Counting Sort

	public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int count[] = new int[max+1];
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			while(count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
		System.out.println("By Bubble sort : ");
		bubbleSort(arr);
		printArray(arr);
		System.out.println("\nBy Selection sort : ");
		selectionSort(arr);
		printArray(arr);
		System.out.println("\nBy Insertion sort : ");
		insertionSort(arr);
		printArray(arr);
		System.out.println("\nBy Inbuilt sort : ");            //Inbuilt sort
		Arrays.sort(arr);
		printArray(arr);
		System.out.println("\nBy Counting sort : ");
		countingSort(arr);
		printArray(arr);
	}
}
