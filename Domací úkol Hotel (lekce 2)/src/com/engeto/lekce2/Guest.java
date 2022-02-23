package com.engeto.lekce2;

import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String lastName;
    private LocalDate birth;


    public Guest(String firstName, String lastName,LocalDate birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }



    public String getDescription(){
        return "Jméno: " + firstName+ " "
                + lastName + ", Datum narození: " + birth;
    }

}
