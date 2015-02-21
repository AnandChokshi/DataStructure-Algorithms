package binarySearchRecursion;

public class BinarySearchRecursion {
	public static int[] numbers;

	public static void main(String[] args) {

		numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 25;
		}
		int i = 0;
		for (int x : numbers) {
			System.out.println(i++ + ":" + x);
		}
		System.out.println();
		System.out.println(find(225, 0, numbers.length - 1));
	}

	public static int find(int key, int lowerBound, int upperBound) {;
		int ele = (upperBound + lowerBound) / 2;
		if (numbers[ele] == key)
			return ele;
		else if (lowerBound > upperBound)
			return -1;
		else {
			if (numbers[ele] > key) {
				return find(key, lowerBound, ele - 1);
			} else {
				return find(key, ele + 1, upperBound);
			}
		}
	}
}
