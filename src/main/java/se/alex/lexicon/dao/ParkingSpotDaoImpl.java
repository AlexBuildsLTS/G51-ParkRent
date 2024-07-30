package se.alex.lexicon.dao;

import se.alex.lexicon.model.ParkingSpot;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class ParkingSpotDaoImpl implements ParkingSpotDao {
    private static final int MAX_SPOTS = 10; // Define the maximum number of spots
    private final Map<Integer, ParkingSpot> parkingSpots = new HashMap<>();

    @Override
    public void create(ParkingSpot parkingSpot) {
        if (getTotalSpots() >= MAX_SPOTS) {
            throw new IllegalStateException("Cannot create more parking spots, maximum limit reached");
        }
        validateParkingSpot(parkingSpot);
        parkingSpots.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking spot created: " + parkingSpot);
    }

    @Override
    public ParkingSpot findById(int id) {
        return parkingSpots.get(id);
    }

    @Override
    public void update(ParkingSpot parkingSpot) {
        validateParkingSpot(parkingSpot);
        parkingSpots.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking spot updated: " + parkingSpot);
    }

    @Override
    public void delete(int id) {
        parkingSpots.remove(id);
        System.out.println("Parking spot deleted with ID: " + id);
    }

    @Override
    public List<ParkingSpot> findAll() {
        return new ArrayList<>(parkingSpots.values());
    }

    @Override
    public int getTotalSpots() {
        return parkingSpots.size();
    }

    private void validateParkingSpot(ParkingSpot parkingSpot) {
        if (parkingSpot == null) {
            throw new IllegalArgumentException("Parking spot must not be null");
        }
        if (parkingSpot.getStatus() == null) {
            throw new IllegalArgumentException("Parking spot status must not be null");
        }
    }
}
