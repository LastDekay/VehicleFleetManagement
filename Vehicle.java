
package VehicleParkingLot;

abstract class Vehicle {
    private String name;
    private String type;
    private int fuel;
    private String status; // Ready, Repair, Disabled, On Mission
    
    public Vehicle(String name,String type){
        this.name = name;
        this.type = type;
        this.fuel = 100;
        this.status = "ready";
    }
    
    //Getters
    public String getName(){return this.name;}
    
    public String getType(){return this.type;}
    
    public int getFuel(){return this.fuel;}
    
    public String getStatus(){return this.status;}
    
    //Setters
    public void setName(String name){this.name = name;}
    
    public void setType(String type){this.type = type;}
    
    public void setFuel(int fuel){this.fuel = fuel;}
    
    public void setStatus(String status){this.status = status;}
    
    
}
