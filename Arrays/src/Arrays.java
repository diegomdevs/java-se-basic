public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[4][2];

        int[][][] numbers = new int[2][2][2];

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);

        System.out.println("-".repeat(50));

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "MXC";

        System.out.println(cities);
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);
        System.out.println(animals[1][0][0][1]);

    }
}
