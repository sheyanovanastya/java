import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        //завдання 1
        System.out.println("Завдання 1");
        int[] oddNumbers = new int[50];
        for (int i = 0; i < 50; i++) {
            oddNumbers[i] = 2 * i + 1;
        }
        Arrays.stream(oddNumbers).forEach(System.out::println);

        //завдання 2
        System.out.println("завдання 2");
        int[] randomArr = rand.ints(20, 0, 10).toArray();
        System.out.println("Оригінальний масив: " + Arrays.toString(randomArr));
        for (int i = 1; i < randomArr.length; i += 2) {
            randomArr[i] = 0;
        }
        System.out.println("Оновлений масив: " + Arrays.toString(randomArr));

        //завдання 3
        System.out.println("завдання 3");
        int[][] arrays = new int[3][5];
        double[] averages = new double[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arrays[i][j] = rand.nextInt(6);
            }
            averages[i] = Arrays.stream(arrays[i]).average().orElse(0);
            System.out.println(Arrays.toString(arrays[i]));
        }
        double maxAvg = Arrays.stream(averages).max().orElse(0);
        System.out.println("Максимальне середнє: " + maxAvg);

        //завдання 4
        System.out.println("завдання 4");
        int[] firstArr = rand.ints(10, 0, 11).toArray();
        int[] secondArr = rand.ints(10, 0, 11).toArray();
        int[] sumArr = new int[10];
        for (int i = 0; i < 10; i++) {
            sumArr[i] = firstArr[i] + secondArr[i];
        }
        System.out.println(Arrays.toString(firstArr));
        System.out.println(Arrays.toString(secondArr));
        System.out.println(Arrays.toString(sumArr));

        //завдання 5
        System.out.println("завдання 5");
        int[] array15 = rand.ints(15, 0, 11).toArray();
        long evenCount = Arrays.stream(array15).filter(n -> n % 2 == 0).count();
        System.out.println(Arrays.toString(array15));
        System.out.println("Кількість парних чисел: " + evenCount);

        //завдання 6
        System.out.println("завдання 6");
        int[][] multiArray = new int[15][];
        for (int i = 0; i < 15; i++) {
            int cols = (i < 4) ? 5 : (i < 8) ? 8 : (i < 12) ? 3 : 9;
            multiArray[i] = rand.ints(cols, 0, 16).toArray();
        }
        Arrays.stream(multiArray).map(Arrays::toString).forEach(System.out::println);

        //завдання 7
        System.out.println("завдання 7");
        int[][] matrix = new int[7][7];
        int maxSumIndex = 0, maxSum = 0;
        for (int i = 0; i < 7; i++) {
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = rand.nextInt(7);
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Найбільша сума у рядку з індексом: " + maxSumIndex);
    }
}