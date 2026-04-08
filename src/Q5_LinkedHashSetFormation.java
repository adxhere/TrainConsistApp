import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Demonstrates maintaining insertion order while ensuring uniqueness.
 *
 * @author Jai
 * @version 1.0
 */
public class Q5_LinkedHashSetFormation {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for Train Formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate

        // Display final formation
        System.out.println("Train Formation: " + trainFormation);

        System.out.println("System ready.");
    }
}