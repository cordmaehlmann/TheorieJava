public class _040_Rechenoperatoren {

    public static void main(String[] args) {

        // Rechenoperatoren

        System.out.println(3 + 4);   // 7
        System.out.println(13 - 7);  // 6
        System.out.println(3 * 7);   // 21

        // Division.
        // Bei zwei Integer entsteht immer ein Integer.
        // Es wird also automatisch abgerundet.
        System.out.println(21 / 3);    // 7
        System.out.println(21.0 / 3);  // 7.0
        // Wenn man eine Fließkommazahl braucht,
        // muss mindestens einer der Operanden eine Fließkommazahl sein.
        System.out.println(23 / 3);      // 7
        System.out.println(23.0 / 3);    // 7.666666666666667
        System.out.println(23 / 3.0);    // 7.666666666666667
        System.out.println(23.0 / 3.0);  // 7.666666666666667

        // Modulo - Restwert-Division
        System.out.println(66 % 8);  // 2

        // Inkrement- & Dekrementoperatoren
        int zahl = 7;
        zahl++;
        System.out.println(zahl);  // 8
        // In Python
        zahl += 1;
        System.out.println(zahl);  // 9

        zahl--;
        System.out.println(zahl);  // 8

        // Pre- und Post-Inkrementoperatoren

        // Pre-Inkrementoperator
        int zahl2 = ++zahl;
        System.out.println(zahl);  // 9
        System.out.println(zahl2);  // 9

        // Post-Inkrementoperator.
        // Bei Post-Inkrementoperator wird nach (Post) der Zuweisung erhöht.
        int zahl3 = zahl++;
        System.out.println(zahl);   // 10
        System.out.println(zahl3);  // 9

        // Miese Stelle
        // Post-Inkrementoperator mit Zuweisung in dieselbe Variable.
        zahl = 10;
        zahl = zahl++;
        System.out.println(zahl);  // 10


































    }
}
