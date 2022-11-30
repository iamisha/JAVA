class Animal {
    void eat() {
        System.out.println("eating");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("baaaaaaaaaaa");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowwwwwwwwwwwww");
    }
}

public class Hierarchical {
    public static void main(String[] args) {

        Cow co = new Cow();
        co.sound();
        co.eat();

        Cat ca = new Cat();
        ca.meow();
        ca.eat();
    }

}
