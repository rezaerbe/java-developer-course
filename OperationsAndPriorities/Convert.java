package OperationsAndPriorities;

public class Convert {

    public static void main(String[] args) {
        int age = 22;
        double salary = 1.23;
        boolean isTrue = true;
        String rate = "4.5";

        // convert to string
        String newSalary = String.valueOf(salary);
        String newAge = String.valueOf(age);
        String newisTrue = String.valueOf(isTrue);

        // convert to integer
        int newRate = Integer.parseInt(rate);
        int newSalaryInt = (int) salary;

        // convert to double
        double newRateDouble = Double.parseDouble(rate);
        double newAgeDouble = (double) age;

    }
}