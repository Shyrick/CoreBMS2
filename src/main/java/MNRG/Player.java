package MNRG;

public class Player {

    String name;
    int position;
    int money;
    boolean isActiv;
    int circleCount= 0;
    int totalScore = 0;



    public Player(String name) {
        this.name = name;
        this.position = 0;
        this.money = 1000;
        this.isActiv = false;

    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
