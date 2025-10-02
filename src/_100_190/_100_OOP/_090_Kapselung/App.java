package _100_190._100_OOP._090_Kapselung;

public class App {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        pkw1.beschreibePKW();
        // Mein Auto ist ein Maserati Granturismo und hat 369 PS.

        PKW pkw2 = new PKW("Trabant");
        pkw2.beschreibePKW();
        // Mein Auto ist ein Trabant Granturismo und hat 369 PS.

        PKW pkw3 = new PKW("BMW", "Z3");
        pkw3.beschreibePKW();
        // Mein Auto ist ein BMW Z3 und hat 369 PS.

        PKW pkw4 = new PKW("Suzuki", "Swift", 200);
        pkw4.beschreibePKW();
        // Mein Auto ist ein Suzuki Swift und hat 200 PS.

        PKW pkw5 = new PKW("Peugeot", 112);
        pkw5.beschreibePKW();
        // Mein Auto ist ein Peugeot Granturismo und hat 112 PS.

        PKW pkw6 = new PKW();
        // pkw6.hersteller = "Bentley";
        pkw6.setHersteller("Bentley");
        pkw6.setModell("Continental GT");
        pkw6.setLeistung(550);
        pkw6.beschreibePKW();
        // Mein Auto ist ein Bentley Continental GT und hat 550 PS.

        System.out.println(PKW.getCounter());  // 6
    }
}
