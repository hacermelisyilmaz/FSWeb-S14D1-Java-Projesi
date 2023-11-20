package com.workintech.devcompany;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {
        setSalary(55000);
        return getName() + " (senior developer) has started to work.";
    }
}
