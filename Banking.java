import java.util.Scanner;

public class Banking{
    double balance = 0;

    Banking(double balance) {
        this.balance = balance;

    }
    
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Banking banking = new Banking(100);
        while(true){
        banking.menu();
        }
        

    }

    
   void menu(){
        System.out.println("\nWELCOME TO JESSE'S BACNKING APP");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Redraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.print("  ⴛ: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                checkBalance();                
                break;
            case 2:
                redraw();
                break;
            case 3:
                depo();
                break;
            case 4:
                System.out.println("Thank you for you visit. We love to see you necxt time");
                System.out.println("Bye!!! Have a nice day");
                break;
            default:
                System.out.println("Invaild input");
                throw new AssertionError();
        }
    
        }

    void checkBalance(){
        if(balance >= 0){
            System.out.printf("You balance is ₵ %.2f\n", balance);
        }

        else{
            balance = 0;
            System.out.println("Balance can't a negative number");
            System.out.printf("So therefore balance is ₵ %.2f\n", balance);

        }
    }

    void redraw(){
        System.out.println("Enter amount to redraw: ");
        System.out.print("  ろ: ");
        double draw = scanner.nextDouble();

        if(draw >= balance){
            balance -= draw;
            System.out.printf("You redrawed ₵ %f\n", draw);
            System.out.printf("Your current balance is ₵ %.2f", balance);
        }

        else{
            System.out.println("Insufficient funds in account");
        }
    }

    void depo(){
        System.out.println("Enter amount to deposit: ");
        System.out.print("  ろ: ");
        double depo = scanner.nextDouble();

        if(depo >= 1){
            balance += depo;
            System.out.printf("You depositeddepo ₵ %.2f\n", depo);
            System.out.printf("Your current balance is ₵ %.2f", balance);
        }

        else{
            System.out.println("You can deposit amount less than ₵ 1 ");
            System.out.println("Amount should be atleast ₵ 1");
        }
    }


}

