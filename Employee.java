package org.example;

import java.util.List;

public class Employee  {

    private String FirstName;
    private String LastName;

    private Double salary;

   // private List<String> projects;
/// List<String> projects
    public Employee(String firstName, String lastName, Double salary) {
        FirstName = firstName;
        LastName = lastName;
        this.salary = salary;
       // this.projects = projects;
    }

    public String getFirstName() {
        return FirstName;
    }

    public Employee() {
    }

    public String getLastName() {
        return LastName;
    }

    public Double getSalary() {
        return salary;
    }

//    public List<String> getProjects() {
//        return projects;
//    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

//    public void setProjects(List<String> projects) {
//        this.projects = projects;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", salary=" + salary +
               // ", projects=" + projects +
                '}';
    }
}
