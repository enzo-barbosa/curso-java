package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100;
    }

    public String showEmployee() {
        return "Employee: " + name
                + ", $ " + netSalary();
    }

    public String showUpdatedEmployee() {
        return "Updated data: " + name
                + ", $ " + netSalary();
    }
}
