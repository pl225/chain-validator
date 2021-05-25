package com.company;

public abstract class Node<I> {

    private final I dado;

    public Node (I dado) {
        this.dado = dado;
    }

    public final I getDado() {
        return this.dado;
    }

    public abstract void accept (Visitor visitor);
}
