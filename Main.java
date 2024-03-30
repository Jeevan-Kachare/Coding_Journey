package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.*;

public class Main {

    static List<Employee> emp= new ArrayList<>();

    static {
        emp.add(
                new Employee("Jeevan","kachare",5000.00));
        emp.add(
                new Employee("j","k",20.00));
        emp.add(
                new Employee("s","ke",100.00));
    }
    public static void main(String[] args) {
        emp.stream().forEach(emplyee -> {
         //   System.out.println(emplyee);
        });

        List<Employee> increasedSalary= emp.stream().map(employee -> new Employee(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary()*1.10

                )).collect(Collectors.toList());


      //  System.out.println(increasedSalary);

        List<Employee> dec= emp.stream().
                filter(employee -> employee.getSalary() >2000)
                .collect(Collectors.toList());

        System.out.println(dec);

        Employee abc= emp.stream()
        .filter(employee -> employee.getSalary() >5000)
                .map(employee -> new Employee(
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getSalary()*1.10

                ))
                .findFirst()
                        .orElse(null);

        System.out.println(abc);

        // Shortcircuit
        List<Employee> shortCicuit =
        emp.stream()
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(shortCicuit);

        //finieDAta

        Stream.generate(Math::random)
                .limit(5)
                .forEach(value -> System.out.println(value));

        //sorting
      List<Employee> e1=
              emp.stream()
                .sorted((o1,o2)->
                        o1.getFirstName()
                                .compareToIgnoreCase(o2.getFirstName()))
              .collect(Collectors.toList());

        System.out.println(e1);

        //min or max
        emp
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        double totalSal=
                emp
                        .stream()
                        .map(employee -> employee.getSalary())
                        .reduce(0.0,Double::sum);


        System.out.println(totalSal);


    }
}