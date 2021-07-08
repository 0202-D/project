class Cat extends Animal {
String name;
    public static int catCount;

    public Cat(String name) {
        this.name=name;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int obstacleLengthRun) {
        if (obstacleLengthRun <= 200) {
            System.out.println(name + " пробежал " + obstacleLengthRun + " метров");}
            else{
                System.out.println(name+" сдох");}}

        public void swim (int obstacleLengthswim){
            System.out.println("Кот не умеет плавать");}

}