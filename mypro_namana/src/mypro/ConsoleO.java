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
		//TODO: variables should be named properly.
		Scanner sc = new Scanner(System.in);
		Student studentVar = new Student();
		//TODO: Proper messages should be displayed to customers/end users
		// Ex: Here e in enter should be capital.
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
