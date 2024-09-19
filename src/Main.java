import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int element : arr) {
            total += element;
        }
        System.out.println(" Сумма трат за месяц составила " + total + " рублей ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int totslMsx = 0;
        int totslMin = -1;
        String max = "Максимальная сумма трат составила ";
        String min = "рублей";
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] ledger = generateRandomArray();
        int sum = 0;
        for (int j : ledger) {
            sum += j;
        }
        double average = (double) sum / ledger.length;
        System.out.println(" Средняя сумма трат за месяц составила " + average + " рублей ");
    }

    public static void task4() {
        System.out.println(" Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        int n = reverseFullName.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = reverseFullName[n - i - 1];
            reverseFullName[i] = temp;
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseFullName));

        System.out.println();

        System.out.println(reverseFullName);
        System.out.println();
    }
}