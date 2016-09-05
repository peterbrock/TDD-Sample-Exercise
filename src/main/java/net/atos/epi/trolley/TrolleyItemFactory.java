package net.atos.epi.trolley;

import net.atos.epi.trolley.item.Apple;
import net.atos.epi.trolley.item.Orange;

/**
 * Factory class to create a new TrolleyItem
 * Created by peterbrock on 05/09/16.
 */
public class TrolleyItemFactory {

    /**
     * Creates a new TrolleyItem, given a string description of the item
     * @param description string description of the item to create
     * @return the TrolleyItem
     */
    public static TrolleyItem getTrolleyItem(String description) {

        TrolleyItem retVal = null;

        if ("Apple".equalsIgnoreCase(description)) {
            retVal = new Apple();
        } else if ("Orange".equalsIgnoreCase(description)) {
            retVal = new Orange();
        }

        return retVal;
    }
}
