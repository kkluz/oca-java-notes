package chapter4;

import javax.swing.JButton;

public class JavaOperators {

  public static void main(String[] args) {
    int x = 1;
    int y = 2;

    //Sample assignments
    y = y - 6;
    x = x + 2 * 5;

    //The same assignments using Compound Assignment Operators
    //help to save some key strokes
    y -= 6;
    x += 2 * 5;

    /*Commonly used compound operators:
    +=, -=, *=, /= */

    //Relational Operators <, <=, >, >=, ==, and !=
    //Relational operators always result in a boolean
    //Resulting value can be assigned to a boolean primitive

    boolean b = 100 > 99;
    System.out.println("Value of b is " + b);

    //Four relational operators can be used to compare integers, floating-point numbers and characters: >, >=, <, <=
    String animal = "unknown";
    char sex = 'm';
    if (sex <= 'f') {
      animal = "female " + animal;
    }
    System.out.println("The animal is a " + animal);

    //When comparing a character with a character or a character with a number, Java will use the Unicode value of the character as the numerical value for comparison.

    //"Equality" operators ==, !=
    /*There are four different types of things that can be tested:
    ■ Numbers
    ■ Characters
    ■ Boolean primitives
    ■ Object reference variables
    So what does == look at? The value in the variable—in other words, the bit pattern.*/

    //Equality for Primitives
    System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
    System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
    System.out.println("5 != 6? " + (5 != 6));

    //Floating-point number is compared with an integer and the values are the same, so == operator returns true.
    System.out.println("5.0 == 5L? " + (5.0 == 5L));
    System.out.println("true == false? " + (true == false));

    //Equality for Reference Variables
    JButton a = new JButton("Exit");
    JButton c = a;
    JButton d = new JButton("Exit");

    //the == operator is looking at the bits in the variable, so for reference variables,
    // this means that if the bits in both reference variables are identical, then both refer to the same object.
    System.out.println("Is reference a equal to c? " + (a == c));
    System.out.println("Is reference a equal to d? " + (a == d));
    //This shows us that a and c reference the same instance of a JButton
    //In order to to check if objects are "meaningfully equivalent", the equals() method should be used.

    //Every class in Java inherits a method from class Object that tests to see if two objects of the class are "equal."

    /*The equals() Method in Class Object The equals() method in class Object works the same way that the == operator works.
    If two references point to the same object, the equals() method will return true.
    If two references point to different objects, even if they have the same values, the method will return false.*/

    /*The equals() Method in Class String The equals() method in class String has been overridden.
    When the equals() method is used to compare two strings, it will return true if the strings have the same value,
    and it will return false if the strings have different values.
    For String's equals() method, values ARE case sensitive.*/

    /* Equality of enums
    You can use either the == operator or the equals() method
    to determine whether two variables are referring to the same enum constant:*/

    /*instanceof Comparison
    check if the object referred to by the variable on the left side of the operator
    passes the IS-A test for the class or interface type on the right side
    The instanceof operator is used for object reference variables only.*/

    String s = new String("s");
    if (s instanceof String) {
      System.out.println("s is a String");
    }

    //An array is always an instance of Object, even if its an array of primitives.

    //Arithmetic Operators
    int w = 15;
    int z = w % 4;
    System.out.println("The result of 15 % 4 is the "
        + "remainder of 15 divided by 4. The remainder is " + z);

    /*Expressions are evaluated from left to right by default.
    You can change this sequence, or precedence, by adding parentheses.
    Also remember that the *, /, and % operators have a higher precedence
    than the + and - operators.)*/

    /*The modulus operator throws out everything but the remainder.
        The division operator throws out the remainder.*/

    int j = w / 4;
    System.out.println(j);

    //String Concatenation Operator
    String q = "String";
    int t = 3;
    int e = 7;
    System.out.println(q + t + e);
    System.out.println(t + (e + q));

    int u = 2;
    System.out.println("" + u + 3);

    //Increment and Decrement Operators
    /*++ Increment (prefix and postfix)
    -- Decrement (prefix and postfix)*/

    int players = 0;
    System.out.println("players online: " + players++);
    System.out.println("The value of players is "
        + players);
    System.out.println("The value of players is now "
        + ++players);

//  Postfix increment operator,
//  causes players to be incremented by one
//  but only after the value of players is used in the expression.

    // increment operators used in the if statement is also increasing the value
    int f = 2;
    int g = 3;
    if ((g == f++) | (f < ++g)) {
      System.out.println("f = " + f + " g = " + g);
    }


  }
}
