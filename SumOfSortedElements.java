package mypro;

/**
 * 
 * @author namana_shenoy
 *
 */
public class SumOfSortedElements {

	public static void main(String args[]) {

		int[] array = { 10, 20, 30, 40, 50, 10 };
		int sum = 0;
		// its called foreach it loop. Not advanced.
		// Advanced for loop
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("Sum of array elements is:" + sum);
	}
}
