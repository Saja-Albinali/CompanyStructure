package company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");

        Director director = new Director("Ahmed", "IT", 1200, 50000);
        System.out.println(director);
        director.allocateBudget(15000);

        Engineer engineer = new Engineer("Saja", "engineering", 1500, new String[] {"Java", "Python"});
        System.out.println(engineer);

        SalesPerson salesPerson = new SalesPerson("Nadia", "HR", 1100, 100);
        System.out.println(salesPerson);


        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
    }
}