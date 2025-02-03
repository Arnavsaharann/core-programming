import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double serviceYears = scanner.nextDouble();

            if (salary <= 0 || serviceYears < 0) {
                System.out.println("Invalid input! Please enter positive values.");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = serviceYears;
        }

        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] + ", Bonus = " + bonuses[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
