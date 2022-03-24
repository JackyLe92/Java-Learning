/*
@Author levan
@Date Mar 24, 2022
@Version 1.0
*/


package exercise;

public class ArithmeticDemo {

	public static void main(String[] args) {
		double result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		int original_result = (int) result;
		String firstString = "This is ";
		String secondString = " a concatenated string. ";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
		
		result = result -1 ;
		System.out.println(original_result + " - 1 = " + result);
		original_result = (int)result;
		
		result *= 2;
		System.out.println(original_result + " * 2 = " + result);
		original_result = (int) result;
		
		result /= 2;
		System.out.println(original_result + " / 2 = " + result);
		original_result = (int) result;
		
		result %= 7;
		System.out.println(original_result + " % 7 = " + result);

		System.out.println("name is Thang " + true);
		
		int i = 1;
		i += i++ + (++i) + (++i) + i++;
		System.out.println(i);
	}

}
