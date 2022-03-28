/*
@Author levan
@Date Mar 25, 2022
@Version 1.0
*/


package exercise2;
import java.util.Scanner;

public  class JPE_S_A201 {
	static Scanner input = new Scanner(System.in); 

	public static void main(String[] args) {
		JPE_S_A201 exam1 = new JPE_S_A201();
		
		// create exam1 array;
		String [] arrTesting = exam1.createArray();
		
		//create value to test
		System.out.print("Enter the String value: ");
		String value = input.nextLine();
		System.out.println();
		
		//Run test
		
		exam1.checkStringContain(value, arrTesting);
	}
	
	
	//User enter the array elements
	public  String[] createArray () {
		// enter the number of elements
		System.out.print("Enter number of Elements: ");
		int numElements = Integer.parseInt(input.nextLine());
		
		// create String array with numElement
		String [] arrTest = new String [numElements];
		
		// input the Element for arrTest
		for (int i = 0; i < numElements; i++) {
			System.out.flush();
			System.out.printf("Enter arrTest[%d] :", i );
			arrTest[i] = input.nextLine();
			System.out.println();
		}
		return arrTest;
	}
	
	public void checkStringContain (String value, String[] arrTest) {
		for (int i = 0; i < arrTest.length; i++) {
			if(arrTest[i].equals(value)) {
				
				System.out.println("CONTAINED");
				return;
			}
		}
		System.out.println("NO CONTAIN");
	}
	
}
