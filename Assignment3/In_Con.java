package Assignment3;
class Vehicle {
    String make;
    String model;
    int year;
}
class Car extends Vehicle{
     Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
        System.out.println("Car make:"+make);
        System.out.println("Car model:"+model);
        System.out.println("Car year:"+year);
    }
}
class Motorcycle extends Vehicle{
    Motorcycle(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
        System.out.println("Motorcycle make:"+make);
        System.out.println("Motorcycle model:"+model);
        System.out.println("Motorcycle year:"+year);
    }
}
public class In_Con {
    public static void  main(String[] args) {
        Car car=new Car("Toyota","Camry",2022);
        Motorcycle motorcycle=new Motorcycle("Honda","CBR500R",2021);

    }
}

