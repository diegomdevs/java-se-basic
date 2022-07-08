public class UpdatingVariables {
    public static void main(String[] args) {
        // Stating Variables.
        int salary = 1000;
        String employer_name = "Miguel Gonzalez";

        // Updating Variables.

        // Int

        // Bono $200
        salary += 200;

        // Pension $50 discount.
        salary -= 50;

        // 2 Extra hours $ 30 c/u.
        salary += (30 * 2);

        // Coupon food: 45$.
        salary -= 45;

        // String

        // Adding second lastname.
        employer_name += " Calero";

        // Adding first name.
        employer_name = "Felix " + employer_name;

        // Printing Variables.
        System.out.println("Salary: " + salary);
        System.out.println("Employer Name: " + employer_name);
    }
}
