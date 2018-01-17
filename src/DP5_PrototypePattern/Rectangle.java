package DP5_PrototypePattern;

public class Rectangle extends Shape {

    public Rectangle() {
        type = Rectangle.class.getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
