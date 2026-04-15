package Assignment6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee(
                "Ansh", "ABCDE1234F", LocalDate.now(),
                "Developer", 101, 50000, 10000, "SWE"
        );

        ContractEmployee emp2 = new ContractEmployee(
                "Raj", "XYZAB5678K", LocalDate.now(),
                "Consultant", 102, 120, 500
        );

        Manager manager = new Manager(
                "Simran", "LMNOP9876Q", LocalDate.now(),
                "Manager", 103, 80000, 20000,
                "SWE", 10000, 5000
        );

        System.out.println("Full Time Employee CTC: " + emp1.calcCTC());
        System.out.println("Contract Employee CTC: " + emp2.calcCTC());
        System.out.println("Manager CTC: " + manager.calcCTC());
    }
}