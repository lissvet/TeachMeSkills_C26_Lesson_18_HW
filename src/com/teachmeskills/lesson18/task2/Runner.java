package com.teachmeskills.lesson18.task2;

import java.util.ArrayList;
import java.util.List;
/**Create a collection of ArrayList class with the name values of all students in the group
 * Using Streams:
    - Select all names beginning with "a" (regardless of upper/lower case letters)
    - Sort and return the first element of the collection*/
public class Runner {

    public static void main(String[] args) {
        List<String> studentList= new ArrayList<>();
        studentList.add("Polina");
        studentList.add("Arthur");
        studentList.add("Dmitrii");
        studentList.add("Ivan");
        studentList.add("Mark");
        studentList.add("Daniil");
        studentList.add("Stepan");
        studentList.add("Sergey");
        studentList.add("Fedor");
        studentList.add("Lisa");

        studentList.stream()
                .filter(n -> n.matches("((?i)a)[aA-zZ]+"))
                .forEach(System.out::println);

        studentList.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }

}
