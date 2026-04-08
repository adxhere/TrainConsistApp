import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity (HashMap)
 *
 * Demonstrates mapping of bogies to their seating/load capacities.
 *
 * @author Jai
 * @version 1.0
 */
public class Q6_BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for Bogie -> Capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // Display capacity details using entrySet()
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("System ready.");
    }
}