package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej6 {

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(3.4);
        numbers.add(4.2);
        numbers.add(7.4);

        System.out.println(average(numbers));
    }

    public static Double average(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return null;
        } else {
            double sum = 0;

            for (var number : numbers) {
                sum += number;
            }

            return sum / numbers.size();
        }

    }
}
