public class Circle extends Shape {
    private double radius1;
    private double radius2;

    public Circle(double radius1, double radius2) {
        super();
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Circle.");
        return PI * radius1 * radius2;
    }
}
