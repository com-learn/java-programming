package com.learn.collection;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        deque();

    }
    static void deque() {

        // Deque
        Deque<String> arrayDeque = new ArrayDeque<>();
        Deque<String> linkedList = new LinkedList<>();

        // deque can be used as a FIFO or a LIFO
        // First and Last combinations for the below methods
        // add / offer
        // remove / poll

        arrayDeque.addFirst("one");
        arrayDeque.addLast("two");
        arrayDeque.addLast("three");

        // arrayDeque.push("four"); -- push adds at beginning
        // arrayDeque.pop(); -- pops from the beginning
        // arrayDeque.element() -- takes element from the top

        System.out.println(" current state of deque : "+ arrayDeque);
        System.out.println(" top state of deque : "+ arrayDeque.element());


    }

    static void priorityQueue() {

        // queue operations
        // add at the tail, remove from the head, peek the head

        // add & offer -- add throws, offer doesn't - if addition is not possible
        // remove & poll -- remove throws, poll doesn't -- if queue is empty
        // element & peek -- element throws, peek doesn't -- if queue is empty

        Queue<String> linkedList = new LinkedList<>();

        linkedList.add("task1");
        linkedList.add("task2");
        linkedList.add("task3");

        System.out.println(" - current queue 1- "+ linkedList);

        linkedList.offer("task4");
        System.out.println(" - current queue 2- "+ linkedList);

        linkedList.remove("task2");
        System.out.println(" - current queue 3- "+ linkedList);

        linkedList.poll();
        System.out.println(" - current queue 4- "+ linkedList);

        System.out.println(" - current queue top - "+ linkedList.element());
        System.out.println(" - current queue top - "+ linkedList.peek());

        Queue<Employee> priorityQueue = new PriorityQueue<>(Comparator.comparing(Employee::getGrade).thenComparing(Employee::getExperience).reversed());

        priorityQueue.add(Employee.builder().name("midosh").grade(3).experience(10).build());
        priorityQueue.add(Employee.builder().name("satish").grade(4).experience(15).build());
        priorityQueue.add(Employee.builder().name("senthil").grade(4).experience(12).build());
        priorityQueue.add(Employee.builder().name("kannan").grade(5).experience(20).build());


        //priorityQueue.forEach(System.out::println);
    }
}

@Data
@ToString
@Builder
class Employee {
    String name;

    Integer grade;

    Integer experience;
}


