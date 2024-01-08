import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args){
        int a,b,c,sum;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no:");
        a= sc.nextInt();
        System.out.print("Enter 2nd no:");
        b= sc.nextInt();
        System.out.print("Enter 3rd no:");
        c= sc.nextInt();
        sum=a+b+c;
        double avg=sum/3;
        System.out.print("Average of the numbers:"+avg);
    }
}
