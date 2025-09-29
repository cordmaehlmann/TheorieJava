import java.util.Random;

public class _070_ifElseIfElse {

    public static void main(String[] args) {

        // if else
        double zahl = Math.random();
        if (zahl < 0.5) {
            System.out.println("Kleine Zahl");
        } else {
            System.out.println("Große Zahl");
        }

        // if else if else
        Random r = new Random();
        int tag = r.nextInt(1, 8); // 1 - 7
        String wochentag = "";

        if (tag == 1) {
            wochentag = "Montag";
        }
        else if (tag == 2) {
            wochentag = "Dienstag";
        }
        else if (tag == 3) {
            wochentag = "Mittwoch";
        }
        else if (tag == 4) {
            wochentag = "Donnerstag";
        }
        else if (tag == 5) {
            wochentag = "Freitag";
        }
        else if (tag == 6) {
            wochentag = "Samstag";
        }
        else if (tag == 7) {
            wochentag = "Sonntag";
        }
        else {
            wochentag = "FEHLER";
        }
        System.out.println(wochentag);

        // Bei nur einer Anweisung im Anweisungsblock können die geschweiften Klammern auch wegfallen.
        if (tag == 1) wochentag = "Montag";
        else if (tag == 2) wochentag = "Dienstag";
        else if (tag == 3) wochentag = "Mittwoch";
        else if (tag == 4) wochentag = "Donnerstag";
        else if (tag == 5) wochentag = "Freitag";
        else if (tag == 6) wochentag = "Samstag";
        else if (tag == 7) wochentag = "Sonntag";
        else wochentag = "FEHLER";
        System.out.println(wochentag);


    }
}
