package Assignment6;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
    protected double baseSalary;
    protected double perfBonus;
    protected String role; // SWE / HR

    public FullTimeEmployee(String name, String panNo, LocalDate joiningDate,
                            String designation, int empId,
                            double baseSalary, double perfBonus, String role) {
        super(name, panNo, joiningDate, designation, empId);
        this.baseSalary = baseSalary;
        this.perfBonus = perfBonus;
        this.role = role;
    }

    @Override
    public double calcCTC() {
        if (role.equalsIgnoreCase("SWE")) {
            return baseSalary + perfBonus;
        } else if (role.equalsIgnoreCase("HR")) {
            return baseSalary + perfBonus; // assuming perfBonus = hiringCommission
        } else {
            return baseSalary;
        }
    }
}