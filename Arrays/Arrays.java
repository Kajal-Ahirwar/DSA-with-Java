import java.util.*;

public class Arrays {

	// public static int binarySearch(int numbers[], int key) {
	// int start = 0, end = numbers.length - 1;
	// while(start <= end) {
	// int mid = (start+end)/2;
	// //comparisons
	// if(numbers[mid] == key) {
	// return mid;
	// }
	// if(numbers[mid] > key) { // left
	// end = mid - 1;
	// } else {
	// start = mid + 1;
	// }
	// }
	// return -1;
	// }
	// int first = 0, last = numbers.length - 1;
	// while(first < last) {
	// //swap
	// int temp = numbers[last];
	// numbers[last] = numbers[first];
	// numbers[first] = temp;
	// first++;
	// last--;
	// }
	// public static void pairs(int numbers[] ) {
	// int tp = 0;
	// for(int i=0; i<numbers.length; i++) {
	// int curr = numbers[i];
	// for(int j=i+1; j<numbers.length; j++) {
	// System.out.print("(" + curr + "," + numbers[j] + ") ");
	// tp++;
	// }
	// System.out.println();
	// }
	// System.out.println("Total pairs : " + tp);
	// }
	// public static void maxSubArraySum(int numbers[]) {
	// int currSum = 0;
	// int maxSum = Integer.MIN_VALUE;
	// int prefix[] = new int[numbers.length];
	// //Calculate prefix sum
	// for(int i=1;i<prefix.length; i++) {
	// prefix[i] = prefix[i-1] + numbers[i];
	// }
	// for(int i=0; i<numbers.length; i++) {
	// int start = i;
	// for(int j=i; j<numbers.length; j++){
	// int end = j;
	// currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
	// // for(int k=start; k<=end; k++) {
	// // currSum += numbers[k];
	// // }
	// System.out.println(currSum);
	// if(maxSum < currSum) {
	// maxSum = currSum;
	// }
	// }
	// }
	// System.out.println("Max sum = " + maxSum);
	// }
	// public static void kadanes(int numbers[]) {
	// int ms = Integer.MIN_VALUE;
	// int cs = 0;
	// for(int i=0; i<numbers.length; i++) {
	// cs = cs + numbers[i];
	// if(cs<0) {
	// cs = 0;
	// }
	// ms = Math.max(cs, ms);
	// }
	// System.out.println("Max sub Array sum is : " + ms);
	// }
	// public static int trappedRainwater(int height[]) {
	// int n = height.length;
	// //calculate left max boundary
	// int leftMax[] = new int[n];
	// leftMax[0] = height[0];
	// for(int i=1; i<n; i++) {
	// leftMax[i] = Math.max(height[i], leftMax[i-1]);
	// }
	// //calculate right max boundary
	// int rightMax[] = new int[n];
	// rightMax[n - 1] = height[n - 1];
	// for(int i=n-2; i>=0; i--) {
	// rightMax[i] = Math.max(height[i], rightMax[i+1]);
	// }
	// int trappedWater = 0;
	// //loop
	// for(int i=0; i<n; i++) {
	// //waterLevel = min(leftmax bound, rightmax bound)
	// int waterLevel = Math.min(leftMax[i], rightMax[i]);
	// //trapped water = waterlevel - height[i]
	// trappedWater += waterLevel - height[i];
	// }
	// return trappedWater;
	// }
	// public static boolean returnValue(int[] nums){
	// for(int i=0; i<nums.length; i++) {
	// for(int j=i+1; j<nums.length; j++) {
	// if(nums[i] == nums[j]) {
	// return true;
	// }
	// }
	// }
	// return false;
	// HashSet<Integer> set = new HashSet<>();
	// for(int i=0; i<nums.length; i++) {
	// if(set.contains(nums[i])) {
	// return true;
	// } else {
	// set.add(nums[i]);
	// }
	// }
	// return false;
	// }
	// public static int verifying(int nums[]) {
	// for(int i=0; i<nums.length; i++) {
	// if(nums[i] == 0) {
	// return i;
	// }
	// return -1;
	// }
	// return 1;
	// }
	// public static void bubbleSort(int nums[]) {
	// for(int turn=0; turn<nums.length-1; turn++) {
	// for(int j=0; j<nums.length-1-turn; j++) {
	// if(nums[j] > nums[j+1]) {
	// //swap
	// int temp = nums[j];
	// nums[j] = nums[j+1];
	// nums[j+1] = temp;
	// }
	// }
	// }
	// }
	public static void printNums(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void selectionSort(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			int minPos = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[minPos] > nums[j]) {
					minPos = j;
				}
			}
			// swap
			int temp = nums[minPos];
			nums[minPos] = nums[i];
			nums[i] = temp;
		}
	}

	public static void main(String[] args) {
		int nums[] = { 5, 3, 2, 6, 7, 4, 1 };
		// selectionSort(nums);
		// printNums(nums);
		// Scanner sc = new Scanner(System.in);
		// int nums[] = new int[10];
		// Scanner sc = new Scanner(System.in);
		// int nums[] = new int[10];
		// nums[0] = sc.nextInt();
		// nums[1] = sc.nextInt();
		// nums[2] = sc.nextInt();
		// nums[3] = sc.nextInt();
		// nums[4] = sc.nextInt();
		// int value = verifying(nums);
		// System.out.println(value);
		// nums[5] = sc.nextInt();
		// boolean value = returnValue(nums);
		// System.out.println(value);
		// int height[] = {4, 2, 0, 6, 3, 2, 5};
		// reverse(numbers);
		// for(int i=0; i<numbers.length; i++) {
		// System.out.print(numbers[i] + " ");
		// }
		// System.out.println();
		// pairs(numbers);
		// System.out.println(trappedRainwater(height));
	}

}
