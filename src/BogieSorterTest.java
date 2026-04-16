import java.util.Arrays;

public class BogieSorterTest {

    public static void main(String[] args) {

        testSort_BasicAlphabeticalSorting();
        testSort_UnsortedInput();
        testSort_AlreadySortedArray();
        testSort_DuplicateBogieNames();
        testSort_SingleElementArray();
    }

    static void testSort_BasicAlphabeticalSorting() {
        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        String[] result = BogieSorter.sortBogieNames(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_UnsortedInput() {
        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        String[] result = BogieSorter.sortBogieNames(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_AlreadySortedArray() {
        String[] input = {"AC Chair","First Class","General"};
        String[] expected = {"AC Chair","First Class","General"};

        String[] result = BogieSorter.sortBogieNames(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_DuplicateBogieNames() {
        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        String[] result = BogieSorter.sortBogieNames(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }

    static void testSort_SingleElementArray() {
        String[] input = {"Sleeper"};
        String[] expected = {"Sleeper"};

        String[] result = BogieSorter.sortBogieNames(input);

        System.out.println(Arrays.equals(result, expected) ? "PASS" : "FAIL");
    }
}
