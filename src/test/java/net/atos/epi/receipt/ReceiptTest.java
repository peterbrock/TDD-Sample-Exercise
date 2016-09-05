package net.atos.epi.receipt;

import net.atos.epi.trolley.item.Apple;
import net.atos.epi.trolley.item.Orange;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peterbrock on 05/09/16.
 */
public class ReceiptTest {

    /**
     * Tests the creation of a receipt
     * (for no items)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptNoItems() throws Exception {

        //Given
        String[] testReceipt = {};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(0, receipt.items.size());
    }

    /**
     * Tests the creation of a receipt
     * (for 1 apple)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptApple() throws Exception {

        //Given
        String[] testReceipt = {"Apple"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(1, receipt.items.size());
        assertTrue(receipt.items.get(0) instanceof Apple);
    }

    /**
     * Tests the creation of a receipt
     * (for 1 orange)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptOrange() throws Exception {

        //Given
        String[] testReceipt = {"Orange"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(1, receipt.items.size());
        assertTrue(receipt.items.get(0) instanceof Orange);
    }

    /**
     * Tests the creation of a receipt
     * (for 1 banana)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptBanana() throws Exception {

        boolean exceptionThrown = false;

        try {

            //Given
            String[] testReceipt = {"Banana"};

            //When
            Receipt receipt = new Receipt(testReceipt);

        } catch (RuntimeException e) {

            exceptionThrown = true;
        }

        assertTrue(exceptionThrown);
    }

    /**
     * Tests the creation of a receipt
     * (for multiple equal objects)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptAppleMultiple() throws Exception {

        //Given
        String[] testReceipt = {"Apple", "Apple"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(1, receipt.items.size());
        assertTrue(receipt.items.get(0) instanceof Apple);
        assertEquals(2, receipt.items.get(0).quantity);
    }

    /**
     * Tests the creation of a receipt
     * (for multiple different objects)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptMultiple() throws Exception {

        //Given
        String[] testReceipt = {"Orange", "Apple"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(2, receipt.items.size());
        assertTrue(receipt.items.get(0) instanceof Orange);
        assertTrue(receipt.items.get(1) instanceof Apple);
    }

    /**
     * Tests the creation of a receipt
     * (for different case objects)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptDifferentCase() throws Exception {

        //Given
        String[] testReceipt = {"Orange", "orange"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(1, receipt.items.size());
        assertTrue(receipt.items.get(0) instanceof Orange);
        assertEquals(2, receipt.items.get(0).quantity);
    }

    /**
     * Tests the creation of a receipt
     * (for realistic test)
     * @throws Exception
     */
    @Test
    public void testCreateReceiptRealistic() throws Exception {

        //Given
        String[] testReceipt = {"Orange", "Apple", "Apple", "Orange", "Apple"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(2, receipt.items.size());
        assertEquals(2, receipt.items.get(0).quantity);
        assertEquals(3, receipt.items.get(1).quantity);
    }

    /**
     * Tests that the getTotal method correctly calculates the cost of the items in the receipt
     * (for a single item)
     * @throws Exception
     */
    @Test
    public void testGetTotalOneItem() throws Exception {

        //Given
        String[] testReceipt = {"Apple"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(0.60, receipt.getTotal(), 0.0001);
    }

    /**
     * Tests that the getTotal method correctly calculates the cost of the items in the receipt
     * (for multiple items)
     * @throws Exception
     */
    @Test
    public void testGetTotalMultipleItem() throws Exception {

        //Given
        String[] testReceipt = {"Apple", "Orange"};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(0.85, receipt.getTotal(), 0.0001);
    }

    /**
     * Tests that the getTotal method correctly calculates the cost of the items in the receipt
     * (for no item)
     * @throws Exception
     */
    @Test
    public void testGetTotalZeroItem() throws Exception {

        //Given
        String[] testReceipt = {};

        //When
        Receipt receipt = new Receipt(testReceipt);

        //Then
        assertEquals(0.0, receipt.getTotal(), 0.0001);
    }

}