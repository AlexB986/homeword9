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
            arr[i] = random.nextInt(100_000) + 200_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int currentSpending = 0;
        for (int element : arr) {
            currentSpending = currentSpending + element;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей \n", currentSpending);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();

        int max_Spending = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max_Spending < arr[i]) {
                max_Spending = arr[i];
            }
        }

        int min_Spending = max_Spending;
        for (int i = 0; i < arr.length; i++) {
            if (min_Spending > arr[i]) {
                min_Spending = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей \n", min_Spending);
        System.out.printf("Максимальная сумма трат за день составила %s рублей\n", max_Spending);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sumArr = 0;
        int lenArr = arr.length;
        for (int element : arr) {
            sumArr = sumArr + element;
        }
        float medium_Sum = (float) sumArr / lenArr;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", medium_Sum);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}