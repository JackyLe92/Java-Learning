public class Exercise1 {
  static public void main(String[] args) {
    char [] arrChar = {'1','2','3','4','5','5','7','7','7','7','7','7','4','4','5','5','5'};

    char[] uniqueChar = new char[arrChar.length];
    int indexUniqueChar = 0;
    for (int i = 0; i < arrChar.length -1 ; i++){
      boolean isDistinct = true;
      for (int j = 0; j < i; j++) {
        if (arrChar[i] == arrChar[j]) {
          isDistinct = false;
        }
      }
      if(isDistinct){
        uniqueChar[indexUniqueChar] = arrChar[i];
        indexUniqueChar++;
      }
    }
    // for(char item:uniqueChar) {
    //     System.out.print(item);
    //   }
    for(int i = 0; i < uniqueChar.length-1; i++) {
      int count = 0;
      for (int j = 0; j < arrChar.length-1; j++) {
        if (uniqueChar[i] == arrChar[j] ) {
          count++;
        }
      }
      if(uniqueChar[i] == '\u0000') break;
      System.out.println(uniqueChar[i] + " : " + count);
    }

  }
}
