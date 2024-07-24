package se.alex.lexicon.model;
import java.util.List;

public class ParkingLot {
    private String areaCode;
    private List<ParkingSpot> spots;

    // Constructor, Getters and Setters
    public ParkingLot(String areaCode, List<ParkingSpot> spots) {
        this.areaCode = areaCode;
        this.spots = spots;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }
}
