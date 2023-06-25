public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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
            summPerMonth+=arr[i];
            System.out.printf("Сумма трат за месяц составила %d рублей",summPerMonth);
        }

    }
}