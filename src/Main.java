public class Main {
    public static void main(String[] args) {
        // завдання 1: ділення та залишок від ділення
        System.out.println("завдання 1");
        int firstNumber = 52; // перше число
        int secondNumber = 5; // друге число

        int divisionResult = firstNumber / secondNumber; // ціле число від ділення
        int remainder = firstNumber % secondNumber; // залишок від ділення

        System.out.println("частка від " + firstNumber + " / " + secondNumber + " = " + divisionResult);
        System.out.println("залишок = " + remainder);

        // завдання 2: сума цифр двозначного числа
        System.out.println("\nзавдання 2");
        int twoDigitNumber = 69; // двозначне число

        int tens = twoDigitNumber / 10; // перша цифра (десятки)
        int units = twoDigitNumber % 10; // друга цифра (одиниці)

        int digitSum = tens + units; // сума цифр

        System.out.println("Сума цифр числа " + twoDigitNumber + " = " + digitSum);

        // завдання 3: округлення числа без Math.round()
        System.out.println("\nзавдання 3");
        double decimalValue = 19.6; // число з дробовою частино

        // округлення вручну: додаємо 0.5 і відкидаємо дробову частину
        int roundedValue = (int) (decimalValue + 0.5);

        System.out.println("округлене значення числа " + decimalValue + " = " + roundedValue);
    }
}

