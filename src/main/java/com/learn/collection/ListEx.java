package com.learn.collection;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

public class ListEx {
    public static void main(String[] args) {
        // a list maintains insertion order
        List<String> arrayListEx = new ArrayList<>(); // dynamic positional based, faster access
        List<String> linkedListEx = new LinkedList<>(); // faster insertion and deletion
        List<String> vectorEx = new Vector<>(); // synchronized list

        List<Cricketer> cricketers = new ArrayList<>();

        Cricketer virat = Cricketer.builder().name("Virat").age(30).matches(200).highestScore(180).runs(7000).build();
        cricketers.add(virat);
        Cricketer dhoni  = Cricketer.builder().name("Dhoni").age(34).matches(400).highestScore(120).runs(4200).build();

        cricketers.add(dhoni);
        Cricketer rohit =  Cricketer.builder().name("Rohit").age(20).matches(130).highestScore(250).runs(4000).build();

        cricketers.add(rohit);
        Cricketer sanju =   Cricketer.builder().name("Sanju").age(20).matches(150).highestScore(110).runs(2000).build();

        cricketers.add(sanju);

//        System.out.println();
//        cricketers.stream().sorted(Comparator.comparingInt(Cricketer::getHighestScore).reversed()).forEach(System.out::println);System.out.println();
//
//        System.out.println();
//        cricketers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

       // cricketers.forEach(System.out::println);

        Stack<String> stackEx = new Stack<>(); // LIFO structure
        stackEx.push("method1");
        stackEx.push("method2");
        stackEx.push("method3");

        System.out.println( " top element : " + stackEx.peek());

        stackEx.pop();

        System.out.println( " current Elements : " + stackEx);

        int position = stackEx.search("method2");

        System.out.println( " method2 present at : " + position);

        int position2 = stackEx.search("method3");

        System.out.println( " method3 present at : " + position2);

        System.out.println( " is stack empty : " + stackEx.isEmpty());



    }

}

@Getter
@Builder
@ToString
class Cricketer implements Comparable{
    private String name;
    private Integer age;
    private Integer matches;
    private Integer runs;
    private Integer highestScore;


    @Override
    public int compareTo(Object o) {
        return this.age - ((Cricketer)o).getAge();
    }
}

