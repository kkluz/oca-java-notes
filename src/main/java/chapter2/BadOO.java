package chapter2;

public class BadOO {
  public int size;
  public int weight;

//  a public setSize(int a) method missing

//  The ability to make changes in your implementation code without breaking the code of others
//  who use your code is a key benefit of encapsulation.

//  By hiding implementation details, you can rework your method code
//  (perhaps also altering the way variables are used by your class) without forcing a change in the code
//  that calls your changed method.

//  If you want maintainability, flexibility, and extensibility, your design must include encapsulation.
//  How do you do that?
//      ■ Keep instance variables hidden (with an access modifier, often private).
//      ■ Make public accessor methods, and force calling code to use those methods rather than directly accessing the instance variable.
//  These so-called accessor methods allow users of your class to set a variable's value or get a variable's value.
//  For these accessor methods, use the most common naming convention of
//  set<SomeProperty> and get<SomeProperty>.

//  We call the access methods getters and setters, although some prefer the fancier terms accessors and mutators.
}
