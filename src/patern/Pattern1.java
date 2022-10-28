package patern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

		System.out.print("Which pattern u want to prinnt..Please enter pattern number");
		Scanner scn = new Scanner(System.in);
		int patternNumber = scn.nextInt();

		switch (patternNumber) {
		case 1: {
			pattern1(5);
			break;
		}
		case 2: {
			pattern2(5);
			break;
		}
		case 3: {
			pattern3(5);
			break;
		}
		case 4: {
			pattern4(5);
			break;
		}
		case 5: {
			pattern5(5);
			break;
		}
		case 6: {
			pattern6(5);
			break;
		}
		default: {
			System.out.print("Invalid input");
			System.exit(0);
		}

		}

	}

	public static void pattern1(int n) {
		System.out.println("I am in pattern1");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void pattern2(int n) {
		System.out.println("I am in pattern2");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void pattern3(int n) {

		System.out.println("I am in pattern3");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void pattern4(int n) {

		System.out.println("I am in pattern4");
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();

		}
	}

	public static void pattern5(int n) {

		System.out.println("I am in pattern5");

		for (int row = 1; row <= 2 * n; row++) {

			int totalColInRow = row > n ? 2 * n - row : row;

			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

	public static void pattern6(int n) {

		System.out.println("I am in pattern6");

		for (int row = 1; row <= 2 * n-1; row++) {

			int totalColInRow = row > n ? 2 * n - row : row;
			int noOfSpaces = n - totalColInRow;

			
			for (int col = 1; col <= totalColInRow; col++) {
				System.out.print("*");

			}
			for (int s = 1; s <= noOfSpaces; s++) {
				System.out.print(" ");
			}
			System.out.println();

		}
		
	}
}
