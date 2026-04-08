import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7: Sort Bogies by Capacity (Comparator)
 *
 * Demonstrates sorting of bogie objects using Comparator.
 *
 * @author Jai
 * @version 1.0
 */


    // Constructor
    }

    // toString() for display
    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class Q7_SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Sort bogies by capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies sorted by capacity:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("System ready.");
    }
}