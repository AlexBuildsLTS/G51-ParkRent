package se.alex.lexicon.dao;

import se.alex.lexicon.model.Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerDaoImpl implements CustomerDao {
    private final Map<Integer, Customer> customers = new HashMap<>();

    @Override
    public void create(Customer customer) {
        validateCustomer(customer);
        customers.put(customer.getId(), customer);
        System.out.println("Customer created: " + customer);
    }

    @Override
    public Customer findById(int id) {
        Customer customer = customers.get(id);
        System.out.println("Customer retrieved: " + customer);
        return customer;
    }

    @Override
    public void update(Customer customer) {
        validateCustomer(customer);
        customers.put(customer.getId(), customer);
        System.out.println("Customer updated: " + customer);
    }

    @Override
    public void delete(int id) {
        Customer customer = customers.remove(id);
        System.out.println("Customer deleted: " + customer);
    }

    private void validateCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer must not be null");
        }
        if (customer.getName() == null || customer.getName().isEmpty()) {
            throw new IllegalArgumentException("Customer name must not be null or empty");
        }
        if (customer.getPhoneNumber() == null || customer.getPhoneNumber().isEmpty()) {
            throw new IllegalArgumentException("Customer phone number must not be null or empty");
        }
    }
}
