package Assignment2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PrintRoll_AvgMarks {
    int roll;
    float avg;
    int marks;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of subjects:");
        int num =sc.nextInt();
        PrintRoll_AvgMarks ob[]=new PrintRoll_AvgMarks[num];
        for(int i=0;i<num;i++){
            ob[i]=new PrintRoll_AvgMarks();
            System.out.println("Enter the roll of students:"+(i+1));
            ob[i].roll=sc.nextInt();
            System.out.println("Enter the marks of each subject:"+(i+1));
            ob[i].marks=sc.nextInt();
        }
        System.out.println("Roll no:\t"+" "+"Marks:\t");
        for (int i=0;i<num;i++){
            System.out.println(ob[i].roll+""+ob[i].marks);
        }
    }
}
