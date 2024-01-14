package Assignment2;

public class CalculateArea {
    public static float area(float a){
        float areaofsquare=a*a;
        return areaofsquare;
    }
    public static float area(float a ,float b){
        float areaofrectangle=a*b;
        return areaofrectangle;
    }
    public static double area(double r){
        double areaofcircle= Math.PI*r*r;
        return areaofcircle;
    }

    public static void main(String[] args) {
        System.out.println(area(20.5f));
        System.out.println(area(10.5f,20.4f));
        System.out.println(area(4.8));
    }
}
