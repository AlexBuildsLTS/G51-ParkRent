package se.alex.lexicon.model;

public enum SpotStatus {
    AVAILABLE,
    OCCUPIED,
    RESERVED;

    /**
     * Enum to act for different types of vehicles.
     */
    public enum VehicleType {
        CAR,
        MOTORCYCLE,
        VAN,
        TRUCK,
        ELECTRIC_CAR
    }
}
