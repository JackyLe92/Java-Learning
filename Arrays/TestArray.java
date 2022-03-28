//Passing Array to method 
public class TestArray {
  public static void main(String [] args) {
    int [] intArray = {5, 22, 15, 8, 89, 6};
    System.out.println("Max of value: " + findMax(intArray));
  }

  static int findMax(int [] intArray) {
    int max = intArray[0];

    for(int item:intArray) {
      if (item > max){
        max = item;
      }
    }
    return max;
  }
}
