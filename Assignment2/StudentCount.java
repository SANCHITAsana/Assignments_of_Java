package Assignment2;

class Student {
    static int count = 0;

    public Student() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
public class StudentCount {
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        System.out.println("Total no of students:"+Student.getCount());
    }
}
