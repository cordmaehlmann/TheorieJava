package _100_OOP._050_Konstruktor;

// Konstruktor.
// Eine Methode, die genauso heissen muss wie die Klasse.
// Jedes Mal, wenn mit new ein neues Objekt erzeugt wird,
// wird der Konstruktor ausgeführt.

public class PKW {

    String hersteller;
    String modell;
    int leistung;  // PS

    PKW() {
        this.hersteller = "Maserati";
        this.modell = "Granturismo";
        this.leistung = 369;
        System.out.println("Ein PKW wurde erzeugt!");
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
