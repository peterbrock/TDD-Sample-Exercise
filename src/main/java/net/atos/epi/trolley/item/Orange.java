package net.atos.epi.trolley.item;

import net.atos.epi.trolley.TrolleyItem;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

        throw new NotImplementedException();
    }
}
