package mypro;

/**
 * 
 * @author namana_shenoy
 *
 */
public class SmallestElement {

	public static void main(String[] args) {

		int[] numbers = { 88, 96, 73, 68, 54 };
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println("smallest number in array is:" + smallest);
	}

}
