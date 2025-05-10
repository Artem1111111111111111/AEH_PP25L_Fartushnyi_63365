package pl.pp;
public class Lab9 {
    private int numerMagazynu;
    private int dostepnaPrzestrzen;
    private String nazwaWlasciciela;
    private String email;
    private String numerTelefonu;

    public Lab9(int numerMagazynu, int dostepnaPrzestrzen, String nazwaWlasciciela, String email, String numerTelefonu) {
        this.numerMagazynu = numerMagazynu;
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

    public void dodajTowar(int ilosc) {
        if (ilosc <= dostepnaPrzestrzen) {
            dostepnaPrzestrzen -= ilosc;
            System.out.println("Dodano " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
        } else {
            System.out.println("Za mało miejsca w magazynie. Pozostała przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
        }
    }

    public void usunTowar(int ilosc) {
        int zajetaPrzestrzen = 5000 - dostepnaPrzestrzen;
        if (ilosc <= zajetaPrzestrzen) {
            dostepnaPrzestrzen += ilosc;
            System.out.println("Usunięto " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
        } else {
            System.out.println("Nie można usunąć więcej towaru niż jest w magazynie. Zajęta przestrzeń: " + zajetaPrzestrzen + " jednostek.");
        }
    }

    public void sprawdzZajetosc() {
        int zajeta = 5000 - dostepnaPrzestrzen;
        System.out.println("Zajęta przestrzeń magazynowa: " + zajeta + " jednostek.");
        System.out.println("Dostępna przestrzeń magazynowa: " + dostepnaPrzestrzen + " jednostek.");
    }

    public void aktualizujKontakt(String nowyEmail, String nowyTelefon) {
        this.email = nowyEmail;
        this.numerTelefonu = nowyTelefon;
        System.out.println("Zaktualizowano dane kontaktowe właściciela.");
        System.out.println("Nowy email: " + email);
        System.out.println("Nowy numer telefonu: " + numerTelefonu);
    }
}