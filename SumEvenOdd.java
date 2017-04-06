package mypro;

/**
 * 
 * @author namana_shenoy
 *
 */
public class SumEvenOdd {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int even_sum = 0, odd_sum = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] % 2 == 0) {
				even_sum = even_sum + a[i];

			} else {
				odd_sum = odd_sum + a[i];

			}
		}
		System.out.println("the even sum is:" + even_sum);
		System.out.println("the odd sum is:" + odd_sum);
	}
}
