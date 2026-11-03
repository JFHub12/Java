
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.print("Enter a cat or a dog(cat = 1 and dog = 2): ");
        String choice = scanner.nextLine();

        if(choice.equals("cat")){
            animal = new Cat();
            animal.speak();
        }

        else if(choice.equals("dog")){
            animal = new Dog();
            animal.speak();
        }
    }
}