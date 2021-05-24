package Lection08.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GameMap extends JPanel {

    private int mapSizeX;
    private int mapSizeY;
    private int winLength;
    private int [][] map;

    private int human = 1;
    private int ai = 2;
    private int emptyField = 0;

    private int cellWight;
    private int cellHeight;

    private boolean gameOver;
    private boolean isMapExist;

    private final String MSG_Human_win = "Human win!";
    private final String MSG_Ai_win = "Ai win!";
    private final String MSG_Draw = "Draw!";

    private final int STATE_HUMAN_WIN = 0;
    private final int STATE_AI_WIN = 1;
    private final int STATE_DRAW = 2;

    private Random random = new Random();
    private MainWindow mainWindow;

    GameMap(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        setBackground(Color.BLACK);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent mouseObject) {
                super.mouseReleased(mouseObject);
                update(mouseObject);
            }
        });
        isMapExist = false;
    }

    void startGame(int mapSizeX,int mapSizeY, int winLength){
        this.mapSizeX = mapSizeX;
        this.mapSizeY = mapSizeY;
        this.winLength = winLength;
      //  mainWindow.putLog("Game Start");
        this.map = new int[mapSizeY][mapSizeX];
        this.isMapExist = true;
        this.gameOver = false;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void update(MouseEvent mouseObject){
        if (!isMapExist) return;
        if (gameOver) return;

        int cellX = mouseObject.getX() / cellWight;
        int cellY = mouseObject.getY() / cellHeight;

        if ((!isValidCell(cellX,cellY)) || !isEmptyCell(cellX,cellY)){
            return;
        }

        map[cellY][cellX] = human;
        mainWindow.putLog("Player > [" + (cellX + 1) + ":" + (cellY + 1) + "]");

        if (checkWin(human)){
            setGameOver(STATE_HUMAN_WIN);
            return;
        }

        if (isFullMap()){
            setGameOver(STATE_DRAW);
            return;
        }

        aiTurn();
        repaint();

        if (checkWin(ai)){
            setGameOver(STATE_AI_WIN);
            return;
        }

        if (isFullMap()){
            setGameOver(STATE_DRAW);
            return;
        }

    }
    private void setGameOver(int stateGameOver){
        repaint();
        this.gameOver = true;
        showGameOverMessage(stateGameOver);
    }

    private void render(Graphics g){
        if (!isMapExist) return;

        createMap(g);

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (isEmptyCell(x,y)){
                    continue;
                }
                if (map[y][x] == human){
                    g.setColor(Color.GREEN);
                    g.fillOval(x * cellWight + 10, y * cellHeight + 10,cellWight - 20,cellHeight - 20);
                }
                if (map[y][x] == ai){
                    g.setColor(Color.RED);
                    g.fillRect(x * cellWight + 10, y * cellHeight + 10,cellWight - 20, cellHeight - 20);
                }
            }
        }
        if (gameOver){
            return;
        }

    }
    private void showGameOverMessage(int stateGameOver){
        switch (stateGameOver){
            case STATE_HUMAN_WIN:
                JOptionPane.showMessageDialog(this,MSG_Human_win);
                mainWindow.putLog(MSG_Human_win);
                break;
            case STATE_AI_WIN:
                JOptionPane.showMessageDialog(this,MSG_Ai_win);
                mainWindow.putLog(MSG_Ai_win);
                break;
            case STATE_DRAW:
                JOptionPane.showMessageDialog(this,MSG_Draw);
                mainWindow.putLog(MSG_Draw);
                break;
        }
    }

    private void  createMap(Graphics g){
        int width = getWidth();
        int height = getHeight();

        cellWight = width / mapSizeX;
        cellHeight = height / mapSizeX;

        g.setColor(Color.white);

        for (int i = 0; i <= mapSizeY; i++) { //линии по горизонтали
            int y = i * cellHeight;
            g.drawLine(0, y, width, y);
        }

        for (int i = 0; i < mapSizeX; i++) {
            int x = i * cellWight;
            g.drawLine(x,0,x, height);
        }
    }

    private void aiTurn() {
        if (turnAIWinCell()) {
            return;
        }
        if (turnHumanWinCell()) {
            return;
        }
        int x;
        int y;
        do {
            x = random.nextInt(mapSizeX);
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        map[y][x] = ai;
        mainWindow.putLog("AI > [" + (x + 1) + ":" + (y + 1) + "]");
    }

    private boolean turnAIWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = ai;    // поставим нолик в каждую клетку поля по очереди
                    if (checkWin(ai)) {
                        return true;    // если мы выиграли, вернём истину, оставив нолик в выигрышной позиции
                    }
                    map[i][j] = emptyField;    // если нет - вернём обратно пустоту в клетку и пойдём дальше
                }
            }
        }
        return false;
    }

    // Проверка, выиграет-ли игрок своим следующим ходом
    private boolean turnHumanWinCell() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = human;     // поставим крестик в каждую клетку по очереди
                    if (checkWin(human)) {    // если игрок победит
                        map[i][j] = ai;    // поставить на то место нолик
                        return true;
                    }
                    map[i][j] = emptyField;    // в противном случае вернуть на место пустоту
                }
            }
        }
        return false;
    }

    // проверка на победу
    private boolean checkWin(int player) {
        for (int i = 0; i < mapSizeX; i++) {     // ползём по всему полю
            for (int j = 0; j < mapSizeY; j++) {
                if (checkLine(i, j, 1, 0, winLength, player)) {
                    return true;    // проверим линию по х
                }
                if (checkLine(i, j, 1, 1, winLength, player)) {
                    return true;    // проверим по диагонали х у
                }
                if (checkLine(i, j, 0, 1, winLength, player)) {
                    return true;    // проверим линию по у
                }
                if (checkLine(i, j, 1, -1, winLength, player)) {
                    return true;    // проверим по диагонали х -у
                }
            }
        }
        return false;
    }

    // проверка линии
    private boolean checkLine(int x, int y, int vx, int vy, int len, int player) {
        final int farX = x + (len - 1) * vx;    // посчитаем конец проверяемой линии
        final int farY = y + (len - 1) * vy;
        if (!isValidCell(farX, farY)) {
            return false;    // проверим не выйдет-ли проверяемая линия за пределы поля
        }
        for (int i = 0; i < len; i++) {    // ползём по проверяемой линии
            if (map[y + i * vy][x + i * vx] != player) {
                return false;    // проверим одинаковые-ли символы в ячейках
            }
        }
        return true;
    }

    private boolean isFullMap() {
        for (int i = 0; i < mapSizeY; i++) {
            for (int j = 0; j < mapSizeX; j++) {
                if (map[i][j] == emptyField) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    private boolean isEmptyCell(int x, int y) {
        return map[y][x] == emptyField;
    }
}
