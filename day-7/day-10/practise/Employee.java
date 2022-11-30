// Single Inheritance in JAVA
class EmployeeTest {
    String id, name;

    public EmployeeTest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + " " + this.name;
    }
}

class Employee {
    public static void main(String[] args) {
        EmployeeTest e = new EmployeeTest("122", "isha hitang");
        System.out.println(e);

    }
}
