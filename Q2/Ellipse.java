public class Ellipse extends Shape {
    private double A;
    private double B;

    public Ellipse(double a, double b) {
        super();
        A = a;
        B = b;
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Ellipse.");
        return PI * A * B;
    }
}
