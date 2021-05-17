package Lection04;
import java.util.Random;
import java.util.Scanner;

public class HW4 {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char emptyField = '_';

    public static Scanner pencil = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        createMap();
        printMap();

        while (true){
            turnHuman();
            printMap();
            if (win(human)) {
                System.out.println(" Human win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Drawl");
                break;
            }

            turnAi();
            printMap();
            if (win(ai)) {
                System.out.println("AI win!");
                break;
            }

            if (fullMap()) {
                System.out.println("Drawl");
                break;
            }
        }
        System.out.println("Game Over");
    }



    public static void createMap() {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeY][mapSizeX];
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = emptyField;

            }

        }
    }

    public static void printMap() {
        System.out.print(" ");
        for (int i = 0; i < mapSizeX * 2 + 1; i++) {
            System.out.print((i % 2 == 0) ? " ": (i / 2 + 1));

        }
        System.out.println();

        for (int y = 0; y < mapSizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void turnHuman() {
        int x;
        int y;

        do {
            System.out.print("Enter your coordinates from 1 before " + mapSizeX + " : ");
            x = pencil.nextInt() - 1;
            y = pencil.nextInt() - 1;
        } while (!validField(y,x) || !emptyField(y, x));

        map[y][x] = human;
        System.out.println("Your move in [" + (x+1) + ":" + (y+1) + "]");

    }

    public static void turnAi() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!emptyField(y, x));

        map[y][x] = ai;
        System.out.println("AI move in [" + (x+1) + ":" + (y+1) + "]");
    }

    public static boolean win(char player){
        boolean x,y,k,n;
        x = true;
        y = true;
        k = true;
        n = true;
        for (int i=0; i < mapSizeY; i++) {
            k &= (map[i][i] == player);
            n &= (map[mapSizeX-i-1][i] == player);
            for (int j = 0; j < mapSizeX; j++) {
                x &= (map[i][j] == player);
                y &= (map[j][i] == player);
            }
            if (y || x) return true;
        }
        if (k || n) return true;
        return false;
    }

    public static boolean fullMap(){
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validField(int y, int x){
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean emptyField(int y, int x){
        return map[y][x] == emptyField;
    }

}


