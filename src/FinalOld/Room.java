package FinalOld;

import java.util.Date;

public class Room {
    private int id;
    private int placeNumber;
    private int price;
    public boolean isBooked;
    public Date bookingStart;
    public Date bookingEnd;

    public Room(int id, int placeNumber, int price) {
        this.id = id;
        this.placeNumber = placeNumber;
        this.price = price;
        this.isBooked = false;
    }

    public int getId() {
        return id;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public Date getBookingStart() {
        return bookingStart;
    }

    public Date getBookingEnd() {
        return bookingEnd;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void setBookingStart(Date bookingStart) {
        this.bookingStart = bookingStart;
    }

    public void setBookingEnd(Date bookingEnd) {
        this.bookingEnd = bookingEnd;
    }
}
