package se.alex.lexicon.model;

public class Customer {
    private int customerId; // Unique identifier for the customer
    private String name; // Customer's name
    private String phoneNumber; // Customer's phone number

    // Constructor to initialize a customer
    public Customer(int customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Returns a string representation of the customer
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{")
                .append("customerId=").append(customerId)
                .append(", name='").append(name).append('\'')
                .append(", phoneNumber='").append(phoneNumber).append('\'')
                .append('}');
        return sb.toString();
    }
}
