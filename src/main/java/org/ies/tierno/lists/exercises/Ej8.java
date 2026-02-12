package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej8 {

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(3.4);
        numbers.add(4.2);
        numbers.add(7.4);

        System.out.println(min(numbers));
    }

    public static Double min(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return null;
        } else {
            double min = numbers.get(0);

            for (var number : numbers) {
                if (number < min) {
                    min = number;
                }
            }

            return min;
        }

    }
}
