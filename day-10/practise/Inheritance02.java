class Human {
    String name = "isha hitang";
    int age = 19;
}

class Employee extends Human {
    double sal = 12000.34;

    public void showData() {
        System.out.println(name + " " + age + sal);
    }
}

class Manager extends Employee {
    public void showData() {
        // System.out.println(name + " " + age + sal);
        super.showData();
    }
}

public class Inheritance02 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.showData();

    }
}
