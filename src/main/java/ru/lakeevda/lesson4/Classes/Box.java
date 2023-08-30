package ru.lakeevda.lesson4.Classes;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private final List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        this.fruits.add(fruit);
    }

    public int getWeight() {
        int weight = 0;
        for (Fruit fruit : this.fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void moveTo(Box<? super T> another) {
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

}
