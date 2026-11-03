import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
    
    float num1;
    float num2;
    char operator;
    float result;

    System.out.print("Enter first number: ");
    num1 = scanner.nextFloat();
    
    System.out.print("Choose an operation(+, -, *, /, %): ");
    operator = scanner.next().charAt(0);

    System.out.print("Enter second number: ");
    num2 = scanner.nextFloat();

    switch (operator) {
        case '+':
            result = num1 + num2;
            System.out.printf("%f + %f = %f", num1, num2, result);
            break;
        case '-':
            result = num1 - num2;
            System.out.printf("%f + %f = %f", num1, num2, result);
            break;
        default:
            throw new AssertionError();
    }



      scanner.close();
    }
}