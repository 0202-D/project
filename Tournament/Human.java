public class Human implements Participants{
    private String name;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " runing!");
    }
    public void jump() {
        System.out.println(name + " jumping!");
    }
    }

