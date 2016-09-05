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
     * Test the calculateDiscountCost method correct returns the right discount cost (3 for 2)
     * (for a quantity of that isn't discounted)
     * @throws Exception
     */
    @Test
    public void testCalculateDiscountCostNoDiscount() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 1;

        //Then
        assertEquals(0.0, orange.calculateDiscountCost(), 0.0001);
    }

    /**
     * Test the calculateDiscountCost method correct returns the right discount cost (3 for 2)
     * (for a quantity of 3 - discounted)
     * @throws Exception
     */
    @Test
    public void testCalculateDiscountCostSingleDiscount() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 3;

        //Then
        assertEquals(0.25, orange.calculateDiscountCost(), 0.0001);
    }

    /**
     * Test the calculateDiscountCost method correct returns the right discount cost (3 for 2)
     * (for a quantity of 4 - discounted)
     * @throws Exception
     */
    @Test
    public void testCalculateDiscountCostSingleDiscountBoundary() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 4;

        //Then
        assertEquals(0.25, orange.calculateDiscountCost(), 0.0001);
    }

    /**
     * Test the calculateDiscountCost method correct returns the right discount cost (3 for 2)
     * (for a large discount - discounted)
     * @throws Exception
     */
    @Test
    public void testCalculateDiscountCostDiscountLarge() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 13;

        //Then
        assertEquals(1.00, orange.calculateDiscountCost(), 0.0001);
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
     * (for a large quantity including discount)
     * @throws Exception
     */
    @Test
    public void testCalculateTotalCostLarge() throws Exception {

        //When
        Orange orange = new Orange();
        orange.quantity = 13;

        //Then
        assertEquals(2.25, orange.calculateTotalCost(), 0.0001);
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