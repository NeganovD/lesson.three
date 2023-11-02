package simpleNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (prime(number)) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не является простым");
        }
    }

    public static boolean prime (int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        int i = 3;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
            i++;
        }
        return true;
    }
}