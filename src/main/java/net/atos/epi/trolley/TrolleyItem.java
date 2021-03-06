package net.atos.epi.trolley;

/**
 * Abstract class representing a type of item that appears on the receipt.
 * Created by peterbrock on 05/09/16.
 */
public abstract class TrolleyItem {

    /*
    Number of this type of item
     */
    public int quantity;

    /**
     * Creates a new Trolley Item
     */
    public TrolleyItem() {

        this.quantity = 1;
    }

    /**
     * Calculates the total cost of all of the items of this type
     * @return total cost in pounds/pence
     */
    public double calculateTotalCost() {

        return (quantity * getCostPerUnit()) - calculateDiscountCost();
    }

    /**
     * Get a description of this item type
     * @return description
     */
    public abstract String getDescription();

    /**
     * Get the cost of a single item of this type
     * @return unit cost in pounds/pence
     */
    public abstract double getCostPerUnit();

    /**
     * Get the amount of discount to be applied to the total cost of this type of item (e.g. reduce price by 50p due to buy 1 get 1 free discount)
     * @return the discount to be applied in pounds/pence
     */
    public abstract double calculateDiscountCost();

}
