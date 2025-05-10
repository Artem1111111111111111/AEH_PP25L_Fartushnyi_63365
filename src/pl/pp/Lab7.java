package pl.pp;

public class Lab7 {
    public boolean accepts(String input) {
        if (input == null) return false;
        return input.length() >= 5 && input.length() <= 10 && input.contains("a");
    }

    public static void main(String[] args) {
        Lab7 validator = new Lab7();
        System.out.println(validator.accepts("apple"));
        System.out.println(validator.accepts("car"));
        System.out.println(validator.accepts("houseboat"));
        System.out.println(validator.accepts("abcdefghijk"));
    }
}