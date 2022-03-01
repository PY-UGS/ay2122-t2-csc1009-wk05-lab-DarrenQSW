public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Triangle.");
        return 0.5 * base * height;
    }
}
