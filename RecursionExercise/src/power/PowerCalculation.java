package power;

public class PowerCalculation {
	public static void main(String[] args) {
		System.out.println(power(3, 18));
	}

	public static int power(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			int temp = power(x * x, y / 2);
			if (y % 2 != 0) {
				return temp*x;
			}
			return temp;
		}
	}
}