package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class NodeInt implements Node {

    private final int number;

    public NodeInt (int number) {
        this.number = number;
    }

    @Override
    public List<SimpleNode> getKeys() {
        if (number <= 9) {
            return Collections.singletonList(
                    new SimpleNode(Objects.hashCode(this.number))
            );
        } else {
            return Arrays.asList(
                new SimpleNode(Objects.hashCode(number / 10)), // primeiro digito
                new SimpleNode(Objects.hashCode(number % 10)) // segundo digito
            );
        }
    }
}
