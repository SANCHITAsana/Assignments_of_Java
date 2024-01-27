package Assignment3;
class Shape{
    public double area(){
        return 0;
    }
}
class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*r*r;
    }
}
class Rectangle extends Shape{
    double l;
    double h;
    public Rectangle(double l,double h){
        this.l=l;
        this.h=h;
    }
    public double area(){
        return l*h;
    }
}
class Triangle extends Shape{
    double b;
    double h;
    public Triangle(double b,double h){
        this.b=b;
        this.h=h;
    }
    public double area(){
        return 0.5*b*h;
    }
}
public class Area {
    public static void main(String[] args) {
        Shape cir=new Circle(8);
        Shape rec=new Rectangle(4,6);
        Shape tri=new Triangle(3,8);
        System.out.println("Area of Circle:"+cir.area());
        System.out.println("Area of Rectangle:"+rec.area());
        System.out.println("Area of Triangle:"+tri.area());
    }
}
