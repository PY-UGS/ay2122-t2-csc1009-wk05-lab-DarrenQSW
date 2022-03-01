public class Square extends Shape {
    private double base;
    private double height;

    public Square(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Square.");
        return base * height;
    }
}
