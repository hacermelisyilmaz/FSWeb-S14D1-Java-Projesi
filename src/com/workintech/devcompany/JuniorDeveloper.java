package com.workintech.devcompany;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public String work() {
        setSalary(32000);
        return getName() + " (junior developer) has started to work.";
    }
}
