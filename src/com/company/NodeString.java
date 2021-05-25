package com.company;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NodeString implements Node {

    private final String word;

    public NodeString(String word) {
        this.word = word;
    }

    @Override
    public List<SimpleNode> getKeys() {
        if (this.word.length() == 1) {
            return Collections.singletonList(
                    new SimpleNode(Objects.hashCode(word.charAt(0)))
            );
        } else {
            return this.word.chars().mapToObj(c -> new SimpleNode(Objects.hashCode(c))).collect(Collectors.toList());
        }
    }
}
