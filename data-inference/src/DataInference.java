public class DataInference {
    public static void main(String[] args) {
        // Stating Variables

        // Using var to inference any data.

        // int

        // salary 1000.
        var salary = 1000;


        // double

        // pension 3%.
        var pension = (salary * 0.03);

        // totalSalary (salary - pension)
        var totalSalary = salary - pension;

        // String

        var employerName = "Diego Gonzalez";

        // Printing Variables

        System.out.println("Salary: " + salary);

        System.out.println("Pension: " + pension);

        System.out.println("Total Salary: " + totalSalary);

        System.out.println("Employer: " + employerName);
    }
}
