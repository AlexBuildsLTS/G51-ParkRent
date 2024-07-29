package se.alex.lexicon.dao;

import se.alex.lexicon.model.Customer;
import java.util.List;

public interface CustomerDao {
    Customer save(Customer customer);
    Customer findById(int customerId);
    List<Customer> findAll();
    void delete(int customerId);
}
