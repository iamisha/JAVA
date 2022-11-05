class ParameterizeConst {
    String name, addr;
    int roll;

    public ParameterizeConst(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public ParameterizeConst(String name, String addr) {
        this.name = name;
        this.addr = addr;
        System.out.println(name + " " + addr);
    }

    void fun() {
        System.out.println(name + " " + roll);
    }
}

class NextParameterizedConst {
    public static void main(String[] args) {
        ParameterizeConst ref = new ParameterizeConst("yunik baudel", 1);
        ParameterizeConst r = new ParameterizeConst("Youna Baudel", "palpa");
        ref.fun();
    }
}