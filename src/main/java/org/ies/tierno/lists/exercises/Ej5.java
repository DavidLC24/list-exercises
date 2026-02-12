package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej5 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);

        System.out.println(sum(numbers));
    }
    public static int sum(List<Integer> numbers) {
        int sum = 0;

        for (var number : numbers) {
            sum += number;
        }

        return sum;
    }
}
