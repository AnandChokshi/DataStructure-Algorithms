package anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramMyTry {
	public static int size;
	public static char[] chArray;

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		chArray = str.toCharArray();
		size = chArray.length;
		// pass total size of string to doAnagram method
		doAnagram(size);
	}

	public static void doAnagram(int newSize) {
		// base case of method if size becomes 1
		if (newSize == 1) {
			return;
		} else {
			// else print every case of that particular size
			for (int i = 0; i < newSize; i++) {
				// reduce size by 1 and recursively call method
				doAnagram(newSize - 1);
				// we only need to print when last two character swap them, which covers every basis
				if (newSize == 2) {
					for (int j = 0; j < size; j++) {
						System.out.print(chArray[j]);
					}
					System.out.println();
				}
				// after every iteration rotate array
				rotate(newSize);
			}
		}
	}

	// this method rotates array according to passed size as if you pass 4 for total size of 4 array, it
	// means you want to rotate 4-4 = 0th character, so that character will be set in last position
	public static void rotate(int newSize) {
		int i;
		// position will give us the character which needs to be rotate
		int position = size - newSize;
		char temp = chArray[position];
		// this for loop starts shifting characters from the position to the last of size
		for (i = position; i < size - 1; i++) {
			chArray[i] = chArray[i + 1];
		}
		// put selected character at the end of loop
		chArray[i] = temp;
	}
}
