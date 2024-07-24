package se.alex.lexicon.model;

import se.alex.lexicon.enums.VehicleType;


public class Vehicle {
        private String licensePlate;
        private VehicleType type;

        // Constructor, Getters and Setters
        public Vehicle(String licensePlate, VehicleType type) {
            this.licensePlate = licensePlate;
            this.type = type;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public VehicleType getType() {
            return type;
        }

        public void setType(VehicleType type) {
            this.type = type;
        }
    }

