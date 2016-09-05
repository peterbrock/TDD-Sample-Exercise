package net.atos.epi.trolley.item;

import net.atos.epi.trolley.TrolleyItem;

/**
 * The 'Apple' item
 * Created by peterbrock on 05/09/16.
 */
public class Apple extends TrolleyItem {

    /**
     * Creates an apple object
     */
    public Apple() {
        super();
    }

    @Override
    public String getDescription() {
        return "Apple";
    }

    @Override
    public double getCostPerUnit() {
        return 0.60;
    }
}
