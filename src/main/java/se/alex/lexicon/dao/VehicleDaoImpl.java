package se.alex.lexicon.dao;

import se.alex.lexicon.model.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class VehicleDaoImpl implements VeichleDao {
    private final List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle findById(String licensePlate) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Vehicle> findAll() {
        return new ArrayList<>(vehicles);
    }

    @Override
    public void delete(String licensePlate) {
        vehicles.removeIf(vehicle -> vehicle.getLicensePlate().equals(licensePlate));
    }
}
