import java.util.Arrays;

public class Main {
    public static void main(String[] args){
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
        int totalPayment = 0;

        for (int payment : arr) {
            totalPayment += payment;
        }

        System.out.println("Сумма трат за месяц составила " + totalPayment + " рублей.");
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int[] arr = generateRandomArray();

        Arrays.sort(arr);

        int minPayment = arr[0];
        int maxPayment = arr[arr.length - 1];

        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + maxPayment + " рублей.");
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int[] arr = generateRandomArray();
        double totalPayment = 0;

        for (int payment : arr) {
            totalPayment += payment;
        }

        double averagePayment = totalPayment / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей.");
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.print("Имя и фамилия сотрудника: ");

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}






