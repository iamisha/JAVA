// write a code animal as a base class, cat(derived class) and cow(derived class). Write a eat() 
// method in animal class and override that method in the derived class.
class Animals {
    void eat() {
        System.out.println("i'm animal");
    }
}

class Dog extends Animals {
    void eat() {
        System.out.println("i'm dog");
    }
}

class Cat extends Animals {
    void eat() {
        System.out.println("i'm cat");
    }
}

public class Hierarchichal02 {
    public static void main(String[] args) {
        Animals a = new Animals();
        Animals b = new Dog();
        Animals c = new Cat();
        a.eat();
        b.eat();
        c.eat();
    }
}
