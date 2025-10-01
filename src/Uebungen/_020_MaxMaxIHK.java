package Uebungen;

public class _020_MaxMaxIHK {

    // Löse die Aufgabe MaxMax der IHK

    public static void main(String[] args) {

        int[] CPULoad = new int[] {12, 10, 40, 73, 33, 60};
        // int[] CPULoad = new int[] {12, 10, 40, 73, 33, 60, 80};
        // int[] CPULoad = new int[] {12, 10, 4, 3};

        int max = 0;
        int max2 = 0;

        for (int i = 0; i < CPULoad.length; i++) {

            if (CPULoad[i] > max) {
                max2 = max;
                max = CPULoad[i];
            } else if (CPULoad[i] > max2) {
                max2 = CPULoad[i];
            }

        }

        System.out.println(max);
        System.out.println(max2);

    }


}
