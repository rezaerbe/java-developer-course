package ObjectOrientedProgramming;

public class Casting {

    public static void main(String[] args) {

        CarTruck.Owner = "Smith";
        CarTruck carTruck = new CarTruck();

        carTruck.Model = 2014;
        carTruck.setHasTruck(true);
        carTruck.MilesDrive = 100;
        carTruck.Price = 20000;
        carTruck.Type = "GSM";
        Car myCar =(Car) carTruck;
        System.out.println(myCar.MilesDrive);
        
    }
    
}