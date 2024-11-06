package company;

public class Director extends Employee {
    private double budget;

    public Director(String name, String department, double salary,double budget) {
        super(name, department, salary);
        this.budget=budget;
    }
public void allocateBudget(double amount){
        if (amount<=budget){
            System.out.println("allocate budget" + amount + " to department.");
            budget -= amount;
        } else {
            System.out.println("Insufficient budget.");
        }
}
    public String toString() {
        return super.toString() + "Budget: " + budget;
    }
    public double getBudget(){
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }

        }


