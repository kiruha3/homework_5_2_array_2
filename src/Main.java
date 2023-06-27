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
        System.out.printf("Первая задача%n");
        int[] arr = generateRandomArray();
        int summPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            summPerMonth += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей %n", summPerMonth);
    }

    public static void task2() {
        System.out.println("2 задача");
        int[] arr = generateRandomArray();
        int minEl = arr[0];
        int maxEl = arr[0];
        int summPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minEl > arr[i]) {
                minEl = arr[i];
            }
            if (maxEl < arr[i]) {
                maxEl = arr[i];
            }
            // трассировка
            // System.out.printf("%d - %d - %d %n",minEl,maxEl,arr[i]);
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. %nМаксимальная сумма трат за день составил %d рублей %n", minEl, maxEl);
    }

    public static void task3() {
        System.out.println("3 задача");
        int[] arr = generateRandomArray();
        double midSum = 0;
        for (int i = 0; i < arr.length; i++) {
            midSum += arr[i];
        }
        midSum = midSum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей %n", midSum);
    }

    private static void task4() {
        System.out.println("4 задача");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.printf("%s", reverseFullName[i]);
        }
        System.out.println();
    }
}