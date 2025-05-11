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
            if (savings >= goal) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + savings + " рублей");
            }
        }
    }
}