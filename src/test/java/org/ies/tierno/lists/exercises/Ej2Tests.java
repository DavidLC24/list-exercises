package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej2Tests {
    @Test
    public void addAtBegginingTest() {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Peppa");
        names.add("George");
        names.add("Pocoyo");

        Ej2.addAtBeggining(names, "Patricio");

        Assertions.assertEquals("Patricio", names.get(0));
        Assertions.assertEquals(5, names.size());
    }

        @Test
        public void addBegginingEmptyListTest(){
            List<String> names = new ArrayList<>();

            // Ejecución del test
            Ej2.addAtBeggining(names, "Patricio");

            // Comprobaciones
            Assertions.assertEquals("Patricio", names.get(0));
            Assertions.assertEquals(1, names.size());
        }

}
