import java.sql.SQLOutput;
import java.util.Scanner;

/*
class newSwitch {
    static void main(String[] args) {
        newSwitch newS = new newSwitch();
        newS.newDay(1);
    }

    public void newDay(int day){
        String Day = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println(Day);
    }
}
*/

//! Problem 1 : To find out Minimum among Two Numbers
/*
class newSwitch{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Value : ");
        int firstVal = sc.nextInt();

        System.out.print("Enter Second Value :");
        int secondVal = sc.nextInt();

        newSwitch find = new newSwitch();
        find.findMin(firstVal, secondVal);
    }

    public void findMin(int first, int second){
        System.out.println((first < second)?first:second + " is Minimum among "+ first + " and " + second);
    }
}*/
//! Problem 2 : To find out a given number is odd or even
/*
class newSwitch{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int firstNumber = input.nextInt();

        newSwitch oddE = new newSwitch();
        oddE.oddEven(firstNumber);
    }

    public void oddEven(int number1){
        System.out.println("The Number is : "+( (number1 & 1)==1 ? "Odd" : "Even" ));
    }
}*/
//! Problem 3 : TO Calculate an absolute Value of a given integer
/*
class newSwitch{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Value to find it's absolute Value : ");
        int value1 = input.nextInt();

        newSwitch value = new newSwitch();
        value.absValue(value1);
    }
    public void absValue(int number){
        System.out.println("Absolute Value of "+number+ " is : " + ((number < 0)? -number : number));
    }
}
*/
/*
class newSwitch{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks1 = input.nextInt();

        newSwitch nw = new newSwitch();
        nw.calculateMarks(marks1);
    }
    void calculateMarks(int marks){
        if (marks >= 80){
            System.out.println("Your Grade is : High");
        }
        else if (marks > 50 && marks < 79){
            System.out.println("Your Grade is : Moderate");
        }
        else if (marks > 0 && marks < 50){
            System.out.println("Your Grade is : Low");
        }
        else{
            System.out.println("Enter Marks in the Range of 0 - 100");
        }
    }
}
 */
//! To print months based on 1 - 12
/*
class newSwitch{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value Between 1 - 12 : ");
        int userInput = input.nextInt();

        newSwitch nw = new newSwitch();
        nw.monthOfTheYear(userInput);
    }
    public void monthOfTheYear(int digit){
        String output = switch (digit){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalArgumentException("Input Must be Between 1 - 12 ");
        };
        System.out.println("The Month on "+digit + " is : "+output);
    }
}
 */
//! TO create a Basic Calculator using Switch
class newSwitch{
    static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st value : ");
        int input1 = input.nextInt();

        System.out.print("Enter an Operation : ");
        String operaton = input.next();

        System.out.print("Enter 2nd Value : ");
        int input2 = input.nextInt();

        newSwitch nw = new newSwitch();
        int output = nw.Calculator(input1 , operaton, input2);
        System.out.println("Output is : "+output);
    }
    public int Calculator(int num1 ,String op, int num2){
        int oper = switch (op){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default -> throw new IllegalArgumentException("Kindly Pass '+', '-' , '*' , '/' Argument as an Operation.");
        };
        return oper;
    }
}