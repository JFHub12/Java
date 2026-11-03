import java.util.Scanner;
public class ChangeLetters{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String word = scanner.nextLine();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; i < word.length(); i++){
            char n = word.charAt(i);
            if(word.contains(vowels[i])){

            }

        };
        
    }
}