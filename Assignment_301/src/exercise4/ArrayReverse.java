/*
@Author levan
@Date Mar 28, 2022
@Version 1.0
*/


package exercise4;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32, 11, 22, 33, 55 };
		//print array before convert 
		System.out.print("Original Array: ");
		display(myIntArray);
		System.out.println();
		
		int temp = 0;
		int reverseIndex = myIntArray.length - 1;
		for (int i = 0; i < myIntArray.length / 2; i++) {
			temp = myIntArray[i];
			myIntArray[i] = myIntArray[reverseIndex];
			myIntArray[reverseIndex] = temp;
			--reverseIndex;
		}
		System.out.print("Reverse Array: ");
		display(myIntArray);
		System.out.println();
		
	}
	static void display(int[] arr) {
		for(int num:arr) {
			System.out.print(num +" ,");
		}
	}

}
