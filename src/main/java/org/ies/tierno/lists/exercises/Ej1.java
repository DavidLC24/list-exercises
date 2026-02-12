package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Peppa");
        names.add("George");
        names.add("Pocoyo");


        for (var name : names) {
            System.out.println(name);
        }
    }
}
