package grechkaStorage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eatsPerMonth = 6;
        System.out.print("Введите количество месяцев: ");
        int month = scanner.nextInt();
        int buckwheatWeightLeft = month * eatsPerMonth;
        int totalBuckwheatWeight = month * eatsPerMonth;
        int totalMoneyForStorage = 0;
        final int moneyForStoragePerMonthForOneKg = 100;
        for (int i = 1; i <= month; i++){
            totalMoneyForStorage = totalMoneyForStorage + buckwheatWeightLeft * moneyForStoragePerMonthForOneKg;
            buckwheatWeightLeft = buckwheatWeightLeft - eatsPerMonth;
        }
        System.out.println("Василий хранит свои запасы гречки на складе. \n" +
                "Василий примерно съедает примерно " + eatsPerMonth + "кг гречки. Всего гречки у Василия " +
                totalBuckwheatWeight + "кг. \n" +
                "Платеж за хранение 1 килограмма гречки составляет " + moneyForStoragePerMonthForOneKg + "руб./месяц. \n" +
                totalMoneyForStorage + " рублей поднадобится заплатить Василию, для хранения гречки, до исчерпания его запасов ");

    }
}
