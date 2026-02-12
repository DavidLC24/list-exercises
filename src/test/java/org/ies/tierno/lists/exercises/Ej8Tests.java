package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ej8Tests {
    public void getMinTest (){
        List<Double> numbers= List.of(3d, 4d, 3d);

        Double res= Ej8.min(numbers);

        Assertions.assertEquals(4d, res, 0.0001);

    }
    @Test
    public void minEmptyListTest(){
        List<Double> numbers= List.of();
    }
}
