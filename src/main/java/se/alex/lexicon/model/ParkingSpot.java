package se.alex.lexicon.model;

public class                                                                        ParkingSpot {
    private int id;
    private SpotStatus status;

    public ParkingSpot(int id, SpotStatus status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
