package org.ies.tierno.lists.exercises;

import java.util.ArrayList;
import java.util.List;

public class Ej15 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(
                new Student("Bob", "Esponja", "bob@esponja.org", 31000)
        );
        students.add(
                new Student("Peppa", "Pig", "peppa@pig.org", 31001)
        );
        students.add(
                new Student("George", "Pig", "george@pig.org", 31000)
        );

        System.out.println(filterByZipCode(students, 31000));
    }

    public static List<Student> filterByZipCode(List<Student> students, int zipcode) {
        List<Student> result = new ArrayList<>();
        for (var student : students) {
            if (student.getZipCode() == zipcode) {
                result.add(student);
            }
        }

        return result;
    }
}
