import java.util.Scanner;
import java.util.Random;

public class Main{

    /*
//Two dimensional arrays

String[][] groceries ={{"Apple", "Orange", "Bannana"},
                        {"Potato", "Onion", "Carrot"},
                        {"Chicken", "Pork", "Beef", "Fish"}};

    for(String[] foods : groceries){
        for(String food : foods){
            System.out.print(food + " ");
        }
        System.out.println();
    }
*/
   


/*
    static void myfriends(String name, int age, String colour) {
        //int increase = 0;
        System.out.println("These are my friends");
        //System.out.printf("number %d\n", increase);
        System.out.printf("%s is my name, i am %s in colour\n", name, colour);
        System.out.printf("I am %d of age\n\n", age);


    }
//A method is written outside the main function
    */


   //about classs
   String location;
   static int number;

   Main(String location){
    this.location = location;
    number++;
   }





    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Hello I am a Jesse here");
        // System.out.println("I am here to learn Java");
        // System.out.println("The shoutcut for System.out.println is sout");

        // int age = 12;
        // System.out.println("I am" + age + "old");

        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine();



/*
        //Calculate area of a rectangle
        

        System.out.println("Calculating the Area of a rectangle\n");

        System.out.print("Enter the width of the rectangle: ");
        float width = scanner.nextFloat();

        System.out.print("Enter the height of the rectangle: ");
        float height = scanner.nextFloat();

        float Area;
        Area = width * height;

        System.out.println("The Area of the rectangle is " + Area + "cm");
*/


/*
    //Finding the circumference, area and volume of a circle

    double radius = 0;

    
    System.out.println("Finding the circumference, area and volume of a circle");
    System.out.print("\nEnter radius: ");
    radius = scanner.nextDouble();

    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius, 2);
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    

    System.out.printf("The Circumference of a circle: %.1fcm\n", circumference);
    System.out.printf("The Area of a circle: %.1fcm\n", area);
    System.out.printf("The Volume of a circle: %.1fcm\n", volume);
*/

/*
 //How to use the printf()

 //[specifier-charatere]
 String name = "Jesse";
 int age = 19;
 char firstletter = 'J';
 double gpa = 4.0;
 boolean grade = true;

System.out.printf("I am called %s\n", name);
System.out.printf("I am %d years old\n", age);
System.out.printf("With %c being the first letter of my name\n ", firstletter);
System.out.printf("And a GPA of %f\n",gpa);
System.out.printf("My grade will always be %b\n\n", grade);


//[.precision]
double price = 232233.32203;
double price2 = -1111.111;

System.out.printf("%.2f\n\n", price);

//[Width]

int num1 = 1;
int num2 = 23;
int num3 = 456;
int num4 = 7890;

System.out.printf("%04d\n",num1);
System.out.printf("%04d\n",num2);
System.out.printf("%04d\n",num3);
System.out.printf("%04d\n",num4);

System.out.printf("%4d\n",num1);
System.out.printf("%4d\n",num2);
System.out.printf("%4d\n",num3);
System.out.printf("%4d\n",num4);

System.out.printf("%-4d\n",num1);
System.out.printf("%-4d\n",num2);
System.out.printf("%-4d\n",num3);
System.out.printf("%-4d\n\n",num4);

//[flags]
System.out.printf("%+,.1f\n", price);
System.out.printf("%,.3f\n", price);
System.out.printf("%(,.2f\n", price2);
System.out.printf(" %f\n", price);

*/


/*
//Formula for the Amount
double amount;
double principal = 10000;
double rate = 3 /100;
int times = 1;
int years = 1 ;

amount = principal*(Math.pow((1+(rate/years)), (years*times)));

System.out.println(amount);
*/

/*
//Temperature conversion

System.out.println("TEMPERATURE CONVERSION\n");
System.out.println("1. Convert Fahrenheit to Celsius");
System.out.println("2. Convert Celsius to Fahrenheit");
System.out.println("3. Exit\n");
System.out.print("Choice: ");
int choice = scanner.nextInt();

//double Celsius = 5/9 * (Fahrenheit - 32);
//double Fahrenheit = 9/5 * (Celsius + 32);

if( choice == 1){
    System.out.print("Enter temperature: ");
    double Fahrenheit = scanner.nextDouble();

    double Celsius = 5/9 * (Fahrenheit - 32);

    System.out.printf("Fahrenheit to Celsius: %f\n", Celsius);

}

else if(choice == 2){
    System.out.print("Enter temperature: ");
    double Celsius = scanner.nextDouble();

    double Fahrenheit = 9/5 * (Celsius + 32);

    System.out.printf("Celsius to Fahrenheit: %f\n", Fahrenheit);

}

else if(choice == 3){
    System.out.println("Thank you for the visit");
    System.out.println("Enjoy your day, byeeee");
}

else{
    System.out.println("Invalid input try again later");
}

switch (choice) {
    case 1:
        System.out.print("Enter temperature: ");
        double Fahrenheit = scanner.nextDouble();
        double Celsius = 5/9 * Fahrenheit - 32;

        System.out.printf("Fahrenheit to Celsius: %f\n", Celsius);

        break;
    case 2:
        System.out.print("Enter temperature: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 9/5 * (celsius + 32);


        System.out.printf("Celsius to Fahrenheit: %f\n", fahrenheit);
    default:
        System.out.println("invalid");
}
*/

/*
//Ternary operator ? Return 1 or 2 values if condition is true 

int score = 55;

String passOrFail = (score >= 60) ? "Pass" : "Fail"; 

System.out.println(passOrFail);

*/


/*
//Methods here


myfriends("Jesse", 19, "Dark");

*/

/*
//Arrays
String[] friends ={"Ransford", "Esi", "Selasi", "Eugenia", "Gifty"};

//using for each
    // for(String friend : friends){
    //     System.out.println(friend);
    // }

//using for loop
    for(int i = 0; i < friends.length; i++){
        System.out.print(friends[i]);
    }
*/

/*
//Main object

Main main1 = new Main("Spintex");
Main main2 = new Main("Accra");
Main main3 = new Main("Kasoa");

System.out.println(Main.number);

*/





scanner.close();
}
}