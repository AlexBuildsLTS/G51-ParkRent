package se.alex.lexicon.model;

public class Vehicle {
    private int id;
    private String licensePlate;
    private VehicleType type;

    public Vehicle(int id, String licensePlate, VehicleType type) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", licensePlate='" + licensePlate + '\'' +
                ", type=" + type +
                '}';
    }
}
