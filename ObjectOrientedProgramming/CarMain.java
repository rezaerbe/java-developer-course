package ObjectOrientedProgramming;

public class CarMain {

    public static void main(String[] args) {
        
        Car.Owner = "Smith";

        Car car1 = new Car("BMW", 2016, 10000, 5);
        double price = car1.GetPrice();
        System.out.println("Owner: " + car1.Owner);
        System.out.println("Car price: " + price);

        Car car2 = new Car();
        car2.Type = "BMW";
        car2.Model = 2015;
        car2.Price = 9000;
        car2.MilesDrive = 10;
        // car2.Owner = "Smith";
        double price2 = car2.GetPrice();
        System.out.println("Owner: " + car2.Owner);
        System.out.println("Car price2: " + price2);
        
    }
    
}