package com.learn.collection;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//mentee
// knowing the path
// walking the path

//mentor
// show the path

public class StreamEx {
    public static void main(String[] args) {

        Stream.generate(new Random()::nextInt)
                .filter(i -> i>0)
                .limit(10)
                .forEach(System.out::println);
        System.out.println();

        Stream.generate(new Random()::nextInt)
                .limit(10)
                .filter(i -> i>0)
                .forEach(System.out::println);
        System.out.println();

        Stream.iterate(0, i->i+1)
                .limit(10)
                .forEach(System.out::println);

        System.out.println();
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> i < 6)
                .forEach(System.out::println);

        System.out.println();
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> i < 4)
                .forEach(System.out::println);

        System.out.println();
        OptionalDouble val = IntStream.of(1,2,3,4,5,6,7,8,9,10)
                .average();


    }
}
