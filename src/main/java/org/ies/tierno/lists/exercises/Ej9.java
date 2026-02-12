package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String response;

        do {
            System.out.print("Introduce un número: ");
            numbers.add(scanner.nextInt());
            scanner.nextLine();

            System.out.println("¿Quieres introducir más números? (S/n)");
            response = scanner.nextLine();
        } while (!response.equalsIgnoreCase("N"));

        System.out.println(numbers);
    }
}
