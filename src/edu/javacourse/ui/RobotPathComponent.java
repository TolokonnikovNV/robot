package edu.javacourse.ui;

import edu.javacourse.robot.Robot;
import edu.javacourse.robot.RobotLine;
import java.awt.Graphics;
import javax.swing.JComponent;

public class RobotPathComponent extends JComponent
{
    private Robot robot;

    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Перебираем все линии, которые сохранились у робота
        // Несколько позже мы разберем эту конструкицю подробно
        for (RobotLine rl : robot.getLines()) {
            // Для каждой линии получаем координаты
            int x1 = (int) rl.getX1();
            int y1 = (int) rl.getY1();
            int x2 = (int) rl.getX2();
            int y2 = (int) rl.getY2();



//
//            int x1 = (int) Math.round(rl.getX1());
//            int y1 = (int) Math.round(rl.getY1());
//            int x2 = (int) Math.round(rl.getX2());
//            int y2 = (int) Math.round(rl.getY2());
            // И рисуем линию с координатами
            g.drawLine(x1, y1, x2, y2);
            int length = (int) Math.sqrt(Math.pow((y2-y1), 2) + Math.pow((x2-x1), 2));
            System.out.println(length);

            //d:=sqrt(sqr(y2-y1)+sqr(x2-x1));
        }
    }
}