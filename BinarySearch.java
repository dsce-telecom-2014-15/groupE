package myprog1;

/**
 * @author namana_shenoy
 */
import java.util.Arrays;


public class BinarySearch {

	public static void main(String[] args) {
		
		int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchElement = 4;
		int lowerIndex = 0, highIndex = myIntArray.length, midIndex = (highIndex + lowerIndex) / 2;

		
		while (highIndex > lowerIndex) {
			if (myIntArray[midIndex] == searchElement) {
				System.out.println("In " + Arrays.toString(myIntArray) + "element " + searchElement
						+ " is found at index " + midIndex);
				break;
			} else if (myIntArray[midIndex] > searchElement) {
				highIndex = midIndex;
			} else {
				lowerIndex = midIndex;
			}
			midIndex = (highIndex + lowerIndex) / 2;
		}

	}

}
