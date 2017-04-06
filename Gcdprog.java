package mypro;

import java.util.Scanner;

/**
 * 
 * @author namana_shenoy
 *
 */

public class Gcdprog {

	public static void main(String[] args) {
		findGcd();

	}

	public static void findGcd() {

		System.out.println("enter the n value:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int rem = 0;
		while (num1 != 0 && num2 != 0) {
			rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		System.out.println("the gcd is:" + num1);

	}

}
