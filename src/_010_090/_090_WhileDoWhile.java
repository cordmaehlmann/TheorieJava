package _010_090;

public class _090_WhileDoWhile {

    public static void main(String[] args) {

        // while
        // Kopfgesteuerte Schleife
        int i = 0;
        while (i < 10) {
            System.out.print("Hello");  // HelloHelloHelloHelloHelloHelloHelloHelloHelloHello
            i++;
        }
        System.out.println();

        // do while
        // Fußgesteuerte Schleife
        int j = 0;
        do {
            System.out.print(j + " ");  // 0 1 2 3 4 5 6 7 8 9
            j++;
        } while (j < 10);
        System.out.println();




    }
}
