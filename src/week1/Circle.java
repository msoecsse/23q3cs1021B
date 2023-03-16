package week1;

public class Circle implements Shape{

    private String color;
    private double centerX;
    private double centerY;
    private double radius;

    public Circle(String color, double radius, double centerX, double centerY){
        this.color = color;
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    @Override
    public double area(){
        return Shape.PI * Math.pow(radius,2);
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double getDiamter(){
        return 2 * radius;
    }

    @Override
    public String getString() {
        return this.color;
    }

}
