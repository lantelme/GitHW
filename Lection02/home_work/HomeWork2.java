package Lection02.home_work;

public class HomeWork2 {
        public static void main(String[] args){
        System.out.println("Задание №1");
        System.out.println(summa(1,2));
        System.out.println("Задание №2");
        myNumbers(2);
        System.out.println("Задание №3");
        System.out.println(myMath(-2));
        System.out.println("Задание №4");
        cycle("hello",15);
        System.out.println("");
        System.out.println("Задание №5");
        System.out.println(year(400));

    }
        public static boolean summa(int a, int b){
        int summa;
        summa = a + b;
        return summa > 10 && summa <= 20;
    }
        public static void myNumbers (int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
        public static boolean myMath (int a) {
        return a <= 0;
    }
        public static void cycle(String a, int b){
        for (int i = 0; i < b; i++){
            System.out.print(a + " " + b + " ");
        }
    }
        public static boolean year (int a){
        return ((a % 4 == 0) && !(a % 100 == 0) || (a % 400 == 0));
    }
}


