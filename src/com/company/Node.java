package com.company;

import java.util.List;

public abstract class Node {
    public abstract List<Integer> getKeys ();

    public static Node createNode(int number) {
        return new NodeInt(number);
    }

    public static Node createNode(String string) {
        return new NodeString(string);
    }
}
