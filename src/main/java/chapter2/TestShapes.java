package chapter2;

public class TestShapes {

  public static void main(String[] args) {
    PlayerPiece shape = new PlayerPiece();
    shape.displayShape();
    shape.movePiece();
  }
}

class GameShape {

// a method with generic functionality
// the method modified in the superclass will be automatically propagated across all the subtypes
  public void displayShape() {
    System.out.println("displaying shape");
  }
}

class PlayerPiece extends GameShape {

  public void movePiece() {
    System.out.println("moving game piece");
  }
}

class TilePiece extends GameShape {

  public void getAdjacent() {
    System.out.println("getting adjacent tiles");
  }
}


