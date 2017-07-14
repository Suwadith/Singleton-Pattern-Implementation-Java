package Lazy_Instantiation;

/**
 * Created by Suwadith on 7/14/2017.
 */
public class Vehicle {

    //Creating an instance of the class by creating an object of that particular class
    private static Vehicle vehicle = null;

    //Making sure that any other classes will not be able to create an instance of this class
    private Vehicle(){

    }

    public static Vehicle getVehicle(){
        //This makes sure that the instance is not created until the getVehicle method is called
        if(vehicle == null){
            vehicle = new Vehicle();
        }
        return vehicle;
    }

    //All the other methods that a class can have
    protected static void cleanTheVehicle(){
        System.out.println("Cleaning Vehicle....");
    }

    protected static void parkVehicle(){
        System.out.println("Parking Vehicle....");
    }

}
