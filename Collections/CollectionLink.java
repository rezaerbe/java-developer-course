package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLink {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<String>();
        ls.add("John");
        ls.add("Jena");
        ls.add("Laya");

        Iterator<String> itr = ls.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
    
}