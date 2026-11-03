import java.util.Scanner;

public class Questions{

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        String[] questions = {"\nWhat is the name of Fiagbe's first son",
                              "\nWhere is he from?",
                              "\nHow old is he?",
                              "\nWhat school does he attend"};

        String[][] options = {{"A. Jesse", "B. John", "C. Jeff"},
                              {"A. Esiama", "B. Anloga", "C. Shama"},
                              {"A. 18", "B. 19", "C. 20"},
                              {"A. Tech", "B. Legon", "C. Central"}};
                        
        char[] answers = {'A', 'B', 'B', 'C'};
        int score = 0;

        System.out.println("**********************");
        System.out.println("Question and Answers");
        System.out.println("***********************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String opt : options[i]){
                System.out.println(opt);
            }

            System.out.print("Choose the coorect anser: ");
            char choice = scanner.next().toUpperCase().charAt(0);

            if(choice == answers[i]){
                System.out.println("You are correct✅");
                score++;
            }

            else{
                System.out.println("You are wrong❌");
                System.out.println("The correct answer is: " + answers[i]);
            }
        }

        System.out.println("***********************");
        System.out.println("   Result: " + score + "/" + questions.length);
        System.out.println("***********************");
    }
}
