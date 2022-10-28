package Array;

public class CountDigit {

	public static void main(String[] args) {

		 int countResult = getDigitCount(123);

		 System.out.println("Total digit count \n"+countResult);

		/*
		 * //time complexity--o(1)
		 * 
		 * int count = 1234887678; String cntString = Integer.toString(count); int c =
		 * cntString.length(); System.out.println("Total digit count \n" + c);
		 */

	}

	public static int getDigitCount(int a) {
		int rem = 0;
		int count = 0;
		
		//time complexity--o(n)
		while (a > 0) {
			a = a / 10;
			count++;

		}

		return count;
	}
}
