package com.company;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NodeString extends Node {

    private final String word;

    public NodeString(String word) {
        this.word = word;
    }

    @Override
    public List<Integer> getKeys() {
        if (this.word.length() == 1) {
            return Collections.singletonList(
                    Objects.hashCode(this.word.charAt(0))
            );
        } else {
            return this.word.chars().mapToObj(Objects::hashCode).collect(Collectors.toList());
        }
    }
}
