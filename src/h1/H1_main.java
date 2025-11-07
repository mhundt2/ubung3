package h1;

public class H1_main {
    public static void main(String[] args) {
        double guthaben = -100.0;
        double monEingang = 100.0;
        int rating = -2;
        boolean warnhinweis;
        boolean negativ;

        if (guthaben < 0) {
            negativ = true;
        } else {
            negativ = false;
        }

        if (guthaben > 0) {
            rating += 3;
        } else if (guthaben == 0) {
            rating += 2;
        }

        if (guthaben < 0) {
            if (monEingang >= Math.abs(guthaben)) {
                rating += 1;
            } else if (monEingang < Math.abs(guthaben)) {
                rating -= 1;
            }
        }

        if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }
        System.out.println("Guthaben: " + guthaben);
        System.out.println("Mon Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Warnhinweis: " + warnhinweis);
        System.out.println("Negativ: " + negativ);
    }
}