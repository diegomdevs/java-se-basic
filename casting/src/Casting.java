public class Casting {
    public static void main(String[] args) {
        // Stating Variables

        // Estimation
        double monthlyDogs = (30.0 / 12.0);
        int estimatedMonthlyDogs = (int) monthlyDogs;

        // Exactitude
        int a = 30;
        int b = 12;

        double c = (double) (a/b);

        char n = '1';
        int nI = (byte) n;

        // Printing Variables
        System.out.println(estimatedMonthlyDogs);
        System.out.println((double) (a / b));
        System.out.println(c);
        System.out.println(nI);
    }
}
