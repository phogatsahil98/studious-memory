import java.util.HashMap;
import java.util.Map;

//! Highest Value among all Values
/*
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
*/

//! Second-Highest Value

class Day7 {
    // Function to find second most frequent element
    public static int secondMostFrequentElement(int[] nums) {

        // If array has less than 2 elements
        if (nums.length < 2) {
            return -1;
        }

        // Step 1: Build frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find highest and second highest frequency
        int firstMax = 0;
        int secondMax = 0;

        for (int freq : map.values()) {

            if (freq > firstMax) {
                secondMax = firstMax;
                firstMax = freq;
            }
            else if (freq > secondMax && freq < firstMax) {
                secondMax = freq;
            }
        }

        // If second highest doesn't exist
        if (secondMax == 0) {
            return -1;
        }

        // Step 3: Find smallest element having secondMax frequency
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondMax) {
                result = Math.min(result, entry.getKey());
            }
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        int[] arr = {4,4,5,5,6,7};

        int answer = secondMostFrequentElement(arr);

        System.out.println("Second Most Frequent Element: " + answer);
    }
}