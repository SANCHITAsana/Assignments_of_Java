package Assignment4;
public class Vehicle {
    double speed;
    int capacity;
    public Vehicle(double speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }
}
class Car extends Vehicle {
    String model;
    public Car(double speed, int capacity, String model) {
        super(speed, capacity);
        this.model = model;
    }
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Capacity: " + capacity);
    }
    public static void main(String[] args) {
        Car car = new Car(60.0, 5, "Suzuki");
        car.displayDetails();
    }
}