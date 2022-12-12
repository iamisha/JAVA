class Student {
    String name;
    int roll;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return this.name;
    }

    public int getRoll() {
        return this.roll;
    }
}

class Objectandclass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Isha Hitang");
        s1.setRoll(201710);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
    }
}