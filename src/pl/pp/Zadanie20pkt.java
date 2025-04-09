package pl.pp;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Zadanie20pkt {
    public static void main(String[] args) {
            Random rand = new Random();
            Scanner scanner = new Scanner(System.in);

            // Tworzenie i losowanie 6 różnych liczb z przedziału 1-49
            Set<Integer> tablica1 = new HashSet<>();
            while (tablica1.size() < 6) {
                tablica1.add(rand.nextInt(49) + 1);
            }

            System.out.println("Wylosowane liczby: " + tablica1);

            // Tworzenie drugiej tablicy poprzez wczytanie liczb od użytkownika
            Set<Integer> tablica2 = new HashSet<>();
            System.out.println("Podaj 6 różnych liczb z przedziału 1 do 49:");

            while (tablica2.size() < 6) {
                try {
                    System.out.print("Liczba " + (tablica2.size() + 1) + ": ");
                    int liczba = scanner.nextInt();

                    if (liczba < 1 || liczba > 49) {
                        System.out.println("Liczba musi być z przedziału od 1 do 49.");
                    } else if (tablica2.contains(liczba)) {
                        System.out.println("Liczba już została podana. Podaj inną.");
                    } else {
                        tablica2.add(liczba);
                    }
                } catch (Exception e) {
                    System.out.println("To nie jest poprawna liczba całkowita.");
                    scanner.next(); // To usunie błędny input
                }
            }

            // Sprawdzenie, ile liczb się powtarza
            Set<Integer> intersection = new HashSet<>(tablica1);
            intersection.retainAll(tablica2);

            System.out.println("Twoje liczby: " + tablica2);
            System.out.println("Ilość trafionych liczb: " + intersection.size());
        }

    }
