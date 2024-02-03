package Assignment4;
class Employee {
    private int employeeID;
    private int salary;

    public Employee(int employeeID, int salary) {
        this.employeeID = employeeID;
        this.salary = salary;
    }
}
class Manager extends Employee {
    String department;
    public Manager(int employeeID, int salary, String department) {
        super(employeeID, salary);
        this.department = department;
    }
    public void displayDetails() {
//        System.out.println("Employee ID: " + employeeID);
//        System.out.println("Salary: $" + salary); employeeID & salary both are private
        System.out.println("Department: " + department);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Manager manager = new Manager(12345, 50000 ,"Sales");
        manager.displayDetails();
    }
}
