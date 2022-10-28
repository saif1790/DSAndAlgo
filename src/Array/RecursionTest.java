package Array;

public class RecursionTest {

	public static void main(String[] args) {
		printNumber(5);
	}

	public static void printNumber(int a) {

		for (int i = 1; i <= 10; i++) {

			System.out.print(a * i + " ");

		}
		a--;
		System.out.println();

		while (a > 0) {
			printNumber(a);
		}
		if(a==0)
		{
			System.out.println("===");
		}
		
	}
}
