package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej4Tests {

    @Test
    public void getLastTest() {
        // Preparación del test
        List<Integer> numbers = List.of(3, 4, 7, -1);

        // Ejecución del test
        Integer last = Ej4.last(numbers);

        // Comprobaciones
        Assertions.assertEquals(-1, last);
    }

    @Test
    public void getLastEmptyListTest() {
        // Preparación del test
        List<Integer> numbers = new ArrayList<>();

        // Ejecución del test
        Integer last = Ej4.last(numbers);

        // Comprobaciones
        Assertions.assertNull(last);
    }
}
