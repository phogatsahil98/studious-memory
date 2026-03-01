import java.util.HashMap;
import java.util.Map;

public class Day7 {

    public static void main(String[] args) {

        // Input array
        int[] arr = {1,2,3,4,5,1,2,3,1,2};

        // Variable to store maximum frequency value
        int maxFreqValue = 0;

        // Variable to store maximum frequency count
        int maxFreq = 0;

        // Creating a HashMap
        // Key   -> Array element
        // Value -> Frequency of that element
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // STEP 1: Count Frequency
        for (int i = 0; i < arr.length; i++) {

            // If element already exists in map, increment its count
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
            // If element does not exist, initialize it with 1
            else {
                hashMap.put(arr[i], 1);
            }
        }

        // STEP 2: Print Frequency Map
        System.out.println("Element : Frequency");
        for (Map.Entry<Integer , Integer> entry : hashMap.entrySet()) {

            // entry.getKey()   -> Element
            // entry.getValue() -> Frequency
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // STEP 3: Find Maximum Frequency Element
        for (Map.Entry<Integer , Integer> entry : hashMap.entrySet()) {

            // If current frequency is greater than maxFreq
            if (entry.getValue() > maxFreq) {

                // Update max frequency
                maxFreq = entry.getValue();

                // Store corresponding element
                maxFreqValue = entry.getKey();
            }
        }

        System.out.println("\nMaximum Frequency Count is : " + maxFreq);
        System.out.println("Element with Maximum Frequency is : " + maxFreqValue);
    }
}