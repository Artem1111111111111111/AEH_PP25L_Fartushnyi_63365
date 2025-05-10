import pl.pp.Lab9;

public class Main {
    public static void main(String[] args) {
        Lab9 magazyn = new Lab9(1, 5000, "Jan Kowalski", "jan@example.com", "+48 111 222 333");

        magazyn.dodajTowar(3000);
        magazyn.usunTowar(1000);
        magazyn.dodajTowar(2500);
        magazyn.sprawdzZajetosc();
        magazyn.aktualizujKontakt("owner@magazyn.pl", "+48 123 456 789");
    }
}