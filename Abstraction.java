interface Soundable {
    void makeSound();
}

abstract class Animal {
    abstract void eat();
    abstract void sleep();
}


class Dog extends Animal implements Soundable {
    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}


class Cat extends Animal implements Soundable {
    @Override
    void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat(); 
        dog.sleep(); 
        ((Soundable) dog).makeSound(); 

        Animal cat = new Cat();
        cat.eat(); 
        cat.sleep();
        ((Soundable) cat).makeSound();
    }
}
