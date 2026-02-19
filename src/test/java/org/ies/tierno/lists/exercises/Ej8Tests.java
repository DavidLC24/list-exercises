package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej8Tests {
    @Test
    public void minTest() {
        var numbers = List.of(2d, 1.0d, 7d, 99d);

        var min = Ej8.min(numbers);

        Assertions.assertEquals(1d, min, 0.0001);
    }

    @Test
    public void minEmptyListTest() {
        List<Double> numbers = List.of();

        Double min = Ej8.min(numbers);

        Assertions.assertNull(min);
    }
}
