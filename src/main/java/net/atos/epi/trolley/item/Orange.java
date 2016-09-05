package net.atos.epi.trolley.item;

import net.atos.epi.trolley.TrolleyItem;

/**
 * The 'Orange' item
 * Created by peterbrock on 05/09/16.
 */
public class Orange extends TrolleyItem {

    /**
     * Creates a new Orange object
     */
    public Orange() {
        super();
    }

    @Override
    public String getDescription() {
        return "Orange";
    }

    @Override
    public double getCostPerUnit() {
        return 0.25;
    }

    @Override
    public double calculateDiscountCost() {

        //3 for 2
        return (quantity/3) * getCostPerUnit();
    }
}
