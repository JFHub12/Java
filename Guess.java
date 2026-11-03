import java.util.Random;
import java.util.Scanner;

public class Guess{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int attempt = 3;
        int ranNum = random.nextInt(1, 11);

        for (int i = 0; i < 3; i++) {
          System.out.print("Guess a number from 1 to 10: ");
          int guess = scanner.nextInt();

        if(guess == ranNum){
            System.out.println("You guessed right");
            break;
        } 

        else{
            System.out.println("You have " + attempt-- + " remaining");
            System.out.println("Try again");
            if(attempt == 0){
                System.out.printf("Your have %d attempts. Try again later", attempt);
            }
        } 
        }
    }
}