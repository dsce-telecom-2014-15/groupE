package mypro;

/**
 * 
 * @author namana_shenoy
 *
 */
public class NumberTables {

	public static void main(String[] args) {

		//TODO Fix these warnings. yellow lines.
		int prod = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				prod = i * j;
				System.out.print(i + "x" + j + "=" + (j * i));
				System.out.println();
			}
			System.out.print(" \n");
		}
	}

}
