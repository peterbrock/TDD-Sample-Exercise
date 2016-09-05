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

        throw new NotImplementedException();
    }

    @Override
    public double getCostPerUnit() {

        throw new NotImplementedException();
    }

}
