package se.alex.lexicon.dao;

import se.alex.lexicon.model.ParkingSpot;

public interface ParkingSpotDao {
    void create(ParkingSpot parkingSpot);
    ParkingSpot findById(int id);
    void update(ParkingSpot parkingSpot);
    void delete(int id);

    int getTotalSpots();
}
