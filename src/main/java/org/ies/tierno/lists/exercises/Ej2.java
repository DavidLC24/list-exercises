package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static void addAtBeggining(List<String> list, String value) {
        list.add(0, value);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Peppa");
        names.add("George");
        names.add("Pocoyo");

        addAtBeggining(names, "Patricio");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
