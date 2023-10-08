package CSC372PortfolioProject;

public class Main {

    public static void main (String[] args)  {
        Inventory.updateList(); //updates a Linked list of inventory from autos.txt
        Menu menu = new Menu();
        menu.menuSelection();    //Users can add, delete, view and edit list of cars
        VehicleFileIO.writeToFile();  //Writes array list of cars back to autos.txt

    }
}
