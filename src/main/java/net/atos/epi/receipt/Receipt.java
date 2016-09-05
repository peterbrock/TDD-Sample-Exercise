package net.atos.epi.receipt;

import net.atos.epi.trolley.TrolleyItem;
import net.atos.epi.trolley.TrolleyItemFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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

        this.items = new ArrayList<TrolleyItem>();
        items.addAll(parseScannedItems(scannedItems));
    }

    /**
     * Get the total cost of all receipt items including any discounts
     * @return total cost in pounds/pence
     */
    public double getTotal() {

        double totalCost = 0.0;
        for (TrolleyItem item : items){
            totalCost += item.calculateTotalCost();
        }

        return totalCost;
    }

    /**
     * Converts an array of scanned items (e.g. Apple, Orange) into a collection of item objects
     * @param scannedItems string array of items
     * @return collection of trolleyItem objects
     */
    private Collection<TrolleyItem> parseScannedItems(String[] scannedItems) {
        HashMap<String, TrolleyItem> itemTypes = new HashMap<String, TrolleyItem>();

        for (int i = 0; i < scannedItems.length; i++) {

            String itemString = scannedItems[i].toLowerCase();
            if (itemTypes.containsKey(itemString)) {
                itemTypes.get(itemString).quantity++;
            } else {
                TrolleyItem item = TrolleyItemFactory.getTrolleyItem(itemString);
                if (item != null) {
                    itemTypes.put(itemString, item);
                } else {
                    throw new RuntimeException("Unexpected item [" + scannedItems[i] + "] in the bagging area!");
                }
            }
        }

        return itemTypes.values();
    }

}
