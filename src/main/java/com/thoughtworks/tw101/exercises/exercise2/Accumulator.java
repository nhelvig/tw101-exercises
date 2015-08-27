package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    int count;

    public Accumulator() {
        this.count = 0;
    }
    public void increment() {
        this.count += 1;
    }

    public void total() {
        System.out.println(this.count);
    }
}
