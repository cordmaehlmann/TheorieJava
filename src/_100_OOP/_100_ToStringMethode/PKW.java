package _100_OOP._100_ToStringMethode;

// Kapselung
// Englisch: Encapsulation.
// Das (Ver-)Kapseln von Attributen, um diese zu schützen.
//

public class PKW {

    private static int counter;  // 0

    private String hersteller;
    private String modell;
    private int leistung;

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

    // Getter & Setter
    public String getHersteller() {
        // TODO: Nach alle auf toUpper()
        return this.hersteller;
    }

    public void setHersteller(String hersteller) {
        // TODO: In der DB nachschlagen, ob es den Hersteller gibt.
        // Validierung
        this.hersteller = hersteller;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    // Wenn es nur einen Getter gibt wie bei counter,
    // ist das Attribut schreibgeschützt
    // und kann von außerhalb der Klasse nicht geändert werden.
    public static int getCounter() {
        return counter;
    }

    /*
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
    */

    // Die von Java geerbte Methode toString() überschreiben (overriding)
    /*
    public String toString() {
        return "Mein Auto ist ein "
                + this.hersteller
                + " "
                + this.modell
                + " und hat "
                + this.leistung + " PS.";
    }
*/

    // Annotation (Bemerkung) an den Compiler
    @Override
    public String toString() {
        return "PKW {" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", leistung=" + leistung +
                '}';
    }

}
