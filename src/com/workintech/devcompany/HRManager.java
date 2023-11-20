package com.workintech.devcompany;

public class HRManager extends Employee {
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {

        return "HR manager has started to work.";
    }
}
