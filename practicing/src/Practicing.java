public class Practicing {
    public static void main(String[] args) {
        //  Exercise 1: presenting my family:
        String grandfatherName = "Hernan";
        byte grandfatherAge = 73;
        String grandmotherName = "Dilcia";
        byte grandmotherAge = 68;
        String motherName = "Dilcia";
        byte motherAge = 53;
        String brotherName = "Felix";
        byte brotherAge = 25;
        String myName = "Diego";
        byte myAge = 17;

        System.out.println("Exercise 1: Family");
        System.out.println("Grandfather name and age: " + grandfatherName + ", " +  grandfatherAge);
        System.out.println("Grandmother name and age: " + grandmotherName + ", " +  grandmotherAge);
        System.out.println("Mother name and age: " + motherName + ", " +  motherAge);
        System.out.println("Brother name and age: " + brotherName + ", " +  brotherAge);
        System.out.println("My name and age: " + myName + ", " +  myAge);
        System.out.println("-".repeat(50));

        // Exercise 2: Casting
        char c = 'z';
        int cI = c;

        int i = 250;
        long iL = i;
        short iS = (short) iL;

        double d = 301.067;
        long dL = (long) d;

        int a = 100;
        float aF = (a + 5000.66f);

        int e = 737;
        e *= 100;
        byte eB = (byte) e;

        double f = 298.638;
        f /= 25;
        long fL = (long) f;


        System.out.println("Exercise 2: casting");
        System.out.println("char to int (char c to int cI): " + cI);
        System.out.println("int to long to short (int i to long iL to short iS): " + iS);
        System.out.println("double to long (double d to long dL): " + dL);
        System.out.println("int to float (int a to float aF): " + aF);
        System.out.println("int to byte (int e to byte eB): " + eB);
        System.out.println("double to long (double f to long fL): " + fL);
    }
}
