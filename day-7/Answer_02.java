abstract class Player {
    String name, team;

    public Player(String name, String team) {
        this.name = name;
        this.team = team;
    }

    abstract void showStat();
}

class Football extends Player {
    int m;

    public Football(String name, String team, int m) {
        super(name, team);
        this.m = m;
    }

    public void showStat() {
        System.out.println("goal");
    }
}

class Answer_02 {

    public static void main(String[] args) {
        Football f = new Football("messi", "cesanno", 7);
        f.showStat();
    }
}
