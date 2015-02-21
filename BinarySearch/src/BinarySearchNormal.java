public class BinarySearchNormal {
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
		System.out.println(find(225));
	}

	public static int find(int key) {
		int upperBound = numbers.length - 1;
		int lowerBound = 0;
		int ele;
		while (true) {
			ele = (upperBound + lowerBound) / 2;
			if (numbers[ele] == key)
				return ele;
			else if (lowerBound > upperBound)
				return -1;
			else {
				if (numbers[ele] > key) {
					upperBound = ele - 1;
				} else {
					lowerBound = ele + 1;
				}
			}
		}
	}

}
