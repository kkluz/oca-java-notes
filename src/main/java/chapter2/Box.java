package chapter2;

public class Box {

  // hide the instance variable; only an instance
  // of Box can access it
  private int size;

  // Provide public getters and setters
  public int getSize() {
    return size;
  }

  public void setSize(int newSize) {
    size = newSize;
  }

//  What benefit can there be from having getters and setters that add no functionality?
//  The point is, you can change your mind later and add more code to your methods without breaking your API.
}
