package Variables;
import java.util.Scanner;

public class Input {

    static Scanner reader = new Scanner(System.in);
    static Scanner reader1 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Name: ");
        String name = reader.nextLine();
        System.out.println("Enter Age: ");
        int age = reader.nextInt();
        System.out.println("Enter Salary: ");
        double salary = reader.nextDouble();
        System.out.println("Enter Gender: ");
        String input = reader1.nextLine();
        char gender = input.charAt(0);

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
        System.out.println("gender: " + gender);

        
    }
}