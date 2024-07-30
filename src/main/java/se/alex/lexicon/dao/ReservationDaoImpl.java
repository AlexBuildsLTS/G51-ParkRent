package se.alex.lexicon.dao;

import se.alex.lexicon.model.Reservation;
import java.util.ArrayList;
import java.util.List;

public class ReservationDaoImpl implements ReservationDao {
    private final List<Reservation> reservations = new ArrayList<>();

    @Override
    public void create(Reservation reservation) {
        reservations.add(reservation);
        System.out.println("Reservation created: " + reservation);
    }

    @Override
    public Reservation save(Reservation reservation) {
        reservations.add(reservation);
        System.out.println("Reservation saved: " + reservation);
        return reservation;
    }

    @Override
    public Reservation findById(int reservationId) {
        return reservations.stream()
                .filter(reservation -> reservation.getReservationId() == reservationId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Reservation> findAll() {
        return new ArrayList<>(reservations);
    }

    @Override
    public void delete(int reservationId) {
        reservations.removeIf(reservation -> reservation.getReservationId() == reservationId);
        System.out.println("Reservation deleted with ID: " + reservationId);
    }
}
