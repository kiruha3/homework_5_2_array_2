public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        int[] arr = generateRandomArray();
        int summPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            summPerMonth += arr[i];
        }
        System.out.printf("Сумма трат за месяц составила %d рублей %n", summPerMonth);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minEl = 999_999_999;
        int maxEl = 0;
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
        System.out.printf("Минимальная сумма трат за день составила %d рублей. %nМаксимальная сумма трат за день составил %d рублей", minEl, maxEl);
    }
}