import java.util.Arrays;

public class _110_Array {

    public static void main(String[] args) {

        // Array.

        // Wichtigster Container-Datentyp in Java.

        // Entspricht der Liste in Python.
        // Unterschied zu Python: In Java darf in einem Array nur ein Datentyp sein.
        // Unterschied zu Python: In Java ist die Länge eines Arrays nicht veränderbar (Performance-Vorteil).

        int[] zahlen = new int[3];
        System.out.println(zahlen);  // [I@27716f4

        // Der Default-Wert des Datentyps wird automatisch eingefügt:
        System.out.println(zahlen[0]);  // 0
        System.out.println(zahlen[1]);  // 0
        System.out.println(zahlen[2]);  // 0

        // Indexe neu belegen:
        zahlen[0] = 11;
        zahlen[1] = 13;
        zahlen[2] = 17;

        // Arrays.toString() zum ausgeben des Inhalts:
        System.out.println(Arrays.toString(zahlen));  // [11, 13, 17]

        // Array-Literal zum direkten Zuweisen von Startwerten:
        int[] zahlen2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(zahlen2));  // [1, 2, 3, 4, 5]

        // Das length-Attribut eines Array-Objekts:
        System.out.println(zahlen.length);   // 3
        System.out.println(zahlen2.length);  // 5

        // Klassische for-Schleife:
        String[] namen = {"Peter", "Paul", "Mary"};
        for (int index = 0; index < namen.length; index++) {                     // 0 1 2
            System.out.print(namen[index] + " ");  // Peter Paul Mary
        }
        System.out.println();

        // Enhanced for-Schleife
        // Speziell zum Durchlaufen von Containern, wie z.B einem Array.
        // Wenn man den index nicht in der Schleife braucht.
        for (String name : namen) {
            System.out.print(name + " ");  // Peter Paul Mary
        }
        System.out.println();

        // Klassische for-Schleife mit Benutzung des index in der Schleife.
        for (int index = 0; index < namen.length; index++) {
            System.out.print((index+1) + "." + namen[index] + " ");  // 1.Peter 2.Paul 3.Mary
        }
        System.out.println();

        // ArrayIndexOutOfBoundsException.
        // Die wahrscheinlich berühmteste Java-Fehlermeldung.
        // Runtime-Fehlermeldung, die vom Compiler nicht beanstandet wird.
        int[] zahlen3 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(zahlen3[99]);





    }
}
