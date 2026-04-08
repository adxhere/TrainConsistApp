public class GoodsBogieSafe public class GoodsBogieSafe {

    String type;
    String cargo;

    public GoodsBogieSafe(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        try {
            // Unsafe rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.");
        }
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}{
}
