public class Assignment5 {
    public static void findCircle(double r){
        double perimeter=2*Math.PI*r;
        double area=Math.PI*r*r;
        System.out.println("Perimeter is="+perimeter);
        System.out.println("Area is="+area);
    }
    public static void main(String[] args){
        double r=7.5;
        findCircle(r);
    }
}
