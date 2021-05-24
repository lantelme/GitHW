package Lection08.app;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private int winWidth = 750;
    private int winHeight = 600;
    private int winPosX = 200;
    private int winPosY = 150;

    private int minMapSize = 3;
    private int maxMapSize = 10;
    private int minWinLength = 3;

    private String mapSizeSettingPrefix = "Map size now: ";
    private String mapWinLengthPrefix = "Win Length now: ";

    private JButton btnStart;//создание кнопки
    private JButton btnExit;
    private JButton btnClearLog;

    private JPanel panelSettings;
    private JPanel panelControls;

    private JTextArea gameLog;
    private JScrollPane scrollPanel;

    private JSlider sliderMapSizeSetup;
    private JLabel labelMapSize;

    private JSlider sliderWinLengthSetup;
    private JLabel labelWinLength;

    private GameMap gameMap;

    private int round = 0;


    MainWindow() {
        prepareAppWindow();//создание окна
        prepareGameSettings();
        prepareButtons();//создание кнопок
        prepareSettingsControls();
        prepareGameLog();

        gameMap = new GameMap(this);


        panelSettings.add(panelControls, BorderLayout.NORTH);
        panelSettings.add(scrollPanel, BorderLayout.SOUTH);

        add(panelSettings, BorderLayout.EAST);
        add(gameMap);


//        add(btnStart);
//        add(btnExit);
//        add(btnStart, BorderLayout.NORTH);//добавление кнопки на окно
//        add(btnExit, BorderLayout.SOUTH);//BorderLayout - менеджер расположения по умолчанию

//        setLayout(new GridLayout(5,10));//смена менеджера расположения на массивный//игнорирует количество столбцов, но строки никогда не проигнорирует
//        setLayout(new FlowLayout()); //менеджер расположения, который перекидывает элементы на новую строку, если пользователь меняет размер
//
//        for (int i = 0; i < 50; i++) {
//            add(new JButton("Button # "+ i));
//
//        }


        setVisible(true);//видимость окна / всегда ставится в конец
    }


    private void prepareAppWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//завершение программы при нажатии на крестик
        setTitle("Application");//название окна
        setSize(winWidth, winHeight);//размеры окна//пиксели
        setLocation(winPosX, winPosY);//позиция окна, относительно монитора//пиксели
        setResizable(false);//запрет на изменение размеров окна
        // setBackground(new Color(241, 236, 155)); - установление цвета фона
    }


    private void prepareButtons() {
        btnStart = new JButton("Start");//объявление кнопки
        btnStart.addActionListener(new ActionListener() {//добавление события кнопке
            @Override
            public void actionPerformed(ActionEvent e) {
                collectGameSetupAndLaunch();
            }
        });

        btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                putLog("Bye now");
                System.exit(0);

            }

        });
        btnClearLog = new JButton("Clear Log");
        btnClearLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLog.setText("");
            }
        });
    }



    private void prepareGameSettings() {
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2, 1));

    }

    private void prepareSettingsControls() {
        panelControls = new JPanel();

        labelMapSize = new JLabel(mapSizeSettingPrefix + minMapSize);

        sliderMapSizeSetup = new JSlider(minMapSize, maxMapSize, minMapSize);
        sliderMapSizeSetup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentMapSizeValue = sliderMapSizeSetup.getValue();
                labelMapSize.setText(mapSizeSettingPrefix + currentMapSizeValue);
                sliderWinLengthSetup.setMaximum(currentMapSizeValue);
            }
        });

        labelWinLength = new JLabel(mapWinLengthPrefix + minWinLength);
        sliderWinLengthSetup = new JSlider(minWinLength, minMapSize, minMapSize);
        sliderWinLengthSetup.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText(mapWinLengthPrefix + sliderWinLengthSetup.getValue());
            }
        });



        panelControls.setLayout(new GridLayout(10, 1));

        panelControls.add(labelMapSize);
        panelControls.add(sliderMapSizeSetup);
        panelControls.add(labelWinLength);
        panelControls.add(sliderWinLengthSetup);
        panelControls.add(btnStart);
        panelControls.add(btnClearLog);
        panelControls.add(btnExit);


    }

    private void prepareGameLog() {
        gameLog = new JTextArea();
        scrollPanel = new JScrollPane(gameLog);
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);//одна строка - одна строка
    }

     void putLog(String msg){
        gameLog.append(msg + "\n");
    }

    private void collectGameSetupAndLaunch(){
        int mapSize = sliderMapSizeSetup.getValue();
        int winLen = sliderWinLengthSetup.getValue();

        ++round;
        putLog("---- Round " + round + " ----");
        putLog("Map size is " + mapSize + "x" + mapSize + " . Win length is " + winLen);
        gameMap.startGame(mapSize, mapSize, winLen);
    }
}