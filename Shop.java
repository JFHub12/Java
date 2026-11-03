import java.util.Scanner;


public class Shop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What will you like to buy: ");
        String buy = scanner.nextLine();

        System.out.print("What is the price for eash?: ");
        double price = scanner.nextFloat();

        System.out.print("How many would you like to buy: ");
        int quantity = scanner.nextInt();

        double total = quantity * price;
        System.out.println("\n-------Results-------");
        System.out.println("You have bought " + quantity + " " + buy + "(s)");
        System.out.println("You total is $" + total);
        
        scanner.close();
    }
}