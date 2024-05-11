package GLAB_303_10_4;

public interface Movable {// An interface defines a list of public abstract methods to be implemented by the subclasses
     void moveUp();
     void moveDown();
     void moveLeft();
    void moveRight();
    String getCoordinate();
}