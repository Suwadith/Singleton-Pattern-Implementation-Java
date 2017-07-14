package Early_Instantiation;

/**
 * Created by Suwadith on 7/14/2017.
 */
public class Vehicle {

    private static Vehicle vehicle = new Vehicle();

    private Vehicle(){

    }

    public static Vehicle getInstance(){
        return vehicle;
    }

    protected static void cleanTheVehicle(){
        System.out.println("Cleaning Vehicle....");
    }

    protected static void parkVehicle(){
        System.out.println("Parking Vehicle....");
    }

}
