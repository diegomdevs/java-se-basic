public class MathematicalOperations {
    public static void main(String[] args) {

        // Stating Variables.
        float x = 2.1f;
        float y = 3;
        // Area of a sphere
        double a = (4 * Math.PI * Math.pow(y, 2));

        // Printing Variables
        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.pow(x, y));
        System.out.println(Math.max(x, y));
        System.out.println(Math.sqrt(y));
        System.out.println(Math.PI * Math.pow(y, 2));
        System.out.println("The area of a sphere: " + a);
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
