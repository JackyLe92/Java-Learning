package Operators.Java_Operators;

public class StudentManagement {
  static public void main(String[] args) {
    Object obj = new Student();
    System.out.println(obj instanceof String);
    System.out.println(obj instanceof Student);
    System.out.println(obj instanceof Object);
  } 
}
