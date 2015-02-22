package partition;

public class QuickSort {
	public static int[] numbers = new int[20];

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			numbers[i] = (int) (Math.random() * 199);
		}

		quickSort(0, numbers.length - 1);

		for (int i : numbers) {
			System.out.println(i + " ");
		}
	}

	public static void quickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			// partition with right most digit
			int partition = partition(left, right, numbers[right]);
			// quickSort left partition recursively
			quickSort(left, partition - 1);
			// quickSort right partition recursively
			quickSort(partition + 1, right);
		}
	}

	public static int partition(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		int temp;

		while (true) {
			// get left pointer to large number then pivot
			while (numbers[++leftPtr] < pivot)
				;

			// get right pointer to small number then pivot
			while (rightPtr > 0 && numbers[--rightPtr] > pivot)
				;

			// if leftPtr move past the right pointer then every digits are
			// partitioned
			if (leftPtr >= rightPtr)
				break;
			// else swap left and right pointer
			else {
				temp = numbers[leftPtr];
				numbers[leftPtr] = numbers[rightPtr];
				numbers[rightPtr] = temp;
			}
		}
		// after completion swap right most digit which is pivot with starting
		// of second partition which arrange that digit to its sorted position
		temp = numbers[leftPtr];
		numbers[leftPtr] = numbers[right];
		numbers[right] = temp;
		return leftPtr;
	}
}
