/*
@Author levan
@Date Mar 27, 2022
@Version 1.0
*/
/*
* Declare an int arrray and a variable ‘len’. Ask user to enter length of Array
* Continuing to require users enter a value for an element of Array, 
* repeating this work until Array is full or user chooses “N/n” if asked “Do you want to continue?”
* Enter an int value stored to ‘value’ variable, write java code to count frequency of the value in Array, prints amount and positions. 
 */

package exercies3;
import java.util.Scanner;

public class FrequentNumber {
	static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) {
		int [] arrayTesting = createArray();
		
		// Enter int value
		System.out.print("Enter checking number: ");
		int value = input.nextInt();
		
		// Find frequency of number
		frequencyOfNumber(value, arrayTesting);
	}
	
	public static void frequencyOfNumber (int num, int[] arrInt) {
		int count = 0;
		int [] indexPos = new int [arrInt.length];
		for(int number:arrInt) {
			if(number == num) {
				indexPos[count]= number;
				count++;
				
			}
		}
		System.out.printf("Frquency of %d in  is %d",num, count);
		System.out.println();
		System.out.print("Position is: ");
		for(int i = 0; i < arrInt.length; i++) {
			if(arrInt[i] == num)
			System.out.print( + i + ",  ");
			
		}
	}
	
	public static  int[] createArray () {
		// enter the number of elements
		System.out.print("Enter number of Elements: ");
		int numElements = Integer.parseInt(input.nextLine());
		
		// create String array with numElement
		int [] arrTest = new int [numElements];
		
		// input the Element for arrTest
		for (int i = 0; i < numElements; i++) {
			System.out.flush();
			System.out.printf("Enter arrTest[%d] :", i );
			arrTest[i] = input.nextInt();
			
		}
		return arrTest;
	}

}
