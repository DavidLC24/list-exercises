package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej16 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(filterEvenNumbers(numbers));
    }

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();
        for (var number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            }
        }
        return even;
    }
}
