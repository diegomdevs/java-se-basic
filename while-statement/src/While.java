import java.util.Scanner;
public class While {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        // Do While
        int response = 0;
        do {
            System.out.println("Select an option!");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Thanks for visit us!");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Select a correct option!");
            }
        } while (response != 0);
        System.out.println("Program Finish!");

        // While
        isTurnOnLight = turnOnOffLight();
        byte i = 0;
        while (isTurnOnLight && i < 10) {
            printSOS();
            i++;
        }

    }
    public static void printSOS() {
        System.out.println("...___...");
        return;
    }
    public static boolean turnOnOffLight() {
        return (isTurnOnLight) ? false : true;
    }
}
