class Employee {
    String id, name;
    int mSal;

    public Employee(String id, String name, int mSal) {
        this.id = id;
        this.name = name;
        this.mSal = mSal;
    }

    public int geYearlySal() {
        return this.mSal * 12;
    }
}

class Teacher extends Employee {
    int nSubj;

    public Teacher(String id, String name, int mSal, int nSubj) {
        super(id, name, mSal);
        this.nSubj = nSubj;
    }

    public int getYearlySal() {
        return super.geYearlySal() + nSubj * 12;
    }

}

public class Inheritance03 {
    public static void main(String[] args) {
        Teacher t = new Teacher("122", "isha hitang", 3000, 4);
        System.out.println(t.getYearlySal());
        Employee e = new Employee("144", "kamala Pandey", 2000);
        System.out.println(e.geYearlySal());

    }
}
