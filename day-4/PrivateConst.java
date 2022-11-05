public class PrivateConst {
    String name;
    int roll;

    private PrivateConst() {
        this.name = "lala";
        this.roll = 10;
        System.out.println(name + " " + roll);
    }

    public static void main(String[] args) {
        PrivateConst ref = new PrivateConst();

    }
}
