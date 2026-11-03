
public class Animal{

    String name;
    int age;
    boolean isAlive;

    Animal(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    void display(){
        System.out.printf("\nI an animal called %s \n", name);
        System.out.printf("I am %d of age \n", age);
        System.out.printf("And I am Alive: %b \n\n", isAlive);
    }
    

    void speak(){
        System.out.println("This animal is speaking");
    }

    void eat() {
        System.out.println("I am an Animal so therefore I can eat");
    }
}