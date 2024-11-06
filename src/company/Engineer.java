package company;

import java.util.ArrayList;
import java.util.Arrays;

public class Engineer extends Employee {
    private ArrayList<String> skills;

    public Engineer(String name, String department , double salary, String[] initialSkills) {
        super(name, department, salary);
        this.skills = new ArrayList<>(Arrays.asList(initialSkills));
    }

    // Getters
    public ArrayList<String> getSkills() {
        return skills;
    }

    // Setters
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return super.toString() + ", Skills: " + skills;
    }
}

