package Assignment4;
class Shape {
     void draw() {

         System.out.println("Drawing Shape");
    }
}

class Circle1 extends Shape {
    void draw() {

        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {

        System.out.println("Drawing Rectangle");
    }
}
public class Drawing {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();
        Circle1 circle=new Circle1();
        circle.draw();;
        Rectangle rectangle=new Rectangle();
        rectangle.draw();
    }
}
