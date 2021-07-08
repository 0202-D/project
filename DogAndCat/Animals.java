abstract class Animals {
   static int animalCounter=0;
    private final int maxRun;
    private final int maxSwim;

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public Animals(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        animalCounter++;
    }

    static void animalCounter(){
   System.out.println("Животных у нас "+animalCounter);
}
   abstract void run(int distance);
   abstract void swim(int distance);
}
