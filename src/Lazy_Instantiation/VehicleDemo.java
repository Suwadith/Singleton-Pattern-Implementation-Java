package Lazy_Instantiation;

/**
 * Created by Suwadith on 7/14/2017.
 */
public class VehicleDemo {

    public static void main(String[] args){

        //We won't be able to create another instance of the class that has been implemented using Singleton Pattern
        //Instead we'll be using the instance / object that was created before in the original class
        //But in here the instance of the Vehicle class will only get created after we call the getVehicle method
        //Until then there won't be an instance of the Vehicle class
        Vehicle vehicleObj = Vehicle.getVehicle();
        vehicleObj.cleanTheVehicle();
        vehicleObj.parkVehicle();

    }

}
