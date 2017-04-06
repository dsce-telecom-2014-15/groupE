package mypro;

import java.util.Scanner;

/**
 * 
 * @author namana_shenoy
 *
 */
public class ConsoleO {

	public static void main(String[] args) {

		readData();

		Gcdprog.findGcd();
		Lcmprog.findLcm();
	}

	private static void readData() {
		Scanner sc = new Scanner(System.in);
		Student studentVar = new Student();
		System.out.println("enter the interger value:");
		int i = sc.nextInt();
		System.out.println("integer value is:" + i);
		System.out.println("enter the double value:");
		double d = sc.nextDouble();
		System.out.println("the double value is:" + d);
		System.out.println(" enter the string value:");
		String s = sc.next();
		System.out.println("the string value is:" + s);

	}

}
