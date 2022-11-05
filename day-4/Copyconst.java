public class Copyconst {
    String name;
    int roll;

    public Copyconst(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println(name + " " + roll);
    }

    Copyconst(Copyconst ref) {
        name = ref.name;
        roll = ref.roll;
        System.out.println(name + " " + roll);
    }
}

class NextCopyconst {
    public static void main(String[] args) {
        Copyconst ref = new Copyconst("raju", 10);
        Copyconst ref2 = new Copyconst(ref);
    }
}