package DP5_PrototypePattern;

public class Circle extends Shape {

    public Circle() {
        type = Circle.class.getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
