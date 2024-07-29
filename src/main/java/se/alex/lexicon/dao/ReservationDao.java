package se.alex.lexicon.dao;

import se.alex.lexicon.model.Reservation;
import java.util.List;

public interface ReservationDao {
    Reservation save(Reservation reservation);
    Reservation findById(int reservationId);
    List<Reservation> findAll();
    void delete(int reservationId);
}
