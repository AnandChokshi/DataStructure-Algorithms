package shellSortAndInsertionSort;

public class ShellSort {

	public static void main(String[] args) {
		int[] a = { 10, 2, 5, 11, 8, 9, 12, 15, 6, 7, 10, 2, 5, 11, 8, 9, 12,
				15, 6, 7 };
		shellSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void shellSort(int[] a) {
		int inner, outer;
		int temp;

		int h = 1;
		while (h <= a.length / 3)
			h = h * 3 + 1;

		while (h > 0) {
			for (outer = h; outer < a.length; outer++) {
				temp = a[outer];
				inner = outer;
				while (inner > h - 1 && a[inner - h] >= temp) {
					a[inner] = a[inner - h];
					inner -= h;
				}
				a[inner] = temp;
			}
			h = (h - 1) / 3;
		}
	}
}
