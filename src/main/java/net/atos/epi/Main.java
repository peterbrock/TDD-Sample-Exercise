package net.atos.epi;

import net.atos.epi.receipt.Receipt;

/**
 * Created by peterbrock on 05/09/16.
 */
public class Main {

    /**
     * Entry point of the application
     * @param args expects a list of items in the basket (e.g. Apple, Orange, Apple, Apple)
     */
    public static void main(String[] args) {

        Receipt receipt = new Receipt(args);

        System.out.println("Total value of receipt: " + receipt.getTotal());
    }

}
