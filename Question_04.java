// Question 4: Employee and HRManager (Overriding and extending)
class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class Question_04 {
    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        HRManager hr = new HRManager(75000);

        emp.work();
        System.out.println("Employee Salary: " + emp.getSalary());

        hr.work();
        System.out.println("HR Manager Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}
