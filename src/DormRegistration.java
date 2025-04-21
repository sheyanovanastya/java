import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidDormitoryAgeException extends Exception {
    public InvalidDormitoryAgeException(String message) {
        super(message);
    }
}

public class DormRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть ваш вік: ");
            int age = scanner.nextInt();

            if (age < 17 || age > 25) {
                throw new InvalidDormitoryAgeException("Вік повинен бути від 17 до 25.");
            }

            System.out.println("Реєстрація успішна.");
        } catch (InputMismatchException e) {
            System.out.println("Помилка: потрібно вводити число.");
        } catch (InvalidDormitoryAgeException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
