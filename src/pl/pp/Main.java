package pl.pp;

public class Main {
    public static void main(String[] args) {
        Lab8 konto = new Lab8("123456789", 1000.0, "Jan Kowalski", "jan@example.com", "123456789");

        konto.wyplata(900.0);
        konto.wplata(250.0);
        konto.wyplata(50.0);
        konto.wyplata(500.0);
    }
}
