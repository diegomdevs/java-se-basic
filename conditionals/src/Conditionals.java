public class Conditionals {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        byte sendFiles = 3;
        if (isBluetoothEnabled) {
            sendFiles++;
            System.out.println("Sending Files...");
        } else {
            System.out.println("Please, turn on your Bluetooth");
        }
    }
}
