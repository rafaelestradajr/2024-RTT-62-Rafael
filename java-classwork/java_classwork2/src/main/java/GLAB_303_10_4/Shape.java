package GLAB_303_10_4;

public abstract class Shape {
    protected String color;
    protected double height; // To hold height.
    protected double width;
    protected double base; //To hold base

    public void setColor(String color) {
        this.color = color;
    }

public void setWidth(double width) {
    this.width = width;
}

public void setHeight(double height) {
    this.height = height;
}
public void setBase(double base) {
    this.base = base;

    // The getArea method is abstract.
    // It must be overridden in a subclass.
    // /** Al shapes must provide a method called getArea(); */
}
    public abstract double getArea();

    public abstract void displayshapName();

    /** Returns a self-descriptive string */

    public String toString() {
        return "Shape[color=" + color + "]";
    }
    public void displayshapeName()
    {
        System.out.println("I am a Shape.");
    }
}