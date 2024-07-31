package se.alex.lexicon.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.alex.lexicon.model.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomerDaoImplTest {
    private CustomerDao customerDao;

    @BeforeEach
    public void setUp() {
        customerDao = new CustomerDaoImpl();
    }

    @Test
    public void testCreateAndFindById() {
        Customer customer = new Customer(1, "Alex Youssef", "076987987");
        customerDao.create(customer);
        Customer found = customerDao.findById(1);
        assertEquals(customer, found);
    }

    @Test
    public void testUpdate() {
        Customer customer = new Customer(1, "Alex Youssef", "076987987");
        customerDao.create(customer);
        customer.setName("Alex Updated");
        customerDao.update(customer);
        Customer updated = customerDao.findById(1);
        assertEquals("Alex Updated", updated.getName());
    }

    @Test
    public void testDelete() {
        Customer customer = new Customer(1, "Alex Youssef", "076987987");
        customerDao.create(customer);
        customerDao.delete(1);
        Customer deleted = customerDao.findById(1);
        assertNull(deleted);
    }
}
