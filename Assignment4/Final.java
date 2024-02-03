package Assignment4;
class Person {
    public final void introduce() {

        System.out.println("I am a person.");
    }
}

class Student extends Person {
//    public void introduce() {
//        System.out.println("I am a student.");
//    }
}

class Teacher extends Person {
//    public void introduce() {
//        System.out.println("I am a teacher."); it's not possible because introduce() method is a final method
//    }
}

public class Final {
    public static void main(String[] args) {
        Person person = new Person();
        person.introduce();

        Student student = new Student();
        student.introduce();

        Teacher teacher = new Teacher();
        teacher.introduce();
    }
}

