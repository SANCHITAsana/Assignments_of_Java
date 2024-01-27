package Assignment3;
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammal gives birth to live young");
    }
}
class Bat extends Mammal {
    void fly() {
        System.out.println("Bat can fly");
    }
}
class Bird extends Animal {
    void giveEggs() {
        System.out.println("Bird gives eggs");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Mammal dog = new Mammal();
        dog.eat();
        dog.sleep();
        dog.giveBirth();
        Bat bat = new Bat();
        bat.eat();
        bat.sleep();
        bat.giveBirth();
        bat.fly();
        Bird sparrow = new Bird();
        sparrow.eat();
        sparrow.sleep();
        sparrow.giveEggs();
    }
}
