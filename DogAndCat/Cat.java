public class Cat extends Animals {
    private String name;

    static int catCounter = 0;

    public Cat(int maxRun, String name) {
        super(maxRun, -1);
        this.name = name;
        catCounter++;
    }

    public String getName() {
        return name;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    @Override
    void run(int distance) {
        if (distance <= getMaxRun()) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не побежал");
        }
    }

    void swim(int distance) {
        System.out.println("Коты не плавают!");

    }

    public void getCounter() {
        System.out.println("Котов у нас " + catCounter);

    }
}
