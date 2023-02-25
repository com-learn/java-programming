package com.learn.collection;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        // set will contain unique elements
        Set<String> names = new LinkedHashSet<>();//HashSet<>(); // will maintain insertion order
        names.add("messi");
        names.add("ronaldo");
        names.add("mbappe");
        names.add("neymar");

        //names.forEach(System.out::println);

        Set<String> backendDevSkills = new HashSet<>();
        Set<String> frontendDevSkills = new HashSet<>();

        backendDevSkills.add("java");
        backendDevSkills.add("springboot");
        backendDevSkills.add("devops");
        backendDevSkills.add("agile");

        frontendDevSkills.add("angular");
        frontendDevSkills.add("html");
        frontendDevSkills.add("css");
        frontendDevSkills.add("devops");
        frontendDevSkills.add("agile");
        // set operation
        // union - addAll
        // intersection - retainAll
        // difference - removeAll

        //performUnion(frontendDevSkills, backendDevSkills);
        //performIntersection(frontendDevSkills, backendDevSkills);
        //performDiff(frontendDevSkills, backendDevSkills);

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("zidane");
        sortedSet.add("xavi");
        sortedSet.add("guardiola");
        sortedSet.add("scaloni");

        sortedSet.forEach(System.out::println);


        Footballer messi = Footballer.builder().name("messi").matches(400).goals(837).assists(512).build();
        Footballer ronaldo = Footballer.builder().name("ronaldo").matches(412).goals(800).assists(487).build();
        Footballer mbappe = Footballer.builder().name("mbappe").matches(200).goals(387).assists(123).build();
        Footballer neymar = Footballer.builder().name("neymar").matches(287).goals(370).assists(252).build();

        SortedSet<Footballer> sortedFootballer = new TreeSet<>(Comparator.comparing(Footballer::getGoals));
        sortedFootballer.add(messi);
        sortedFootballer.add(ronaldo);
        sortedFootballer.add(mbappe);
        sortedFootballer.add(neymar);
        sortedFootballer.forEach(System.out::println);

    }

    public static void performUnion(Set<String> s1, Set<String> s2) {
        Set<String> unionSet = new HashSet<>(s1);
        unionSet.addAll(s2);
        unionSet.forEach(System.out::println);
    }

    public static void performIntersection(Set<String> s1, Set<String> s2) {
        Set<String> unionSet = new HashSet<>(s1);
        unionSet.retainAll(s2);
        unionSet.forEach(System.out::println);
    }

    public static void performDiff(Set<String> s1, Set<String> s2) {
        Set<String> unionSet = new HashSet<>(s1);
        unionSet.removeAll(s2);
        unionSet.forEach(System.out::println);
    }


}

@Builder
@Data
@ToString
class Footballer {
    String name;
    Integer matches;

    Integer goals;

    Integer assists;
}