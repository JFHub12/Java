import java.util.Scanner;

public class Login{
    static Scanner scanner = new Scanner(System.in);

    static void showMenu() {

        System.out.println("Welcome to Jesse's Java Login page");

        System.out.println("1. Login");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");
        System.out.print("  丈: ");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Enter username: ");
            System.out.println("Enter email: ");
            System.out.println("Enter password: ");
        }

        else if(choice == 2){
            Sign_up();
        }
    }

    static void Sign_up(){
        String first_name, last_name, username, email, password, password2;
        int number;
        System.out.println("Enter first name: ");
        first_name = scanner.nextLine();

        System.out.println("Enter second name: ");
        last_name = scanner.nextLine();

        System.out.println("Enter username: ");
        username = scanner.nextLine();

        System.out.println("Enter email: ");
        email = scanner.nextLine();

        System.out.println("Enter password: ");
        password = scanner.nextLine();

        System.out.println("Confirm password: ");
        password2 = scanner.nextLine();

        System.out.println("Enter phone number: ");
        number = scanner.nextInt();
    }

    
    
    public static void main(String[] args) {
        showMenu();
    }
}