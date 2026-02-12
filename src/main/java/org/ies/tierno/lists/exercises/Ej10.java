package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ej10 {

    public static List<Integer> sum10(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (var number : numbers) {
            result.add(number + 10);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(0);
        numbers.add(15);

        var result = sum10(numbers);

        System.out.println(result);
    }
}
