public class Declaration {
  public static void main(String [] args) {
    String [] testString = new String[10];
    testString[1] = "Home";
    System.out.println(testString[1]);

    String names[] = {"Home", "name", "Nhat"};
    for (int i = 0; i < names.length ;i++){
      System.out.println(names[i]);
    }

    int [] test1 = {1,2,3,4,5};

    String [] test2 = {};
    String [] newNames = names;
    System.out.println(newNames);
    int [] test3;
    test3 = test1;
    System.out.println(test3);
    test3[2] = 10;

  }
}
