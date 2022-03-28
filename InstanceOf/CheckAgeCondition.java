import java.util.Scanner;
public class CheckAgeCondition {
  public static void main (String [] args){


    Scanner input = new Scanner(System.in);
    System.out.print("Enter you age: ");

    int age = input.nextInt();

    if(age >= 18) {
      System.out.println("You are student!");
    } 
    else if(age >= 12 && age < 18) {
      System.out.println("You are in highschool!");
    }
    else if (age >= 10 && age < 12  ) {
      System.out.println("You are in middle school!");
    }
    else if (age >=6 && age < 10){
      System.out.println("You are in primary school!");
    } else System.out.println("You're still young to go to school :)."); 
  }
}
