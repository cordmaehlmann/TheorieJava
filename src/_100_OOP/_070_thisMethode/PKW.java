package _100_OOP._070_thisMethode;

// this()-Methode

public class PKW {

    String hersteller;
    String modell;
    int leistung;  // PS

    PKW(String hersteller, String modell, int leistung) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.leistung = leistung;
        System.out.println("Ein PKW wurde erzeugt!");
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
