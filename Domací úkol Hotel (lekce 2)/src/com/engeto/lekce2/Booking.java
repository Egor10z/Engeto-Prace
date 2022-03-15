package com.engeto.lekce2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {

    private int room;
    public String guest;
    public LocalDate beginning;
    public LocalDate end;
    public TypeOfStay type;

    public Booking(int room, String guest, LocalDate beginning, LocalDate end, TypeOfStay type) {
        this.room = room;
        this.guest = guest;
        this.beginning = beginning;
        this.end = end;
        this.type = type;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public LocalDate getBeginning() {
        return beginning;
    }

    public void setBeginning(LocalDate beginning) {
        this.beginning = beginning;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public TypeOfStay getType() {
        return type;
    }

    public void setType(TypeOfStay type) {
        this.type = type;
    }

    public String getDescription() {
        return "Rezervace pokoje číslo " + room + ", pro " + guest + " od " + beginning + " do " + end + " , pobyt: " + type;

    }



}


