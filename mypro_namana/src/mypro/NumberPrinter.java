package mypro;

/**
 * 
 * @author namana_shenoy
 *
 */
//TODO Name the class properly. Seems this program prints prime numbers.
public class NumberPrinter {

	public static void main(String[] args) {
		//TODO Why is this message printed to console in this program.
		System.out.println("hello");
		int limit = 50;
		System.out.println("prime number between 1 and :" + limit);
		for (int i = 1; i < 50; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;

				}
			}
			if (isPrime)
				System.out.print(i + " ");
		}
	}
}
