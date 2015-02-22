package partition;

public class QuickSortWithInsertionSort {
	public static int[] numbers = new int[2000000];

	public static void main(String[] args) {

		for (int i = 0; i < 2000000; i++) {
			numbers[i] = (int) (Math.random() * 199);
		}

		quickSort(0, numbers.length - 1);

		for (int i : numbers) {
			System.out.println(i + " ");
		}
	}

	public static void quickSort(int left, int right) {
		// if less then three elements then manually sort them so stack memory
		// remain free
		if (right - left + 1 <= 30) {
			insertitionSort(left, right);
		} else {
			// find median and sort right most, left most and center element in
			// array
			int median = median(left, right);
			// partition from median
			int partition = partition(left, right, median);

			// quickSort for left partition
			quickSort(left, partition - 1);
			// quickSort for right partition
			quickSort(partition + 1, right);
		}
	}

	public static int median(int left, int right) {
		// find center of the array
		int center = (left + right) / 2;

		// compare left and center and sort
		if (numbers[left] > numbers[center])
			swap(left, center);

		// compare left and right and sort
		if (numbers[left] > numbers[right])
			swap(left, right);

		// compare center and right and sort
		if (numbers[center] > numbers[right])
			swap(center, right);

		// now put center to right - 1 position as center will be use to
		// partition the array
		swap(center, right - 1);
		return numbers[right - 1];
	}

	public static int partition(int left, int right, int pivot) {
		int leftPtr = left; // first element is already sorted in median so
							// start with next element, see while loop below
		int rightPtr = right - 1; // last element is already sorted in median so
									// start with second last element, see while
									// loop below

		while (true) {
			// as mentioned above start next to first to find larger then pivot
			while (numbers[++leftPtr] < pivot)
				;

			// start with second last to find smaller the pivot
			while (numbers[--rightPtr] > pivot)
				;

			// terminate the while if left move past the right as array is
			// partitioned
			if (leftPtr >= rightPtr)
				break;
			else {
				// if not then swap left and right elements for partition
				swap(leftPtr, rightPtr);
			}
		}
		// swap starting of partition with second last element which is median
		swap(leftPtr, right - 1);
		return leftPtr;
	}

	public static void swap(int one, int two) {
		int temp = numbers[one];
		numbers[one] = numbers[two];
		numbers[two] = temp;
	}

	public static void insertitionSort(int left, int right) {
		int inner, outer;
		int temp;

		for (outer = left + 1; outer < (right - left); outer++) {
			temp = numbers[outer];
			inner = outer;

			while (inner > left && numbers[inner - 1] >= temp) {
				numbers[inner] = numbers[inner - 1];
				inner--;
			}
			numbers[inner] = temp;
		}
	}
}
