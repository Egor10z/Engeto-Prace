package com.engeto.lekce5;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class ListOfPlants {


    private List<Plant> listOfPlants = new ArrayList<Plant>();

    public void addPlant(Plant plant) {
        listOfPlants.add(plant);
    }

    public Plant getPlant(int order) {
        return listOfPlants.get(order);

    }

    public void removePlant(int order) {
        listOfPlants.remove(order);

    }

    public void loadFromFile(String filename, String delimiter) throws PlantException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
                int lineNumber = 0;
                while (scanner.hasNextLine()) {
                    String record = scanner.nextLine();
                    lineNumber++;
                    try {
                        this.addPlant(Plant.parsePlant(record, delimiter));
                    } catch (PlantException e){
                    throw new PlantException("Chybný soubor!");
                }
                }
            } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }


    }


    private static final String FILE_ITEM_DELIMITER = "\t";

    public void saveToFile(String output, String delimiter) {
        try (PrintWriter writer =
                     new PrintWriter(new FileWriter(output))
        )
        {int i = 0;
            for (Plant plant : listOfPlants) {
                String plantAsFileLine = plant.outputString(FILE_ITEM_DELIMITER);
                writer.println(plantAsFileLine);
                i++;



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Plant> getAllPlants() {
        return new ArrayList<>(listOfPlants);


    }
}




