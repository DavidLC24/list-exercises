package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej7Tests {
    @Test
    public void getMaxTest(){
        List<Double> numbers= List.of(3d, 4d, 3d);

        Double res= Ej7.max(numbers);

        Assertions.assertEquals(4d, res, 0.0001);
    }

    @Test
    public void maxEmptyListTest(){
        List<Double> numbers = List.of();

        Double res = Ej7.max(numbers);

        Assertions.assertNull(res);
    }
}
