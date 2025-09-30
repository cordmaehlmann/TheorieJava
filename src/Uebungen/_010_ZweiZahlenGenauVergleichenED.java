package Uebungen;

import java.util.Random;

public class _010_ZweiZahlenGenauVergleichenED {

    public static void main(String[] args) {

        /*
         * Zwei Zahlen genau vergleichen
         *
         * Schreibe ein Programm, das zwei zufällige Zahlen erzeugt.
         * Dann soll das Programm testen und ausgeben,
         * welche von den beiden Zahlen größer ist oder ob beide Zahlen gleich groß sind.
         */
        Random r = new Random();

        int zahl1 = r.nextInt(1, 6);
        int zahl2 = r.nextInt(1, 6);

        // System.out.println(zahl1);
        // System.out.println(zahl2);

        if (zahl1 > zahl2) {
            System.out.println("Zahl1: " + zahl1);
            System.out.println("Zahl2: " + zahl2);
            System.out.println("Zahl1 ist größer als Zahl2");
        }
        else if (zahl2 > zahl1) {
            System.out.println("Zahl1: " + zahl1);
            System.out.println("Zahl2: " + zahl2);
            System.out.println("Zahl2 ist größer als Zahl1");
        }
        else if (zahl1 == zahl2) {
            System.out.println("Zahl1: " + zahl1);
            System.out.println("Zahl2: " + zahl2);
            System.out.println("Die beiden Zahlen sind gleich groß");
        }
        else {
            System.out.println("FEHLER!");
        }
    }
}
