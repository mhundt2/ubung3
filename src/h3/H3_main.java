package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 100;
        int fix = 67;
        int wartend = 35;
        boolean istVoll;

        int freiePlaetze = max - fix;

        if (freiePlaetze > 0 && wartend > 0) {
            if (wartend <= freiePlaetze) {
                fix += wartend;
                wartend = 0;
            } else {
                wartend -= freiePlaetze;
                fix = max;
            }
        }

        if (fix >= max) {
            istVoll = true;
        } else {
            istVoll = false;
        }

        System.out.println("Maximale Plätze: " + max);
        System.out.println("Fixplätze vergeben: " + fix);
        System.out.println("Auf Warteliste: " + wartend);
        System.out.println("Veranstaltung voll: " + istVoll);
    }
}