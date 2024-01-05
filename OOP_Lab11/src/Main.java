
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Bir sayi gir: ");
            String inputNumber = scanner.nextLine();
            int number = parseNumber(inputNumber);

            System.out.print("Bir yas gir: ");
            int age = scanner.nextInt();
            checkAge(age);

            int square = calculateSquare(number);
            System.out.println("Girilen sayinin karesi: " + square);
            System.out.println("islem basariyla tamamlandi.");
        } catch (NumberFormatException e) {
            System.err.println("Hata: Sayi formati hatali!");
        } catch (InvalidAgeException e) {
            System.err.println("Hata: " + e.getMessage());
        }
    }

    private static int parseNumber(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }

    private static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Yaş 18'den küçük olamaz!");
        }
    }

    private static int calculateSquare(int number) {
        return number * number;
    }
}
