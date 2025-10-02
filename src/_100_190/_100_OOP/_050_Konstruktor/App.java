package _100_190._100_OOP._050_Konstruktor;

public class App {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        pkw1.beschreibePKW();

        PKW pkw2 = new PKW();
        pkw2.hersteller = "Trabant";
        pkw2.modell = "601";
        pkw2.leistung = 23;

        pkw2.beschreibePKW();

    }
}
