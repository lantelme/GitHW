package Lection02;

public class Lesson_2 {

//    {
//        int adc = 999;
//        int cde = 1;
//        int result = adc+cde; так делать нельзя ни в коем случае
//    }

  //  public static int valueFromClass = 987; //будет доступно везде, так как объявлено в классе

    public static void main (String[] args) {
        // result = A * B + (C /D); a = int
        // A = a + b / c - d
        // B = b * c + a * d
        // C = a + b + c + d
        // D = a - b - c - d


//        String value = "String";
////        int valueFromMethodMain = 874; //Доступна только в данном методе
////        System.out.println(valueFromMethodMain);
////
//////        int a = 20;
//////        int b = 20;
//////        int result;
//////
//////        if (a > b) {
//////            result = a;
//////        } else if (a == b) {
//////            result = 999;
//////        } else {
//////            result = b;
//////        }
//////
//////        result = (a > b) ? doSomething1()  : doSomething2(); //тернарный оператор(только true, false) ? - true, : - false
//////
//////        System.out.println("Result = "+ result);
//////
//////    }
////
//////    public static int doSomething1(){
//////        ///
//////        return 15;
//////    }
//////    public static int doSomething2(){
//////        ///
//////        return 15;
////
////        String nameLetter = "Maria";
////
////        if (nameLetter == "Boris") {
////            System.out.println(" Give letter to Boris");
////        } else if (nameLetter == "Olga") {
////            System.out.println("Give letter to Olga");
////        } else if (nameLetter == "Maria") {
////            System.out.println("Give letter to Maria");
////        } else {
////            System.out.println("Go out office");
////        }
////
////        System.out.println("=============");
////
////        switch (nameLetter) {
////            case "Maria":
////                System.out.println("Give letter to Maria");
////                System.out.println(valueFromClass);
////                break;
////            case "Boris": // if (nameLetter == "Boris"
////                System.out.println(" Give letter to Boris");
////                break;
////            case "Olga":
////                System.out.println("Give letter to Olga");
////                break;
////            default:
////                System.out.println("Go out office");
////                break;
////        }
////        // for (int i = 0; i < 10; i++) {
////        String value = "String";
////        int value1;
////        int value2;
////        for (value1 = 0, value2 = 15; value1 < 10; value1++, value2--) {
////            System.out.print(value + value1  + " > "+ value2 + " | ");
////        } f
//        for (int i = 0; i < 10 /*количество*/; i++){
//            System.out.print(value + i + " | ");
//        }
//        System.out.println(myMath(2, 10)); //1024

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }

//        myPifagorTable(10,10);

//        int a = 0;
//
//        while (a < 10) { //смотрю на условие
//            a++;
//            if (a == 5 || a == 7){
//            continue; //возвращает в начало условия (продолжай) || - или  ! - не && - и
//            }
//            System.out.print(a + " | ");
//        }

//        int c = 0;
//        do { //сначала выполняется, потом смотрит на условие
//            c++;
//            if (c == 6) {
//                break; //останавливает цикл после достижения условия if
//            }
//            System.out.print(c + " | ");
//        } while (c < 10);

        int result = valueA(valueA(valueA(50,100,150,200), 4, 6, 8), valueB(10,20,30,40), valueC(-10, -20, -30, -40), valueD(1, 2, 3 , 4))
                * valueB(10, 12, 14, 16)
                + valueC(20, 25, 30, 35)
                / valueD(0, 1 , 2, 3);
        System.out.println(result);
//        int b = 0; не запускать - бесконечный уикл
//        while (true) {
//            b++;
//            System.out.print(b + " | ");
//        }
    }

    public static int valueA(int a, int b, int c, int d){
        return a + b / c - d;
    }
    public static int valueB(int a, int b, int c, int d){
        return b * c + a * d;
    }
    public static int valueC(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public static int valueD(int a, int b, int c, int d){
        return a - b - c - d;
    }





}





// public static void myPifagorTable(int widh, int height){
//     for (int y = 1; y < height; y++) {
//            for (int x = 1; x < widh; x++) {
//                System.out.print(y * x + "\t");
//         }
//         System.out.println();
//     }
// }
//
// public static int myMath(int  baseValue, int signature) {
//        int result = 1;
//        for (int i = 0; i < signature; i++){
//            result = result *baseValue;
//        }
//
//        return result;
// }
//}
