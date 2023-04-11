package week1;

import java.util.ArrayList;

public class ShapeDriver {

    public static void main(String[] args) {

        Circle circ1 = new Circle("purple", 5, 0,0);

        Rectangle rect = new Rectangle("red", 5,8,0,0);

        System.out.println("The area of our circle is: " + circ1.area());
        System.out.println("The area of our rectangle is: " + rect.area());

        Shape mask = rect;

        Shape.maximumArea(circ1, rect);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(circ1);
        shapes.add(rect);

        for(Shape shape: shapes){
            System.out.println(shape.getString());
        }


        Object o = rect;
        Circle circ = (Circle)o;

    }


}
