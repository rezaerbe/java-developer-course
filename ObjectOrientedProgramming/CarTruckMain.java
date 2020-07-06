package ObjectOrientedProgramming;

public class CarTruckMain {

    public static void main(String[] args) {

        CarTruck.Owner = "Smith";
        CarTruck carTruck = new CarTruck();

        carTruck.Model = 2014;
        carTruck.setHasTruck(true);
        carTruck.MilesDrive = 100;
        carTruck.Price = 20000;
        carTruck.Type = "GSM";
        System.out.println("Price: " + carTruck.GetPrice());
        carTruck.GetOwner();
        
    }
    
}