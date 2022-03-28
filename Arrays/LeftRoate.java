import java.util.concurrent.RejectedExecutionHandler;

public class LeftRoate {
  public static void main(String[] args) {
    // Left Rotate the Array
    // int nElement = 2;
    // int [] arrInt = {1,2,3,4};
    // int [] temp = new int[nElement];
    // for (int i = 0; i < nElement; i++){
    //   temp[i] = arrInt[i];
    // }
    // for(int i = nElement; i < arrInt.length; i++) {
    //   arrInt[i - nElement] = arrInt[i];
    // }
    
    // for(int j = 0; j <temp.length; j++ ){
    //   arrInt[nElement] = temp[j];
    //   nElement++;
    // }
    // for(int num:arrInt){
    //   System.out.println(num);
    // }
    int n = 1;
    int [] array = {1,2,3,4,2,35,67,32,11,43,777,9};
    leftRoate(array, n);

  }

  static int[] leftRoate(int[] arr, int nElement){
    // Create empty array type int with length as assigned
    int [] temp = new int[nElement];
    // Pass value from left side of Array to empty array
    for (int i = 0; i < nElement; i++){
      temp[i] = arr[i];
    }

    // Dich chuyen gia tri cho arr
    for(int i = nElement; i < arr.length; i++) {
      arr[i - nElement] = arr[i];
    }
    
    //Gan lai gia tri, ma o do gia tri da bi dich chuyen
    for(int j = 0; j <temp.length; j++ ){
      arr[nElement] = temp[j];
      nElement++;
    }
    for(int num:arr){
      System.out.println(num);
    }
    return arr;
    }
}
