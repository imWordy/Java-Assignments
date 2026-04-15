package Assignment6;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
    private int noOfHours;
    private double hourlyRate;

    public ContractEmployee(String name, String panNo, LocalDate joiningDate,
                            String designation, int empId,
                            int noOfHours, double hourlyRate) {
        super(name, panNo, joiningDate, designation, empId);
        this.noOfHours = noOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcCTC() {
        return noOfHours * hourlyRate;
    }
}