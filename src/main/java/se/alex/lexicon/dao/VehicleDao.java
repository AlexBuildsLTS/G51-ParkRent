package se.alex.lexicon.dao;

import se.alex.lexicon.model.Vehicle;

public interface VehicleDao {
    void create(Vehicle vehicle);
    Vehicle findById(int id);
    void update(Vehicle vehicle);
    void delete(int id);
}
