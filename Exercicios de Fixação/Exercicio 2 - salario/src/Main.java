import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name:");
        employee.name = ler.next();

        System.out.println("Gross Salary:");
        employee.grossSalary = ler.nextDouble();

        System.out.println("Tax:");
        employee.tax = ler.nextDouble();

        System.out.println(employee.showEmployee());

        System.out.println("Which percentage to increase salary?");
        double percentage = ler.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println(employee.showUpdatedEmployee());

        ler.close();
    }
}