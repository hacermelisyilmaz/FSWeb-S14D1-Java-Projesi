package com.workintech.devcompany;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {
        setSalary(getSalary() + 500);
        return getName() + " (junior developer) has started to work.";
    }
}
