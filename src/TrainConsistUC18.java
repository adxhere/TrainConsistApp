import java.util.Scanner;

public class TrainConsistUC18 {

    // Linear Search Method
    public static boolean searchBogie(String[] bogies, String key) {

        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].equals(key)) {
                return true; // match found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogies = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogies[i] = scanner.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String key = scanner.nextLine();

        // Search Operation
        boolean found = searchBogie(bogies, key);

        if (found) {
            System.out.println("Bogie FOUND in consist.");
        } else {
            System.out.println("Bogie NOT FOUND.");
        }

        // Run Test Cases
        runTests();
    }

    // ================= TEST CASES =================

    public static void runTests() {
        System.out.println("\nRunning Test Cases...");

        testSearch_BogieFound();
        testSearch_BogieNotFound();
        testSearch_FirstElementMatch();
        testSearch_LastElementMatch();
        testSearch_SingleElementArray();
    }

    static void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = searchBogie(arr, "BG309");
        System.out.println(result ? "PASS" : "FAIL");
    }

    static void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        boolean result = searchBogie(arr, "BG999");
        System.out.println(!result ? "PASS" : "FAIL");
    }

    static void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        boolean result = searchBogie(arr, "BG101");
        System.out.println(result ? "PASS" : "FAIL");
    }

    static void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG550"};
        boolean result = searchBogie(arr, "BG550");
        System.out.println(result ? "PASS" : "FAIL");
    }

    static void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};
        boolean result = searchBogie(arr, "BG101");
        System.out.println(result ? "PASS" : "FAIL");
    }
}
