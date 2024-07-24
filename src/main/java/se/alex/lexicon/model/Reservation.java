package se.alex.lexicon.model;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private Customer customer;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Constructor, Getters and Setters
    public Reservation(int reservationId, Customer customer, Vehicle vehicle, ParkingSpot parkingSpot, LocalDateTime startTime, LocalDateTime endTime) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
}