package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ej12Tests {
    @Test
    public void getJunction (){
        List<Double> numbers1= List.of(0.0, 1.0, 2.0);
        List<Double> numbers2= List.of(0.0, 1.0, 2.0);

        List<Double> numbers= Ej12.junction(numbers1, numbers2);

        Assertions.assertEquals(List.of(2.0), numbers);
    }
}
