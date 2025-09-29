import java.util.Random;

public class _060_Zufallszahlen {

    public static void main(String[] args) {

        // Zufallszahlen

        // Per new ein Objekt der Klasse Random erzeugen.
        // Dieses Objekt ist ein Zufallszahlengenerator.
        Random r = new Random();

        // nextInt()-Methode
        // Gibt einen Integer zwischen origin (inklusiv) und bound (exklusiv) zurück.
        System.out.println(r.nextInt(1, 7));  // z.B. 3

        int wurf = r.nextInt(1, 7);
        System.out.println(wurf);  // z.B. 3

        // Math.random() - 0 (inklusiv) bis 1 (exklusiv)
        System.out.println(Math.random());  // z.B. 0.9866816565230826

    }
}
