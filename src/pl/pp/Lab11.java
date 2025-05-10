import java.util.*;

class Student {
    private String indeks;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Student(String indeks, String imie, String nazwisko, List<Integer> oceny) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public String getIndeks() {
        return indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public double getSrednia() {
        return oceny.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + indeks + ") - Average: " + String.format("%.2f", getSrednia());
    }
}

public class Lab11 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // Znalezienie studenta z najwyższą średnią
        Student najlepszy = Collections.max(students, Comparator.comparingDouble(Student::getSrednia));
        System.out.println("Student z najwyższą średnią: " + najlepszy);

        // Posortowanie studentów według nazwisk
        students.sort(Comparator.comparing(Student::getNazwisko));
        System.out.println("\nStudenci posortowani według nazwisk:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Obliczenie średniej ocen wszystkich studentów
        double sredniaWszystkich = students.stream()
                .mapToDouble(Student::getSrednia)
                .average()
                .orElse(0.0);
        System.out.printf("\nŚrednia ocen wszystkich studentów: %.2f\n", sredniaWszystkich);
    }
}
