package se.alex.lexicon.dao;

import se.alex.lexicon.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer findById(int customerId) {
        return customers.stream()
                .filter(customer -> customer.getCustomerId() == customerId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers);
    }

    @Override
    public void delete(int customerId) {
        customers.removeIf(customer -> customer.getCustomerId() == customerId);
    }
}
