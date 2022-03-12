package com.engeto.lekce5;

import java.io.IOException;
import java.time.LocalDate;

public class Main {

    public static final String FILENAME = "kvetiny.txt";
    public static final String DELIMITER = "\t";
    private static final String OUTPUT = "vystup.txt";
    //public static final String FILENAME = "kvetiny-spatne-frekvence.txt";
    //public static final String FILENAME = "kvetiny-spatne-datum.txt";


    public static void main(String[] args)  {

        ListOfPlants plants = new ListOfPlants();
        try {
            plants.loadFromFile(FILENAME,DELIMITER);
        } catch (PlantException e) {
                e.printStackTrace();


            for (Plant plant : plants.getAllPlants()) {
                System.out.println(plant.getWateringInfo());
            }
            plants.addPlant(new Plant("Pampeliska"));
            plants.addPlant(new Plant("Tulipan", 4, LocalDate.now()));
            plants.removePlant(2);

            try {
                plants.saveToFile(OUTPUT, DELIMITER);
            } catch (Exception ex) {
                ex.printStackTrace();
            }


        }

    }}

