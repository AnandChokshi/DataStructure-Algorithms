package partition;

public class Partition {
	public static int[] numbers = new int[20];

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			numbers[i] = (int) (Math.random() * 199);
		}
		// partition with pivot 
		System.out.println(partition(0, numbers.length - 1, 99));

		for (int i : numbers) {
			System.out.println(i + " ");
		}
	}

	public static int partition(int left, int right, int pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		int temp;

		while (true) {
			// get left pointer to larger number then pivot
			while (leftPtr < right && numbers[++leftPtr] < pivot);

			// get right pointer to smaller number then pivot
			while (rightPtr > left && numbers[--rightPtr] > pivot);

			// if left pointer move past right pointer then all arranged 
			if (leftPtr >= rightPtr)
				break;
			// otherwise swap left and right pointer data
			else {
				temp = numbers[leftPtr];
				numbers[leftPtr] = numbers[rightPtr];
				numbers[rightPtr] = temp;
			}
		}
		// return position of starting point of second partition 
		return leftPtr;
	}

}
