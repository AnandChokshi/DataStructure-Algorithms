package subset;

public class SubSet {
	public static void main(String arg[]) {
		System.out.println(subSet(5, 3));
	}

	public static int subSet(int n, int k) {
		if (k == n || k == 0) {
			return 1;
		} else {
			return subSet(n - 1, k - 1) + subSet(n - 1, k);
		}
	}
}
