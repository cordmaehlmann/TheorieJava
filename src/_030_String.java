public class _030_String {

    public static void main(String[] args) {

        // String - Zeichenkette
        // Objekt einer Klasse (Referenz Typ)
        // Datentyp wird großgeschrieben.
        // Beim String MUSS man doppelte Anführungszeichen benutzen.

        String begruessung = "Hallo";
        System.out.println(begruessung);  // Hallo

        // String-Verkettung - Konkatenation
        String name = "Peter";
        System.out.println(begruessung + " " + name);  // Hallo Peter

        // Implizite Typenkonvertierung.
        // Nur ein Operand (Wert) muss ein String sein.
        System.out.println(name + 42);  // Peter42
        System.out.println(42 + name);  // 42Peter

    }
}
