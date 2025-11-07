package p1;

import java.util.Random;

public class P1_main {
    public static void main(String[] args) {
        Random zufallsZahl = new Random();
        int wuerfel = zufallsZahl.nextInt(6) + 1;
        if (wuerfel == 1 || wuerfel == 4) {

            System.out.println("gewonnen!");

        } else if (wuerfel == 2) {
            System.out.println("Verloren!");

        } else if (wuerfel == 5) {
            System.out.println("Unentschieden!");
        } else {
            System.out.println("unklar!");

        }
    }
}
