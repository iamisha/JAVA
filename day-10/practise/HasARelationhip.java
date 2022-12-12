class Storage {
    int memorybase;
    boolean HDD;

    public Storage(int memorybase, boolean HDD) {
        this.memorybase = memorybase;
        this.HDD = HDD;
    }

    public void showData() {
        System.out.println(this.memorybase + " " + this.HDD);
    }
}

class Computer {
    String brandname;
    double price;
    Storage str;

    public Computer(String b, double p, Storage s) {
        brandname = b;
        price = p;
        str = s;
    }

    public void showData() {
        System.out.println(this.brandname + " " + this.price + " ");
        this.str.showData();
    }
}

public class HasARelationhip {
    public static void main(String[] args) {
        Storage st = new Storage(8, false);
        st.showData();
        Computer c = new Computer("lenovo", 78000, st);
        c.showData();
    }
}
