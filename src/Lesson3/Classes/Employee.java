package Lesson3.Classes;

public class Employee implements Comparable<Employee> {
    private final String name;
    private final Integer age;
    private final Double salary;

    public Employee (String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.age - o.getAge());
    }

    @Override
    public String toString() {
        return name + "," + age + "," + salary;
    }
}
