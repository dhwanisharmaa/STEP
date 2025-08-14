import java.util.Random;

public class ZaraBonusCalculator {

    static final int EMPLOYEE_COUNT = 10;

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] employeeData = new int[EMPLOYEE_COUNT][2]; // [][0] = salary, [][1] = years of service

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(10); // 1 to 10 years of service
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
        }

        return employeeData;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] newSalaryData = new double[EMPLOYEE_COUNT][2]; // [][0] = bonus, [][1] = new salary

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            newSalaryData[i][0] = bonus;
            newSalaryData[i][1] = newSalary;
        }

        return newSalaryData;
    }

    // Method to display everything in a table and total summary
    public static void displayResults(int[][] employeeData, double[][] newSalaryData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-12s %-15s %-12s %-12s%n", "ID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = newSalaryData[i][0];
            double newSalary = newSalaryData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-12d %-15d %-12.2f %-12.2f%n",
                              i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("\nTotal Old Salary: ₹" + totalOldSalary);
        System.out.println("Total Bonus Paid: ₹" + totalBonus);
        System.out.println("Total New Salary: ₹" + totalNewSalary);
    }

    // Main Method
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] newSalaryData = calculateBonusAndNewSalary(employeeData);
        displayResults(employeeData, newSalaryData);
    }
}
