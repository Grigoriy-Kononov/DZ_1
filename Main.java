import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("Вашему вниманию представлена домашняя работа по теме:");
        System.out.println("'Java: знакомство и как пользоваться базовым API'");
        System.out.println("Задача №1:");
        System.out.println("Вычислить n-ое треугольного число(сумма чисел от 1 до n).");
        System.out.println("Задача №2:");
        System.out.println("Bычислить n! (произведение чисел от 1 до n).");
        System.out.println("Задача №3:");
        System.out.println("Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.");
        System.out.println("Задача №4:");
        System.out.println("Реализовать простой калькулятор");
        System.out.println("");
        start();
    }
    

    private static void start() {
        System.out.println("Выберите задачу для выполнения(1,2,3,4), для выхода нажмите любую другую клавишу.");
        try (Scanner scanner = new Scanner(System.in)) {
            String task = scanner.nextLine();
            int i = Integer.parseInt (task);
            switch (i) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                default:
                    break;
            }
        } 
    }

    private static void task1() {
        System.out.println("Задача №1:");
        System.out.println("Введите n: ");
        try (Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNextLine()){            
                String task = scanner.nextLine();
                int a = Integer.parseInt (task);
                int result = 0;
                for (int i = 0; i < a; i++) {
                    result = result + i;
                }
                System.out.println("n-ое треугольного числа равно: " + result);
                start();
            }
        } 
    }
        
    private static void task2() {
        System.out.println("Задача №2:");
        System.out.println("Введите n: ");
        try (Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNextLine()){
                String task = scanner.nextLine();
                int a = Integer.parseInt (task);

                int result = 1;
                for (int i = 1; i < a; i++) {
                    result = result * i;
                }
                System.out.println("n! = " + result);
                start();
            }
        } 
    }

    private static void task3() {
        System.out.println("Задача №3:");
        int n = 1000;
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Простые числа от 1 до 1000: ");
        System.out.println(primeNumbers);
        start();
        return;
    }

    private static void task4() {
        System.out.println("Задача №4:");
        System.out.println("Введите первое число: ");
        try (Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNextLine()){
                Double a = scanner.nextDouble();
                System.out.println("Введите второе число: ");
                Double b = scanner.nextDouble();
                System.out.println("Введите действие с числами(+, -, *, /): ");
                Double result;
                char op = scanner.next().charAt(0);
                switch(op) {
                    case '+': result = a + b;
                        break;
                    case '-': result = a - b;
                        break;
                    case '*': result = a * b;
                        break;
                    case '/': result = a / b;
                        break;
                    default:  System.out.printf("Ошибка! Введен не коректный оператор");
                        return;
                }
            System.out.print("\nПолученый результат:\n");
            System.out.println(a + " " + op + " " + b + " = " + result);
            start();
            }
        } 
    }
}

          