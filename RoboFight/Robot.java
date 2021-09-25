public class Robot {
    private String name;
    private int health;
    private int speed;
    private String [] tactic;

    public Robot(String name, int health, int speed, String[] tactic) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.tactic = tactic;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public String[] getTactic() {
        return tactic;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
