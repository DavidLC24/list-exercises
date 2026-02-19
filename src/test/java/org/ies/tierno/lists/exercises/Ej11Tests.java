package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ej11Tests {
    @Test
    public void getunion(){
        List<Double> numbers1 = List.of(10d, 0d, 1d);
        List<Double> numbers2 = List.of(310d, 0.4d, 21d);

        List<Double> numbersUnion = Ej11.union(numbers1, numbers2);

        Assertions.assertEquals(List.of(10d, 0d, 1d, 310d, 0.4d, 21d), numbersUnion);
    }
}
