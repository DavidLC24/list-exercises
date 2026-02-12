package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej3Tests {
    @Test
    public void getFirstTest() {
        // Preparación del test
        List<Integer> numbers = List.of(3, 4, 7, -1);

        // Ejecución del test
        Integer first = Ej3.first(numbers);

        // Comprobaciones
        Assertions.assertEquals(3, first);
    }

    @Test
    public void getFirstEmptyListTest() {
        // Preparación del test
        List<Integer> numbers = new ArrayList<>();

        // Ejecución del test
        Integer first = Ej3.first(numbers);

        // Comprobaciones
        Assertions.assertNull(first);
    }
}
