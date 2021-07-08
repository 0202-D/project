public class Main {
    public static void main(String[] args) {
  Participants [] participants = {new Robot("T-1000"),new Cat("Tom"),new Human("Ivan")};
  Obstacles [] obstacles ={new PunningRoad(),new Wall()};
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length ; j++) {
                obstacles[j].passingThrough(participants[i]);
            }

        }
    }

}
