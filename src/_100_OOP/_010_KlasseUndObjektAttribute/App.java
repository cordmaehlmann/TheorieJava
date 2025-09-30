package _100_OOP._010_KlasseUndObjektAttribute;

public class App {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        System.out.println(pkw1);  // _100_OOP._010_KlasseUndObjektAttribute.PKW@8efb846

        // Die Objekt-Attribute werden automatisch mit ihren Standard-Werten belegt.
        System.out.println(pkw1.hersteller);  // null
        System.out.println(pkw1.modell);      // null
        System.out.println(pkw1.leistung);    // 0

        pkw1.hersteller = "Maserati";
        pkw1.modell = "Granturismo";
        pkw1.leistung = 369;


    }
}
