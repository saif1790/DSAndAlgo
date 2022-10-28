package Array;

public class RequiredSum {

	public static void main(String[] args) {

		int a[] = {1, 2,4, 7};
		int lengthArray = a.length;
		int s = 0;
		int e = lengthArray - 1;
		for (int i = 0; i < lengthArray; i++) {
			if (a[s] + a[e] == 10) {
				System.out.println("found sum = 10 by adding number at index" + "starting from" + s + "--" + a[s]
						+ "and ending from " + e + "--" + a[e]);
				s++;
				e--;
			} else if (a[s] + a[e] > 10) {
				e--;
			} else if (a[s] + a[e] < 10) {
				s++;
			} else {
				if (a[s] == a[e]) {
					System.out.println("no any number for comparing");
					break;
				}
				 
			}
		}

	}
}
