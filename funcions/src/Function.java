import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        byte sumResult = sum((byte) 100, (byte) 27);
        double circleAreaResult = circleArea(3);
        System.out.println(sumResult);
        System.out.println(circleAreaResult);
        System.out.println("Pesos to dollars: " + convertToDollar(200, "MXN"));
    }
    public static byte sum(byte a, byte b) {
        return (byte) (a + b);
    }
    public static double circleArea(double r) {
        return (Math.PI * Math.pow(r, 2));
    }
    public static double sphereArea(double r) {
        return (4 * Math.PI * Math.pow(r, 2));
    }
    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }
    public static double convertToDollar(double amount, String currency) {
        switch (currency) {
            case "MXN":
                amount *= 0.049;
                break;
            case "COP":
                amount *= 0.00023;
                break;
        }
        return amount;
    }
}
