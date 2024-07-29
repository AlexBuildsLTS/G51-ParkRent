package se.alex.lexicon.model;

import se.alex.lexicon.enums.SpotStatus;

public class ParkingSpot {
    private int spotNumber; // Number of the parking spot
    private SpotStatus status; // Status of the parking spot
    private String areaCode; // Area code of the parking spot

    // Constructor to initialize a parking spot
    public ParkingSpot(int spotNumber, SpotStatus status, String areaCode) {
        this.spotNumber = spotNumber;
        this.status = status;
        this.areaCode = areaCode;
    }

    // Getters and setters
    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    // Returns a string representation of the parking spot
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParkingSpot{")
                .append("spotNumber=").append(spotNumber)
                .append(", status=").append(status)
                .append(", areaCode='").append(areaCode).append('\'')
                .append('}');
        return sb.toString();
    }
}
