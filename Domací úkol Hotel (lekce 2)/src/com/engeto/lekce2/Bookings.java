package com.engeto.lekce2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bookings {

        ArrayList<Booking> bookings = new ArrayList<Booking>();

        public void addBooking(Booking newBooking) {
            bookings.add(newBooking);
        }

        public void printBookings() {
            for (Booking booking : bookings) {
                System.out.println(booking.getDescription());
            }
        }


    }
