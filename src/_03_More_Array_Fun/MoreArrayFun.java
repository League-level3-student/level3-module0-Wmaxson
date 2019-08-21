package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {

		String[] succc = { "F", "U", "N" };
		succ(succc);
		suc(succc);
		succcc(succc);
		succccc(succc);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public static void succ(String[] string) {
		String String = "";
		for (int i = 0; i < string.length; i++) {
			String += string[i];
		}
		System.out.println(String);
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.

	public static void suc(String[] string) {
		String String = "";
		for (int i = string.length - 1; i >= 0; i--) {
			String += string[i];
		}
		System.out.println(String);
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	public static void succcc(String[] string) {
		String String = "";
		for (int i = 0; i < string.length; i += 2) {
			String += string[i];
		}
		System.out.println(String);
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

	
	
	public static void succccc(String[] string) {
		int[] printedIndexes = new int[string.length];
		int currentPos = 0;
		Random randy = new Random();
		
		while(currentPos<string.length) {
			int ran=randy.nextInt(string.length);
			boolean printIt = true;
			for (int i = 0; i < currentPos; i++) {
				if (printedIndexes[i] == ran) {
					printIt = false;
					break;
					
				}
			}
			
			if (printIt) {
				System.out.print(string[ran]);
				printedIndexes[currentPos] = ran;
				currentPos ++;
			} else {
				
			}
		}
	}
	/*
	public static void succccc(String[] string) {
		String String = "";
		int randy = 0;
		String[] Array;
		int[] printedIndexes = new int[string.length];
		int currentpos = 0;
		Random r = new Random();

		while (currentpos < string.length) {
			
			for (int i = 0; i < printedIndexes.length; i++) {
				randy = r.nextInt(string.length);
				System.out.println(randy);
				if (randy != printedIndexes[i]) {
					String += string[randy];
					currentpos++;
				}else {
					
				}


			}
			
		}
		
		System.out.println(String);
	}
	 */
}
