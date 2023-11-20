package com.workintech.devcompany;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name) {
        setId(id);
        setName(name);
    }

    public Employee(int id, String name, double salary) {
        this(id, name);
        setSalary(salary);
    }

    public String work() {
        setSalary(getSalary() + 500);
        return getName() + " (employee) has started to work.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
