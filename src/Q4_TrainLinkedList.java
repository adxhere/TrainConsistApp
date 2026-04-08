import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList)
 *
 * Demonstrates ordered train consist using LinkedList.
 *
 * @author Jai
 * @version 1.0
 */
public class Q4_TrainLinkedList {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for Train Consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry");

        System.out.println("After adding Pantry: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final train consist
        System.out.println("Final Train Consist: " + train);

        System.out.println("System ready.");
    }
}