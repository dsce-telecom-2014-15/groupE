package myprog1;
/**
 * 
 * @author namana_shenoy
 *
 */

public class TabelsOfNumbers {

	public static void main(String[] args) {
	
		int prod = 1;
		   for (int i = 1; i <= 20; i++) {
			  System.out.println();
			    for (int j = 1; j <= 15; j++) {
				  prod = i * j;
				  System.out.print(i + "x" + j + "=" + (j * i));
				  System.out.println();
			}
			System.out.print(" \n");
		}
	}

}
