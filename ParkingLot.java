
package VehicleParkingLot;


import java.util.ArrayList;

import java.util.Scanner;

//This class will be used by drones, trucks and bikes
public class ParkingLot { 
    ArrayList<Vehicle> lot = new ArrayList<>();
    //Constructor
    public ParkingLot(){
        
    }
    //Add vehicle to the lot
    public void addVehicle(Vehicle item){
        lot.add(item);
    }
    
    public static void askUserAdd(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What type of vehicle are you adding?\n1. Drone\n0.Cancel");
        
    }
    
    //Look at list of vehicle names
    public ArrayList<String> getVehicles(){
        ArrayList<String> listName = new ArrayList<>();
        for(int i = 0; i < this.lot.size();i++){
            listName.add(this.lot.get(i).getName());
        }
        return listName;
    }
    
}
