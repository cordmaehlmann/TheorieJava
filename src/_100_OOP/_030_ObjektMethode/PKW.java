package _100_OOP._030_ObjektMethode;

// Objekt-Methode

public class PKW {

    // Objekt-Attribute
    String hersteller = "Maserati";
    String modell = "Granturismo";
    int leistung = 369;  // PS

    // Vor dem Methodenbezeichner MUSS der Datentyp des Rückgabewerts stehen.
    // void (deutsch: Leere) steht für keinen Rückgabewert.
    void wasBinIch() {
        System.out.println("Ich bin ein PKW!"); // Ausgeben
        // In die Datenbank schreiben
        // Per Email verschicken
    }

    String wasBinIch2() {
        return "Ich bin ein PKW!";
        // ZURÜCKGEBEN an die Stelle des Methodenaufrufs.
    }


}
