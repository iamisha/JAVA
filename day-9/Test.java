class SemesterException extends Exception {
    public SemesterException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int sem;

    public Student(String name, int sem) throws SemesterException {
        if (sem < 1 || sem > 8) {
            throw new SemesterException("invalid semester");
        } else {
            this.name = name;
            this.sem = sem;
            System.out.println(this.name + " " + this.sem);
        }
    }
}

class Test {
    public static void main(String[] args) {
        try {
            Student s = new Student("isha", 9);
        } catch (SemesterException e) {
            System.out.println(e.getMessage());
        }
    }

}
