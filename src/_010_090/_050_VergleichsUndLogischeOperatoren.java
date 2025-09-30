package _010_090;

public class _050_VergleichsUndLogischeOperatoren {

    public static void main(String[] args) {

        // Vergleichsoperatoren
        // ==, !=, <, >, <=, >=
        System.out.println(2 == 3);  // false
        System.out.println(2 != 3);  // true

        // Logische Operatoren

        // AND per &&
        System.out.println(true && true);    // true
        System.out.println(true && false);   // false
        System.out.println(false && true);   // false
        System.out.println(false && false);  // false

        // OR per ||
        System.out.println(true || true);    // true
        System.out.println(true || false);   // true
        System.out.println(false || true);   // true
        System.out.println(false || false);  // false

        // NICHT/NOT per !
        System.out.println(!true);  // false


    }
}
