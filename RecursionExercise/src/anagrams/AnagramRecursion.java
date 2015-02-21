package anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramRecursion {
	static int size;
	static int count;
	static char[] arrayChar = new char[100];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		size = str.length();

		for (int i = 0; i < size; i++) {
			arrayChar[i] = str.charAt(i);
		}
		doAnagram(size);
	}

	public static void doAnagram(int newSize) {
		if (newSize == 1)
			return;
		for (int i = 0; i < newSize; i++) {
			doAnagram(newSize - 1);
			if (newSize == 2) {
				displayWord();
			}
			rotate(newSize);
		}
	}

	public static void rotate(int newSize) {
		int i;
		int position = size - newSize;
		char temp = arrayChar[position];
		for (i = position + 1; i < size; i++) {
			arrayChar[i - 1] = arrayChar[i];
		}
		arrayChar[i - 1] = temp;
	}

	public static void displayWord() {
		System.out.print(count++ + " : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arrayChar[i]);
		}
		System.out.println();
	}
}
