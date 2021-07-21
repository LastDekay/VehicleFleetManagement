package VehicleParkingLot;

import java.util.Scanner;

public class ManageLotMenu {
    public static void main(String[] args){
        
    }
    
    // Test for Parking lot and adding Abstract Vehicle class to a list
    public static DroneVehicle testAdd(){
        DroneVehicle testD = new DroneVehicle("Test");
        return testD;
    }
    
    public void testBuild(){
        ParkingLot testLot = new ParkingLot();
        testLot.addVehicle(testAdd());
        testLot.addVehicle(testAdd());
        testLot.addVehicle(testAdd());
        testLot.lot.get(0).setName("ReNamed");
        System.out.println(testLot.getVehicles());
    }
    //End of Test
}
