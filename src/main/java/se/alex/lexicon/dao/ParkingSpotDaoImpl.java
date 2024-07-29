package se.alex.lexicon.dao;

import se.alex.lexicon.model.ParkingSpot;
import java.util.ArrayList;
import java.util.List;

public class ParkingSpotDaoImpl implements ParkingSpotDao {
    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    @Override
    public ParkingSpot save(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }

    @Override
    public ParkingSpot findById(int spotNumber) {
        return parkingSpots.stream()
                .filter(spot -> spot.getSpotNumber() == spotNumber)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ParkingSpot> findAll() {
        return new ArrayList<>(parkingSpots);
    }

    @Override
    public void delete(int spotNumber) {
        parkingSpots.removeIf(spot -> spot.getSpotNumber() == spotNumber);
    }
}
