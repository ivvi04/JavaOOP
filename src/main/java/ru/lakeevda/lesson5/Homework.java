package ru.lakeevda.lesson5;

import java.util.List;

public class Homework {

    public int sum(List<Integer> items) {
        // FIXME Реализовать
        int sum = 0;
        for(Integer i : items){
            sum += i;
        }
        return sum;
    }

    public boolean hasExactly(List<String> items, String item) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        } else if (items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }

    public <T> void copy(List<? extends T> source, List<? super T> target) {
        target.addAll(source);
    }
}
