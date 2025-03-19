package pl.pp;
import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Zadanie 1
        //1
//        double x = 20;
//        double y = 2;
//

//        System.out.println("Proszę podaj swoje imię:");
//        String ime = sc.nextLine();
//        System.out.println("Proszę podaj swoje nazwisko:");
//        String nazwisko = sc.nextLine();
//        sc.close();
//        System.out.println("Witaj " + ime + " " + nazwisko + "!");
        //2
//        var result = x + y;
//        System.out.println("x + y = " + result);
//
//        result = x - y;
//        System.out.println("x - y = " + result);
//
//        result = x * y;
//        System.out.println("x * y = " + result);
//
//        result = x / y;
//        System.out.println("x / y = " + result);
//
//        result = x % y;
//        System.out.println("x % y = " + result);
//
//        System.out.println("Wpisz dwie licby rozdielone klawiaszem Enter:");
//        double first = sc.nextDouble();
//        double second = sc.nextDouble();
//        System.out.println("x + y = " + first + second);
    //Zadanie 2
        //1
//        int n = 10;
//        var result = Math.pow(n, 2);
//        System.out.println(result);
        //2
        System.out.println("Proszę podaj swoje wieku:");
        int n = sc.nextInt();
        int result = n * 365 * 24 * 60 * 60;
        System.out.println("Twój wiek w sekundach:" + result);
    }
}
