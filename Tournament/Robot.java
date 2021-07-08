public class Robot implements Participants{
    private String model;

    public Robot(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void run() {
        System.out.println(model + " runing!");
    }
    public void jump() {
        System.out.println(model + " jumping!");
    }
}
