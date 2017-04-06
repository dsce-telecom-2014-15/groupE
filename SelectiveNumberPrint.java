package mypro;

/**
 * this does sometging
 * 
 * @author namana_shenoy
 *
 */
public class SelectiveNumberPrint {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i != 11 && i != 12 && i != 13 && i != 14) {
				System.out.print(i + " ");
			}
			// TODO use continue statement
		}
	}

}
