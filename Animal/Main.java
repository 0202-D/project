public class Main {
    public static void main(String[] args) {
Cat cat = new Cat("Мурзик");
cat.run(150);
Dog dog =new Dog("Палкан");
dog.run(500);
cat.swim(10);
dog.swim(15);
Dog dog1=new Dog("Wolf");
dog1.run(400);
        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());
    }

}
