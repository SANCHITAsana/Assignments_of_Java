package Assignment4;
class Animal {
    protected String name;
    public Animal(String name) {

        this.name = name;
    }
    public String getName() {

        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {

        super(name);
    }

    public String getName() {

        return name;
    }
}

public class DogName{
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        System.out.println("My dog's name is " + dog.getName());
    }
}
