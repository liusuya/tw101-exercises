package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 0) {
            //the new name is lexicographically before the current node's name
            if (leftChild == null) {
                leftChild = new Node(nameOfNewNode);
            }
            else {
                leftChild.add(nameOfNewNode);
            }
        }
        else {
            //the new name is the same as the current node's name or after it
            if (rightChild == null) {
                rightChild = new Node(nameOfNewNode);
            }
            else {
                rightChild.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        ArrayList<String> list = new ArrayList<String>();

        if (leftChild != null) {
            list.addAll(leftChild.names());
        }
        list.add(name);
        if (rightChild != null) {
            list.addAll(rightChild.names());
        }
        return list;
    }
}
