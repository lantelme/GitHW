package Lection01;

    public class HomeWorkApp {

        public static void main()  {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();

        }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
            System.out.println("");

        }

        public static void checkSumSign() {
            int a = 123;
            int b = -444;
            int c = a + b;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("a + b = " + c);
            boolean more = c > 0;
            if (more) {
                System.out.println("Сумма положительная");
                System.out.println("");
            }
            else {
                System.out.println("Сумма отрицательная");
                System.out.println("");
            }

        }

        public static void printColor() {
            int value = 89;
            boolean red = value <= 0;
            boolean green = value >= 100;
            if (red) {
                System.out.println("Красный");
                System.out.println("");
            }  if (green) {
                System.out.println("Зеленый");
                System.out.println("");
            }
            else {
                System.out.println("Желтый");
                System.out.println("");
            }
        }

        public static void compareNumbers() {
            int a = 1;
            int b = 125;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            boolean more = a >= b;
            if (more) {
                System.out.println("a >= b");
            } else  {
                System.out.println("a < b");
            }


        }

    }
