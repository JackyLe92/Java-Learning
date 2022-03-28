/*
@Author levan
@Date Mar 25, 2022
@Version 1.0
*/


package exercise1;

public class JPE_S_A201 {
	
	
	public int SumAverageRunningInt (int lowerBound, int upperBound) {
//		int lowerBound = 1;
//		int upperBound = 100;
		int sum = lowerBound;
		int count = 0;
		for (int i = lowerBound; i <= upperBound; i++ ) {
			sum += i;
			count++;
		}
		return sum/count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPE_S_A201 test = new JPE_S_A201();
		double avg = (double) test.SumAverageRunningInt(1, 100);
		System.out.println("Average of number is: " + avg);
	}

}
