import java.util.Scanner;
/*
public class Recursive {
    public static void main(String[] args) {
        System.out.println("Welcome to Password Checker");
        Scanner input = new Scanner(System.in);

        int inputPass;

        do {
            System.out.print("Enter a Password : ");
            inputPass = input.nextInt();

            if (inputPass == 2580) {
                System.out.println("Password Verified");
                break;
            } else {
                System.out.println("Invalid Password. Try again.");
            }

        } while (true);
    }
}
*/
//! Checking Password Using Recursive Function
/*
class Recursive{
    static void main(String[] args){
        System.out.println("Welcome to Password Checker");
        int password = 121972;
        passwordChecker(password);
    }

    public static void passwordChecker(int pass){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Password to Verify : ");
        int userPass = input.nextInt();

            if (userPass == pass){
                System.out.println("Password Verified");
                return;
            }
            else{
                System.out.println("Invalid Password, Kindly Pass Again...");
            }
        passwordChecker(pass);
    }
}
*/
//! Guessing Number Game
/*
class Recursive{
    static void main(String[] args){
        System.out.println("Welcome to Number Guessing Game. Enter a Number Between 0 to 10");
        Scanner input = new Scanner(System.in);

        int randomNumber = (int)(Math.random()*10);

        int TotalGuess = 3;
        do{
            System.out.print("Enter a Guessed Value : ");
            int guessedNumber = input.nextInt();

            if(randomNumber == guessedNumber){
                System.out.println("You Guessed it Right");
                break;
            } else{
                System.out.println("That's not a Number, Make a Guess again...");
                TotalGuess--;
            }
        }while (TotalGuess > 0);
        System.out.println("You are Out of Guess");
    }
}
 */
//! TO find out Maximum number in an Array
/*
public class Recursive {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 56};

        int max = arr[0];   // assume first element is max

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Maximum number in the array is: " + max);
    }
}
*/
//! To write a program to find out an occurrence of specific element
/*
class Recursive{
    static void main(String[] args){
        int[] element = {1,2,3,4,5,6,2,3,4,5,6,4,5,6,5,6};

        System.out.println("Welcome to Occurrence Finder");

        System.out.print("Enter an element to find total occurrence of that element : ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        int minimumOccurrence = 0;
        for (int value : element){
            if (value == userInput){
                minimumOccurrence++;
            }
        }
        System.out.println("Total Occurrence of the "+userInput + " is "+minimumOccurrence + " Times");
    }
}
 */
//! To Exit a loop when user enters "Exit".
/*
class Recursive {
    public static void main(String[] args) {

        System.out.println("To Exit from the loop Kindly input \"Exit\" ");
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter an Input");
            String userInput = input.next();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Enter above mentioned string to break the loop");
            }

        } while (true);
    }
}
 */
//! Printing Sum of all positive Numbers -> Production Grade Approach
/*
class SumCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers to add. Type 'exit' to stop.");

        while (true) {
            System.out.print("Input: ");
            String userInput = input.nextLine().trim();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            if (!userInput.matches("-?\\d+")) {
                System.out.println("Invalid input. Numbers only.");
                continue;
            }

            sum += Integer.parseInt(userInput);
        }

        System.out.println("Total Sum: " + sum);
    }
}
*/

//! Printing Sum of all positive Numbers
/*
public class Recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        do{
            System.out.println("Enter Values : ");
            int userInput = input.nextInt();

            if(userInput < 0){
                break;
            }

            sum +=userInput;
        } while(true);

        System.out.println("Total Sum is :"+ sum);
    }
}
*/
//! Define a Student Class and user toString Method to print the name age and user toString method to print every
//! details
/*
public class Recursive {
    String name = "Sahil";
    int age = 23;

    @Override
    public String toString() {
        return
                "Name is :"+name + "," + "and your current age is : "+age;
    }

    static void main(String[] args) {
        Recursive rc = new Recursive();
        System.out.println(rc);
    }
}
*/
//! To Calculate Area and Circumference of a Circle using Math.PI
/*
public class Recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius of Circle : ");
        int userInput = input.nextInt();

        System.out.println("The Area of Circle is : "+Math.ceil(Math.PI*(userInput*userInput)));
    }
}
 */
//! To Simulate the roll of dice and print the number between 1 to 6 using Math.random Method
/*
public class Recursive {
    static void main() {
        System.out.println("Welcome to Dice Roller Game");

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println(dice);
    }
}
 */
//! Create a Random Number guessing Game
/*
public class Recursive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number guessing Game");

        int randomGeneratedNumber = (int)(Math.random()*10);
        do {
            System.out.print("Enter a Number : ");
            int userInput = input.nextInt();

            if(randomGeneratedNumber > userInput){
                System.out.println("Please Enter a larger Number");
            } else if (randomGeneratedNumber < userInput) {
                System.out.println("Please Enter a Smaller Number");
            } else{
                System.out.println("You Guessed it right, You Won !");
                break;
            }
        }while (true);
    }
}
 */
