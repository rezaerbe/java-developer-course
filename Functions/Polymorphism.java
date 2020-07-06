package Functions;

public class Polymorphism {

    double div(double n1, double n2) {
        double r = n1/n2;

        return r;
    }

    double div(int n1, int n2) {
        double r = n1/n2*3;

        return r;
    }

    public static void main(String[] args) {

        double r = new Polymorphism().div(10.0, 5.0);
        System.out.println("R: " + r);

        r = new Polymorphism().div(20,2);
        System.out.println("R: " + r);

        r = new Polymorphism().div(20, 2.5);
        System.out.println("R: " + r);
    }
    
}