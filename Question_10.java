// Question 10: Abstract Employee with Manager and Programmer
abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name + ", Total Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer: " + name + ", Total Salary: " + calculateSalary());
    }
}

public class Question_10 {
    public static void main(String[] args) {
        Employee mgr = new Manager("Alice", 80000, 15000);
        Employee prog = new Programmer("Bob", 60000, 5000);

        mgr.displayInfo();
        prog.displayInfo();
    }
}
