package com.engeto.lekce2;


import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int beds;
    private double price;
    private boolean balcony;
    private boolean seaView;
    public String haveBalcony;
    public String haveSeaView;

    public Room(int roomNumber, int beds, double price, boolean balcony, boolean seaView) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.price = price;
        this.balcony = balcony;
        this.seaView = seaView;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }


    public String getDescriptionBalcony(){
        if (balcony)
            return "s balkónem";

        else return "bez balkónu";
    }

    public String getDescriptionSeaView(){
        if (seaView)
            return "s výhledem na moře";

        else return "bez výhledu na moře";
    }


    public String getDescription(){
        return "Pokoj číslo:" + roomNumber + " má "
                + beds + " postel za cenu "
                + price + " Kč/noc, " + getDescriptionBalcony() + ", " + getDescriptionSeaView();

    }

}



