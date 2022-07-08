public class Operators {
    public static void main(String[] args) {
        // Stating Variables
        byte lives = 5;
        byte gift = 100;

        // Postfix

        // Decrement Operator --.
        lives--;

        // Increment Operator ++.
        lives++;

        // Prefix
        ++lives;
        --lives;

        // Printing Variables
        System.out.println("Lives: " + lives);
        System.out.println("Prefix Gift: " + gift + ++lives);
        System.out.println("Postfix Gift: " + gift + lives++);
    }
}
