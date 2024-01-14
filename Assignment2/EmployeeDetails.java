package Assignment2;
class Employee{
    int empId;
    String empName;
    double empSalary;
    static int totalEmployees=0;
    public Employee(int empId,String empName,double empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
        totalEmployees++;
    }
    public Employee(String empName,double empSalary){
        this.empName=empName;
        this.empSalary=empSalary;
        totalEmployees++;
    }
    public Employee(){
        totalEmployees++;
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"sana",50000);
        Employee employee2=new Employee("sumon",60000);
        Employee employee3=new Employee();
        System.out.println("Employee1:"+employee1.empId +employee1.empName +employee1.empSalary);
        System.out.println("Employee2:"+employee2.empId +employee2.empName +employee2.empSalary);
        System.out.println("Employee3:"+employee3.empId +employee3.empName +employee3.empSalary);
        System.out.println("Total no of employee:"+Employee.totalEmployees);
    }
}
