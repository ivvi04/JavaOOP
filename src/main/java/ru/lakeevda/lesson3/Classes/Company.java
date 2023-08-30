package ru.lakeevda.lesson3.Classes;

import java.util.Iterator;
import java.util.Set;

public class Company implements Iterable<Employee> {

    private final String name;
    private final Set<Employee> employees;

    public Company (String name, Set<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public String toString() {
        return name + " : " + employees + "";
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator(this.employees);
    }
}

