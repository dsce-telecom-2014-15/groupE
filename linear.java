package progect2;

import java.util.Arrays;
// TODO: classes should be named properly
public class linear {

	public static void main(String[] args) {
		int[] myIntArray = { 1, 4, 3, 4, 5, 6, 7, 8, 4, 10 };
		int searchElement = 4;
        int count=0;
		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] == searchElement) {
			 count++;	
				System.out.println("In " + Arrays.toString(myIntArray) + "element " + searchElement + " is found at index " + i);
			}
			
		}
		System.out.print("these manytimes "+count);
	}

}

	
