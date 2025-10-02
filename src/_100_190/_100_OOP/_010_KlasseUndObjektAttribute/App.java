package _100_190._100_OOP._010_KlasseUndObjektAttribute;

public class App {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        System.out.println(pkw1);  // _100_190._100_OOP._010_KlasseUndObjektAttribute.PKW@8efb846

        // Die Objekt-Attribute werden automatisch mit ihren Standard-Werten belegt.
        System.out.println(pkw1.hersteller);  // null
        System.out.println(pkw1.modell);      // null
        System.out.println(pkw1.leistung);    // 0

        pkw1.hersteller = "Maserati";
        pkw1.modell = "Granturismo";
        pkw1.leistung = 369;

        PKW pkw2 = new PKW();
        pkw2.hersteller = "Trabant";
        pkw2.modell = "601";
        pkw2.leistung = 23;

        System.out.println("PKW1: " + pkw1.hersteller + " " + pkw1.modell + " " + pkw1.leistung);
        // PKW1: Maserati Granturismo 369
        System.out.println("PKW2: " + pkw2.hersteller + " " + pkw2.modell + " " + pkw2.leistung);
        // PKW2: Trabant 601 23

    }
}
