public class Car{
    String name = "Jesse";
    int age = 19;
    char fname = 'J';
    boolean isCorrect = true;
    
    void eat(){
        System.out.println(name + " lies eating paaaa");
    }

public static void main(String[] args) {
    Car car = new Car();
    System.out.println(car.name);

    car.eat();
}

}