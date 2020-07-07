package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionSet {

    public static void main(String[] args) {

        HashSet<String> ls = new HashSet<String>();
        ls.add("John");
        ls.add("Jena");
        ls.add("Laya");

        Iterator<String> itr = ls.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        TreeSet<String> ls1 = new TreeSet<String>();
        ls1.add("John");
        ls1.add("Jena");
        ls1.add("Laya");

        Iterator<String> itr1 = ls1.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        
    }
    
}