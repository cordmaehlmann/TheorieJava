package _100_190;

public class _130_OhneKlammern {

    public static void main(String[] args) {

        // Ohne Klammern

        int a = 4;
        int b = 7;
        if (a == b)
            System.out.println("Sind gleich");
        else
            System.out.println("Sind unterschiedlich!");


        // if braucht einen Boolean
        // Es wird nicht, wie z.B. in Python automatisch bool() drum gelegt.
        String name = "Titus";
        if (name == "Titus") {
            System.out.println("Name Titus");
        }

        // java: Inkompatible Typen: java.lang.String kann nicht in boolean konvertiert werden
        // if (name) { System.out.println("Name vorhanden"); }


    }
}
