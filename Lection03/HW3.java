package Lection03;
import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] array100;
    public static int[][] myIntArray2;

    public static void main(String[] args) {
        System.out.println("Задание №1");
        invertArray();
        System.out.println("Задание №2");
        intArray();
        System.out.println("Задание №3");
        myMath();
        System.out.println("Задание №4");
        squareArray();

    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }

    public static void intArray() {
        int[] array100 = new int[100];
        int count = 1;
        for (int i = 0; i < array100.length; i++) {
            array100[i] = count;
            count++;
            System.out.print(array100[i] + "\t");
        }
        System.out.println(" ");
    }

    public static void myMath() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void squareArray() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
