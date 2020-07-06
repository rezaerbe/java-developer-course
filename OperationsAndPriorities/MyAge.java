package OperationsAndPriorities;

import java.util.Calendar;
import java.util.Scanner;

public class MyAge {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Day of Birth: ");
        int DOB = reader.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - DOB;
        System.out.println("Your age is ("+ age + ") years");
    }
    
}