package chapter3;

public class Island {

  Island i;

  public static void main(String[] args) {
    //    islands of isolation
    Island i2 = new Island();
    Island i3 = new Island();
    Island i4 = new Island();
    i2.i = i3;
    i3.i = i4;
    i4.i = i2;
    i2 = null;
    i3 = null;
    i4 = null;

//    the three Island objects (previously known as i2, i3, and i4) have instance variables so that they refer to each other,
//    but their links to the outside world (i2, i3, and i4) have been nulled.
//    These three objects are eligible for garbage collection.
  }

}
