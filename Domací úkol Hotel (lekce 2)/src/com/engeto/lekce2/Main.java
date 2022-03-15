package com.engeto.lekce2;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Guest firstGuest = new Guest("Adéla", "Malíková", LocalDate.of(1993,3,13));

        Guest secondGuest = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5));


        System.out.println(firstGuest.getDescription());
        System.out.println(secondGuest.getDescription());

        Room roomNumberOne = new Room(1, 1, 1000, true, true);
        Room roomNumberTwo = new Room(2, 1, 1000, true, true);
        Room roomNumberThree = new Room(3,3,2400, false, true);

        System.out.println(roomNumberOne.getDescription());
        System.out.println(roomNumberTwo.getDescription());
        System.out.println(roomNumberThree.getDescription());

        Booking booking1 = new Booking(1,"Adéla" , LocalDate.of(2021, 7,19), LocalDate.of(2021, 7, 26), TypeOfStay.RECREATIONAL);
        Booking booking2 = new Booking(2,"Adéla a Jan", LocalDate.of(2021, 9,1), LocalDate.of(2021, 9, 14), TypeOfStay.WORKING);

        Bookings bookings = new Bookings();
        bookings.addBooking(booking1);
        bookings.addBooking(booking2);
        bookings.printBookings();




    }

}
