
class Checkout {
    public static void main(String[] args) {

        double taxRate = 0.06;
        double[] prices = { 1.23, 5.93, 21.34 };

        System.out.format("Setting Tax Rate to %.2f%% %n%n", taxRate);
        CashRegister register = new CashRegister(taxRate);

        for (int i = 0; i < prices.length; i++) {
            System.out.format("Adding item price: $%.2f %n", prices[i]);
            register.setPrice(prices[i]);
        }

        System.out.println();
        System.out.format("   Subtotal: $%.2f %n", register.calculateSubtotal());
        System.out.format("        Tax: $%.2f %n", register.calculateTax());
        System.out.format("Grand Total: $%.2f %n", register.calculateGrandTotal());

        System.out.format("%nRecalculating with new tax rate ... %n%n");

        taxRate = 0.08;
        System.out.format("Setting Tax Rate to %.2f%% %n", taxRate);
        register.setTaxRate(taxRate);

        System.out.format("   Subtotal: $%.2f %n", register.calculateSubtotal());
        System.out.format("        Tax: $%.2f %n", register.calculateTax());
        System.out.format("Grand Total: $%.2f %n", register.calculateGrandTotal());
    }
}
