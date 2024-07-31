package se.alex.lexicon.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.alex.lexicon.model.ParkingSpot;
import se.alex.lexicon.model.SpotStatus;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSpotDaoImplTest {
    private ParkingSpotDao parkingSpotDao;

    @BeforeEach
    public void setUp() {
        parkingSpotDao = new ParkingSpotDaoImpl();
    }

    @Test
    public void testCreateAndFindById() {
        ParkingSpot spot = new ParkingSpot(1, SpotStatus.AVAILABLE);
        parkingSpotDao.create(spot);
        ParkingSpot found = parkingSpotDao.findById(1);
        assertEquals(spot, found);
    }

    @Test
    public void testUpdate() {
        ParkingSpot spot = new ParkingSpot(1, SpotStatus.AVAILABLE);
        parkingSpotDao.create(spot);
        spot.setStatus(SpotStatus.OCCUPIED);
        parkingSpotDao.update(spot);
        ParkingSpot updated = parkingSpotDao.findById(1);
        assertEquals(SpotStatus.OCCUPIED, updated.getStatus());
    }

    @Test
    public void testDelete() {
        ParkingSpot spot = new ParkingSpot(1, SpotStatus.AVAILABLE);
        parkingSpotDao.create(spot);
        parkingSpotDao.delete(1);
        ParkingSpot deleted = parkingSpotDao.findById(1);
        assertNull(deleted);
    }

    @Test
    public void testMaxSpots() {
        for (int i = 1; i <= 10; i++) {
            ParkingSpot spot = new ParkingSpot(i, SpotStatus.AVAILABLE);
            parkingSpotDao.create(spot);
        }
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            ParkingSpot extraSpot = new ParkingSpot(11, SpotStatus.AVAILABLE);
            parkingSpotDao.create(extraSpot);
        });
        assertEquals("Cannot create more parking spots, maximum limit reached", exception.getMessage());
    }
}
