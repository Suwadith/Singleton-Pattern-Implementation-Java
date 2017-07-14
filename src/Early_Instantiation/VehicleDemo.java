package Early_Instantiation;

/**
 * Created by Suwadith on 7/14/2017.
 */
public class VehicleDemo {

   public static void main(String[] args){

       //We won't be able to create another instance of the class that has been implemented using Singleton Pattern
       //Instead we'll be using the instance / object that was created before in the original class
       Vehicle vehicleObj = Vehicle.getVehicle();
       vehicleObj.cleanTheVehicle();
       vehicleObj.parkVehicle();
   }

}
