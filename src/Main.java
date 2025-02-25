public class Main {
    public static void main(String[] args) {
        // завдання 1: вивід чисел від 500 до 650 з кроком 10 (всі види циклів)
        System.out.println("Завдання 1.1 (for)");
        for (int num = 500; num <= 650; num += 10) {
            System.out.println(num);
        }

        System.out.println("завдання 1.2 (while)");
        int val = 500;
        while (val <= 650) {
            System.out.println(val);
            val += 10;
        }

        System.out.println("завдання 1.3 (do-while)");
        int step = 500;
        do {
            System.out.println(step);
            step += 10;
        } while (step <= 650);

        // завдання 2: виведення послідовності 2а-1, доки значення менше 5000
        System.out.println("\nзавдання 2");
        int sequenceValue = 2;
        while (sequenceValue < 5000) {
            System.out.println(sequenceValue);
            sequenceValue = 2 * sequenceValue - 1;
        }

        // завдання 3: визначення всіх додатних дільників числа 10
        System.out.println("\nзавдання 3");
        for (int divisor = 1; divisor <= 10; divisor++) {
            if (10 % divisor == 0) {
                System.out.println(divisor);
            }
        }

        // завдання 4: обчислення факторіалу числа 10 за допомогою циклів for і while
        System.out.println("\nзавдання 4.1 (for)");
        long factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        System.out.println("факторіал 10: " + factorial);

        System.out.println("завдання 4.2 (while)");
        factorial = 1;
        int num = 1;
        while (num <= 10) {
            factorial *= num;
            num++;
        }
        System.out.println("факторіал 10: " + factorial);

        // завдання 5: підрахунок симетричних комбінацій на електронному годиннику
        System.out.println("\nзавдання 5");
        int symmetricalCount = 0;
        for (int hours = 0; hours < 24; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                String formattedTime = String.format("%02d:%02d", hours, minutes);
                if (formattedTime.charAt(0) == formattedTime.charAt(4) &&
                        formattedTime.charAt(1) == formattedTime.charAt(3)) {
                    symmetricalCount++;
                }
            }
        }
        System.out.println("кількість симетричних комбінацій: " + symmetricalCount);

        // завдання 6*: підрахунок чисел, де сума перших трьох цифр дорівнює сумі останніх трьох цифр
        System.out.println("\nзавдання 6*");
        int luckyNumbers = 0;
        for (int i = 0; i <= 999999; i++) {
            int leftSum = (i / 100000) + ((i / 10000) % 10) + ((i / 1000) % 10);
            int rightSum = ((i / 100) % 10) + ((i / 10) % 10) + (i % 10);

            if (leftSum == rightSum) {
                luckyNumbers++;
            }
        }
        System.out.println("кількість щасливих чисел: " + luckyNumbers);
    }
}
