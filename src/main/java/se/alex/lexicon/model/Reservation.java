package se.alex.lexicon.model;

import se.alex.lexicon.enums.SpotStatus;
import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {
    private int reservationId; // Unique identifier for the reservation
    private int customerId; // ID of the customer making the reservation
    private String customerName;
    private String customerPhoneNumber;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Constructor to initialize a reservation with customer details
    public Reservation(int reservationId, int customerId, String customerName, String customerPhoneNumber,
                       Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime startTime, LocalDateTime endTime) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getters and setters
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    // Extends the reservation end time by a given number of hours
    public void extendTime(int hours) {
        this.endTime = this.endTime.plusHours(hours);
    }

    // Marks the reservation as active and occupies the parking spot
    public void reserve() {
        this.reservationId = UUID.randomUUID().hashCode(); // Generate a unique reservation ID
        this.parkingSpot.setStatus(SpotStatus.OCCUPIED); // Set parking spot status to occupied
    }

    // Cancels the reservation and vacates the parking spot
    public void cancel() {
        this.parkingSpot.setStatus(SpotStatus.VACANT); // Set parking spot status to vacant
    }

    // Returns a string representation of the reservation
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation{")
                .append("reservationId=").append(reservationId)
                .append(", customerId=").append(customerId)
                .append(", customerName='").append(customerName).append('\'')
                .append(", customerPhoneNumber='").append(customerPhoneNumber).append('\'')
                .append(", vehicle=").append(vehicle)
                .append(", parkingSpot=").append(parkingSpot)
                .append(", startTime=").append(startTime)
                .append(", endTime=").append(endTime)
                .append('}');
        return sb.toString();
    }
}
