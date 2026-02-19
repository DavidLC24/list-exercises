package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej13 {

    public static void main(String[] args) {
        List<Double> numbers1 = new ArrayList<>();
        numbers1.add(3.5);
        numbers1.add(1.5);
        numbers1.add(2.5);

        List<Double> numbers2 = new ArrayList<>();
        numbers2.add(3.5);
        numbers2.add(2.5);

        var result = removeAll(numbers1, numbers2);

        System.out.println(result);
    }

    public static List<Double> removeAll(List<Double> numbers, List<Double> numbersToRemove) {
        List<Double> result = new ArrayList<>();

        for (var number: numbers) {
            if(!numbersToRemove.contains(number)){
                result.add(number);
            }
        }
        return result;
    }
}
