package com.AWT;

import java.awt.*;
import java.awt.event.*;

public class Main {

    // создаем в классе пееменные
    private Frame mainFrame;  // фрайм и 3 метки (лэйблы)
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

   public Main(){ // ----------------------------------------- конструктор для нашего класса
       prepareGUI(); // и вызываемый метод prepareGUI
   }

   public static void main(String[] args){
       Main  myMainClass = new Main(); // создание наешого основного класса
       myMainClass.showLabelDemo(); // и вызываемый метод showLabelDemo
   }

   // ----------------------------------------------------- описывает основное визуальное отображение
   private void prepareGUI(){
       mainFrame = new Frame("Java AWT Label"); // инициализация фрэйма
       mainFrame.setSize(400,400); // размеры
       mainFrame.setLayout(new GridLayout(3, 1)); // расположение объектов на форме

       mainFrame.addWindowListener(new WindowAdapter() { // обработка событий
           public void windowClosing(WindowEvent windowEvent){ // принажатии на кнопку "Закрыть"
               System.exit(0);
           }
       });

       // метки
       headerLabel = new Label(); // инициализация
       headerLabel.setAlignment(Label.CENTER); // в центре
       statusLabel = new Label(); // инициализация
       statusLabel.setAlignment(Label.CENTER);// в центре
       statusLabel.setSize(350,100); // размеры

       controlPanel = new Panel(); // новая панель
       controlPanel.setLayout(new FlowLayout()); // расположение объектов на форме (лайаут)

       // добавление объектов на форму
       mainFrame.add(headerLabel);
       mainFrame.add(controlPanel);
       mainFrame.add(statusLabel);
       mainFrame.setVisible(true); // видимость формы true
   }

   //----------------------------------------------------- Что будет в метках
   private void showLabelDemo(){
       headerLabel.setText("Контрол в действии: Label (headerLabel)");

       Label label = new Label();// создание метки
       label.setText("Контрол в действии: new Label (controlPanel)");
       label.setAlignment(Label.CENTER); // в центре
       label.setBackground(Color.GRAY); // цвет заливки
       label.setForeground(Color.WHITE); // цвет текста
       controlPanel.add(label); // добавить на панель

       statusLabel.setText("Контрол в действии: Label (statusLabel)");

       mainFrame.setVisible(true); // видимость формы true
   }
}
