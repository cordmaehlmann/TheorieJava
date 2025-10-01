package _100_OOP._080_StatischeAttribute;

// Statische Attribute
// Gehören der Klasse.
// Werden auch Klassen-Attribute genannt.

public class PKW {

    // Definition eines statischen Attributs.
    // Existiert nur einmal, da es nur eine Klasse gibt
    // und kann daher nur einen Wert haben.
    static int counter;  // 0

    // Objekt-Attribute
    // Können bei den einzelnen Objekten unterschiedliche Werte haben.
    String hersteller;
    String modell;
    int leistung;

    PKW(String hersteller, String modell, int leistung) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.leistung = leistung;
        System.out.println("Ein PKW wurde erzeugt!");
        // Benutzung des statischen Klassen-Attributs:
        PKW.counter++;
    }

    PKW() {
        this("Maserati", "Granturismo", 369);
    }

    PKW(String hersteller) {
        this(hersteller, "Granturismo", 369);
    }

    PKW(String hersteller, String modell) {
        this(hersteller, modell, 369);
    }

    PKW(String hersteller, int leistung) {
        this(hersteller, "Granturismo", leistung);
    }

    void beschreibePKW() {
        System.out.println(
                "Mein Auto ist ein "
                        + this.hersteller
                        + " "
                        + this.modell
                        + " und hat "
                        + this.leistung + " PS."
        );
    }
}
