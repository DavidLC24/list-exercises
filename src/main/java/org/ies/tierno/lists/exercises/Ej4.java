package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {
    public static Integer last(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(1);
        numbers.add(0);

        System.out.println(last(numbers));
    }
}
