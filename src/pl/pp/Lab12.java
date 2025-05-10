import java.io.*;
import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile;

        // Wczytywanie poprawnej ścieżki pliku wejściowego
        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (inputFile.exists() && inputFile.isFile()) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        // Ścieżka do pliku wyjściowego
        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String outputPath = scanner.nextLine();

        int lineCount = 0;

        // Liczenie linii w pliku
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }

            System.out.println("Liczba linii w pliku: " + lineCount);

            // Zapis do pliku wyjściowego
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write("Nazwa pliku: " + inputFile.getName());
                writer.newLine();
                writer.write("Liczba linii: " + lineCount);
                System.out.println("Wynik zapisano do pliku: " + outputPath);
            }

        } catch (IOException e) {
            System.out.println("Błąd podczas przetwarzania pliku: " + e.getMessage());
        }
    }
}
