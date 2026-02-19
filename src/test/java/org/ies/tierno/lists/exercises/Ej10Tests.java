package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ej10Tests {
    @Test
    public void getSum10(){
        List<Integer> numbers= List.of(3, 4, 5);

        List<Integer> res= Ej10.sum10(numbers);

        Assertions.assertEquals(List.of(13, 14, 15), res);
    }
}
