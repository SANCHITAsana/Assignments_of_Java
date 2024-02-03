package Assignment4;
final class Shape1 {
    public void draw() {
        System.out.println("Drawing shape");
    }
}
//class Circle extends Shape {
//    // This class cannot be created because Shape is final
//}
public class DrawingShape{
    public static void main(String[] args) {
        Shape1 shape = new Shape1();
        shape.draw();
    }
}
