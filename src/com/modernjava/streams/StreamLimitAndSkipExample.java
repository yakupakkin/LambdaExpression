package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> limit5numbers = numbers.stream().limit(numbers.size()/2).collect(Collectors.toList());
        limit5numbers.forEach(System.out::println);

        System.out.println("-----");
        List<Integer> skip5numbers = numbers.stream().skip(numbers.size()/2).collect(Collectors.toList());
        skip5numbers.forEach(System.out::println);


    }
}
