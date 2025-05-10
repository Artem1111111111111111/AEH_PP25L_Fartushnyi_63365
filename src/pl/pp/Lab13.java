import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Lab13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputFilePath;
        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            inputFilePath = scanner.nextLine();
            if (Files.exists(Paths.get(inputFilePath))) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Podaj poprawną ścieżkę.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String outputFilePath = scanner.nextLine();

        Map<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                        if (!word.isEmpty()) {
                            totalWords++;
                            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku.");
            return;
        }

        System.out.println("Liczba wszystkich słów: " + totalWords);
        System.out.println("Wystąpienia słów:");
        wordCount.forEach((key, value) -> System.out.println(key + ": " + value));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write("Plik: " + inputFilePath + "\n");
            writer.write("Liczba wszystkich słów: " + totalWords + "\n");
            writer.write("Wystąpienia słów:\n");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisu do pliku.");
        }

        System.out.println("Dane zostały zapisane do pliku wyjściowego.");
    }
}
