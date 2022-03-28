class FooPrinter {
  static final String UPPER = "FOO";
  static final String LOWER = "foo";

  boolean printUpper = false;

  void upper() {
    printUpper = true;
  }
  void lower() {
    printUpper = false;
  }
  void print() {
    if(printUpper) 
      System.out.println(UPPER);
    else
      System.out.println(LOWER);
  }
}
