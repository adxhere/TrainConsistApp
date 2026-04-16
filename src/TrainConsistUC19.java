import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistUC19 {

    // Binary Search Method
    public static boolean binarySearch(String[] bogies, String key) {

        if (bogies.length == 0) return false;

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogies[mid].compareTo(key);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogies = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogies[i] = scanner.nextLine();
        }

        // 🔑 IMPORTANT: Sort before Binary Search
        Arrays.sort(bogies);

        System.out.println("Sorted Bogies: " + Arrays.toString(bogies));

        System.out.print("Enter bogie ID to search: ");
        String key = scanner.nextLine();

        boolean found = binarySearch(bogies, key);

        if (found) {
            System.out.println("Bogie FOUND using Binary Search.");
        } else {
            System.out.println("Bogie NOT FOUND.");
        }

        // Run Test Cases
        runTests();
    }

    // ================= TEST CASES =================

    public static void runTests() {
        System.out.println("\nRunning Test Cases...");

        testBinarySearch_BogieFound();
        testBinarySearch_BogieNotFound();
        testBinarySearch_FirstElementMatch();
        testBinarySearch_LastElementMatch();
        testBinarySearch_SingleElementArray();
        testBinarySearch_EmptyArray();
        testBinarySearch_UnsortedInputHandled();
    }

    static void testBinarySearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = binarySearch(arr, "BG309");
        System.out.println(result ? "PASS" : "FAIL");
    }

    static void testBinarySearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = binarySearch(arr, "BG999");
        System.out.println(!result ? "PASS" : "FAIL");
    }

    static void testBinarySearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = binarySearch(arr, "BG101");
        System.out.println(result ? "PASS" : "FAIL");
    }

    static void testBinarySearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = binarySearch(arr, "BG550");
        System.out.println(result ? "PASS" : "FAIL");
    }

    static void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};
        boolean result = binarySearch(arr, "BG101");
        System.out.println(result ? "PASS" : "FAIL");
    }

    static void testBinarySearch_EmptyArray() {
        String[] arr = {};
        boolean result = binarySearch(arr, "BG101");
        System.out.println(!result ? "PASS" : "FAIL");
    }

    static void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {"BG309","BG101","BG550","BG205","BG412"};

        Arrays.sort(arr); // required before search

        boolean result = binarySearch(arr, "BG205");
        System.out.println(result ? "PASS" : "FAIL");
    }
}
