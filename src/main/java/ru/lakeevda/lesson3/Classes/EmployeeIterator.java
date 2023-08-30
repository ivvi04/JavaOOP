package ru.lakeevda.lesson3.Classes;

import java.util.Iterator;
import java.util.Set;

public class EmployeeIterator implements Iterator<Employee> {

    private Employee[] employees;

    private Integer cursor = 0;

    public EmployeeIterator(Set<Employee> employees) {
        this.employees = employees.toArray(new Employee[0]);
    }

    @Override
    public boolean hasNext() {
        return cursor < this.employees.length;
    }

    @Override
    public Employee next() {
        return employees[cursor++];
    }
}
