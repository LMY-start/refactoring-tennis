package cn.xpbootcamp.tennis;

public class Player {
    private int point = 0;
    private String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    public void addPoint() {
        point++;
    }
}
