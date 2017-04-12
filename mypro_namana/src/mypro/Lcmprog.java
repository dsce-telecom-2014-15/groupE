package mypro;

import java.util.Scanner;

/**
 * 
 * @author namana_shenoy
 *
 */
public class Lcmprog {

	public static void main(String[] args) {
		findLcm();
	}

	public static void findLcm() {
		//TODO Remove unnecessary comments.
		// TODO Auto-generated method stub
		System.out.println("enter the n value:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max, min;
		if (a > b) {
			max = a;
			min = b;

		} else {
			max = b;
			min = a;
		}
		int lcm = 0;
		for (int i = 1; i <= min; i++) {
			int x = max * i;

			if (x % min == 0) {
				lcm = x;
			}
		}

		System.out.println("L.C.M. = " + lcm);

	}

}
