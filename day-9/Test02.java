class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

class Voter {
    String name;
    int age;

    public Voter(String name, int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("invalid age");
        } else {
            this.name = name;
            this.age = age;
            System.out.println(this.name + " " + this.age);
        }
    }
}

public class Test02 {
    public static void main(String[] args) {
        try {
            Voter fout = new Voter("isha", 18);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
