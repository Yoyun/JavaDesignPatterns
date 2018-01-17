package DP5_PrototypePattern;

public class Square extends Shape {

    public Square() {
        type = Square.class.getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
