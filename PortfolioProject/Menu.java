package CSC372PortfolioProject;

import java.util.Scanner;
public class Menu {
    static Scanner sc = new Scanner(System.in);
    public void menuSelection()  {
        int menuSelection;
        boolean closeMenu = true;
        do  {
            System.out.println("");
            System.out.println("Please select an option:");
            System.out.println("1: Add new vehicle to inventory");
            System.out.println("2: Delete vehicle from inventory");
            System.out.println("3: Print vehicle information");
            System.out.println("4: Exit program");
            System.out.println("");
            menuSelection = sc.nextInt();

            if (menuSelection == 1)  {
                Vehicle.addVehicle();
            }
            if (menuSelection == 2)  {
                Vehicle.deleteVehicle();
            }
            if (menuSelection == 3)  {
                System.out.println("");
                for (int i = 0; i < Inventory.inventoryList.size(); i++)  {
                    System.out.printf("%d: ", i + 1);
                    Inventory.printVehicleInfo(i);
                }
            }
            if (menuSelection == 4) {
                System.out.println("Thank you for using Jason's inventory System! Goodbye.");
                closeMenu = false;
            }
        }
        while (closeMenu == true);
    }
}

