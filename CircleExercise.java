package Operators;
import java.lang.Math;

public class CircleExercise {
  public static void main (String [] args) {
    float radius = 7.5f;
    final double Pi = Math.PI;
    System.out.println("Perimeter is = " + radius * 2 * Pi);
    System.out.println("Area is = " + Pi * Math.pow(radius, 2));
  }
}
