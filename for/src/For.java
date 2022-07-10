public class For {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        isTurnOnLight = turnOnOffLight();

        // For
        for (int i = 1; i <= 10 ; i++) {
            printSOS();
        }
    }
    public static void printSOS() {
        System.out.println("...___...");
    }
    public static boolean turnOnOffLight() {
        return (isTurnOnLight) ? false : true;
    }
}
