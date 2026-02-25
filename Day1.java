import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Map;

//! Write a java program to find minimum and maximum element of an array.
/*
import java.util.ArrayList;

public class Day1 {

    // Use ArrayList<Integer> as the parameter
    public static void minimumElement(ArrayList<Integer> list) {
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) { // Use .size() for ArrayList
            if (list.get(i) < minElement) {     // Use .get(i)
                minElement = list.get(i);       // Use = for assignment
            }
        }
        System.out.println("The Minimum Number is : " + minElement);
    }

    public static void maximumElement(ArrayList<Integer> list) {
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxElement) {
                maxElement = list.get(i);
            }
        }
        System.out.println("The Maximum Number is : " + maxElement);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(19);
        list.add(101);

        // Just call the methods; they handle the printing inside
        minimumElement(list);
        maximumElement(list);
    }
}
 */

//! Write a java program to reverse elements of an array?
/*
public class Day1 {

    public static void reversArray(ArrayList<Integer> numArray){
        for(int i = numArray.size()-1; i >= 0 ; i--){
            System.out.println(numArray.get(i));
        }
    }

    public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>();
    list.add(12);
    list.add(22);
    list.add(32);
    list.add(42);
    list.add(52);

    reversArray(list);
    }
}
 */

//! Write a java program to sort elements of an array in ascending order.
//? Using Selection Sort
/*
import java.util.ArrayList;

public class Day1 {

    public static void sortInAscendingOrder(ArrayList<Integer> arrayList) {

        for (int i = 0; i < arrayList.size() - 1; i++) {

            int minIndex = i;
//          System.out.println("Using minIndex : "+minIndex);
//          System.out.println("Using i : "+i);
//          System.out.println("Using arrayList.get(i) : "+arrayList.get(i));
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) < arrayList.get(minIndex)) {
                    minIndex = j;
                }
            }

            // swap using indices
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(minIndex));
            arrayList.set(minIndex, temp);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(98);
        array.add(48);
        array.add(18);
        array.add(88);
        array.add(48);

        sortInAscendingOrder(array);

        System.out.println(array);
    }
}
*/
//? Using Insertion Sort
/*
import java.util.ArrayList;

public class Day1 {

    public static void AscendingSortUsingInsertion(ArrayList<Integer> arrayList) {

        for (int i = 1; i < arrayList.size(); i++) {
            int j = i;

            while (j > 0 && arrayList.get(j - 1) > arrayList.get(j)) {
                int temp = arrayList.get(j);
                arrayList.set(j, arrayList.get(j - 1));
                arrayList.set(j - 1, temp);
                j--; // 🔑 mandatory
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(90);
        arrayList.add(56);
        arrayList.add(87);
        arrayList.add(23);
        arrayList.add(9);

        AscendingSortUsingInsertion(arrayList);
        System.out.println(arrayList);
    }
}
 */
//? Repeating Insertion Sort
/*
public class Day1 {

    public static void sortUsingInsertion(ArrayList<Integer> arrayList){
        // Taking 1st element as Sorted so loop will be from 1 to end
        for (int i = 1; i < arrayList.size(); i++) {
            // Here we will take a condition so check from i to the start of i
            int j = i;
            while (j > 0 && arrayList.get(j-1) > arrayList.get(j)){
                //Swap elements of j-1 with j so element becomes sorted
                int temp = arrayList.get(j);
                arrayList.set(j, arrayList.get(j-1));
                arrayList.set((j-1), temp);
                j--;
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(43);
        arrayList.add(23);
        arrayList.add(73);
        arrayList.add(93);
        arrayList.add(13);

        System.out.print("Sorted Array : ");
        sortUsingInsertion(arrayList);
        System.out.println(arrayList);
    }
}
 */
//! Using Bubble Sort
/*
import java.util.ArrayList;

public class Day1 {

    public static void sortingUsingBubble(ArrayList<Integer> arrayList){

        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = 0; j < arrayList.size() - i - 1; j++) {

                if (arrayList.get(j) > arrayList.get(j + 1)) {

                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(34);
        arrayList.add(24);
        arrayList.add(94);
        arrayList.add(14);
        arrayList.add(4);

        sortingUsingBubble(arrayList);
        System.out.print("Sorted Array : " + arrayList);
    }
}
 */
//! Write a java program to sort elements of an array in Ascending order
/*
import java.util.ArrayList;

public class Day1 {

    public static void sortingUsingSelectionSort(ArrayList<Integer> arrayList) {

        for (int i = 0; i < arrayList.size() - 1; i++) {

            int minIndex = i;

            // find minimum element index
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) < arrayList.get(minIndex)) {
                    minIndex = j;
                }
            }

            // swap after inner loop
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(minIndex));
            arrayList.set(minIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(99);
        arrayList.add(94);
        arrayList.add(79);
        arrayList.add(90);

        sortingUsingSelectionSort(arrayList);
        System.out.println("Array after Sorting : " + arrayList);
    }
}
 */
//! Write a java program to sort elements of an array in descending order.
/*
import java.util.ArrayList;

public class Day1 {

    public static void sortInDescendingOrder(ArrayList<Integer> arrayList) {

        for (int i = 0; i < arrayList.size() - 1; i++) {

            // index of maximum element
            int maxIndex = i;

            // find maximum element in remaining array
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) > arrayList.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            // swap once per pass
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(maxIndex));
            arrayList.set(maxIndex, temp);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(44);
        arrayList.add(12);
        arrayList.add(78);
        arrayList.add(23);
        arrayList.add(90);

        sortInDescendingOrder(arrayList);
        System.out.println("Sorted Numbers in Descending Order : " + arrayList);
    }
}
 */
