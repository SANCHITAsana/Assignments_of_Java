package Assignment4;
public class Circle {
    final double PI = 3.14;
    double r;
    public Circle(double r) {
        this.r= r;
    }
    public double calculateArea() {
        return PI * r * r;
    }
    public static void main(String[] args) {
        double r = 5.0;
        Circle circle = new Circle(r);
        System.out.println("Area of the circle is: " + circle.calculateArea());
    }
}
