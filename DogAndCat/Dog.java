public class Dog extends Animals {
    private String name;
static int dogCounter =0;

    public Dog(int maxRun, int maxSwim, String name) {
        super(maxRun, maxSwim);
        this.name = name;
        dogCounter++;
    }

    @Override
    void run(int distance) {
        if (distance <= getMaxRun()) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не может столько бежать!!!");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= getMaxSwim()) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не доплывет!!!");
        }
    }
    void dogCounter(){
        System.out.println("Собак у нас "+dogCounter);
    }
}
