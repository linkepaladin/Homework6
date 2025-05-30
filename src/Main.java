public class Main {
    public static void main(String[] args) {
        // task 1

        System.out.println("Задача 1");

        int deposit = 15000;
        int savings = 0;
        int goal = 2_459_000;
        int month = 0;
        while (savings <= goal) {
            savings = savings + deposit;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + savings + " рублей");
        }

        // task 2

        System.out.println("Задача 2");

        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // task 3;

        System.out.println("Задача 3");

        int population = 12_000_000;
        int fertility = (population * 17) / 1000;
        int mortality = (population * 8) / 1000;
        int populationIncrease = fertility - mortality;
        int firstYear = 0;
        while (firstYear < 10) {
            population = population + populationIncrease;
            firstYear++;
            System.out.println("Год " + firstYear + " численность населения составляет " + population);
        }

        // task 4

        System.out.println("Задача 4");

        int deposit1 = 15000;
        int goal1 = 12_000_000;
        int month1 = 1;
        while (deposit1 <= goal1) {
            System.out.println("Месяц " + month1 + ", сумма накоплений " + deposit1 + " рублей");
            month1++;
            int increaseRate = (deposit1 * 7) / 100;
            deposit1 = deposit1 + increaseRate;
        }
        System.out.println("Месяц " + month1 + ", сумма накоплений " + deposit1 + " рублей");

        //task 5

        System.out.println("Задача 5");

        int deposit2 = 15000;
        int goal2 = 12_000_000;
        int month2 = 1;
        while (deposit2 <= goal2) {
            month2++;
            int increaseRate2 = (deposit2 * 7) / 100;
            deposit2 = deposit2 + increaseRate2;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений " + deposit2 + " рублей");
            }
        }

        // task 6

        System.out.println("Задание 6");

        int deposit3 = 15000;
        int month3 = 1;
        int yearsInMonth = 12 * 9;
        while (month3 <= yearsInMonth) {
            month3++;
            int increaseRate3 = (deposit3 * 7) / 100;
            deposit3 = deposit3 + increaseRate3;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений " + deposit3 + " рублей");
            }
        }

        //task 7

        System.out.println("Задача 7");

        int friday = 1;
        int daysInMonth = 31;
        while (friday <= daysInMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }

        //task 8

        System.out.println("Задача 8");

        int currentYear = 2025;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometInterval = 79;
        int cometAppearanceYear = 0;
        while (cometAppearanceYear <= endYear) {
            cometAppearanceYear = cometAppearanceYear + cometInterval;
            if (cometAppearanceYear >= startYear && cometAppearanceYear <= endYear) {
                System.out.println(cometAppearanceYear);
            }
        }
    }
}