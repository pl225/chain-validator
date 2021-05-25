package com.company;

public class NodeInt extends Node<Integer> {

    public NodeInt (Integer number) {
        super(number);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
