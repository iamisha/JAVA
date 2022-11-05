public class ThisKey_03 {
    int x, y, w, h;

    public ThisKey_03(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

    }

    public ThisKey_03(int w, int h) {
        this(0, 0, w, h);

    }

    public ThisKey_03() {
        this(0, 0, 1, 1);

    }

    void fun() {
        System.out.println(x + " " + y + " " + w + " " + h);
    }

    public static void main(String[] args) {
        ThisKey_03 ref = new ThisKey_03(1, 2, 3, 4);
        ref.fun();
        ThisKey_03 ref1 = new ThisKey_03(10, 11);
        ref1.fun();
        ThisKey_03 ref2 = new ThisKey_03();
        ref2.fun();
    }
}
