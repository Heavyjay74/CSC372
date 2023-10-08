package CSC372PortfolioProject;

import java.util.*;

public class Vehicle implements Comparable<Vehicle>{

    private String make;
    private String model;
    private double milesPerGallon;

    public Vehicle(String make, String model, double milesPerGallon)  {
        this.setMake(make);
        this.setModel(model);
        this.setMilesPerGallon(milesPerGallon);
    }
    @Override public int compareTo(Vehicle v)  {
        if (milesPerGallon > v.milesPerGallon) {
            return 1;
        }
        else if (milesPerGallon == v.milesPerGallon) {
            return 0;
        }
        else {
            return -1;
        }
    }
    public String getMake()  {
        return make;
    }
    public void setMake(String make)  {
        this.make = make;
    }
    public String getModel()  {
        return model;
    }
    public void setModel(String model)  {
        this.model = model;
    }
    public double getMilesPerGallon()  {
        return milesPerGallon;
    }
    public void setMilesPerGallon(double milesPerGallon)  {
        this.milesPerGallon = milesPerGallon;
    }
    public static void addVehicle ()  {

        try {
            //System.out.println("");
            System.out.println("Please enter make, model, miles per gallon");
            Scanner scnr = new Scanner(System.in);
            //System.out.println("");
            String make = scnr.next();
            String model = scnr.next();
            double mpg = scnr.nextDouble();

            Vehicle vehicle = new Vehicle (make, model, mpg);
            Inventory.inventoryList.add(vehicle);

            //System.out.println("");
            Inventory.printVehicleInfo(Inventory.inventoryList.size() - 1);
            System.out.println("Do you want to save this to the permanent inventory?");
            System.out.println("Type 'yes' or 'no'");
            String answer = scnr.next();
            if (answer.equals("yes"))  {
                Collections.sort(Inventory.inventoryList);
                VehicleFileIO.writeToFile();
            }
            else  {
                System.out.println("Car will not be added to permanent inventory.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteVehicle()  {
        int input;
        Scanner scnr = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please enter inventory number to be deleted:");
        System.out.println("");
        input = (scnr.nextInt() - 1);
        Inventory.inventoryList.remove(input);
    }

}
