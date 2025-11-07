package h2;

public class H2_main {
    public static void main(String[] args) {
        int jahr = 2025;
        boolean schalt;

        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            schalt = true;
        } else {
            schalt = false;
        }

        System.out.println("Das Jahr: " + jahr);
        System.out.println("Ist Schaltjahr: " + schalt);
    }
}

