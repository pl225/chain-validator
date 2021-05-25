package com.company;

public class NodeString extends Node<String> {

    public NodeString(String word) {
        super(word);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
