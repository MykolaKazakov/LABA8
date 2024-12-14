public class Algorithms {
    // 1. Пошук мінімального елемента масиву позитивних чисел
    public static int findMinPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean found = false;
        for (int num : arr) {
            if (num > 0 && num < min) {
                min = num;
                found = true;
            }
        }
        return found ? min : -1; // Якщо не знайдено, повертаємо -1
    }

    // 2. Розрахунок суми елементів масиву, який може складатися лише з від'ємних чисел
    public static int sumNegative(int[] arr) {
        int sum = 0;
        boolean hasNegative = false;
        for (int num : arr) {
            if (num < 0) {
                sum += num;
                hasNegative = true;
            }
        }
        return hasNegative ? sum : 0; // Якщо від'ємних чисел немає, повертаємо 0
    }

    // 3. Алгоритм розрахунку N-го елемента послідовності Фібоначчі
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; ++i) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    // 4. Алгоритм розрахунку сили струму на ділянці кола (I = U / R)
    public static double calculateCurrent(double voltage, double resistance) {
        if (resistance <= 0) return -1; // Неправильний ввід
        return voltage / resistance;
    }
}
