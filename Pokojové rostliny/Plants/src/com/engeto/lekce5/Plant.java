package com.engeto.lekce5;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class Plant {



    String name;
    String notes;
    LocalDate planted;
    LocalDate watering;
    int frequencyOfWatering;

    public  Plant(String name) {
        this.name = name;
        this.frequencyOfWatering = 7;
        this.planted = LocalDate.now();
    }

    public Plant(String name, String notes,int frequencyOfWatering, LocalDate planted, LocalDate watering) {
        this.name = name;
        this.notes = notes;
        this.frequencyOfWatering = frequencyOfWatering;
        this.planted = planted;
        this.watering = watering;

    }
    public Plant(String name, int frequencyOfWatering, LocalDate planted) {
        this.name = name;
        this.notes = " ";
        this.frequencyOfWatering = frequencyOfWatering;
        this.watering = LocalDate.now();
        this.planted = planted;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {

        return watering;
    }


    public static Plant parsePlant(String text, String del) throws PlantException {
        String[] parts = text.split(del);
        String name = parts[0];
        String notes = parts[1];
        try {
            int frequencyOfWatering = Integer.parseInt(parts[2]);
            LocalDate watering = LocalDate.parse(parts[3]);
            LocalDate planted = LocalDate.parse(parts[4]);

            return new Plant(name, notes, frequencyOfWatering, watering, planted);
        } catch (DateTimeParseException ex) {
            throw new PlantException("Datum zálivky je starší než datum zasazení květiny!");
        } catch (NumberFormatException ex) {
            throw new PlantException("Frekvence zálivky je chybně zadaná!");
        }
    }





    public void setWatering(LocalDate watering) throws PlantException {
        int result = watering.compareTo(planted);
        if (result > 0)
            throw new PlantException("Zalivka nesmí být starší než datum zasazené květiny ");


        this.watering = watering;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if (frequencyOfWatering <= 0)
            throw new PlantException("Špatně zadané číslo frekvence zalivky!");
        this.frequencyOfWatering = frequencyOfWatering;
    }


    public String getWateringInfo(){
        return "Květina " + name  + ": Byla naposledy zalita: " + watering + ", další doporučené zalití " + watering.plusDays(frequencyOfWatering);
    }
    public String outputString(String delimiter) {
        return
                getName() + delimiter
                        + getNotes() + delimiter
                        + getFrequencyOfWatering() + delimiter
                        + getWatering() + delimiter
                        + getPlanted();

    }}





