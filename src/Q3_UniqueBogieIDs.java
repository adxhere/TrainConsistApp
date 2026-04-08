import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 *
 * Demonstrates how HashSet ensures uniqueness of bogie IDs.
 *
 * @author Jai
 * @version 1.0
 */
public class Q3_UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Bogie IDs (ensures uniqueness)
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);

        System.out.println("System ready.");
    }
}