package Ivnchel;

import java.util.Scanner;

public class Main {
    // Исправления для файла var_10.txt
    static void firstTask() {

        int valVoid = 9091;
        double javaVal = 2002.43284374811622667;
        int r = 6142;
        double strNum = 2907.306514022320285;
        char charVal = '1';
        String x = "мороженое";
        String c = "Солнце";
        String chess = "шахматы";
        int a = 'c';
        String b = "шоколад";
        float byteVal = 2529f;
        String watermelon = "арбуз";
        long f = 'x';
        double num = 'I';
        double staticVal = 4744.4090550294384813;

        System.out.println("pass");
    }

    // Задание 2: вычисление математической функции при заданном x
    static double secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();
        return Math.sqrt(Math.abs(x)) + Math.sin(x) + Math.pow(x, 2);
    }

    // Задание 3 (вариант 10): Даны три числа. Найти сумму двух наибольших из них.
    static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число:");
        double c = scanner.nextDouble();

        double sum;
        if (a <= b && a <= c) {
            sum = b + c;
        } else if (b <= a && b <= c) {
            sum = a + c;
        } else {
            sum = a + b;
        }

        System.out.println("Сумма двух наибольших чисел:");
        System.out.println(sum);
    }

    // Задание 4: расчет кинетической энергии E = (m * v^2) / 2 с валидацией входных данных
    static void fourthTask() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данная программа вычисляет кинетическую энергию тела.");

        System.out.println("Введите массу тела m (кг):");
        double m = scanner.nextDouble();
        if (m <= 0) {
            throw new Exception("Масса тела должна быть строго больше нуля.");
        }

        System.out.println("Введите скорость тела v (м/с):");
        double v = scanner.nextDouble();
        if (v < 0) {
            throw new Exception("Скорость не может быть отрицательной.");
        }

        double energy = (m * Math.pow(v, 2)) / 2.0;
        System.out.println("Кинетическая энергия тела равна:");
        System.out.printf("%.2f\n", energy);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Задание 1");
        firstTask();
        System.out.println("-----------------");

        System.out.println("Задание 2");
        System.out.println(secondTask());
        System.out.println("-----------------");

        System.out.println("Задание 3");
        thirdTask();
        System.out.println("-----------------");

        System.out.println("Задание 4");
        fourthTask();
    }
}