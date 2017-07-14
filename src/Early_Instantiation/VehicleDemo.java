package Early_Instantiation;

/**
 * Created by Suwadith on 7/14/2017.
 */
public class VehicleDemo {

   public static void main(String[] args){

       Vehicle vehicleObj = Vehicle.getVehicle();
       vehicleObj.cleanTheVehicle();
       vehicleObj.parkVehicle();
   }

}
