import java.util.Scanner;

//Find max of three numbers
public class FindMax {
  static public void main(String [] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three numbers:");
    System.out.print("Number 1: ");
    int num1 = input.nextInt();
    
    System.out.println("");
    System.out.print("Number 2: ");
    int num2 = input.nextInt();

    System.out.println("");
    System.out.print("Number 3: ");
    int num3 = input.nextInt();
    System.out.println("");


    // set max = num1
    int max = num1;
    if (num2 > max) {
      max = num2;
      if (num3 > max){
        max = num3;
        System.out.println("Max is: " + max);
      } else System.out.println("Max is: " + max);
    } 
    else {
      if (num3 > max){
        max = num3;
        System.out.println("Max is: " + max);
      } else System.out.println("Max is: " + max);
    }


  }
}
