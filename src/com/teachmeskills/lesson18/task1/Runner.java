package com.teachmeskills.lesson18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**Create a collection of ArrayList class fill it with random elements of Integer type.
 * Using Streams:
    - Remove duplicates
    - Output all even elements in the range from 7 to 17 (inclusive).
    - Multiply each element by 2
    - Sort and display the first 4 elements
    - Output the number of elements in the stream
    - Output the arithmetic mean of all numbers in the stream*/
public class Runner {

    public static void main(String[] args) {
        List<Integer> randomInt = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            randomInt.add((int) (Math.random() * 100));
        }

        System.out.println("Remove duplicates: ");
        randomInt.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("Remove Output all even elements in the range from 7 to 17 (inclusive): ");
        randomInt.stream()
                .filter(n -> n % 2 == 0 && n >= 7 && n <= 17)
                .forEach(System.out::println);

        System.out.println("Multiply each element by 2: ");
        randomInt.stream()
                .map(n -> n*2)
                .forEach(System.out::println);

        System.out.println("Sorted elements: ");
        randomInt.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("First four elements: ");
        randomInt.stream()
                .limit(4)
                .forEach(System.out::println);

        System.out.println("Number of elements: " + randomInt.stream().count());

        System.out.println("Arithmetic mean of elements: " + randomInt.stream()
                                                                     .collect(Collectors.averagingInt(Integer::intValue)));

    }

}
