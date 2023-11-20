package com.workintech.devcompany;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {
        setSalary(45000);
        return getName() + " (mid developer) has started to work.";
    }
}
