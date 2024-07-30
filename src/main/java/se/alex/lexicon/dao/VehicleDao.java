package se.alex.lexicon.dao;

import se.alex.lexicon.model.Vehicle;
import java.util.List;

public interface VehicleDao {
    void create(Vehicle vehicle);
    Vehicle findById(int id);
    void update(Vehicle vehicle);
    void delete(int id);
    List<Vehicle> findAll(); // Add findAll to interface
}
