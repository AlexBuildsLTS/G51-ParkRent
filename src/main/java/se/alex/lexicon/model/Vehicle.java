package se.alex.lexicon.model;

import se.alex.lexicon.enums.VehicleType;

public class Vehicle {
    private String licensePlate;
    private VehicleType type; // Type of the vehicle
    private Customer owner;

    // Constructor to initialize a vehicle with a license plate and type
    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    // Constructor to initialize a vehicle with a license plate, type, and owner
    public Vehicle(String licensePlate, VehicleType type, Customer owner) {
        this(licensePlate, type); // Chaining constructor
        this.owner = owner;
    }

    // Getters and setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    // Returns a string representation of the vehicle
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle{")
                .append("licensePlate='").append(licensePlate).append('\'')
                .append(", type=").append(type)
                .append(", owner=").append(owner)
                .append('}');
        return sb.toString();
    }
}
