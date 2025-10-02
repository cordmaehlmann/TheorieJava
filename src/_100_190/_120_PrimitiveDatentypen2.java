package _100_190;

public class _120_PrimitiveDatentypen2 {

    public static void main(String[] args) {

        // Primitive Datentypen 2

        // Insgesamt gibt es 8

        // Ganzzahlen

        // Byte
        // 8-Bit (-128 bis 127)
        byte b1 = 7;
        System.out.println(b1);                      // 7
        System.out.println(Math.pow(2, 8));          // 256.0
        System.out.println(-(Math.pow(2, 8) / 2));   // -128.0
        System.out.println(Math.pow(2, 8) / 2 - 1);  // 127.0

        // Short
        // 16-Bit
        short s1 = 1234;
        System.out.println(s1);                       // 1234
        System.out.println(Math.pow(2, 16));          // 65536.0
        System.out.println(-(Math.pow(2, 16) / 2));   // -32768.0
        System.out.println(Math.pow(2, 16) / 2 - 1);  // 32767.0

        // Integer.
        // Standard-Ganzzahl.
        // 32-Bit
        int int1 = 123456;
        System.out.println(int1);                     // 123456
        System.out.println(Math.pow(2, 32));          // 4_294_967_296
        System.out.println(-(Math.pow(2, 32) / 2));   // -2_147_483_648
        System.out.println(Math.pow(2, 32) / 2 - 1);  // 2_147_483_647

        // Long
        // 64-Bit
        // Braucht ein abschließendes L
        long long1 = 3_000_000_000L;
        System.out.println(long1);                    // 123456
        System.out.println(Math.pow(2, 64));          // 1.8446744073709552E19
        System.out.println(-(Math.pow(2, 64) / 2));   // -9.223372036854776E18
        System.out.println(Math.pow(2, 64) / 2 - 1);  // 9.223372036854776E18

        // System.out.println(3_000_000_000);  // java: Ganzzahl zu groß
        System.out.println(3_000_000_000L);

        // Fließkommazahlen

        // Float
        // 32-Bit

        // float f1 = 1234.567;  // java: Inkompatible Typen: Möglicher Verlust bei Konvertierung von double in float
        float f1 = 1234.567F;

        float f2 = 1234.56789123456789F;
        System.out.println(f2);  // 1234.5679

        // Double
        // 64-Bit
        // Standrad-Fließkommazahlen
        double d2 = 1234.56789123456789;
        System.out.println(d2);  // 1234.567891234568

        // Boolean
        // 8-Bit
        boolean boo1 = true;
        System.out.println(boo1);  // true

        // Character
        // 16-Bit
        // Einführungszeichen.
        // Nur genau ein Zeichen.
        char c1 = 'A';
        System.out.println(c1);  // A

        // Dezimalzahl als ASCII-Code
        char c2 = 65;
        System.out.println(c2);  // A

        c1++;
        c2++;
        System.out.println(c1 + " " + c2);  // B B

        // Unicode
        char c3 = '\u2126';
        System.out.println(c3);  // Ω
































    }
}
