package com.java.optional.project;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaOptionalMap {

    public static void main(String[] args) {
        Integer year = 2016;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2016 = yearOptional.filter(y -> (y == 2016)).isPresent();

        System.out.println(is2016);


        List<String> companyNames = Arrays.asList("paypal", "samsung", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);


        int size = listOptional
                .map(List::size)
                .orElse(0);

        System.out.println(size);
    }



}
