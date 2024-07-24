package se.alex.lexicon.model;

import se.alex.lexicon.enums.SpotStatus;

public class ParkingSpot {
    private int spotId;
    private SpotStatus status;

    // Constructor, Getters and Setters
    public ParkingSpot(int spotId, SpotStatus status) {
        this.spotId = spotId;
        this.status = status;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }
}