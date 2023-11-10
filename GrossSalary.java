import java.util.Scanner;
public class GrossSalary {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Basic salary: ");
        double basicSalary = scanner.nextDouble();

        double medicalAllowance = 0.2 * basicSalary;
        double teachAllowance = 5000;
        double conveyanceAllowance = 0.15 * basicSalary;
        double adhoeAllowance = 0.35 * basicSalary;

        double grossSalary = basicSalary + medicalAllowance + teachAllowance + conveyanceAllowance + adhoeAllowance;
        System.out.println("Gross Salary: " + grossSalary);

        double gpFund = 0.1 * grossSalary;
        double gst = 0.05 *grossSalary;
        double groupIns = 1000;

        double netSalary = grossSalary - (gpFund + gst + groupIns);
        System.out.println("Net Salary: " +  netSalary);

        scanner.close();
    }
}
