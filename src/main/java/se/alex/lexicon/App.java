package se.alex.lexicon;

import se.alex.lexicon.dao.*;
import se.alex.lexicon.enums.SpotStatus;
import se.alex.lexicon.enums.VehicleType;
import se.alex.lexicon.model.*;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        // Create DAOs
        CustomerDao customerDao = new CustomerDaoImpl();
        VeichleDao veichleDao = new VehicleDaoImpl();
        ParkingSpotDao parkingSpotDao = new ParkingSpotDaoImpl();
        ReservationDao reservationDao = new ReservationDaoImpl();

        // Create a customer
        Customer customer = new Customer(1, "Alex Youssef", "+467398798");
        customerDao.save(customer);

        // Create a vehicle
        Vehicle vehicle = new Vehicle("CBA321", VehicleType.CAR, customer);
        veichleDao.save(vehicle);

        // Create parking spots
        ParkingSpot spot1 = new ParkingSpot(1, SpotStatus.VACANT, "Zone 3");
        ParkingSpot spot2 = new ParkingSpot(2, SpotStatus.VACANT, "Zone 3");
        parkingSpotDao.save(spot1);
        parkingSpotDao.save(spot2);

        // Create a reservation
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusHours(2);
        Reservation reservation = new Reservation(1, customer.getCustomerId(), customer.getName(),
                customer.getPhoneNumber(), vehicle, spot1, startTime, endTime);
        reservationDao.save(reservation);

        // Output reservation details
        System.out.println(reservation);

        // Mark the parking spot as occupied
        spot1.setStatus(SpotStatus.OCCUPIED);
        parkingSpotDao.save(spot1);
        System.out.println("Parking Spot Status: " + spot1.getStatus());

        // List all customers
        System.out.println("All Customers:");
        for (Customer c : customerDao.findAll()) {
            System.out.println(c);
        }

        // List all vehicles
        System.out.println("All Vehicles:");
        for (Vehicle v : veichleDao.findAll()) {
            System.out.println(v);
        }

        // List all parking spots
        System.out.println("All Parking Spots:");
        for (ParkingSpot ps : parkingSpotDao.findAll()) {
            System.out.println(ps);
        }

        // List all reservations
        System.out.println("All Reservations:");
        for (Reservation r : reservationDao.findAll()) {
            System.out.println(r);
        }

        // Delete the vehicle
        veichleDao.delete("CBA321");
        System.out.println("Vehicle deleted. All Vehicles after deletion:");
        for (Vehicle v : veichleDao.findAll()) {
            System.out.println(v);
        }

        // Delete the customer
        customerDao.delete(1);
        System.out.println("Customer deleted. All Customers after deletion:");
        for (Customer c : customerDao.findAll()) {
            System.out.println(c);
        }

        // Delete the reservation
        reservationDao.delete(1);
        System.out.println("Reservation deleted. All Reservations after deletion:");
        for (Reservation r : reservationDao.findAll()) {
            System.out.println(r);
        }
    }
}
