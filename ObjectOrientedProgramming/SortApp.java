package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return o.age-this.age;
    }
}

public class SortApp {
    
    public static void main(String[] args) {

        ArrayList<Person> listOfNames = new ArrayList<>();
        listOfNames.add(new Person ("Jena", 3));
        listOfNames.add(new Person ("Laya", 2));
        listOfNames.add(new Person ("John", 4));
        
        System.out.println("Print before sort");
        print(listOfNames);

        Collections.sort(listOfNames);
        System.out.println("Print after sort");
        print(listOfNames);
    }

    static void print(ArrayList<Person> listOfNames) {
        for (Person person: listOfNames){
            System.out.println("Name: " + person.name);
            System.out.println("Name: " + person.age);
        }
    }
}