public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
}