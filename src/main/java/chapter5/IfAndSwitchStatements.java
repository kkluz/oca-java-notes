package chapter5;

public class IfAndSwitchStatements {

  public static void main(String[] args) {
//    decision statement: if, switch
//    looping constructors: for, while, do
//    exceptions give a way to organize code
//    which deals with problems that might crop up at runtime

//    The expression in parentheses must evaluate to (a boolean) true or false.
//    The following code example is legal (although not recommended for readability):
    int x = 4;
    int y = 0;
    int z = 0;
    if (x > 3) // bad practice
      y = 2;
    z += 8;
    System.out.println(y);
    System.out.println(z);

//    Without curly braces, only one statement is treated as a body of the if test.
//    Instead of nesting if-else statements -> if, else if, else
//    Even if second else if is true, it is never reached.

//    if (exam.done())
//    if (exam.getScore() < 0.61) System.out.println("Try again.");
//    Which if does this belong to?
//    else System.out.println("Java master!");
//    To the most innermost if, so to the second one.
    int a = 5;
    int b = 2;
    int c = 0;
    if ((b > 3) && (a < 2) | c == 0) {
      System.out.println("true"); }

//    If (b > 3) is true, and either (a < 2) or c == 0 is true, then print true.
//    So if (b > 3) is not true, no point in looking at the rest of the expression."

//    if(1), if(0) are illegal in JAVA
//    Common mistake: if(x = true) instead of if (x == true)
    boolean boo = false;
    if (boo = true) {
      System.out.println("Tricky!");
    }

//    The code compiles and runs fine, and the if test succeeds
//    because boo is SET to true (rather than TESTED for true) in the if argument
    int i = 3;
//    if (i = 5) { } // Won't compile because x is not a boolean.

//    switch
    int u = 0;
    switch(u){
      case 0:
        System.out.println(0);
        break;
      case 1:
        System.out.println(2);
        break;
      default:
        System.out.println("default");
    }

//    A switch's expression must evaluate to a
//    char, byte, short, int, an enum (as of Java 5), and a String (as of Java 7)
//    the case constant must be a compile-time constant
    final int m = 1;
    final int n;
    n = 2;
    int w = 0; switch (w) {
      case m: // ok
    }
//      case n: // compiler error (constant expression required)
//      Also, the switch can only check for equality.
//      This means the other relational operators such as greater than
//      are rendered unusable in a case.

//      Strings will be considered "equal" if they have the same
//      case-sensitive sequence of characters

//      case constants are evaluated from the top down, and the first
//      case constant that matches the switch's expression is the execution entry point.
        String s = "green";
        switch(s) {
        case "red": System.out.print("red ");
        case "green": System.out.print("green ");
        case "blue": System.out.print("blue ");
        default: System.out.println("done");
      }
//        result: green blue done
//        This combination occurs because the code didn't hit a break statement; execution just kept
//        dropping down through each case until the end. This dropping down is actually called "fall-through,"
//        because of the way execution falls from one case to the next.

//        practical usage of fall through logic:
    int g = 7;
        switch (g) {
          case 2:
          case 4:
          case 6:
          case 8:
          case 10: {
            System.out.println("g is an even number"); break;
          }
          default:
            System.out.println("g is an odd number");
        }

//    The default case doesn't have to come at the end of the switch.
//    default works just like any other case for fall-through

  }

}
