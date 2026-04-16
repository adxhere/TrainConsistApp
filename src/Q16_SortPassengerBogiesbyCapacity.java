import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {

        testSort_BasicSorting();
        testSort_AlreadySortedArray();
        testSort_DuplicateValues();
        testSort_SingleElementArray();
        testSort_AllEqualValues();
    }

    static void testSort_BasicSorting() {
        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        int[] result = BubbleSortService.sortCapacities(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_AlreadySortedArray() {
        int[] input = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        int[] result = BubbleSortService.sortCapacities(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_DuplicateValues() {
        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        int[] result = BubbleSortService.sortCapacities(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_SingleElementArray() {
        int[] input = {50};
        int[] expected = {50};

        int[] result = BubbleSortService.sortCapacities(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_AllEqualValues() {
        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        int[] result = BubbleSortService.sortCapacities(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }
}
