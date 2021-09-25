import java.util.Map;

public class Arena {
    void fight(Robot robot1 ,Robot robot2, Map<String, Integer> tactics){

        if(robot2.getSpeed()>=robot1.getSpeed()) {
        for(int i=0;i<Math.min(robot1.getTactic().length,robot2.getTactic().length);i++){
            robot1.setHealth(robot1.getHealth() - tactics.get(robot2.getTactic()[i]));
            robot2.setHealth(robot2.getHealth() - tactics.get(robot1.getTactic()[i]));
            if(robot1.getHealth()<0){
            System.out.println(robot2.getName() +" win");break;}
            if(robot2.getHealth()<0){
                System.out.println(robot1.getName() +" win");break;}
        }
        }

      //  System.out.println(robot.health);
      //  System.out.println(robot1.health);
    }
}
