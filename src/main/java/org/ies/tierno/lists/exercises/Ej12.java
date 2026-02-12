package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej12 {
    public static void main(String[] args) {
        List<Double> numbers1 = new ArrayList<>();
        numbers1.add(3.5);
        numbers1.add(1.5);
        numbers1.add(2.5);


        List<Double> numbers2 = new ArrayList<>();
        numbers2.add(3.5);
        numbers2.add(0.5);
        numbers2.add(2.5);
        numbers2.add(12.5);

        System.out.println(junction(numbers1, numbers2));
    }

    public static List<Double> junction(List<Double> numbers1, List<Double> numbers2) {
        List<Double> junction = new ArrayList<>();
        for (var number : numbers1) {
            if (numbers2.contains(number)) {
                junction.add(number);
            }
        }
        return junction;
    }
}
