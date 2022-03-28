import java.util.Scanner;

public class Student {
  private boolean [] subject = new  boolean [10];
  boolean bool;

  public void displayObject () {
    System.out.println("value is " + subject);
    System.out.println("Value of subject[2] is " + subject[2]);
  }

  static public void main (String [] args) {
    int a;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    System.out.println(a);

    int array [] = {1,2,3,4,54,5,6,54,3,31};
    for(int item:array){
      System.out.println(item);
    }

  }
}
