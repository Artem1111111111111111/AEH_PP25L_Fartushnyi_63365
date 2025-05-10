package pl.pp;

public class Lab6 {

    public static void main(String[] args) {
        System.out.println("Porównanie czasu wykonania dwóch pętli:");

        measureExecutionTime();
    }

    public static void measureExecutionTime() {
        // Pierwsza operacja: pętla for
        long startFor = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int x = i * i;
        }
        long endFor = System.nanoTime();
        long durationFor = endFor - startFor;
        System.out.println("Czas wykonania pętli for: " + durationFor + " ns");

        // Druga operacja: pętla while
        long startWhile = System.nanoTime();
        int i = 0;
        while (i < 1000000) {
            int y = i * i;
            i++;
        }
        long endWhile = System.nanoTime();
        long durationWhile = endWhile - startWhile;
        System.out.println("Czas wykonania pętli while: " + durationWhile + " ns");
    }
}
