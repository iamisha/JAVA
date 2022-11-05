public class ThisKey {
    void fun() {
        System.out.println(this);// refering the current object
    }

    public static void main(String[] args) {
        ThisKey ref = new ThisKey();
        System.out.println(ref);
        ref.fun();
    }
}
