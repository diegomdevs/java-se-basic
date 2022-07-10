
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Sum result: " + sum((byte) 1, (byte) 2));
        System.out.println(getPairs(new int[] { 1, 2, 3, 4, 5 }));
    }

    /**
     * This function sums two given byte values.
     *
     * @param a {@code byte} first given value.
     * @param b {@code byte} second given value.
     * @return {@code byte} the sum of the two given values.
     */
    public static byte sum(byte a, byte b) {
        return (byte) (a + b);
    }

}
