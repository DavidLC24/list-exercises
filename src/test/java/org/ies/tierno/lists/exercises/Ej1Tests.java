package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej1Tests {
    @Test
    public void addAtBegginingTest(){
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Peppa");
        names.add("George");
        names.add("Pocoyo");
    }
}
