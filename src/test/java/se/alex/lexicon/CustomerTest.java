package se.alex.lexicon;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer("Alex Youssef", "+4673654321");
        assertEquals("Alex Youssef", customer.getName());
        assertEquals("+4673654321", customer.getLastName());
    }
}