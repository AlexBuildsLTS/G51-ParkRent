package se.alex.lexicon.model;

public class Reservation {
    private int reservationId;
    private String customerName;
    private String date;
    private String time;

    public Reservation(int reservationId, String customerName, String date, String time) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
        this.time = time;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", customerName='" + customerName + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
