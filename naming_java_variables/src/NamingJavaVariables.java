public class NamingJavaVariables {
    public static void main(String[] args) {

        // Stating Variables.

        // Naming variables using camel case.
        int cellPhone = 3;

        // Naming variables using $ symbol.
        String $countryName = "Spain";
        String currency$ = "MXN";

        // Naming variables using _.
        String _backgroundColor = "Green";
        String background_color = "Blue";

        //Printing Variables.
        System.out.println("Camel case");
        System.out.println("cellPhone: " + cellPhone);
        System.out.println("-".repeat(5));
        System.out.println("Using $ symbol");
        System.out.println("$countryName: " + $countryName);
        System.out.println("currency$: " + currency$);
        System.out.println("-".repeat(5));
        System.out.println("Snake Case: ");
        System.out.println("_backgroundColor: " + _backgroundColor);
        System.out.println("background_color: " + background_color);

    }
}
