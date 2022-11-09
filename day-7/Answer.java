class Employee {
    String id, name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return (name + " " + id);
    }
}

class Answer {
    public static void main(String[] args) {
        Employee e = new Employee("1222", "isha hitang");
        System.out.println(e);
    }
}