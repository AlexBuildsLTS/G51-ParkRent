package se.alex.lexicon.dao;

import se.alex.lexicon.model.ParkingSpot;
import java.util.List;

public interface ParkingSpotDao {
    ParkingSpot save(ParkingSpot parkingSpot);
    ParkingSpot findById(int spotNumber);
    List<ParkingSpot> findAll();
    void delete(int spotNumber);
}
