public class Q15_SafeCargoAssignment /**
 * UC15: Safe Cargo Assignment Using try-catch-finally
 */
public class Q15_SafeCargoAssignment {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        GoodsBogieSafe b1 = new GoodsBogieSafe("Cylindrical");
        GoodsBogieSafe b2 = new GoodsBogieSafe("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Continue execution
        b2.assignCargo("Coal");

        System.out.println("System continues safely.");
    }
}{
}
