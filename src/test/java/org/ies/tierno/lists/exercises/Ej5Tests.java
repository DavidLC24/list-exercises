package org.ies.tierno.lists.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ej5Tests {
    @Test
    public void sumTest(){
        List<Integer> numbers = List.of(3, 4, 2);

        int sum = Ej5.sum(numbers);

        Assertions.assertEquals(9, sum);
    }

    @Test
    public void sumEmptyListTest(){
        List<Integer> numbers = List.of();

        int sum = Ej5.sum(numbers);

        Assertions.assertEquals(0, sum);
    }
}
