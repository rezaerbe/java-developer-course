package ObjectOrientedProgramming;


public class CarTruck extends Car {

    private boolean HasTruck;

    public void setHasTruck(boolean HasTruck) {
        this.HasTruck = HasTruck;
    }

    public CarTruck() {
        super("BMW", 2016, 10000, 5);
        System.out.println("Constructor of truck");
    }

    void GetOwner() {
        System.out.println("Owner: " + Owner);
        System.out.println("Price: " + super.GetPrice());
    }

    @Override
    double GetPrice() {
        // different content
        double newPrice = Price - (MilesDrive*50);
        return newPrice;
    }

}