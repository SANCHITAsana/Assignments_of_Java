package Assignment3;
import java.util.Scanner;
public class String_Buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer buf= new StringBuffer();
        System.out.println("Enter the first string: ");
        String fc = sc.nextLine();
        buf.append(fc);
        System.out.println("Enter the second string: ");
        String ss = sc.nextLine();
        buf.append(ss);
        System.out.println("After appending: " + buf);
        System.out.println("Enter the string to insert: ");
        String is = sc.nextLine();
        buf.insert(10, is);
        System.out.println("After inserting: " + buf);
        buf.delete(6,8);
        System.out.println("After deleting: " + buf);
    }
}
