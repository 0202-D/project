 class Dog extends Animal {
    public static int dogCount;
String name;
    public Dog(String name) {
        this.name=name;
        dogCount++;
    }

     public static int getDogCount() {
         return dogCount;
     }

     @Override
    public void run(int obstacleLengthRun) {
        if (obstacleLengthRun <= 500) {
            System.out.println(name + " пробежал " + obstacleLengthRun + " метров");
        } else {
            System.out.println(name + " сдох");
        }
    }
    public void swim(int obstacleLengthSwim){
        if( obstacleLengthSwim<=10){
            System.out.println(name+" проплыл "+obstacleLengthSwim+ " метров");}
        else {
            System.out.println(name+" утонул");}

    }
}