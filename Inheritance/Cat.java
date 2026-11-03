
public class Cat extends Animal{
    int lives;

     Cat(String name, int age, boolean isAlive, int lives){
        super(name, age, isAlive);
        this.lives = lives;
    }


    @Override 
    void speak(){
        System.out.println("The dog goes *meow* ");
        System.out.printf("And i have %d lives\n", lives);
    }

    @Override
    public String toString(){
        return this.name + " is " + this.age + " years old";
    }
}