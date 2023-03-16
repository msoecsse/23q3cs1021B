package week1;

public class Rectangle implements Shape{

    private String color;
    private double upperlLeftX;
    private double upperlLeftY;
    private double width;
    private double height;

    public Rectangle(String color, double height, double width, double upperlLeftX, double upperlLeftY){
        this.color = color;
        this.upperlLeftX = upperlLeftX;
        this.upperlLeftY = upperlLeftY;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public String getString() {
        return color;
    }

    public boolean isSquare(){
        return width == height;
    }
}
