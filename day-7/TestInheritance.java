class Employee {
    String name;
    String id;
    int mSalary;

    public Employee(String id, String name, int mSalary) {
        this.id = id;
        this.name = name;
        this.mSalary = mSalary;
    }

    public int getYearlySalary() {
        return this.mSalary * 12;
    }

    public void showDetail() {
        System.out.println(this.id + " " + this.name + " " + this.mSalary);
    }
}

class Teacher extends Employee {
    int nSubj;

    public Teacher(String id, String name, int mSalary, int nSubj) {
        super(id, name, mSalary);
        this.nSubj = nSubj;
    }

    public int getYearlySalary() {
        return super.getYearlySalary() + this.nSubj * 1000;
    }

    public void showDetail() {
        System.out.println(this.id + " " + this.name + " " + this.mSalary + " " + nSubj);
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Teacher t = new Teacher("12", "isha", 1200, 3);
        t.showDetail();
        System.out.println(t.getYearlySalary());
        Employee e = new Employee("11", "nana", 23000);
        System.out.println(e.getYearlySalary());
        e.showDetail();

    }
}
