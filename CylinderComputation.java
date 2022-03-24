import java.lang.Math;

public class CylinderComputation {
  public static void main(String [] args) {
    double radius = 10;
    double height = 20;
    double surfaceArea = 2 * Math.PI * radius * height;
    double baseArea = Math.PI * Math.pow(radius, 2);
    double volume = baseArea * height;
    System.out.println("Surface Area = " + surfaceArea);
    System.out.println("Base Area = " + baseArea);
    System.out.println("Volume = " + volume);
  }
}
