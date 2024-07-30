package se.alex.lexicon;

import se.alex.lexicon.dao.*;
import se.alex.lexicon.model.*;

public class App {
    public static void main(String[] args) {

        // Instantiate DAO implementations
        ReservationDao reservationDao = new ReservationDaoImpl();
        ParkingSpotDao parkingSpotDao = new ParkingSpotDaoImpl();
        VehicleDao vehicleDao = new VehicleDaoImpl();
        CustomerDao customerDao = new CustomerDaoImpl();

        for (int i = 1; i <= 15; i++) { //
            try {
                ParkingSpot spot = new ParkingSpot(i, SpotStatus.AVAILABLE);
                parkingSpotDao.create(spot);
            } catch (IllegalStateException e) {
                System.err.println(e.getMessage());
                break;
            }
        }

        // Creates new Customers
        Customer customer1 = new Customer(1, "Alex Youssef", "076987987");
        customerDao.create(customer1);
        Customer customer2 = new Customer(2, "Sandra", "073300309");
        customerDao.create(customer2);
        Customer customer3 = new Customer(3, "Johnny Reinfield", "073300309");
        customerDao.create(customer3);

        // Create and save new reservations
        Reservation reservation1 = new Reservation(1, "Alex Youssef", "2024-07-30", "12:00");
        reservationDao.create(reservation1);
        Reservation reservation2 = new Reservation(2, "Sandra Orlovic", "2024-07-30", "11:00");
        reservationDao.create(reservation2);
        Reservation reservation3 = new Reservation(3, "Johnny Reinfield", "2024-07-30", "14:00");
        reservationDao.create(reservation3);

        // Create and save new vehicles
        Vehicle vehicle1 = new Vehicle(1, "ABC123", VehicleType.CAR);
        vehicleDao.create(vehicle1);
        Vehicle vehicle2 = new Vehicle(2, "DEF456", VehicleType.TRUCK);
        vehicleDao.create(vehicle2);
        Vehicle vehicle3 = new Vehicle(3, "GHI789", VehicleType.ELECTRIC);
        vehicleDao.create(vehicle3);

        // Delete a reservation
        reservationDao.delete(3);

        // Find and print all customers
        System.out.println("All customers:");
        System.out.println(customerDao.findById(1));
        System.out.println(customerDao.findById(2));
        System.out.println(customerDao.findById(3));

        // Find and print a specific reservation
        Reservation foundReservation = reservationDao.findById(2);
        System.out.println("Found reservation: " + foundReservation);

        // Update an existing reservation
        reservation2.setTime("12:00");
        reservationDao.save(reservation2);

        // Find and print all reservations after update
        System.out.println("All reservations after update:");
        reservationDao.findAll().forEach(System.out::println);

        // Delete a reservation again to ensure correct behavior
        reservationDao.delete(3);

        // Find and print all reservations after deletion
        System.out.println("All reservations after deletion:");
        reservationDao.findAll().forEach(System.out::println);
    }
}
