public class CopyArray {
  static public void main(String[] args) {
    char[] letter ={'a','d','2','c','a','n','j','g','y','p','7','l','h','g','j','k'};

    // create destination array
    char[] destArray = new char[20];

    // copy  by using System.arraycopy(src, pos, des, pos, length)
    // System.arraycopy(letter,3,destArray, 2, 5);
    // System.out.println(String.valueOf(letter));
    // System.out.println(String.valueOf(destArray));

    // Cloning an array
    char [] test1 = {'1','2','3','4','5','5',(char) 23425,'7','7','7',(char) 23255,'7','7','7', (char) 322,'4','4','5','5','5'};
    char [] test2= test1.clone();
    for(char item:test2){
      System.out.println(item);
    }
  }

}
