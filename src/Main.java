public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
        public  static void task1() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
        public static void task2() {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }
        }
        public static void task3() {
            for (int i = 0; i <= 17; i = i + 2) {
                System.out.println(i);
            }
        }
        public static void  task4() {
            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }
        }
        public static void task5() {
            for (int i = 1904; i <= 2096; i = i + 4) {
                System.out.println(i);
            }
        }
}