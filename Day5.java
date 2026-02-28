/*
public class Day5 {
    public static void main(String[] arguments) {
        int yearIn = 2012;
        int monthIn = 1;

        if (arguments.length > 0) {
            monthIn = Integer.parseInt(arguments[0]);
            System.out.println(monthIn + "/" + yearIn + " has "
                    + countDays(monthIn, yearIn) + " days.");
        } else {
            System.out.println("Please provide month as argument.");
        }
    }

    static int countDays(int month, int year) {
        int count;
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                count = 31;
                break;

            case 4: case 6: case 9: case 11:
                count = 30;
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    count = 29;
                else
                    count = 28;
                break;

            default:
                count = -1;
        }
        return count;
    }
}
 */
//! Total Sum of an array
/*
public class Day5 {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int total = 0;

        for (int i = 0; i < arr1.length; i++) {
            total += arr1[i] + arr2[i];
        }

        System.out.println("The total value is : "+ total);
    }
}
 */
