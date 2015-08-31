package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void add(String nameOfNewNode) {
        if (this.name.compareTo(nameOfNewNode) < 0) {
            if (this.rightChild == null) {
                this.rightChild = new Node(nameOfNewNode);
            } else {
                this.rightChild.add(nameOfNewNode);
            }
        } else if (this.name.compareTo(nameOfNewNode) > 0) {
            if (this.leftChild == null) {
                this.leftChild = new Node(nameOfNewNode);
            } else {
                this.leftChild.add(nameOfNewNode);
            }
        } else {
            //Strings are equal, I have decided not to include duplicates.
        }
    }

    public List<String> names(ArrayList<String> listOfNames) {
        if (listOfNames == null) {
            listOfNames = new ArrayList();
        }
        if (this.leftChild == null) {
            listOfNames.add(this.name);
        } else {
            this.leftChild.names(listOfNames);
            listOfNames.add(this.name);
        }
        if (this.rightChild != null) {
            return this.rightChild.names(listOfNames);
        }
        return listOfNames;
    }

}
