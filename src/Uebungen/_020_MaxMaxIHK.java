package Uebungen;

public class _020_MaxMaxIHK {

    // Löse die Aufgabe MaxMax der IHK

    public static void main(String[] args) {

        int[] CPULoad = new int[] {12, 10, 40, 73, 33, 60};

        int max = 0;
        int max2 = 0;

        for (int i = 0; i < CPULoad.length; i++) {

            if (CPULoad[i] > max) {
                max2 = max;
                max = CPULoad[i];
            } else if (CPULoad[i] > max2) {
                max = CPULoad[i];
            }

        }

        System.out.println(max);
        System.out.println(max2);

    }


}
