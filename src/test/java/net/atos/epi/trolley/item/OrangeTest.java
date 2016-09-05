package net.atos.epi.trolley.item;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peterbrock on 05/09/16.
 */
public class OrangeTest {

    /**
     * Test the default status of an orange (cost, description, quantity)
     * @throws Exception
     */
    @Test
    public void testOrangeDefaults() throws Exception {

        //When
        Orange orange = new Orange();

        //Then
        assertEquals("Orange", orange.getDescription());
        assertEquals(0.25, orange.getCostPerUnit(), 0.0001);
        assertEquals(1, orange.quantity);
    }

    /**
     * Test the calculateTotalCost method correctly returns the right item cost
     * (for a single quantity)
     * @throws Exception
     */
    @Test
    public void testCalculateTotalCostSingle() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 1;

        //Then
        assertEquals(0.25, orange.calculateTotalCost(), 0.0001);
    }

    /**
     * Test the calculateTotalCost method correctly returns the right item cost
     * (for a large quantity)
     * @throws Exception
     */
    @Test
    public void testCalculateTotalCostLarge() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 13;

        //Then
        assertEquals(3.25, orange.calculateTotalCost(), 0.0001);
    }

    /**
     * Test the calculateTotalCost method correctly returns the right item cost
     * (for a zero quantity)
     * @throws Exception
     */
    @Test
    public void testCalculateTotalCostZero() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 0;

        //Then
        assertEquals(0, orange.calculateTotalCost(), 0.0001);
    }

}