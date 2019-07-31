package _00_IntroToArrays;

import java.util.ArrayList;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
				ArrayList<String> s = new ArrayList<String>();
				s.add("1");
				s.add("2");
				s.add("3");
				s.add("4");
				s.add("5");
				// 2. print the third element in the array
				System.out.println(s.get(2));
				// 3. set the third element to a different value
				s.set(2, "a different value");
				// 4. print the third element again
				System.out.println(s.get(2));
				// 5. use a for loop to set all the elements in the array to a string of your
				// choice
				for (int i = 0; i < s.size(); i++) {
					s.set(i, "Brandon");
				}
				// 6. use a for loop to print all the values in the array
				// BE SURE TO USE THE ARRAY'S length VARIABLE
				for (int i = 0; i < s.size(); i++) {
					System.out.println(s.get(i));
				}
				// 7. make an array of 50 integers
				ArrayList<Integer> i = new ArrayList<Integer>();
				// 8. use a for loop to make every value of the integer array a random number
				Random r1 = new Random();
				int random = r1.nextInt();
				for (int r = 0; r < 50; r++) {
					i.add(r, random);
					random = r1.nextInt();
					System.out.println(i.get(r));
				}
				// 9. without printing the entire array, print only the smallest number on the
				// array
				for (int u = 0; u < 50; u++) {
					if(i.get(u)<i.get(u +1)){
						i.remove(u +1);
					}

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
	}
}
