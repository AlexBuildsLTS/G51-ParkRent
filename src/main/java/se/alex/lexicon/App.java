package se.alex.lexicon;

import se.alex.lexicon.enums.SpotStatus;
import se.alex.lexicon.enums.VehicleType;
import se.alex.lexicon.model.Customer;
import se.alex.lexicon.model.ParkingLot;
import se.alex.lexicon.model.ParkingSpot;
import se.alex.lexicon.model.Reservation;
import se.alex.lexicon.model.Vehicle;

import java.time.LocalDateTime;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Alex", "Youssef", "+467398798");

        // Create a vehicle
        Vehicle vehicle = new Vehicle("CBA321", VehicleType.CAR);

        // Create parking spots
        ParkingSpot spot1 = new ParkingSpot(1, SpotStatus.VACANT);
        ParkingSpot spot2 = new ParkingSpot(2, SpotStatus.VACANT);

        // Create a parking lot
        ParkingLot parkingLot = new ParkingLot("Zone 3", Arrays.asList(spot1, spot2));

        // Create a reservation
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusHours(2);
        Reservation reservation = new Reservation(1, customer, vehicle, spot1, startTime, endTime);

        // Output reservation details
        System.out.println("Reservation Details:");
        System.out.println("Customer: " + reservation.getCustomer().getFirstName() + " " + reservation.getCustomer().getLastName());
        System.out.println("Phone Number: " + reservation.getCustomer().getPhoneNumber());
        System.out.println("Vehicle: " + reservation.getVehicle().getLicensePlate());
        System.out.println("Parking Spot ID: " + reservation.getParkingSpot().getSpotId());
        System.out.println("Start Time: " + reservation.getStartTime());
        System.out.println("End Time: " + reservation.getEndTime());

        // Mark the parking spot as occupied
        spot1.setStatus(SpotStatus.OCCUPIED);
        System.out.println("Parking Spot Status: " + spot1.getStatus());
    }
}
