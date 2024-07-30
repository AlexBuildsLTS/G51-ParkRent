package se.alex.lexicon.dao;

import se.alex.lexicon.model.ParkingSpot;
import java.util.List;

public interface ParkingSpotDao {
    void create(ParkingSpot parkingSpot);
    ParkingSpot findById(int id);
    void update(ParkingSpot parkingSpot);
    void delete(int id);
    List<ParkingSpot> findAll();
    int getTotalSpots();
}
