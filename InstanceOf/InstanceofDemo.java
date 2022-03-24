/*
@Author levan
@Date Mar 24, 2022
@Version 1.0
*/


package exercise;

public class InstanceofDemo {

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Parent obj2 = new Child();
		
		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
		// Check if obj1 belong to class Parent or have type of Parent data
		System.out.println("obj1 instanceof Chile: " + (obj1 instanceof Child));
		
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
		
		
		System.out.println("obj1 instanceof Parent: " + (obj2 instanceof Parent));
		// Check if obj1 belong to class Parent or have type of Child data
		System.out.println("obj1 instanceof Chile: " + (obj2 instanceof Child));
		
		System.out.println("obj1 instanceof MyInterface: " + (obj2 instanceof MyInterface));
		

	}

}
