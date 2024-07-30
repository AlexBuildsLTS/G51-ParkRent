package se.alex.lexicon.dao;

import se.alex.lexicon.model.Customer;

public interface CustomerDao {
    void create(Customer customer);
    Customer findById(int id);
    void update(Customer customer);
    void delete(int id);
}