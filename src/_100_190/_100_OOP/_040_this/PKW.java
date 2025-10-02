package _100_190._100_OOP._040_this;

// this
// Repräsentiert das aktuelle/jeweilige Objekt.

public class PKW {

    // Objekt-Attribute
    String hersteller = "Maserati";
    String modell = "Granturismo";
    int leistung = 369;  // PS

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
