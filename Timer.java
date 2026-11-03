import java.util.Scanner;

public class Timer{
    public static void main(String[] args)throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time: ");
        int choice = scanner.nextInt();

        for(int i = choice; i > 0; i--){
            int seconds = i % 60000;
            int minutes = (i / 60000) % 60000;
            int hours = i / 3600000;
            System.out.printf("\r%02d : %02d : %02d", hours, minutes, seconds);
            Thread.sleep(1000);
        }
        
    }
}