package ru.vsu.cs.baturin_v_a;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Введите коэффициент a = ");
        double a = readVar();

        System.out.print("Введите коэффициент b = ");
        double b = readVar();

        System.out.print("Введите коэффициент c = ");
        double c = readVar();

        if (b * b - 4 * a * c < 0) {
            System.out.println("Действительных корней нет");
        }
        else if (b * b - 4 * a * c == 0) {
            System.out.println("Корень данного уравнения: " + countX1(a, b, c));
        }
        else if (b * b - 4 * a * c > 0) {
            System.out.println("Корни данного уравнения: " + countX1(a, b, c) + " и " + countX2(a, b, c));
        }
    }
    private static double readVar() {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        return n;
    }
    private static double countX1(double a, double b, double c) {
        double x1 = ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        return x1;
    }
    private static double countX2(double a, double b, double c) {
        double x2 = ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        return x2;
    }
}
