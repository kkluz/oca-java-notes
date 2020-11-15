package chapter6;
import java.util.function.Predicate;

public class Lambdas {
//    Java 8 is probably best known as the version of Java that finally added lambdas and streams.
//    Tools to tackle some common and complex problems with easier-to-read, more concise, and, in many cases, faster-running code.

/*  The basic syntax for a Predicate lambda has three parts:
  A Single Parameter An Arrow-Token   A Body
          x                 →         7< > 5*/

//  The parameter can be just a variable name, or it can be the type followed by
//  a variable name all in parentheses.
//  The body MUST (one way or another) return a boolean.
//  The body can be a single expression, which cannot have a return statement.
//  The body can be a code block surrounded by curly braces, containing one or more valid statements,
//  each ending with a semicolon, and the block must end with a return statement.

  public static void main(String[] args) {
    Lambdas m1 = new Lambdas();
// ==== LEGAL LAMBDAS ========================
    m1.go(x -> 7 < 5);
    m1.go(x -> {
      return adder(2, 1) > 5;
    });
    m1.go((Lambdas x) -> {
      int y = 5;
      return adder(y, 7) > 8;
    });
    m1.go(x -> {
      int y = 5;
      return adder(y, 6) > 8;
    });
    int a = 5;
    int b = 6;
    m1.go(x -> {
      return adder(a, b) > 8;
    });
    m1.go((Lambdas x) -> adder(a, b) > 13);
// ==== ILLEGAL LAMBDAS =======================
// m1.go(x -> return adder(2, 1) > 5; ); // m1.go(Lambdas x -> adder(2, 3) > 7);
// m1.go(() -> adder(2, 3) > 7);
// m1.go(x -> { adder(4, 2) > 9 });
// m1.go(x -> { int y = 5; adder(y, 7) > 8; });
  }

  void go(Predicate<Lambdas> e) {
    Lambdas m2 = new Lambdas();
    System.out.println(e.test(m2) ? "ternary true" : "ternary false");
  }

  static int adder(int x, int y) {
    return x + y;
  } // complex calculation

}

