
public class Dog extends Animal{
    int lives;

    Dog(String name, int age, boolean isAlive, int lives){
        super(name, age, isAlive);
        this.lives = lives;
    }


    @Override
    void speak(){
        System.out.println("The dog goes *woof* ");
        System.out.printf("And i have %d lives\n", lives);
    }
}