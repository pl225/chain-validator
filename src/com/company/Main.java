package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(36, 6, 24, 4, 47, 7, 2, 3, 27);
        List<String> words = Arrays.asList("p", "aba", "a", "b", "perso", "o", "r", "e", "s");
        List<Integer> numbersNotValid = Arrays.asList(35, 5, 65, 6, 24, 4);
        List<Integer> numbersNotValid2 = Arrays.asList(33, 5, 65, 6, 24, 4);

        ChainValidator chainValidator = new ChainValidator();

        System.out.println(chainValidator.validate(numbers.stream().map(Node::createNode).collect(Collectors.toList())));
        System.out.println(chainValidator.validate(words.stream().map(Node::createNode).collect(Collectors.toList())));
        System.out.println(chainValidator.validate(numbersNotValid.stream().map(Node::createNode).collect(Collectors.toList())));
        System.out.println(chainValidator.validate(numbersNotValid2.stream().map(Node::createNode).collect(Collectors.toList())));
    }
}
