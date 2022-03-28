import java.lang.management.MemoryManagerMXBean;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.math.*;
public class JaggedArray {
  public static void main(String [] args) {
    int [][] jaggedArray = new int[3][];
    jaggedArray[0] = new int[]{0, 1, 3, 4, 6};
    jaggedArray[1] = new int[]{3, 5, 1, 8, 9};
    jaggedArray[2] = new int[]{6, 7, 10};
    for(int[] row:jaggedArray){
      System.out.println(Arrays.toString(row));
    }

    // Scanner input = new Scanner(System.in);
    // int a = input.nextInt();
    // System.out.println("Number a: " + a );

    int [][] jaggedArray2 = new int[4][];
    Random random = new Random();
    for (int i = 0; i < jaggedArray2.length; i++ ) {
      for (int j = 0; j < jaggedArray2[i].length; i++) {
        jaggedArray2[i][j] = random.nextInt(100);
      }
    }

    for (int i = 0; i < jaggedArray2.length; i++ ) {
      for (int j = 0; j < jaggedArray2[i].length; i++) {
        System.out.println(jaggedArray2[i][j] + "\t");
      }
      System.out.println("");
    }

    int a= random.nextInt(100);
    System.out.println("Random for value a: " + a);
  }
}
