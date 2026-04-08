import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 *
 * UC1: Initialize Train and Display Consist Summary
 *
 * This program initializes an empty train consist and displays
 * the initial bogie count.
 *
 * @author Jai
 * @version 1.0
 */
public class Q1_TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist (Dynamic List)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial Bogie Count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready.");
    }
}