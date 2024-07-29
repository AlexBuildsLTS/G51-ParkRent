package se.alex.lexicon.dao;

import se.alex.lexicon.model.Vehicle;

import java.util.List;

public interface VeichleDao {

    Vehicle save(Vehicle vehicle);
    Vehicle findById(String licensePlate);
    List<Vehicle> findAll();
    void delete(String licensePlate);
}
