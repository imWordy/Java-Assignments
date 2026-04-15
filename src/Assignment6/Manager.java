package Assignment6;

import java.time.LocalDate;

public class Manager extends FullTimeEmployee {
    private double ta; // Travel Allowance
    private double eduAllowance;

    public Manager(String name, String panNo, LocalDate joiningDate,
                   String designation, int empId,
                   double baseSalary, double perfBonus,
                   String role, double ta, double eduAllowance) {

        super(name, panNo, joiningDate, designation, empId, baseSalary, perfBonus, role);
        this.ta = ta;
        this.eduAllowance = eduAllowance;
    }

    @Override
    public double calcCTC() {
        return baseSalary + perfBonus + ta + eduAllowance;
    }
}