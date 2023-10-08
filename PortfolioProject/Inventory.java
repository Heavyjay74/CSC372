package CSC372PortfolioProject;

import java.util.*;
import java.io.*;
public class Inventory {

    static LinkedList<Vehicle> inventoryList = new LinkedList<Vehicle>();
    public static void updateList() {
        //updates LinkedList of inventory via autos.txt
        //FileInputStream inputStream = null;

        Scanner inFS = null;
        try {
            File f = new File("autos.txt");
            f.createNewFile();
            FileInputStream inputStream = new FileInputStream(f);
            inFS = new Scanner(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (inFS.hasNext()) {
            String make = inFS.next();
            String model = inFS.next();
            double mpg = inFS.nextDouble();
            Vehicle a = new Vehicle(make, model, mpg);
            inventoryList.add(a);
        }
    }
    public static void printVehicleInfo(int inventoryNumber)  {
        Vehicle v = inventoryList.get(inventoryNumber);
        System.out.printf("%s %s with %.1f miles per gallon%n",
                v.getMake(), v.getModel(), v.getMilesPerGallon());
    }
}
