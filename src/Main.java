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
    }
}