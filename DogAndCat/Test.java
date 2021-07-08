public class Test {
    public static void main(String[] args) {
     Animals [] animals ={
             new Cat(500,"Tom"),new Dog(1000,100,"PLuto"),
             new Dog(1000,100,"Rex")};
        for (int i = 0; i < animals.length ; i++) {
            animals[i].run(250);
            animals[i].swim(150);
        }

            

            
        
             
            
        

        Animals.animalCounter();
    }

}
