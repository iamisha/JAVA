class Storage {
    int memory;
    boolean HDD;

    public Storage(int memory, boolean HDD) {
        this.memory = memory;
        this.HDD = HDD;
    }

    public void showDetail() {
        System.out.println(this.memory + " " + this.HDD);
    }
}

class Computer {
    String bName;
    int price;
    Storage str;

    public Computer(String bName, int price, Storage str) {
        this.bName = bName;
        this.price = price;
        this.str = str;
    }

    public void showDetail() {
        System.out.println(this.bName + " " + this.price);
        this.str.showDetail();
    }
}

class Answer_01 {
    public static void main(String[] args) {
        Storage s = new Storage(12, false);
        Computer c = new Computer("lenovo", 78000, s);
        c.showDetail();
    }
}
