package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//        Zadanie 1
        while (true) {
            System.out.print("Podaj dolny i górny limit liczb całkowitych: ");
            int dolnyLimit = scanner.nextInt();
            int gornyLimit = scanner.nextInt();

            if (gornyLimit <= dolnyLimit) {
                System.out.println("Koniec");
                break;
            }

            int sumaKwadratow = 0;
            for (int i = dolnyLimit; i <= gornyLimit; i++) {
                sumaKwadratow += i * i;
            }

            System.out.printf("Suma kwadratów liczb od %d do %d wynosi %d%n",
                    dolnyLimit * dolnyLimit, gornyLimit * gornyLimit, sumaKwadratow);
//        Zadanie 2
//        char wybor;
//        do {
//            System.out.println("\nWybierz operację:");
//            System.out.println("a) Dodawanie");
//            System.out.println("b) Odejmowanie");
//            System.out.println("c) Mnożenie");
//            System.out.println("d) Dzielenie");
//            System.out.println("q) Zakończ program");
//
//            wybor = scanner.next().charAt(0);
//
//            if (wybor == 'q') {
//                System.out.println("Zamykanie programu...");
//                break;
//            }
//
//            if (wybor != 'a' && wybor != 'b' && wybor != 'c' && wybor != 'd') {
//                System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
//                continue;
//            }
//
//            System.out.print("Podaj pierwszą liczbę: ");
//            double liczba1 = wczytajLiczbe(scanner);
//            System.out.print("Podaj drugą liczbę: ");
//            double liczba2 = wczytajLiczbe(scanner);
//
//            switch (wybor) {
//                case 'a':
//                    System.out.println("Wynik dodawania: " + (liczba1 + liczba2));
//                    break;
//                case 'b':
//                    System.out.println("Wynik odejmowania: " + (liczba1 - liczba2));
//                    break;
//                case 'c':
//                    System.out.println("Wynik mnożenia: " + (liczba1 * liczba2));
//                    break;
//                case 'd':
//                    if (liczba2 == 0) {
//                        System.out.println("Błąd: nie można dzielić przez zero.");
//                    } else {
//                        System.out.println("Wynik dzielenia: " + (liczba1 / liczba2));
//                    }
//                    break;
//            }
//
//        } while (true);
//    }
//
//    public static double wczytajLiczbe(Scanner scanner) {
//        while (!scanner.hasNextDouble()) {
//            System.out.println("To nie jest liczba. Spróbuj ponownie: ");
//            scanner.next();
//        }
//        return scanner.nextDouble();
    }
}
}



