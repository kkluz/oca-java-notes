package chapter6;

public class Strings {

  public static void main(String[] args) {
    //First example
    //1. new String object, with value "abcd", refers to it
    String s = new String("abcd");
    //2. 2nd reference variable referring to the same String object
    String s2 = s;
    // new String object created with value "abcd more stuff", refer s to it =>
    // change s's reference from the old to the new String object
    // s2 still refers to the old object
    s = s.concat(" more stuff");
    System.out.println(s2);
    System.out.println(s);

    //Second example
    //1. crete a String object, give it a value "Java", refer x to it
    String x = "Java";
    //2. create new String object, with value "Java Rules!", but nothing refers to it and object is lost.
    //It still exists in the memory, but no code in the program has any way to reference it.
    x.concat(" Rules!");
    System.out.println("x = " + x);
    x.toUpperCase();
    System.out.println("x = " + x);
    x.replace('a','X');
    System.out.println("x = " + x);

    //Third example
    //now, the original object got lost, because reference variable y refers now to the new String object
    String y = "Java";
    y = y.concat(" Rules!");
    System.out.println("y =" + y);

    //Fourth example
    String t1 = "spring ";
    String t2 = t1 + "summer ";
    t1.concat("fall ");
    t2.concat(t1);
    t1 += "winter ";
    System.out.println(t1 + " " + t2);
    //The result is: "spring winter spring summer"
    //There were 8 objects created: "spring ", "summer" (lost), "spring summer ", "fall " (lost), "spring fall " (lost),
    //"spring summer spring " (lost), "spring winter " (at this moment "spring " is lost) and finally "spring winter spring summer ".
    //There are two reference variables t1 and t2.

    //Creating new strings
    String z = "abc"; // creates one String object and one reference variable
    // "abc" will go into the String constant pool

    String z1 = new String ("abc"); // creates two objects and one reference variable
    // due to new keyword, Java will create a new String object in a normal nonpool memory and literal "abc" will be placed in the pool.

    //substring method
    //int begin is zero-based, int end is not zero-based -> int end=2,index = 1 will be the last one returned
    System.out.println(z.substring(0,2));

    //toString method
    System.out.println(z); //compiler writes here z.toString()

    //array have an attribute (not method) length. Using length() method on array and length attribute on a String causes the compiler error.
    System.out.println(s.length());
    String[] a = new String[3];
    System.out.println(a.length);
  }

}
