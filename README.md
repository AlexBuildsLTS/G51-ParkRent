# G51-ParkRent

This project is a simple parking rental system. It includes DAOs for managing customers, parking spots, reservations,
and vehicles.

## Project Structure

The project follows a layered architecture with the following packages:

- `dao`: Contains Data Access Objects (DAOs) for interacting with the data layer.
- `model`: Contains the models representing the entities in the system.

## DAO Implementations

### CustomerDaoImpl
Manages customers, including creating, updating, finding, and deleting customers.

### ParkingSpotDaoImpl

Manages parking spots with a maximum limit of 10 spots, including creating, updating, finding, and deleting parking
spots.

### ReservationDaoImpl
Manages reservations, including creating, updating, finding, and deleting reservations.

### VehicleDaoImpl
Manages vehicles, including creating, updating, finding, and deleting vehicles.

