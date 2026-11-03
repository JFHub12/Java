
import java.util.Scanner;

public class grading {
     Scanner scanner = new Scanner(System.in);
    void Grades(){
    while(true){

    }
    System.out.println("Enter your score to check grade: ");
    System.out.print("    ꍌ: ");
    float scores = scanner.nextFloat();
    String grade;
    if(scores >= 0 && scores <= 100){
        if(scores >= 80){
            grade = "A";
        }

        else if(scores >= 75){
        grade = "B+";
        }

        else if(scores >= 70){
            grade = "B";
        }

        else if(scores >= 65){
            grade = "C+";
        }

        else if(scores >= 60){
            grade = "C";
        }

        else if(scores >= 55){
            grade = "D+";
        }

        else if(scores >= 50){
            grade = "D";
        }

        else if(scores >= 45){
            grade = "E";
        }

        else{
            grade = "F";
        }
        
        System.out.printf("Your grade is %s", grade);
    }

    else{
        System.out.println("Invaid input. Try again later");
    }

    
}

void course(){
    System.out.println("Enter the number of course studied: ");
    System.out.print("  ꅓ: ");
    int course = scanner.nextInt();
}

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        grading graded = new grading();

        System.out.println("This Is A System Of A Grading System");

        System.out.println("1. Check Grade");
        System.out.println("2. Check GPA");
        System.out.print("    ꅓ: ");
        int grade = scanner.nextInt();

        switch(grade){
            case 1:
                graded.Grades();
                break;
            default:
                System.out.println("Invaid");
                
        }
    }
}