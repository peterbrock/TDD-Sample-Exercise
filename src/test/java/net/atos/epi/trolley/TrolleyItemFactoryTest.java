package net.atos.epi.trolley;

import net.atos.epi.trolley.item.Apple;
import net.atos.epi.trolley.item.Orange;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peterbrock on 05/09/16.
 */
public class TrolleyItemFactoryTest {

    /**
     * Test that the getTrolleyItem method correctly creates a TrolleyItem
     * (for an apple)
     * @throws Exception
     */
    @Test
    public void testGetTrolleyItemApple() throws Exception {

        //When
        TrolleyItem item = TrolleyItemFactory.getTrolleyItem("Apple");

        //Then
        assertTrue(item instanceof Apple);
    }

    /**
     * Test that the getTrolleyItem method correctly creates a TrolleyItem
     * (for an orange)
     * @throws Exception
     */
    @Test
    public void testGetTrolleyItemOrange() throws Exception {

        //When
        TrolleyItem item = TrolleyItemFactory.getTrolleyItem("Orange");

        //Then
        assertTrue(item instanceof Orange);
    }

    /**
     * Test that the getTrolleyItem method correctly creates a TrolleyItem
     * (for a different case)
     * @throws Exception
     */
    @Test
    public void testGetTrolleyItemCase() throws Exception {

        //When
        TrolleyItem item = TrolleyItemFactory.getTrolleyItem("APPLE");

        //Then
        assertTrue(item instanceof Apple);
    }

    /**
     * Test that the getTrolleyItem method correctly handles an invalid item
     * @throws Exception
     */
    @Test
    public void testGetTrolleyItemInvalid() throws Exception {

        //When
        TrolleyItem item = TrolleyItemFactory.getTrolleyItem("Banana");

        //Then
        assertTrue(item == null);
    }

}