package CSC372PortfolioProject;

import java.io.*;
import java.util.Scanner;
public class VehicleFileIO {
    public static void writeToFile()  {
        FileOutputStream fileStream = null;
        PrintWriter outFS = null;
        try {
            fileStream = new FileOutputStream("autos.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("there was an error writing to file");
        }
        outFS = new PrintWriter(fileStream);

        for (int i = 0; i < Inventory.inventoryList.size(); i++)  {
            outFS.printf("%s %s %f%n" ,Inventory.inventoryList.get(i).getMake(), Inventory.inventoryList.get(i).getModel(),
                    Inventory.inventoryList.get(i).getMilesPerGallon());
        }

        outFS.close();
    }

    public static void readFromFile()  {
        FileInputStream inputStream = null;
        Scanner inFS = null;
        String input;

        try {
            inputStream = new FileInputStream("autos.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("There was an error reading from the file");
        }
        inFS = new Scanner(inputStream);

        input = inFS.nextLine();
        System.out.println(input);

    }
}
