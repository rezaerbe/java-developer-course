package ObjectOrientedProgramming;

public class Car {

    public String Type;
    protected int Model;
    public double Price, MilesDrive;
    static String Owner;

    Owners owners;

    public Car(String Type, int Model, double Price, double MilesDrive) {
        this.Type = Type;
        this.Model = Model;
        this.Price = Price;
        this.MilesDrive = MilesDrive;
        owners  = new Owners();
        owners.FirstName = "Reza";
        System.out.println("Constructor1 is create");
    }

    public Car(){
        System.out.println("Constructor2 is create");

    }

    double GetPrice() {
        double newPrice = Price - (MilesDrive*100);
        return newPrice;
    }
    
}