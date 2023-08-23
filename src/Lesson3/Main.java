package Lesson3;

import Lesson2.account.classes.Account;
import Lesson2.account.classes.AccountCredit;
import Lesson2.account.classes.AccountDeposit;
import Lesson2.account.classes.AccountFixed;
import Lesson3.Classes.Company;
import Lesson3.Classes.Employee;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Федоров", 24, 250.00);
        Employee employee2 = new Employee("Смирнов", 31, 50.00);
        Employee employee3 = new Employee("Сидоров", 21, 150.00);
        Employee employee4 = new Employee("Маслов", 18, 100.00);

        Set<Employee> employeesIter = new TreeSet<>();
        employeesIter.add(employee1);
        employeesIter.add(employee2);
        employeesIter.add(employee3);
        employeesIter.add(employee4);
        Company companyOne = new Company("Company One", employeesIter);
        System.out.println(companyOne);

        Set<Employee> employeesSalaryComparator = new TreeSet<>(
                (employeeFirst, employeeSecond) -> (int) (employeeFirst.getSalary() - employeeSecond.getSalary()));
        employeesSalaryComparator.add(employee1);
        employeesSalaryComparator.add(employee2);
        employeesSalaryComparator.add(employee3);
        employeesSalaryComparator.add(employee4);
        Company companyTwo = new Company("Company Two", employeesSalaryComparator);
        System.out.println(companyTwo);

        Set<Employee> employeesSalaryReversedComparator = new TreeSet<>(Comparator.comparing(Employee::getSalary).reversed());
        employeesSalaryReversedComparator.add(employee1);
        employeesSalaryReversedComparator.add(employee2);
        employeesSalaryReversedComparator.add(employee3);
        employeesSalaryReversedComparator.add(employee4);
        Company companyThree = new Company("Company Three", employeesSalaryReversedComparator);
        System.out.println(companyThree);

        Iterator<Employee> iterator = companyThree.iterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}