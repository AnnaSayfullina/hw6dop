public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int number = 1;
        int a = 10;
        while (a > 0) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
                a--;
            }
            number++;
        }
        System.out.println();
    }
    private static void task2() {
        System.out.println("Задача 2");
        int num = 1;
        int step = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.print(num + " ");
            num += step;
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int number = 90;
        int step = 5;
        for ( int i = number; i>= 0; i-=step){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int number = 2;
        int a = 2;
        for (int i = 1; i <=10; i++) {
            System.out.print(number + " ");
            number*=a;
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        int saturday = 1;
        for (; saturday <= 31; saturday+=7) {
            int sunday = saturday + 1;
            System.out.println("Суббота - " + saturday + " число, воскресенье - " + sunday + " число");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int iteration_count = 0;
        for (int ticket = 1; ticket <= 999_999; ticket++) {
        int a = ticket / 100_000;
        int b = (ticket % 100_000) / 10000;
        int c = (ticket % 10000) / 1000;
        int d = (ticket % 1000) / 100;
        int e = (ticket % 100) / 10;
        int f = ticket % 10;
                if ( a + b + c == d + e + f) {
                iteration_count++;
            }

        }
            System.out.println(iteration_count);
        }
    private static void task7() {
        System.out.println("Задача 7");
        int result = 0;
        int first = 1;
        int last = 999_999;
        for (int current = first; current <= last; current++) {
            int firstPart = current / 1000;
            int lastPart = current % 1000;
            if (firstPart == 0 || lastPart == 0) {
                continue;
            }
            int firstSum = calculateSumOfDigits(firstPart);
            int lastSum = calculateSumOfDigits(lastPart);
            if (firstSum == lastSum) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static int calculateSumOfDigits(int num) {
        int result = 0;

        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        return result;
    }

    }