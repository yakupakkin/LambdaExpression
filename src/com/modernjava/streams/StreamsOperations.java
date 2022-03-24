package com.modernjava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

public class StreamsOperations {
    public static void main(String[] args) {
        //count   distinct
        Long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();

        System.out.println(count);
        //distinct
        List<String> courses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(courses);

        //anymatch, allmatch and nonmatch


        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(s -> s.startsWith("J"));

        System.out.println(match);




    }
}
