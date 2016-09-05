package net.atos.epi.trolley.item;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peterbrock on 05/09/16.
 */
public class AppleTest {

    /**
     * Test the default status of an apple (cost, description, quantity)
     * @throws Exception
     */
    @Test
    public void testAppleDefaults() throws Exception {

        //When
        Apple apple = new Apple();

        //Then
        assertEquals("Apple", apple.getDescription());
        assertEquals(0.60, apple.getCostPerUnit(), 0.0001);
        assertEquals(1, apple.quantity);

    }

    /**
     * Test the calculateTotalCost method correctly returns the right item cost
     * (for a single quantity)
     * @throws Exception
     */
    @Test
    public void testCalculateTotalCostSingle() throws Exception {

        //When
        Apple apple = new Apple();
        apple.quantity = 1;

        //Then
        assertEquals(0.60, apple.calculateTotalCost(), 0.0001);
    }

    /**
     * Test the calculateTotalCost method correctly returns the right item cost
     * (for a large quantity)
     * @throws Exception
     */
    @Test
    public void testCalculateTotalCostLarge() throws Exception {

        //When
        Apple apple = new Apple();
        apple.quantity = 11;

        //Then
        assertEquals(6.60, apple.calculateTotalCost(), 0.0001);
    }

    /**
     * Test the calculateTotalCost method correctly returns the right item cost
     * (for a zero quantity)
     * @throws Exception
     */
    @Test
    public void testCalculateTotalCostZero() throws Exception {

        //When
        Apple apple = new Apple();
        apple.quantity = 0;

        //Then
        assertEquals(0.0, apple.calculateTotalCost(), 0.0001);
    }

}