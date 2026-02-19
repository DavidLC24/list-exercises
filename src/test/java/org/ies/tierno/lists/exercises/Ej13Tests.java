package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ej13Tests {
    @Test
    public void getRemoveAll(){
        List<Double> numbers=List.of(3.5,1.5,2.5);
        List<Double> numbersToRemove= List.of(3.5,2.5);

        List<Double> result= Ej13.removeAll(numbers, numbersToRemove);

        Assertions.assertEquals(List.of(1.5),result);
    }
}
