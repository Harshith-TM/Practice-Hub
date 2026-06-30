//Java datatypes

public class DataTypesExample {
    public static void main(String[] args) {

        int employeeId = 101;
        String employeeName = "Aman";
        double basicSalary = 35000.75;
        double bonus = 5000.50;
        char grade = 'A';
        boolean isPermanent = true;

        double totalSalary = basicSalary + bonus;

        System.out.println("Employee ID      : " + employeeId);
        System.out.println("Employee Name    : " + employeeName);
        System.out.println("Grade            : " + grade);
        System.out.println("Permanent Staff  : " + isPermanent);
        System.out.println("Total Salary     : " + totalSalary);
    }
}