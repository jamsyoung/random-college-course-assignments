import java.util.ArrayList;

/**
 * This class is a bare bones cash register that will keep a running total of
 * prices added to it, calculate tax based on a tax rate, and calculate a grand
 * total.
 *
 * @author  James Young
 * @version 0.1.0
 */
public class CashRegister {

    /** Sets the constant default tax rate */
    private static final double DEFAULTTAXRATE = 0.08;

    /** Creates an empty prices array list to hold multiple prices */
    private ArrayList<Double> prices = new ArrayList<Double>();

    /** Creates the taxRate with the default value */
    private double taxRate = DEFAULTTAXRATE;


    /**
     * Default constructor.  This uses the DEFAULTTAXRATE constant when it
     * initializes.
     */
    public CashRegister() { }


    /** This constructor initializes a custom tax rate on creation. */
    public CashRegister(double value) {
        this.taxRate = value;
    }


    /**
     * @return ArrayList of prices
     */
    public ArrayList<Double> getPrices() {
        return this.prices;
    }


    /**
     * Adds the price passed in to the list of prices
     *
     * @param value The price to be added
     */
    public void setPrice(double value) {
        this.prices.add(value);
    }


    /**
     * @return The currently set tax rate
     */
    public double getTaxRate() {
        return this.taxRate;
    }


    /**
     * Sets the tax rate to the value. This should be a decimal percentage,
     * such as 0.08.
     *
     * @param value The tax rate to be set.
     */
    public void setTaxRate(double value) {
        this.taxRate = value;
    }


    /**
     * Calculates the subtotal of every item that is currently in the prices
     * array list.
     *
     * @return The subtotal of all prices.
     */
    public double calculateSubtotal() {
        double total = 0.0;
        for (double price : this.prices) {
            total += price;
        }

        return total;
    }


    /**
     * Calculates the tax for all of the prices added to the prices array list
     * based on the current tax rate.
     *
     * @return The value of tax that will be added on the current total of prices
     */
    public double calculateTax() {
        return this.calculateSubtotal() * this.taxRate;
    }


    /**
     * Calculates the subtotal and the tax total together.
     *
     * @return Grand total of all prices and tax.
     */
    public double calculateGrandTotal() {
        return this.calculateSubtotal() + this.calculateTax();
    }
}
