package mergeSort;

public class MergeSort {
	private static int[] numbers = { 1, 5, 9, 10, 4, 44, 5, 13, 7, 55, 90, 12,
			3, 33, 16 };
	private static int length = numbers.length;

	public static void main(String arg[]) {
		int[] workspace = new int[length];

		mergeSort(workspace, 0, length-1); // pass array, lowerBound, upperBound

		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int[] workspace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound)
			return;
		else {
			int mid = (lowerBound + upperBound) / 2; // find mid
			mergeSort(workspace, lowerBound, mid); // merge on first half
			mergeSort(workspace, mid + 1, upperBound); // merge on second half

			merge(workspace, lowerBound, mid + 1, upperBound); // combine
																// returned
																// result from
																// merge
		}
	}

	public static void merge(int[] workspace, int lowPtr, int highPtr,
			int upperBound) {
		int j = 0; // counter for workspace
		int lowerBound = lowPtr; // starting point of first array
		int mid = highPtr - 1; // end of first array
		int n = upperBound - lowerBound + 1; // total size of numbers to sort in
												// array

		// condition : until one of array reaches at the end
		while (lowPtr <= mid && highPtr <= upperBound) {
			if (numbers[lowPtr] < numbers[highPtr]) {
				workspace[j++] = numbers[lowPtr++];
			} else {
				workspace[j++] = numbers[highPtr++];
			}
		}

		// if first array is not yet empty
		while (lowPtr <= mid) {
			workspace[j++] = numbers[lowPtr++];
		}

		// if second array is not yet empty
		while (highPtr <= upperBound) {
			workspace[j++] = numbers[highPtr++];
		}

		// add result from workspace to origianl array
		for (j = 0; j < n; j++) {
			numbers[lowerBound + j] = workspace[j];
		}
	}
}
