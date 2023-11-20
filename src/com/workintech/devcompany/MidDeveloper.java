package com.workintech.devcompany;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {
        return "Mid developer has started to work.";
    }
}
