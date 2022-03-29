import java.util.ArrayList;
import java.util.Scanner;

    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */

class Plant{ //The Basic Plant Class that stores information about a plant
    private static int ID=1; //An static ID field added, so that each plant object has a unique ID
    private String name;
    private int height;
    private int plantID; //And here the plantID, which is the identifier of a plant object

    public Plant(String inName){ //parameterized constructor
        plantID=ID;
        name=inName;
        height=0;
        ID++;
    }

    //Getters since all members are private 
    public String getName(){return this.name;}

    public int getHeight(){return this.height;}

    public int getID(){return this.plantID;}

    public void printPlantObjectInfo(){
        System.out.print("Plant ID: " + plantID);
        System.out.print(", Plant name: " + name);
        System.out.print(", Plant height: " + height);
        System.out.println();
    }

    public void addHeight(){
        height=height+1;
    }
}    
     
class Plants{ 
    private ArrayList<Plant> plantNamesList;
    private Scanner scannerObject;
    private wateringCan can;

    public Plants(int MAX_WATER){ 
        plantNamesList = new ArrayList<Plant>();
        can = new wateringCan(MAX_WATER);
    }

    public void setPlantNamesList(){ //Set values into plantNamesList for the array
        plantNamesList.add(new Plant("Aloe"));
        plantNamesList.add(new Plant("Rose"));
        plantNamesList.add(new Plant("Lily"));
        plantNamesList.add(new Plant("Sunflower"));
    }

    public void printPlantInfo(){ 
        for (Plant plantObject: plantNamesList)
            plantObject.printPlantObjectInfo();       
    }

    public void waterPlant(){ 
        scannerObject = new Scanner(System.in);
        System.out.print("Enter a plants ID number to water: ");
        int userGeneratedPlant = scannerObject.nextInt();
        for (Plant plant:plantNamesList){
            if (plant.getID()==userGeneratedPlant){
                if(can.getWater()>=1){
                    plant.addHeight();
                    can.giveWater();
                    System.out.println(plant.getName() + " plant watered successfully.");
                    return;
                }
            }
        }
        System.out.println("This Plant not present in the list");
    }

    public void addNewPlant(String newPlant) {
    }

    public void givePlantWater() {
    }
}

class wateringCan{
    private int water;

    public wateringCan(int MAX_WATER){ //Parameterized constructor
        this.water = MAX_WATER; 
    }

    public void giveWater(){ //implements the functionality that one ounce of water has been given to some plant
        if (water>=1)
            water--;
        else
            System.out.println("Water can is empty");
    }

    public int getWater(){ //getter for the amount of water in the can currently
        return water;
    }

}

//main class (run)     
class Main
{
    public static void main(String at[]){
        final int MAX_WATER = 5; //This variable can be changed to set the value of how much water can a watering can hold
        Scanner sc = new Scanner(System.in);
        Plants farm = new Plants(MAX_WATER); //This object will be used to test the functionality
        farm.setPlantNamesList(); //Filling some dummy data. This line may or may not be used according to your preference on how to fill the farm
        int choice=0;
        do{
            System.out.println("Welcome to the virtual farm. Select one of the below options\n1. Display Plants in the farm.\n2. Add a Plant\n3. Water a Plant\n4. Refill Water\n5. See amount of water left in the can\n6. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    farm.printPlantInfo();
                    break;
                case 2:
                    System.out.print("Name of the plant to be added: ");
                    sc.nextLine();
                    String newPlant = sc.nextLine();
                    farm.addNewPlant(newPlant);
                    break;
                case 3:
                    farm.givePlantWater();
                    break;
                case 6:
                    System.out.println("Now exiting..");
                    break;
                default:
                    System.out.println("Enter correct choice.");
            }
        sc.close();   
        } 
        while(choice!=5);
    }
}
        // Create an Array, Populate it, and Print it out
        // Create an ArrayList, Populate it, and Print it out
        // Create an LinkedList, Populate it, and Print it out
        // Create an Queue, Populate it, and Print it out
        // Create an Stack, Populate it, and Print it out
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
    
