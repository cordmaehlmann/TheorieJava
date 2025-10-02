package _100_190._100_OOP._030_ObjektMethode;

public class App {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        System.out.println("PKW1: " + pkw1.hersteller + " " + pkw1.modell + " " + pkw1.leistung);
        // PKW1: Maserati Granturismo 369

        PKW pkw2 = new PKW();
        pkw2.hersteller = "Trabant";
        pkw2.modell = "601";
        pkw2.leistung = 23;
        System.out.println("PKW2: " + pkw2.hersteller + " " + pkw2.modell + " " + pkw2.leistung);
        // PKW2: Trabant 601 23


        pkw1.wasBinIch();                    // Ich bin ein PKW!
        String ausgabe = pkw1.wasBinIch2();  // Ich bin ein PKW!
        System.out.println(ausgabe);

        pkw2.wasBinIch();                   // Ich bin ein PKW!

    }
}
