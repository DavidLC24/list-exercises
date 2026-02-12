package org.ies.tierno.lists.exercises;

import java.util.LinkedList;
import java.util.List;

public class Ej11 {

    public static List<Double> union(List<Double> numbers1, List<Double> numbers2) {
        List<Double> result = new LinkedList<>();
        for (var number : numbers1) {
            result.add(number);
        }

        for (var number : numbers2) {
            result.add(number);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Double> numbers1 = new LinkedList<>();
        numbers1.add(10d);
        numbers1.add(0d);
        numbers1.add(1d);

        List<Double> numbers2 = new LinkedList<>();
        numbers2.add(310d);
        numbers2.add(0.4d);
        numbers2.add(21d);

        var result = union(numbers1, numbers2);

        System.out.println(result);
    }
}
