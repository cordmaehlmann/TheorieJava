package _010_090;

public class _080_ForSchleife {

    public static void main(String[] args) {

        // For-Schleife

        // for (start; bedingung; iteration) {}

        // i ist nur innerhalb der for-Schleife sichtbar/gültig.
        // Vorteil: Nach der Schleife kann i aus dem Speicher gelöscht werden.
        for (int i = 0; i < 10; i++) {

            System.out.print("Hello");  // HelloHelloHelloHelloHelloHelloHelloHelloHelloHello
        }
        System.out.println();

        // System.out.println(i);  // java: Symbol nicht gefunden

        // PYTHON: for i in range(10):

        // j ist in der ganzen main()-Methode sichtbar/gültig
        // und dadurch auch noch nach der Schleife (Vorteil).
        // Nachteil: Bleibt im Speicher, solange die main()-Methode läuft.
        int j;
        for (j = 0; j < 10; j++) {
            System.out.print("Hello");  // HelloHelloHelloHelloHelloHelloHelloHelloHelloHello
        }
        System.out.println();
        System.out.println(j);  // 10

        // Endlosschleife
        // while (true)
        // for (;;) {}

    }
}
