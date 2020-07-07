package Collections;

import java.util.ArrayList;

public class Collections {
    
    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Developer");
        ar.add("Tester");
        ar.add("Manager");

        ar.remove(1);

        for (String str: ar) {
            System.out.println(str);
        }

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("John", 22));
        emp.add(new Employee("Jena", 23));
        emp.add(new Employee("Laya", 24));

        for (Employee str: emp) {
            System.out.println(str.name);
        }
        
    }

    static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}