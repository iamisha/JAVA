
class NextDefaultConst {
    int a;
    String name;

    public NextDefaultConst() {// default constructor
        a = 10;
        name = "isha";
    }

    void fun() {
        System.out.println(a + " " + name);
    }
}

class DefaultConst {
    public static void main(String[] args) {
        NextDefaultConst ref = new NextDefaultConst();
        ref.fun();
    }
}
