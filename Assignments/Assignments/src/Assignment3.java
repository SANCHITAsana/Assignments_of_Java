import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first number:");
        int n= sc.nextInt();
        System.out.print("Input second number:");
        int m= sc.nextInt();
        System.out.println(n+"+"+m+"="+(n+m));
        System.out.println(n+"-"+m+"="+(n-m));
        System.out.println(n+"X"+m+"="+(n*m));
        System.out.println(n+"/"+m+"="+(n/m));
        System.out.println(n+"mod"+m+"="+(n%m));
    }
}
