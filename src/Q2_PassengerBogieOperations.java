import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 *
 * Demonstrates CRUD operations on passenger bogies using ArrayList.
 *
 * @author Jai
 * @version 1.0
 */
public class Q2_PassengerBogieOperations {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("After adding bogies: " + passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check existence
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + exists);

        // Final list state
        System.out.println("Final passenger bogies: " + passengerBogies);

        System.out.println("System ready.");
    }
}