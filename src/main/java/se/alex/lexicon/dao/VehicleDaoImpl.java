package se.alex.lexicon.dao;

import se.alex.lexicon.model.Vehicle;
import java.util.HashMap;
import java.util.Map;

public class VehicleDaoImpl implements VehicleDao {
    private final Map<Integer, Vehicle> vehicles = new HashMap<>();

    @Override
    public void create(Vehicle vehicle) {
        validateVehicle(vehicle);
        vehicles.put(vehicle.getId(), vehicle);
        System.out.println("Vehicle created: " + vehicle);
    }

    @Override
    public Vehicle findById(int id) {
        return vehicles.get(id);
    }

    @Override
    public void update(Vehicle vehicle) {
        validateVehicle(vehicle);
        vehicles.put(vehicle.getId(), vehicle);
        System.out.println("Vehicle updated: " + vehicle);
    }

    @Override
    public void delete(int id) {
        vehicles.remove(id);
        System.out.println("Vehicle deleted with ID: " + id);
    }

    private void validateVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle must not be null");
        }
        if (vehicle.getLicensePlate() == null || vehicle.getLicensePlate().isEmpty()) {
            throw new IllegalArgumentException("Vehicle license plate must not be null or empty");
        }
        if (vehicle.getType() == null) {
            throw new IllegalArgumentException("Vehicle type must not be null");
        }
    }
}
