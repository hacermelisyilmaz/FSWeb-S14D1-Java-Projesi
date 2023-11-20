package com.workintech.devcompany;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(int id, String name, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public String work() {
        setSalary(60000);
        return getName() + " (HR manager) has started to work.";
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniorDevelopers[index] == null) juniorDevelopers[index] = juniorDeveloper;
            else System.out.println("Index is full");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }
    public void addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (midDevelopers[index] == null) midDevelopers[index] = midDeveloper;
            else System.out.println("Index is full");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }
    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index] == null) seniorDevelopers[index] = seniorDeveloper;
            else System.out.println("Index is full");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found: " + index);
        }
    }
}
