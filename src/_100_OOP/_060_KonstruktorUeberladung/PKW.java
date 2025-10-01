package _100_OOP._060_KonstruktorUeberladung;

// Konstruktor-Überladung
// Überladung:
// Methoden dürfen gleich heissen
// und müssen sich dann in der Parameter-Liste unterscheiden:
// Anzahl der Parameter und/oder dem Datentyp der Parameter

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

    PKW(String hersteller) {
        this.hersteller = hersteller;
        this.modell = "Granturismo";
        this.leistung = 369;
        System.out.println("Ein PKW wurde erzeugt!");
    }

    PKW(String hersteller, String modell) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.leistung = 369;
        System.out.println("Ein PKW wurde erzeugt!");
    }

    PKW(String hersteller, String modell, int leistung) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.leistung = leistung;
        System.out.println("Ein PKW wurde erzeugt!");
    }

    PKW(String hersteller, int leistung) {
        this.hersteller = hersteller;
        this.modell = "Granturismo";
        this.leistung = leistung;
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
