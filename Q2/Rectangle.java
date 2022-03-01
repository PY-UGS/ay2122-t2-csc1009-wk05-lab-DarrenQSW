public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Rectangle.");
        return width * height;
    }
}
