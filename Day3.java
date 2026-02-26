import java.util.Arrays;
/*
public class Day3 {

    // =========================
    // MERGE FUNCTION
    // =========================
    // Ye function do sorted subarrays ko merge karta hai
    // Left subarray  : arr[left ... mid]
    // Right subarray : arr[mid+1 ... right]
    public static void merge(int[] arr, int left, int mid, int right) {

        // 1️⃣ Size calculate karo dono subarrays ka
        int size1 = mid - left + 1;
        int size2 = right - mid;

        // 2️⃣ Temporary arrays banao
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        // 3️⃣ Data copy karo original array se temp arrays mein
        // Left array copy
        for (int i = 0; i < size1; i++) {
            leftArray[i] = arr[left + i];
        }

        // Right array copy
        for (int j = 0; j < size2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // 4️⃣ Initial pointers
        int i = 0;      // leftArray ka pointer
        int j = 0;      // rightArray ka pointer
        int k = left;   // original array ka pointer

        // 5️⃣ Compare karke merge karo
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // 6️⃣ Agar leftArray mein elements bache ho
        while (i < size1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // 7️⃣ Agar rightArray mein elements bache ho
        while (j < size2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // =========================
    // MERGE SORT FUNCTION
    // =========================
    // Ye function array ko recursively divide karta hai
    public static void mergeSort(int[] arr, int left, int right) {

        // Base condition
        if (left < right) {

            // 1️⃣ Mid calculate karo
            int mid = left + (right - left) / 2;

            // 2️⃣ Left half ko sort karo
            mergeSort(arr, left, mid);

            // 3️⃣ Right half ko sort karo
            mergeSort(arr, mid + 1, right);

            // 4️⃣ Dono sorted halves ko merge karo
            merge(arr, left, mid, right);
        }
    }

    // =========================
    // MAIN FUNCTION
    // =========================
    public static void main(String[] args) {

        int[] arr = {10, 2, 42, 30, 1};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        // Merge sort call
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}

*/
        import java.util.Arrays;

public class Day3 {

    // =========================
    // PARTITION FUNCTION
    // =========================
    // Ye function pivot ko correct position par place karta hai
    // Aur uske left chhote, right bade elements rakhta hai
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];   // last element as pivot
        int i = low - 1;         // index of smaller element

        for (int j = low; j < high; j++) {

            // Agar current element pivot se chhota ho
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot ko correct position par lao
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }

    // =========================
    // QUICK SORT FUNCTION
    // =========================
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // pivot index milta hai
            int pivotIndex = partition(arr, low, high);

            // left subarray sort
            quickSort(arr, low, pivotIndex - 1);

            // right subarray sort
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // =========================
    // MAIN FUNCTION
    // =========================
    public static void main(String[] args) {

        int[] arr = {10, 80, 30, 90, 40, 50, 70};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}