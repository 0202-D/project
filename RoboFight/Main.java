import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rocky", 200, 20, new String[] { "punch", "punch", "laser", "missile" });
        Robot robot2 = new Robot("Missile Bob", 100, 21, new String[] { "missile", "missile", "missile", "missile" });
        Map<String, Integer> tactics = new HashMap<>(3, 1f);
        tactics.put("punch", 20);
        tactics.put("laser", 30);
        tactics.put("missile", 35);
Arena arena =new Arena();
arena.fight(robot1,robot2,tactics);
    }
}
