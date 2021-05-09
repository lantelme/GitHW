package Lection_03;

import java.util.Random;
import java.util.Scanner;

public class Lection_03 {
    public static Scanner scanner = new Scanner(System.in);//всегда объявляется вне main
    public static Random random = new Random();//по умолчанию в промежутке от 0 до 1 [0,1)
    public static int[][] myIntArray2;

    public static void main (String[] args){
//        int height = random.nextInt(20);
//        int width = random.nextInt(20);
//        myTableFill(height,width);
//        readTwoArray(myIntArray2);

        String[] myTestStringArray = {"Barsik", "Murzik", "cat1", "cat2", "cat3"};//new String[5] //явное определение массива
        //myTestStringArray[0] = "Barsik"
        System.out.println(myTestStringArray[0]);

//        int[][][] test = new int[14][23][15];
//        for (int i = 0; i < test.length; i++) {
//            for (int j = 0; j < test[i].length; j++) {
//                for (int k = 0; k < test[i][j].length; k++) {
//
//                }
//
//            }
//
//        }

//        int a = 10;
//        System.out.println(a);
//        a = 15;
//        System.out.println(a);
//        System.out.println("Random float: " + random.nextFloat()); //[0,1)
//        System.out.println("Random int: " + random.nextInt()); // [-int;+int)
//        System.out.println("Random int [0;15): " + random.nextInt(15)); // [0;15)
//
//        char myChar = (char) random.nextInt(128);
//        System.out.println("Random char: " + myChar);



//     System.out.println("Hello Java");
//     System.out.print("Your text: ");
//    // printUserData();
//
//     int userInt = scanner.nextInt();
//     System.out.println("Result: "+ (userInt * 10));
//        System.out.print("Enter your string: ");
//        String userDataForMethod = scanner.next();
//        System.out.println();
//        System.out.print("Enter you value: ");
//        int count = scanner.nextInt();
//        scannerPlusRandom(userDataForMethod, count);
//        welcomeUser("User1", "Qwerty", "Qwerty2", 44);
//        System.out.println(myMath(10, 15));
//        System.out.println(myMath(11.5f, 15.97f));
        //typeData[]name_array = new typeData[length(всегда int)] l >0
//        String[] myStringArray = new String[4];
//        myStringArray[0] = "My First String in Array";
//        myStringArray[1] = "My Second String in Array";
//        myStringArray[2] = "My Third String in Array";
//        myStringArray[3] = "My Fourth String in Array";
//        System.out.println("In my array: " + myStringArray[2]);
//        myStringArray[2] = "Hello word";
//        System.out.println("In my array: " + myStringArray[2]);

//        String[] box = new String[10];
//        String[] catArray = new String[50];
//        box[0] = "cat1";
//        box[1] = "cat2";
//        box[2] = "cat3";
//        for (int i = 0; i < box.length; i++) {
//            box[i] = "cat " + (i + 1);
//        }
//        for (int i = 0; i < box.length; i++) {
//            System.out.print(box[i] + " | ");
//        }
//        fillArray(catArray,"Barsik");
//        readArray(catArray);
//        System.out.println();
//        fillArray(box,"cat");
//        readArray(box);

//        int[][] myIntArray2 = new int[4][5];//сначала высота// , потом длина
//        myIntArray2[1][2] = 98;
//        System.out.println(myIntArray2[1][2]);
    }

//    public static void myTableFill(int height, int width){
//        myIntArray2 = new int[height][width];
//        int count = 0;
//        for (int y = 0; y < myIntArray2.length; y++) {
//            for (int x = 0; x < myIntArray2[y].length; x++) {
//                myIntArray2[y][x] = count;
//                count++;
//            }
//        }
//    }
//    public static void readTwoArray(int[][] inputArray){
//        for (int y = 0; y < inputArray.length; y++) {
//            for (int x = 0; x < inputArray[y].length; x++) {
//                System.out.print(inputArray[y][x] + "\t");
//            }
//            System.out.println();
//        }
// }

//    public static void fillArray(String[] inputArray, String inputString){
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = inputString + (i + 1);
//        }
//    }
//    public static void readArray(String[] inputArray){
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " | ");
//        }
//    }
//    public static void scannerPlusRandom(String inputString, int numberWords){
//        for (int i = 0; i < numberWords; i++) {
//            System.out.println(inputString + generateInt(-50, 60));
//        }
//}
//
//    public static int generateInt(int min, int max){
//        return random.nextInt(max - min + 1) + min;
//    }
// public static void printUserData() {
//     System.out.println("Your message is " + scanner.next());
// }
//    public static void welcomeUser(String userName){
//        System.out.println("Hello user "+ userName);
//    }
//    public static void welcomeUser(String userName, String userSurname){
//        System.out.println("Hello user "+ userName + " " + userSurname);
//    }
//    public static void welcomeUser(String userName, String userSurname, String lastName){
//        System.out.println("Hello user "+ userName + " " + userSurname + " " + lastName);
//    }
//    public static void welcomeUser(String userName, String userSurname, String lastName, int age){
//        System.out.println("Hello user "+ userName + " " + userSurname + " " + lastName + " " + age);
//    }
//    public static int myMath(int x, int y) {
//        return x * y;
//    }
//    public static float myMath(float x, float y) {
//        return x + y;
//    }
}