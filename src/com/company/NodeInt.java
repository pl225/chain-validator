package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class NodeInt extends Node {

    private final int number;

    public NodeInt (Integer number) {
        this.number = number;
    }

    @Override
    public List<Integer> getKeys() {
        if (this.number <= 9) {
            return Collections.singletonList(
                    Objects.hashCode(this.number)
            );
        } else {
            return Arrays.asList(
                Objects.hashCode(number / 10), // primeiro digito
                Objects.hashCode(number % 10) // segundo digito
            );
        }
    }
}
