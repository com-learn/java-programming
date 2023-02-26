package com.learn.collection;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(Student.builder().name("malu").age(8).city("chennai").subject("english").build());
        student.add(Student.builder().name("adhu").age(8).city("ernakulam").subject("maths").build());
        student.add(Student.builder().name("samrudh").age(8).city("ernakulam").subject("malayalam").build());
        student.add(Student.builder().name("sharan").age(12).city("chennai").subject("tamil").build());
        student.add(Student.builder().name("pooja").age(8).city("chennai").subject("tamil").build());

        // group by attribute name
        Map<String, List<Student>> subjectMap =
                student.stream()
                        .collect(Collectors.groupingBy(Student::getSubject));

        subjectMap.forEach((key,value)-> System.out.println( " subject  : " + key +" \n students "+ value));

        // group by attribute name and down stream collector
        Map<String, List<String>> studentMap =
                student.stream()
                        .collect(Collectors.groupingBy(Student::getCity,
                                Collectors.mapping(Student::getName, Collectors.toList())));

        studentMap.forEach((key,value)-> System.out.println( " city  : " + key +" \n student names "+ value));

        // group by attribute name, count for each group
        Map<String, Long> studentCountMap =
                student.stream()
                        .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));

        studentCountMap.forEach((key,value)-> System.out.println( " city  : " + key +" \n no of students "+ value));

        // group by attribute name, hashmap implementation, downstream collector
        Map<String, List<String>> studentTreeMap =
                student.stream()
                        .collect(Collectors.groupingBy(Student::getCity,
                                TreeMap::new,
                                Collectors.mapping(Student::getName, Collectors.toList())));

        studentTreeMap.forEach((key,value)-> System.out.println( " city  : " + key +" \n student names "+ value));


    }
    public static void streamGenerateIterateOf() {

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

@Builder
@Data
@ToString
class Student {
    String name;
    Integer age;
    String city;
    String subject;

}