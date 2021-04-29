package Lection01;

//one-line comment

/*
more-line comment
 */

/**
 * JavaDoc Comment(Для разработчиков)
 */



public class Lection01 {

    public static void main(String[] args) {
        //Hello_Java!!!
        // System.out.print("Hello_Java!!!\n");
        // System.out.println("Hello_World!!!");
        // System.out.print("Привет Вася!!!");

//        String myString1 = "Hello_Java";
//        String myString2 = "Hello_World";
//
//        System.out.println(myString1);
//        System.out.println(myString2);
//        System.out.println(myString1 + myString2);
//
//        //Целочисленные
//        byte myByte = 50; //-128..+127 (1 byte)
//        short myShort = 500; //-32768..+32767 (2 byte)
//        int myInt = 5269032; //-2.1млрд..+2.1млрд (4 byte)
//        long myLong = 3000000000L; //-2^63..+2^63 (8 byte)
//        System.out.println("Result = " + myInt);
//
//        //С плавающей точкой
//        float myFloat = 956.345F; // (4 byte) - <>.0000000
//        double myDouble = 956.345; // (8 byte) - <>.00000000000000
//
//        //Символы
//        char myChar = '\''; //ASCII (Таблица кодировки) (2 byte)
//
//        //boolean
//        boolean myBoolean = true; //false
//
//        int a = 45;
//        int b = 55;
//        int c = a + b;
//        System.out.println(c);

        //Math-operation +, -, /, *, ^, %(остаток от деления)
//
//        int age = 32;
//
//        boolean less = age < 18;
//        boolean more = age > 65;
//
//        System.out.println(less);
//        System.out.println(more);
//
//        if (less ) {
//            System.out.println("Don't drink!!!");
//        } else if (more) {
//            System.out.println("Sorry, you old!!! Go home");
//        } else {
//            System.out.println("Good luck!!!");
//        }
//
//        int abc = 40;
//        if (abc < 10) {
//            System.out.println((abc + "< 10"));
//        }

        /*
        a = a + 1; -> a++
        a = a - 1; -> a--
        a = a + 45; -> a += 45; (-=, *=, /=, %=)
         */
//    int qwe = 100;
//    int asd = 65;
//    int result;
//
//    result = myMath(qwe, asd, "Hello");
//    qwe++;
//    result += myMath(qwe, asd, "Hello");
//    asd++;
//    result += myMath(qwe, asd, "Hello");
//    qwe++;
//    result += myMath(qwe, asd, "Hello");
//    System.out.println(result);
//
//    System.out.println("Result: " + myMath(10,15, "Hello"));
//
//
//    }
// public static int myMath(int value1, int value2, String myCustomString) {
//        System.out.println(myCustomString);
//        return  value1 + value2;
//
// }
        doSomethingNoArgs();

        public static void doSomethingNoArgs() {
            System.out.println("This is method without args ");
        }

    }
}

