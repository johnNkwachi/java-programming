package dataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        collection.remove("New York");

        for (String s : collection) {
            System.out.print(s.toUpperCase() + ", ");
        }
        System.out.println();
    }
    Collection<Integer>collection = new LinkedList<>();
}
