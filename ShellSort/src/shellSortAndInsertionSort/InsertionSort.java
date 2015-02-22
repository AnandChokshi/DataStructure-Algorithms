package shellSortAndInsertionSort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 10, 2, 5, 11, 8, 9, 12, 15, 6, 7, 10, 2, 5, 11, 8, 9, 12,
				15, 6, 7 };
		insertionSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void insertionSort(int[] a) {
		int inner, outer;
		int temp;

		for (outer = 1; outer < a.length; outer++) {
			temp = a[outer];
			inner = outer;
			while (inner > 0 && a[inner - 1] > temp) {
				a[inner] = a[inner - 1];
				inner--;
			}
			a[inner] = temp;
		}
	}
}
