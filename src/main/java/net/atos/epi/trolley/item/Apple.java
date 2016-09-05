package net.atos.epi.trolley.item;

import net.atos.epi.trolley.TrolleyItem;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

        throw new NotImplementedException();
    }

    @Override
    public double getCostPerUnit() {

        throw new NotImplementedException();
    }
}
