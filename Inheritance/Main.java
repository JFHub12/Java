
public class Main{

    public static void main(String[] args) {
        
        Animal animal = new Animal("Mother", 20, true);
        Dog dog = new Dog("Peace", 10, true, 10);
        Cat cat = new Cat("Joy", 8, true, 8);
        System.out.println(cat);

        animal.display();

        dog.display();

        //cat.display();


    }
}