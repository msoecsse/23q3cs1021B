package week1;

public interface Shape {

    public final static double PI = 3.14;

    /**
     * This is a method that calculated the area of a given shape.
     * @return are of the shape
     */
    public double area();

    public double perimeter();

    String getString();

    public static int maximumArea(Shape one, Shape two){
        return one.area() >= two.area() ? 1 : 2;
        }

}
