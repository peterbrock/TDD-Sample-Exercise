package net.atos.epi.receipt;

import net.atos.epi.trolley.TrolleyItem;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Holds all the items associated to a receipt
 * Created by peterbrock on 05/09/16.
 */
public class Receipt {

    public ArrayList<TrolleyItem> items;

    /**
     * Creates a new receipt
     * @param scannedItems the scanned items to add to the receipt
     */
    public Receipt(String[] scannedItems) {

    }

    /**
     * Get the total cost of all receipt items including any discounts
     * @return total cost in pounds/pence
     */
    public double getTotal() {

        throw new NotImplementedException();
    }

}
